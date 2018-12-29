package ThreadDemo;

// 使用 Yield 让出当前线程
public class ThreadYield extends Thread {
    public ThreadYield(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("当前线程 >>> "+this.getName() + " >>> "+i);
            if (i == 30) {
                // 让掉当前的线程，回到可执行状态，如果没有其他线程抢夺，则有可能当前线程继续执行
                yield();
                System.out.println("当前线程 >>> "+this.getName()+"  >>>  "+i);
            }
        }
    }
}
