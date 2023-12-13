package com.hspedu.codeblock_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 23:32
 * @Description: com.hspedu.codeblock_
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        //1.getN1被调用... 2.A 静态代码块01
        // 3.getN2被调用... 4.A 的普通代码块01
        //5.A()构造器被调用...
        A a = new A();
    }
}
class A{
    private int n2 = getN2(); //普通属性的初始化
    //静态属性的初始化
    private  static int n1 = getN1();
    //普通代码块
    {
        System.out.println("A 的普通代码块01");
    }
    //静态代码块
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }
    public int getN2(){ //非静态方法
        System.out.println("getN2被调用...");
        return 200;
    }
    //无参构造器
    public A(){
        System.out.println("A()构造器被调用...");
    }
}