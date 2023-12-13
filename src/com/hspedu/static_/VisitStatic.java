package com.hspedu.static_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 13:38
 * @Description: com.hspedu.static_
 */
public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量
        //说明： 类变量是随着类的加载而创建的，所以没有创建对象实例也可以访问
        System.out.println(A.name);
        A a = new A();
        System.out.println("a.name=" + a.name);
    }
}
class A{
    //类变量
    //类变量的访问，必须遵循 相关的访问权限
    public static String name = "韩顺平教育";
}