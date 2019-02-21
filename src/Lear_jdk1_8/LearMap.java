package Lear_jdk1_8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LearMap {

    public static void main(String[] args) {

        LearMap learMap = new LearMap();
        learMap.mapSort();

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
}
