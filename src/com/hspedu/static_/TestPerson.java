class Person{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        //  this.total = total; ❌ this不能出现在静态方法中
        //修改
        //注释即可
        Person.total = total;
    }
    public Person(){
        total++;
        id = total;
        System.out.println(id); //4
    }
}
public class TestPerson{
    public static void main(String[]args){
        Person.setTotalPerson(3);
        new Person();
    }
}