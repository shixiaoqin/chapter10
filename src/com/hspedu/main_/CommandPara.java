package com.hspedu.main_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 17:27
 * @Description: com.hspedu.main_
 */
public class CommandPara{
    public static void main(String[]args){
        for(int i=0;i < args.length; i++){
            System.out.println("args[" + i + "]=" + args[i]);
        }
    }
}
