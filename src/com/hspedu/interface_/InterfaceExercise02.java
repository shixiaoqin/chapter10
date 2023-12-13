package com.hspedu.interface_;

import java.text.SimpleDateFormat;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 17:18
 * @Description: com.hspedu.interface_
 */
public class InterfaceExercise02 {

}
interface A1{
    int x = 0; //等价public static final int x = 0;
}
class B{
    int x = 1;
}
class C extends B implements A1{
    public void pX(){
        //System.out.println(x); //❌ 不明确x是谁
        //可以明确指定x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(A1.x + " " + super.x);
    }
    public static void main(String[] args){
        new C().pX();
    }
}