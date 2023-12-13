package com.hspedu.main_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 17:39
 * @Description: com.hspedu.main_
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好,李焕英");
        Movie movie1 = new Movie("唐探3", 100, "陈思成");

    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    //3个构造器--->重载
    //1.下面的三个构造器都有相同的语句
    //2.代码看起来比较冗余
    //3.这是我们可以把相同的语句，放入到一个代码块中，即可
    //4.这样当我们不管调用哪个构造器,创建对象，都会先调用代码块的内容
    //5.代码块调用的顺序优先于构造器
    //代码块
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始");
    };
    public Movie(String name) {
        this.name = name;
        System.out.println("Movie(String name) 构造器被调用...");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("Movie(String name, double price, String director)构造器被调用...");
    }
}