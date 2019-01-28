package Lear_jdk1_8;

import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.*;
import java.util.function.Supplier;

public class LearList {

    public static void main(String[] args) {
        LearList learList = new LearList();

        /** 老版本java 使用排序 */
        // learList.listSort();

        /** jdk1.8 使用排序 */
        // learList.listSort2();

        /** 比较两个循环之间的性能 */
        learList.controlList();
    }

    // 老版本java排序
     public void listSort(){

         List<Integer> lists = Arrays.asList(11,3,53,22,231,344,21);

         Collections.sort(lists, new Comparator<Integer>() {
             @Override
             public int compare(Integer o1, Integer o2) {
                 // 降序
                 //return o2.compareTo(o1);

                 // 升序
                 return o1.compareTo(o2);
             }
         });
         lists.forEach(System.out::println);

     }

    // jdk1.8排序
     public void listSort2(){

         List<Integer> lists = Arrays.asList(11,3,53,22,231,344,21);

         // 升序
         // Collections.sort(lists,(a,b) -> a.compareTo(b));

         // 降序
         Collections.sort(lists,(a,b) -> b.compareTo(a));

         lists.forEach(e -> System.out.println(e));
     }


     // 比较stream.foreach和普通的for循环之间的效率
    public void controlList(){
        List<Integer> filterLists = new ArrayList<>();
        for(int i=0;i<1000000;i++)
        {
            filterLists.add(i);
        }

        Date a = new Date();
        for(int j=0;j<1000000;j++)
        {
            System.out.println(filterLists.get(j));
        }
        Date b = new Date();

        Date c = new Date();
        filterLists.stream().forEach(s -> System.out.println(s));
        
        Date d = new Date();

        long interval = b.getTime()-a.getTime();
        long interval2 = d.getTime()-c.getTime();
        System.out.println("两个时间相差1:"+interval);//19353
        System.out.println("两个时间相差2:"+interval2);//15378

    }



}
