package LearStatis;

import java.util.concurrent.TimeUnit;

public class ThreadParam extends Thread {

    private static StringBuilder builder;

    public static void main(String[] args) {
        new ThreadParam().start();
    }
    @Override
    public void run() {
        builder=new StringBuilder();
        while(true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("data is : "+builder.toString());
        }
    }
    public static StringBuilder getBuilder(){
        return builder;
    }

}
