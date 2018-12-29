package ThreadDemo;

// 模拟存取钱
public class ThreadAccount_A implements Runnable {

   private ThreadAccount threadAccount;
   public  ThreadAccount_A(ThreadAccount threadAccount){
       this.threadAccount = threadAccount;
   }

    @Override
    public synchronized void run() {
        System.out.println("当前线程的名称 >>> "+Thread.currentThread().getName());

        threadAccount.deposit(500);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadAccount.witheraw(500);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadAccount.getBalance());
    }
}
