package Lear_jdk1_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LearMap {

    public static void main(String[] args) {

        LearMap learMap = new LearMap();
        // learMap.mapSort();
        // learMap.aaa();
        /*int result = 0;
        List<String> str = new ArrayList<>();
        str.add("111");
        str.add("111");
        str.add("111");
        str.add("111");
        str.add("111");
        str.stream().forEach(e->{
            System.out.println(e);

        });*/
        Map<String,Object> hh = new HashMap<>();
        hh.put("11",11);
        System.out.println(hh.get("22"));

        String str = "OD191662910029067";
        System.out.println(str.contains("OD33"));
     /*   HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("张三","12");
        hashMap.put("王五","34");
        hashMap.put("里斯","56");
        hashMap.put("里斯2","56");
        hashMap.put("里斯3","56");
        hashMap.put("王伟","90");
        hashMap.put("丁典","110");
        hashMap.entrySet().stream().forEach(e -> {
            System.out.println(e.getValue()+"__");
            if(e.getValue().equals("90")){
                return;
            }
        });*/
       /* Map<String,Integer> hashMap = new HashMap<>();
        if(!hashMap.containsKey("1")){
            System.out.println("1111");
        }*/
    }

    public void mapSort(){
        // 测试hashMap 存储顺序
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("张三","12");
        hashMap.put("王五","34");
        hashMap.put("里斯","56");
        hashMap.put("里斯2","56");
        hashMap.put("里斯3","56");
        hashMap.put("王伟","90");
        hashMap.put("丁典","110");
        System.out.println("++"+hashMap.toString());

        // hashMap.get(里斯) = 56
        // hashMap.keySet().forEach(key -> System.out.println("hashMap.get("+key+") = "+ hashMap.get(key)));

        // key:value = 里斯:56
        // hashMap.entrySet().iterator().forEachRemaining(item -> System.out.println("key:value = "+ item.getKey() + ":" + item.getValue()));

        // key:value = 里斯:56
        // hashMap.entrySet().forEach(entry -> System.out.println("key:value = "+entry.getKey() +":"+entry.getValue()));

        // 单纯的输出值：56
        // hashMap.values().forEach(System.out::println);
        // 单纯的输出key：里斯
        // hashMap.keySet().forEach(e -> System.out.println(e));

        // 里斯----
        // 56
        /*hashMap.entrySet().parallelStream().filter(e -> e.getValue().equals("56")).forEach(e -> {
            System.out.println(e.getKey()+"----");
            System.out.println(e.getValue());
        });

        hashMap.entrySet().stream().filter(e -> e.getValue().equals("56")).forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue()+"___");
        });
        */
        hashMap.entrySet().stream().forEach(e ->{
            if(e.getValue().equals("56")){
                return;
            }
            System.out.println(e.getValue()+"_____");
        });

        Map<String,Object> treeMap = new TreeMap<>();
        treeMap.put("num1",12);
        treeMap.put("num2",42);
        treeMap.put("num3","zhangsan");
        treeMap.put("num3","lisi");
        treeMap.put("num5","wangwu");
        // treeMap.keySet().forEach(key -> System.out.println("treeMap.get("+key+")，= "+treeMap.get(key)));
        // System.out.println(1<<3);
        // System.out.println(2>>>4);

        treeMap.keySet().forEach(key -> System.out.println("treeMap.get("+key+"):"+ treeMap.get(key)));

        System.out.println(treeMap.put("num3",123));
        // Java7中，Map是数组加链表
        // Java8中，Map是数组加链表加红黑树
    }


    public void aaa(){
        String[] a = {"0","1","2","3"};
        List<String> aa = new ArrayList<>();
        aa.add("0");
        aa.add("1");
        aa.add("3");
        Map<String,Object> hashMap = new HashMap<>();
        for (String s : a) {
            for (String s1 : aa) {
                if(s.equals(s1)){
                    switch (s){
                        case "0":{
                            if(!hashMap.containsKey("0")){
                                hashMap.put("0",1);
                            }
                            break;
                        }case "1":{
                            if(!hashMap.containsKey("1")){
                                hashMap.put("1",1);
                            }
                            break;
                        }case "2":{
                            if(!hashMap.containsKey("2")){
                                hashMap.put("2",1);
                            }
                            break;
                        }case "3":{
                            if(!hashMap.containsKey("3")){
                                hashMap.put("3",1);
                            }
                            break;
                        }
                        default:break;
                    }
                }
            }
        }
        for (String s : a) {
            for (String s1 : aa) {
                if(!s.equals(s1)){

                        switch (s){
                            case "0":{
                                if(!hashMap.containsKey("0")){
                                    hashMap.put("0",0);
                                }
                                break;
                            }case "1":{
                                if(!hashMap.containsKey("1")){
                                    hashMap.put("1",0);
                                }
                                break;
                            }case "2":{
                                if(!hashMap.containsKey("2")){
                                    hashMap.put("2",0);
                                }
                                break;
                            }case "3":{
                                if(!hashMap.containsKey("3")){
                                    hashMap.put("3",0);
                                }
                                break;
                            }
                            default:break;
                        }

                }
            }
        }
        hashMap.entrySet().parallelStream().forEach(e -> {
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        });
        System.out.println(hashMap.toString());
    }


    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        //设置当前时间
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        //设置结束时间
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //处于开始时间之后，和结束时间之前的判断
        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    public void a1aa(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");//设置日期格式
        Date newTime = new Date();
        try {
            Date beginTeim = df.parse("2019-03-20 12:10:10");
            Date endTime = df.parse("2019-03-30 12:10:10");
            boolean b = belongCalendar(newTime,beginTeim,endTime);
            System.out.println(b);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        System.out.println(date);

        System.out.println(date.toString());
    }

}
