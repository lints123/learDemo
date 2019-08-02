package Lear_jdk1_8;

import entity.User;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.math.BigDecimal;
import java.util.Optional;

public class LearOptional {

    public static void main(String[] args) {

      /*  LearOptional ll = new LearOptional();

        //ll.test1();

        BigDecimal bigDecimal = BigDecimal.ZERO;
        ll.aaa(bigDecimal);
        System.out.println(bigDecimal);*/
      String str = "[0-9]+";
      String phone = "123111***21";
        System.out.println(phone.matches(str));

    }
    public void aaa(BigDecimal bigDecimal){
        bigDecimal = new BigDecimal(2);
    }

    /* 使用Optional 判断null */
    public void test1(){
        LearTest learTest = new LearTest();
        String str = null;

        Optional<String> nullOptional = Optional.ofNullable(str);

        // 判断是否存在值，存在即为true，不存在为false
        System.out.println(nullOptional.isPresent());

        // 存在值即做些什么，不存在即不做处理
        nullOptional.ifPresent(System.out::println);

        // 链式调用，判断str是否为null，如果为空则返回123123，否则则返回定义的值 strss
        System.out.println(Optional.ofNullable(str).map(s -> "不为空返回").orElse("为空返回"));


        // 链式调用，如果name不为空的情况，则返回指定的值或者继续判断下一个值，如果为空，则直接返回orElse的值
        User user = new User();
        user.setAge(111);
        user.setName("张三11");
        user.setPhone(123);
        boolean t = Optional.ofNullable(user)
                        .map(user1 -> user1.getName())
                        .map(s -> s.equals("张三"))
                        .orElse(false);
        System.out.println(t);


    }
}
