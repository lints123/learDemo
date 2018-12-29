package ThreadDemo;

// 模拟 3个线程 依次打印 ABC
public class ThreadABC implements Runnable {

    private String name;
    private byte[] ago;
    private byte[] after;

    public ThreadABC(String name, byte[] ago, byte[] after){
        this.name = name;
        this.ago = ago;
        this.after = after;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (ago) {
                synchronized (after) {
                    System.out.println("当前线程名称  >>>  " + Thread.currentThread().getName() +" >>> "+name);
                    count--;
                    after.notify();

                }
                try {
                    ago.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
