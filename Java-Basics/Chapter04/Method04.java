//任何一个方法体当中的代码都是遵循自上而下的顺序依次逐行执行的
public class Method04{

  public static void main(String[] args){
    System.out.println("main begin");
    //调用m1方法
    m1();
    System.out.println("main over");
  }

  public static void m1(){
    System.out.println("m1 begin");
    //调用程序不一定写到main方法中，不要把main方法特殊化
    m2();
    System.out.println("m1 over");
  }

  //m2方法可以调用T类的m3()方法吗？
  public static void m2(){
    System.out.println("m2 begin");
    T.m3();
    System.out.println("m2 over");
  }
}

class T{
  public static void m3(){
    System.out.println("m3 begin");
    System.out.println("T's m3 method execute!");
    System.out.println("m3 over");
  }
}
