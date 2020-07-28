public class Object{
  public static void main(String[] args){

    //在这里可以访问Student类吗？
    //当然可以
    /*
    - 创建对象的语法是什么？
     【先死记硬背】
     new 类名();

     Student s1 = new Student();
     和
     int i =100;
      * i 是变量名
      * int是变量的数据类型
      * 100是具体的数据

      * s1是变量名
      * Student是变量s1的数据类型（引用数据类型）
      * new Student()是一个对象
      */

    //创建学生对象1
    //s1是局部变量
    //s1这个局部变量叫做引用
    Student s1 = new Student();//和int i = 1;一个道理
    //怎样访问实例变量？
    System.out.println(s1.no);
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.gender);
    System.out.println(s1.addr);

    System.out.println("--------------------------");

    //创建学生对象2
    //s2也是局部变量
    //s2也叫做引用
    //通过服“=”赋值的方式将内存中实例变量的值修改一下
    Student s2 = new Student();
    System.out.println(s2.no = 110);
    System.out.println(s2.name = "Jack");
    System.out.println(s2.age = 20);
    System.out.println(s2.gender = true);
    System.out.println(s2.addr = "Entrepeneur Dr");

    //再次赋值
    System.out.println(s2.name = "Vicent");

  }

  public static void method(){
    //i, s1, s2都是main方法中的局部变量，在这里是无法访问的
  }


}
