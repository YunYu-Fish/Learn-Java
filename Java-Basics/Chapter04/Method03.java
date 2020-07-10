/*
  - 在方法调用的时候，什么时候“类名.”可以省略？什么时候不能省略？

    * a()方法调用b()方法的时候，a和b方法都在同一个类中，“类名.”可以省略
    * 如果不在一个类中，“类名.”不能省略

*/


public class Method03{
//类1，公开类
  public static void println3(){
    System.out.println("Past was past");
  }
  public static void main(String[] args){
    //调用println()方法
    Method03.println();
    Method03.println2();
    //类名.可以省略吗？
    //同一个方法离可以省略
    println3();

    //如果跨类调用MyClass类中的方法，就不能省略类名.
    MyClass.println();
    MyClass.println2();
    MyClass.println3();
  }

  public static void println(){
    System.out.println("Hello World");
  }

  public static void println2(){
    System.out.println("Hi!!");
  }
}

//类2
class MyClass{
  public static void println(){
    System.out.println('1');
  }
  public static void println2(){
    System.out.println('2');
  }
  public static void println3(){
    System.out.println('3');
  }
}
