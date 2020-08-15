public class Super02{
  public static void main(String[] args){
    new C();
  }
}

class A{
  public A(){
    System.out.println("A的无参数构造执行");
  }
}

class B extends A{
  public B(){
    System.out.println("B的无参数构造执行");
  }
  public B(String name){
    System.out.println("B类的有参数构造执行(String)");
  }
}

class C extends B{
  public C(){
    this("zhangsan");
    System.out.println("C的无参数构造执行");
  }
  public C(String name){
    this(name,20);
    System.out.println("C的有参数构造执行(String)");
  }
  public C(String name, int age){
    super(name);
    System.out.println("C的有参数构造执行(String,int)");
  }
}
