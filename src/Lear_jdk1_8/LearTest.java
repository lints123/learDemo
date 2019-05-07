package Lear_jdk1_8;

import java.util.Optional;

public class LearTest {

    public static void main(String[] args) {
        LearTest learTest = new LearTest();
        // learTest.test1();

    }

    /*获取枚举值*/
    public void test1(){

        int statusCode = StatusEnum.valueOf("NEW").statusCode;

        System.out.println(statusCode);

    }



    public void test3(){
        System.out.println(1);
    }


}
