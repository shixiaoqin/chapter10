package com.hspedu.innerClass;

/**
 * @author 石晓琴
 * @date 2023/12/6 - 12 - 06 - 16:00
 * @Description: com.hspedu.innerClass
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
       Person p = new Person(){
            public void hi(){
                //可以直接访问外部类的所有成员,包含私有的
                System.out.println("匿名内部类访问外部类私有成员n1=" + n1);
            }
        };
       p.hi();
    }
}
class Person{ //类
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person ok " + str);
    }
}
//抽象类/接口