package com.hspedu.codeblock_;
/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 23:08
 * @Description: com.hspedu.codeblock_
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的情况举例
        //1.创建对象实例时(new)
        //AA aa = new AA();
        //2.创建子类对象实例,父类也会被加载,父类先被加载,子类后被加载
        //AA aa2 = new AA();
        //3.使用类的静态成员时(静态属性、静态方法)
        //System.out.println(Cat.n1);
        //static是在类被加载时执行的,并且只会执行一次
//        DO dd = new DO();
//        DO dd1 = new DO();
        //普通的代码块,在创建对象实例时,会被隐式地调用
        //被创建一次, 就会调用一次
        //如果只是使用类的静态成员时,普通代码块不会执行
//        DO dd2 = new DO();
//        DO dd3 = new DO();
        System.out.println(DO.n1); //888
    }
}
class DO{
    public static int n1 = 888;
    //静态代码块
    static{
        System.out.println("DO 的静态代码块被执行...");
    };
    //普通的代码块,在new 对象时,会被调用,而且是每创建一个对象，就调用一次
    //可以这样理解， 普通代码块时构造器的补充
    {
        System.out.println("DO的普通代码块");
    };
}
class Cat{
    public static int n1 = 999; //静态属性
    //静态代码块
    static{
        System.out.println("Cat的 静态代码1被执行...");
    }
}
class BB{
    //静态代码块
    static{
        System.out.println("BB的静态代码块被执行...");
    }
}
class AA extends BB{
    //静态代码块
    static{
        System.out.println("AA类的静态代码块被执行...");
    }
}