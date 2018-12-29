package ThreadDemo;

public class ThreadA extends Thread {
    private String name;
    public ThreadA(String name){
        super(name);
        this.name = name;
    }
    @Override
    public synchronized void run(){
        System.out.println(Thread.currentThread().getName() + " 线程开始执行 ");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程 "+name+"运行："+i);
            try{
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" 线程运行结束 ");
    }
}
