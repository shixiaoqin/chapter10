package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:12
 * @Description: com.hspedu.abstract_
 */
public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println(D.name);

    }
}
//抽象类的本质还是类，所以可以有类的各种成员
abstract class D{
    public int n1 = 10;
    public static String name = "韩顺平教育";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }
}
//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class E{
    public abstract void hi();
}
abstract  class F extends E{ }
class G extends E{
    public void hi(){ //这里相当于G子类实现了父类E的抽象方法,所以实现方法就是要有方法体
    }
}
