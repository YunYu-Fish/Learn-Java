/*
  - 方法怎么定义？语法机制是什么？
    【修饰符列表】返回值类型 方法名(){
        方法体;
      }

    ！！：【】里的内容表示不是必须的是可选的
          方法体由java语句构成

      * 关于修饰符列表：
        修饰符列表不是必选项，是可选的，到目前为止，大家同意写成public static

      * 关于返回值类型：
        - 返回值类型可以是任何类型，只要是java中合法的数据类型就行，数据类型包括基本数据类型和引用数据类型

        - 什么是返回值？
          * 一般指的是一个方法执行结束之后的结果，通常是一个数据，所以是一个数据，所以被称为“值”

          * 方法就是为了完成某个特定的功能，方法结束之后大部分情况下都是有一个结果的，而体现结果的一般都是数据，数据得有类型，这就是返回值类型

          * 当一个方法执行结束不返回任何值的时候，返回值类型也不能恐怖，必须写上void关键字

          * 如果返回值类型不是void，那么在方法体执行结束的时候就必须使用“return值;”这样的语句来完成“值”的返回，如果没有“return值;”这样的语
            句，那么编译器会报错
            - return值;的作用是“返回值”，返回方法的执行结果
            - ！！：只要有“return”关键字的语句执行，当前方法必然结束

          * 如果返回值类型是void，那么在方法体当中不能有“return值;”，但是可以有“return;”语句，这个语句的作用就是用来终止当前方法的

       * 方法名
         - 方法名要见名知义
         - 需要是合法的标识符，且首字母小写，后面每个单词字母大写

       * 形式参数列表
         - 简称：形参
         - ！！：形式参数列表中的每一个参数都是“局部变量”，方法结束之后内存释放
         - 形参的个数是：0-N个
         public static void sumInt(){}
         public static void sumInt(int x){}
         public static void sumInt(int x, int y){}
         - 形参有多个的话用“,”隔开，逗号是英文的
         - 形参的数据类型起决定性作用，对应的变量名是随意的

      * 方法体：
        - 由java语句构成，以“;”结尾
        - 方法体当中编写的是业务逻辑代码，完成某个特定功能
        - 在方法体中的代码遵循自上而下的顺序一次逐行执行
        - 在方法体当中处理业务逻辑代码的时候需要数据，数据来源就是这些形参


    - 方法定义之后怎么调用呢？
      ！！：方法必须调用才能执行
      怎样调用，语法是什么？
      * 类名.方法名(实际参数列表)



*/

public class Method02{
  //main方法结束之后不需要给JBVM返回任何执行结果
  public static void main(String[] args){

    //调用下面的方法
    //(10,2)叫做实际参数列表，简称实参
    //！！：实参和形参必须一一对应，类型要对应，个数要对应
    Method02.division(10,2);

    //调用sum方法
    //怎么去接收这个方法的返回结果？
    //！！：变量的定义需要指定变量的数据类型
    //变量的数据类型是什么呢？
    /*
    int result = Method02.sum(1,3);
    System.out.println(result);
    */

    //result变量可以是double类型吗？
    //可以，int（小容量）转double（大容量），自动类型转换
    double result = Method02.sum(1,3);
    System.out.println(result);

    //对于没有返回值的方法，变量能接收吗？
    //不可以接收


  }
  public static int sum(int a, int b){
    return a+b;
  }

  //业务需求：计算两个int类型的数据的商

  //error: missing return statement
  /*
  public static int division(int x, int y){
    int z = x/y;
  }
  */

  //error: incompitable types: String cannot be converted to int
  /*
  public static int division(int x, int y){
    int z = x/y;
    return "abc";
  }
  */

  //可行
  /*
  public static int division(int x, int y){
    int z = x/y;
    return z; //或者直接return x/y;
  }
  */

  //如果不需要执行结束之后的返回值，希望直接输出

  //改成void再加返回值会报错error: incompitable types: unexcepted return value
  /*
  public static void division(int x, int y){
    return x/y;
    }
    */

    //直接写return或者不写可以通过，只是没有输出
    /*
    public static void division(int x, int y){
      return ;//
      }
      */

    public static void division(int x, int y){
      System.out.println(x/y);
      }



}
