package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:44
 * @Description: com.hspedu.abstract_
 */
public class BB extends Template{
    //计算任务
    //1+...+10000
    @Override
    public void job(){ //重写了Template的 job方法
        long sum = 0;
        for (long i = 0; i < 800000; i++) {
            sum *= i ;
        }
    }
}
