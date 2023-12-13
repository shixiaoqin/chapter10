//基于类的匿名内部类
package com.hspedu.innerClass;

import java.sql.SQLOutput;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 18:02
 * @Description: com.hspedu.innerClass
 */
/*
 * 演示匿名内部类的使用
 * */
public class AnnoymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{ //外部类
    private int n1 = 100;
    public void method(){     //方法
        //演示基于类的匿名内部类
        //1.分析
        //1. father编译类型 Father
        //2.father运行类型 Outer04$1
        //3.底层会创建匿名内部类
        /*
         * class Outer04$2 extends Father{}
         * */
        //4.同时也直接返回了 匿名内部类 Outer04$1的对象
        //5.注意("jack") 参数列表会传递给构造器
        Father father = new Father("jack"){
            public void test(){
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();
    }
}
class Father{//类
    public Father(String name){//构造器
        System.out.println("接收到的name=" + name);
    }
    public void test(){}
}