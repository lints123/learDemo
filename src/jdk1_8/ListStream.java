package jdk1_8;

import java.util.*;

public class ListStream {

     List<User> list = Arrays.asList(
            // name，age
            new User("张三", 11),
            new User("王五", 20),
            new User("王五", 91),
            new User("张三1", 8),
            new User("李四", 44),
            new User("李四", 44),
            new User("李四", 44)
    );

    public static void main(String[] args) {
       ListStream l = new ListStream();
       //l.listRemove();
        HashMap<String,Object> map = new HashMap<>();
        map.put("hahah",12123);
        l.aaa(map);
        map.forEach((k,v)->System.out.println(k+"-"+v));
    }


    private void aaa(Map<String,Object> param){
        param.put("333",111);
        param.put("444","1223");
    }

    // 使用jdk1.8的新特性
    public void ListStream1(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");

        list.forEach( listsss -> System.out.println(listsss));

        list.stream().filter(e -> !e.equalsIgnoreCase("123")).forEach( System.out::println);
    }

    public  void listRemove(){

        List<String> ids = Arrays.asList("12","23","34");

        ids.removeIf(e -> e == "12");
        // 测试删除功能
      //  list.removeIf(user -> user.getName().equalsIgnoreCase("张三1"));

        ids.forEach(e -> System.out.println(e));
    }

}
