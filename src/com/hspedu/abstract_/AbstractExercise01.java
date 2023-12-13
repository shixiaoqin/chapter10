package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:34
 * @Description: com.hspedu.abstract_
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        CommonEmployee amy = new CommonEmployee("Amy", 12, 18000);
        amy.work();
        Manager eden = new Manager("Eden", 13, 30000, 200000);
        eden.work();
    }
}
