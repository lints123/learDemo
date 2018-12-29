package RunnableDemo;

// 多个线程，简单输出10、9、8...
public class RunnableA implements Runnable {
    private int count = 10;

    private int i = 0;
    @Override
    public void run() {

        // synchronized (this) 表示的是该代码块同步，this表示的是当前进来的线程。
        synchronized (this) {
            while (count > 0) {
                notify();   // 唤醒当前进来的线程，如果没有在等待状态，也可以唤醒
                System.out.println("当前线程名称是 >>> " + Thread.currentThread().getName() + " ,count为 >>> " + count);
                count--;
                try {
                    //  wait：使当前线程进入等待状态，并且释放当前对象所持有的锁
                    // (简单理解就是 synchronized 锁住的对象，有方法，有变量，简单理解为当前线程释放了对资源的控制)
                    wait();
                    // System.out.println(Thread.currentThread().getName() + ">>>" + Thread.currentThread().isAlive()+" >>> "+(i++));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
