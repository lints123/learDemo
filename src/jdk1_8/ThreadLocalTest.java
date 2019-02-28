package jdk1_8;

public class ThreadLocalTest {
    private ThreadLocal<Integer> t = null;

    public void initThreadLocal() {
        t = new ThreadLocal<Integer>() {
            @Override
            public Integer initialValue() {
                return null;
            }
        };
        System.out.println(">>>继续执行" + t.get());
    }

    public int get() {
        return t.get();
    }

    public void set(Integer num) {
        t.set(num);
    }

    class ThreadTest implements Runnable {
        private int num;

        private ThreadTest() {

        }

        private ThreadTest(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            if (t == null) {
                initThreadLocal();
            }
            try {
                set(num);
                System.out.println(Thread.currentThread() + ">>>" + get());
            } catch (Exception e) {
                System.out.println("错误 >>>");
            } finally {
                t.remove();
            }
        }

        public void test() {
            for (int i = 0; i < 10; i++) {
                ThreadTest threadTest = new ThreadTest(i);
                Thread t = new Thread(threadTest);
                t.start();
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 测试目的：1、学习ThreadLocal的用法，理解到ThreadLocal是一个本地线程副本变量工具类
         */
        ThreadLocalTest t = new ThreadLocalTest();
        ThreadTest tt = t.new ThreadTest();
        tt.test();
    }

    // 参考网址：https://www.jianshu.com/p/98b68c97df9b
}
