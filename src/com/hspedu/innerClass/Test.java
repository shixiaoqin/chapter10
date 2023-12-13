package com.hspedu.innerClass;

/**
 * @author 石晓琴
 * @date 2023/12/6 - 12 - 06 - 18:42
 * @Description: com.hspedu.innerClass
 */
public class Test {
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner{
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);
        System.out.println("hello");
        System.out.println("dev test");
        System.out.println("de");
    }
}
