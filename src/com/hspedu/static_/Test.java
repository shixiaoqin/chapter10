package com.hspedu.static_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 16:43
 * @Description: com.hspedu.static_
 */
public class Test {
    static int count = 9;
    public void count(){
        System.out.println("count=" + (count++));
    }

    public static void main(String[] args) {
        new Test().count(); //9
        new Test().count(); //10
        System.out.println(Test.count); //11
    }
}
