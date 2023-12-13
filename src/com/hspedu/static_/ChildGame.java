package com.hspedu.static_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 13:06
 * @Description: com.hspedu.static_
 */
public class ChildGame {

    public static void main(String[] args) {
        //定义一个变量 count，统计有多少小孩加入了游戏
        int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;
        //类变量，可以通过类名直接访问
        System.out.println("共有" + Child.count + "个小孩加入游戏");
        System.out.println(child1.count);
        System.out.println(child2.count);
        System.out.println(child3.count);

    }
}
class Child {

    private String name;
    //定义一个变量 count ,是一个类变量(静态变量) static 静态
    //该变量最大的特点就是 会被Child 类的所有对象实例共享
    public  static  int count;
    public Child(String name){
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏...");
    }
}
