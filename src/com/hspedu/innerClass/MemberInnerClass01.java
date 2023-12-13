package com.hspedu.innerClass;

/**
 * @author 石晓琴
 * @date 2023/12/6 - 12 - 06 - 17:48
 * @Description: com.hspedu.innerClass
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        //外部其他类,使用成员内部类的三种方式
        //解读：
        //第一种方式
        //outer08.new Inner08(); 相当于把 new Inner08() 当作是outer08成员
        //这就是一种语法，不用特别纠结
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //第二种方式 在外部类中，编写一个方法，可以返回 Inner08成员
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}
class Outer08{//外部类
    private int n1 = 10;
    public String name = "张三";
    //1.注意⚠️： 成员内部类是定义在外部类的成员位置上
    //2.可以添加任意访问修饰符(public、protected、默认、private),因为它的地位就是一个成员
    class Inner08{//成员内部类
        public void say(){
            System.out.println("Outer08 的 n1= " + n1 + " Outer08的 name= " + name);
        }
    }
    //
    public void t1(){
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关的属性
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
    //返回一个Inner08的实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }
}