package com.hspedu.codeblock_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 23:45
 * @Description: com.hspedu.codeblock_
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
         //1.AAA的普通代码块 2.AAA()构造器被调用...
        // 3.BBB的普通代码块 4.BBB()构造器被调用...
        BBB bbb = new BBB();
    }
}
class AAA{
    public AAA(){
        {
            System.out.println("AAA的普通代码块");
        }
        //1.super()
        //2.调用本类的普通代码块
        System.out.println("AAA()构造器被调用...");
    }
}
class BBB extends AAA{
        {
            System.out.println("BBB的普通代码块");
        }
    public BBB(){
         //1.super()
        //2.调用本类的普通代码块
        System.out.println("BBB()构造器被调用...");
    }
}