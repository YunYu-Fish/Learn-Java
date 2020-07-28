/*
  - 构造方法作用：
    创建对象，并且创建对象的过程中给属性赋值（初始化）
*/
public class Constructor02{
  public static void main(String[] args){

    User u1 = new User();
    System.out.println(u1.id);//111
    System.out.println(u1.name);//Tom
    System.out.println(u1.password);//12345
    System.out.println(u1.age);//30

    User u2 = new User(111);
    System.out.println(u2.id);//0
    System.out.println(u2.name);//null
    System.out.println(u2.password);//null
    System.out.println(u2.age);//0
  }

}
