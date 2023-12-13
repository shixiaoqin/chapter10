package com.hspedu.interface_;
/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 14:06
 * @Description: com.hspedu.interface_
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.swimming();
    }
}
class Monkey{
    private String name;
    public Monkey(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void climbing(){
        System.out.println(name + " 会爬树...");
    }
}
//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}
//继承
//小结：当子类继承了父类，就自动地调用父类的功能
//     如果子类需要扩展功能，可以通过实现接口的方式来扩展
//     可以理解： 实现接口 是对 java 单继承机制的一种补充
class LittleMonkey extends Monkey implements Fishable{
    public LittleMonkey(String name) {
        super(name);
    }
    public void swimming(){
        System.out.println(getName() + " 通过学习,可以像鱼儿一样游泳...");
    }
    public void flying(){
        System.out.println(getName() + " 通过学习,可以像鸟儿一样飞翔");
    }
}