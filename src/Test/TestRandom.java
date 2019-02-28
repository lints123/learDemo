package Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

    }
    // 随机数
    public void random(){
        String simpleDateFormat = new SimpleDateFormat("yyyyMMdd").format(new Date());
        //System.out.println(simpleDateFormat*1000);
        Integer a = Integer.parseInt(simpleDateFormat)*1000;
        System.out.println(a);
        Random random = new Random(a);
        System.out.println(random);
        List<Object> aa = new ArrayList<>();
        for (int i = 0;i<5;i++){

            int j = (int) (Math.random() * (22 - 1)) + 1;
            if(aa.contains(j)){
                i-- ;
                continue;
            }
            aa.add(j);
        }
        for (Object o : aa) {
            System.out.println(o);
        }

    }
}
