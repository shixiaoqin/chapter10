package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 19:02
 * @Description: com.hspedu.abstract_
 */
abstract class Template { //抽象类-模版设计模式
    public abstract void job(); //抽象方法
    public void calculateTime(){ //实现方法，调用job方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务 执行时间" + (end - start));
    }
}
