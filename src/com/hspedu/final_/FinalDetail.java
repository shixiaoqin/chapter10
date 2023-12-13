package com.hspedu.final_;

import com.sun.corba.se.impl.ior.IdentifiableFactoryFinderBase;
import sun.util.resources.cldr.es.CalendarData_es_PY;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 12:20
 * @Description: com.hspedu.final_
 */

class AA{
    //final修饰的属性在定义时,必须赋初值,并且以后不能再修改,赋值可以在如下位置之一[选择一个位置赋初值即可]:
    //1. 定义时 : 如 public final double TAX_RATE = 0.08;
    //2. 在构造器中
    //3. 在代码块中
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA(){
        TAX_RATE2 = 1.1;
    }
    {
        TAX_RATE3 = 8.8;
    }
}
class BB{
    /*
    如果final修饰的属性是静态的,则初始化的位置只能是
        1. 定义时
        2. 在静态代码块, 不能在构造器中赋值
    */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
    // public static final double TAX_RATE3;
    static {
        TAX_RATE2 = 3.3;
    }
//    public BB(){
//        TAX_RATE3 = 9.9;
//    } final修饰的属性是静态时，不能在构造器中赋值
}


class DD{
    public final void cal(){
        System.out.println("cal()方法...");
    }
}
//