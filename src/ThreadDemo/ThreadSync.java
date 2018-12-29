package ThreadDemo;

// 使用 synchronized 同步锁
public class ThreadSync implements Runnable {

    private static int count = 0;

    // private byte[] lock = new byte[0];  // 特殊的instance变量

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" >>> "+(count++));
            }
        }
    }

    public static int getCount() {
        return count;
    }
}
