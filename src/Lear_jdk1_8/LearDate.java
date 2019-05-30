package Lear_jdk1_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

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

       /*
        Date d = new Date();
        System.out.println(d.getTime());
        Date da = new Date(d.getTime() + 3 * 60000);
        System.out.println(da.getTime());
        System.out.println(da);
        */

       /*Date date = new Date();
       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));
        Calendar now = Calendar.getInstance();
        System.out.println("年：" + now.get(Calendar.YEAR));
        System.out.println("月：" + (now.get(Calendar.MONTH) + 1));
        System.out.println("日：" + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + now.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + now.get(Calendar.MINUTE));
        System.out.println("秒：" + now.get(Calendar.SECOND));*/
        //learDate();
        aaaa();
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

    public static void learDate(){
        Calendar cal = Calendar.getInstance();
        //获取今天的日期
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " 年 " + month + " 月 " + day +  " 日");
        Date date = cal.getTime();
        SimpleDateFormat format1= new SimpleDateFormat("yyyy-MM");
        String dateStringYYYYMM = format1.format(date);
        System.out.println(dateStringYYYYMM);
        SimpleDateFormat format11= new SimpleDateFormat("yyyy-MM-dd");
        String dateStringYYYYMMDD = format11.format(date);
        System.out.println(dateStringYYYYMMDD);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = sdf.parse("2000-03-01 12:39:11");

            //获取昨天的日期
            cal.setTime(date1);
            //cal2.set(2018, 2, 1);
            cal.add(Calendar.DATE, -1);
            int year2 = cal.get(Calendar.YEAR);
            int month2 = cal.get(Calendar.MONTH)+1;
            int day2 = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println(year2 + " 年 " + month2 + " 月 " + day2 +  " 日");
            Date date2 = cal.getTime();
            SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd");
            String dateStringYYYYMMDD2 = format2.format(date2);
            System.out.println(dateStringYYYYMMDD2);
        } catch (ParseException e) {
            e.printStackTrace();
        }



//获取上个月的日期（上个月的今天）
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, -1);
        int year3 = cal.get(Calendar.YEAR);
        int month3 = cal.get(Calendar.MONTH)+1;
        int day3 = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year3 + " 年 " + month3 + " 月 " + day3 +  " 日");
        Date date3 = cal.getTime();
        SimpleDateFormat format3= new SimpleDateFormat("yyyy-MM-dd");
        String dateStringYYYYMMDD3 = format3.format(date3);
        System.out.println(dateStringYYYYMMDD3);
    }

    public static void aaaa(){
        //获取今天的日期
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        Date dayDate = cal.getTime();
        // 当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dayTime = sdf.format(dayDate);

        System.out.println(dayTime);

        // 当月时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
        String monthTime = sdf1.format(dayDate);
        System.out.println(monthTime);

        // 获取昨天的时间
        cal.setTime(new Date());
        cal.add(Calendar.DATE,-1);
        int year2 = cal.get(Calendar.YEAR);
        int month2 = cal.get(Calendar.MONTH)+1;
        int day2 = cal.get(Calendar.DAY_OF_MONTH);
        Date date = cal.getTime();
        String yesterDay = sdf.format(date);

        System.out.println(yesterDay);

        // 获取上个月的时间
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, -1);
        Date lastDate = cal.getTime();
        String lastMonth = sdf1.format(lastDate);

        System.out.println(lastMonth);
    }
}
