/*
  方法重载机制
  - 优点：
    代码整齐美观；
    “功能相似”的，可以让“方法名”相同，更易于以后的代码编写

  - 在java语言中，是怎么进行方法区分？
    * 首先java编译器会通过方法名进行区分
    * 但是在java语言中允许方法名相同的情况出现
    * 如果方法名相同的情况下，编译器会通过方法的参数类型进行方法的区分

  - 什么时候需要考虑使用方法重载？
    在同一个类当中，如果“功能1”和“功能2”的功能是相似的，那么可以考虑将它们的方法名一致，这样代码既美观，又便于后期的代码编写
    ！！：overload不能随便使用，如果两个功能压根儿不想干，不相似，根本没关系，此时两个方法使用重载机制的话，会导致编码更麻烦
         无法进行功能的区分

  - 什么时候代码会发生方法重载？
    * 在同一个类中
    * 方法名相同
    * 参数列表不同【参数列表的个数不同；参数列表的类型不同；参数列表的顺序】
    只要同时满足以上3个条件，那么我们可以认定方法和方法之间发生了重载机制
*/

//以下程序不使用方法重载机制，分析程序的缺点？
//以下程序没有语法错误，运行正常，但是三个方法功能相似，但是代码不好看，且调用程序员需要记忆更多的方法名称
public class Overload{
  public static void main(String[] args){
    System.out.println(sum(10.0,11.0));
    System.out.println(sum(10L,11L));
    System.out.println(sum(10,11));


/*
    System.out.println(sumInt(10,20));

    System.out.println(sumLong(10L,20L));

    System.out.println(sumDouble(10.0,20.0));
*/

  }

  //定义一个计算int类型数据的求和方法
  /*
  public static int sumInt(int a, int b){
    return a+b;
  }
  */

/*
  //定义一个计算long类型数据的求和方法
  public static long sumLong(long a, long b){
    return a+b;
  }
  */

/*
  //定义一个计算double类型数据的求和方法
  public static double sumDouble(double a, double b){
    return a+b;
  }
  */

  //如何修改之前的两个缺点呢？
  public static int sum(int a, int b){
    return a+b;
  }

  public static long sum(long a, long b){
    return a+b;
  }

  public static double sum(double a, double b){
    return a+b;
  }

}
