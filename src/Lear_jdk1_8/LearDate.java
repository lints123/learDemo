package Lear_jdk1_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LearDate {

    public static void main(String[] args) throws ParseException {
        // plusDay(7,new Date());
        // 设置指定时间
      /*  String createDate = "2000-01-01 12:39:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(createDate);
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        cl.add(Calendar.DATE,7);
        Date d = cl.getTime();
        System.out.println("时间："+d.getTime());

        String enddate = sdf.format(d);
        System.out.println("增加天数以后的日期：" + enddate);*/


       /* String startTime = "2019-04-16 09:33:00";
        String endTime = "2019-04-30 23:59:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);

        long s1 = startDate.getTime();
        long s2 = endDate.getTime();
        System.out.println("开始时间 >" +s1);
        System.out.println("结束时间 >" +s2);
        Date da = new Date();
        long daTime = da.getTime();
        System.out.println("当前时间 >" + daTime);*/
        Date d = new Date();
        System.out.println(d.getTime());
        Date da = new Date(d.getTime() + 3 * 60000);
        System.out.println(da.getTime());
        System.out.println(da);

    }



    /**
     * 指定日期加上天数后的日期
     * @param num 为增加的天数
     * @param currdate 创建时间
     * @return
     * @throws ParseException
     */
    public static String plusDay(int num,Date  currdate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在的日期是：" + currdate);
        System.out.println("时间 : >>> "+currdate.getTime());
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
        currdate = ca.getTime();
        System.out.println("时间戳： >>> "+currdate.getTime());
        String enddate = format.format(currdate);
        System.out.println("增加天数以后的日期：" + enddate);

        return enddate;
    }

    /**
     * 当前日期加上天数后的日期
     * @param num 为增加的天数
     * @return
     */
    public static String plusDay2(int num){
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currdate = format.format(d);
        System.out.println("现在的日期是：" + currdate);

        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
        d = ca.getTime();
        String enddate = format.format(d);
        System.out.println("增加天数以后的日期：" + enddate);
        return enddate;
    }

}
