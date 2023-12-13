package com.hspedu.innerClass;
/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 17:38
 * @Description: com.hspedu.innerClass
 */
/*
* 演示局部内部类的使用
* */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02{ //外部类
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2()");
    }//私有方法
    public void m1(){//方法
        //1.局部内部类是定义在外部类的局部位置，通常在方法
        //3.不能添加访问修饰符，但是可以使用final 修饰，因为局部变量也可以使用final修饰
        // 解读：如果用final修饰局部内部类，则该内部类不可被继承
        //4.作用域： 仅仅在定义它的方法或代码块中
        String name = "xxx";
     class Inner02{//局部内部类(本质还是一个类)
            //2.可以直接访问外部类的所有成员，包含私有的
            private int n1 = 800;
            public void f1(){
                //5.局部内部类可以直接访问外部类的成员, 比如 外部类的n1 和 m2();
                //System.out.println("n1=" + n1);
                //访问外部类的n1
                System.out.println("n1=" + Outer02.this.n1);
                m2();
            }
        }
        class  Inner03 extends Inner02{}
        //6.外部类在方法中，可以创建Inner02对象，然后调用方法即可
        new Inner02().f1();
    }
    {//代码块
        class Inner04{}
    }
}