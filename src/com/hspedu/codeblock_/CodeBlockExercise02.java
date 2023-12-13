package com.hspedu.codeblock_;

/**
 * @author 石晓琴
 * @date 2023/12/2 - 12 - 02 - 00:37
 * @Description: com.hspedu.codeblock_
 */
public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test a = new Test();
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");
    }
}
class Test{
    Sample sam1 = new Sample("sam1成员初始化"); //(3)
    static Sample sam = new Sample("静态成员sam初始化");//(1)
    static {
        System.out.println("static块执行"); //(2)
        if (sam == null) {
            System.out.println("sam is null");
        }
    }
        Test(){
            //隐藏
            //1.super()
            //2.本类的非静态代码块和非静态属性
            //3.构造器
            System.out.println("Test默认构造函数被调用");//(4)
        }
}