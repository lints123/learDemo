import IOStream.FileInputStreamOrOutputStream;
import IOStream.FileReaderOrWriter;
import RunnableDemo.RunnableA;
import ThreadDemo.*;
import com.sun.corba.se.spi.extension.ZeroPortPolicy;
import jdk1_8.User;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //threadA();

        // threadYield();

        //threadSync();

        // threadSync1();

        // runnableA();

        //threadAccount();

        //threadABC();

        // -------------------------------------------- 操作IO流
        // FileInputStreamOrOutputStream f = new FileInputStreamOrOutputStream();
        //f.fileInput();
        //f.fileInput1();

        // FileReaderOrWriter f1 = new FileReaderOrWriter();
        // f1.fileReader();


       /* String str =  "1232";
        System.out.println(str.hashCode());
        List<String> ll = new ArrayList<>();
        ll.add("1212");
        ll.add("45444");
        Main m = new Main();
        m.aa(ll);
        ll.forEach(v ->{
            if(v.equalsIgnoreCase("5555")){
                int index = ll.indexOf(v);
                ll.set(index,"44444");
            }
        });
        ll.forEach(System.out::println);*/

       User u  = new User();
       u.setName("lisi");
       u.setAge(1212);

       Main m = new Main();
       m.vvv(u);

    }

    // 反射
    public void vvv(Object object) {
        String classPatth = String.valueOf(object.getClass());
        System.out.println(classPatth);
        String str[] = classPatth.split(" ");
        System.out.println(str[0]);
        System.out.println(str[1]);
        classPatth = str[1];
        try {
            Class clazz = Class.forName(classPatth);

            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields){
                //System.out.println(f.getType());
                System.out.println(f.getName());
                /*f.setAccessible(true);
                try {
                    System.out.println(f.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }*/
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void aa(List<String> ll){
        ll.add("5555");
    }

    // 使用join方法
    private static void threadA() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"主线程开始运行");
        ThreadA threadA = new ThreadA("A");
        ThreadA threadA1 = new ThreadA("B");
        threadA.start();
        threadA1.start();
        // join的意思：等待指定线程终止，这里可以理解为: main主线程等待子线程的终止
        threadA.join();
        threadA1.join();
        System.out.println(Thread.currentThread().getName()+"主线程结束执行");
    }

    // 使用 Yield 让掉当前执行的线程，使其回到可执行的状态，如果没有线程抢夺该执行时间，则有可能是该线程继续执行
    private static void threadYield(){
        ThreadYield threadYield = new ThreadYield("张三");
        ThreadYield threadYield1  = new ThreadYield("李四");
        threadYield.start();
        threadYield1.start();
    }

    private static void threadSync(){

        // 这里是两个并发的线程访问同一个对象中的Synchronized代码块，同一时刻只能有一个线程得到执行，另一个线程堵塞
        // 必须等到当前线程执行完代码块之后才能执行该代码
        ThreadSync threadSync = new ThreadSync();
        Thread thread = new Thread(threadSync,"threadSync");
        Thread thread1 = new Thread(threadSync,"threadSync1");
        thread.start();
        thread1.start();
    }

    private static void threadSync1(){
        // 这里实例化了两个对象，创建两个并发线程去执行 Synchronized 代码块的内容
        Thread thread1 = new Thread(new ThreadSync(),"threadSync1");
        Thread thread2 = new Thread(new ThreadSync(),"threadSync2");
        thread1.start();
        thread2.start();
    }

    // 继承Runnable的值
    private static void runnableA(){
        RunnableA ra = new RunnableA();
        Thread tA = new Thread(ra,"A");
        Thread tB = new Thread(ra,"B");
        tA.start();
        tB.start();

    }

    private static void threadAccount(){
        ThreadAccount account = new ThreadAccount("zhang san", 10000.0f);
        // 模拟多个线程，存取同一个账户
        ThreadAccount_A t = new ThreadAccount_A(account);
        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i ++) {
            threads[i] = new Thread(t, "Thread" + i);
            threads[i].start();
        }
    }

    private static void threadABC() throws InterruptedException {
        byte[] ba = new byte[0];
        byte[] bb = new byte[0];
        byte[] bc = new byte[0];
        // 锁住bc,释放ba
        Thread tA = new Thread(new ThreadABC("A",bc,ba));
        Thread tB = new Thread(new ThreadABC("B",ba,bb));
        Thread tC = new Thread(new ThreadABC("C",bb,bc));
        tA.start();
        Thread.sleep(1000);
        tB.start();
        Thread.sleep(1000);
        tC.start();
        Thread.sleep(1000);
    }



}
