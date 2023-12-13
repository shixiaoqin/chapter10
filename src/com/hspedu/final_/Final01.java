package com.hspedu.final_;
/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 12:05
 * @Description: com.hspedu.final_
 */
public class Final01 {
    public static void main(String[] args) {
        E e = new E();
       //  e.TAX_RATE = 0.09;  用final修饰的属性，不能修改它的值
    }
}
class  E{
    public final  double TAX_RATE = 0.08;
}
