/*
  - 使用static关键字可以定义：静态代码块

  - 什么是静态代码块？
    static{
      java语句;
      java语句;
    }

  - sataic静态代码块在什么时候执行呢？
    类加载时执行，并且只执行一次【静态代码块有这样的特征/特点】

  - !!:静态代码块在类加载时执行，并且在main方法执行之前执行

  - 静态代码块一般是按照自上而下的顺序执行

  - 静态代码块有什么作用？
    * 静态代码块不那么常用（不是每一个类当中都要写的东西）
    * 静态代码块这种语法机制实际上是SUN公司给我们java程序员的一个特殊的时刻/时机，这个时机叫做：类加载时机
    例如：项目经理要求在所有编写的程序当中，只要类加载类，记录一下类加载的日志信息（在x年x月x日x时x分x秒，哪个类加载到JVM当中了）
         这些记录日志的代码写到静态代码块当中
         

*/
public class Static06{

  //静态代码块
  static{
    System.out.println("A" );
  }

  //一个类当中可以便携多个静态代码块
  static{
    System.out.println("B");
  }

  //入口
  public static void main(String[] args){
    System.out.println("Hello");
  }

  static{
    System.out.println("C");
  }
}
