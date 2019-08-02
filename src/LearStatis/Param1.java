package LearStatis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Param1 {

    public static void main(String[] args) {
      /*  StringBuilder builder = ThreadParam.getBuilder();
        builder.append("w");*/
        Param1 param1 = new Param1();
        param1.aa();
        System.out.println("22222");
    }

    private void aa(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE,60);
        cal.add(Calendar.DAY_OF_MONTH, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(cal.getTime());
        String enddate = format.format(cal.getTime());
        System.out.println("增加天数以后的日期：" + enddate);
    }


}
