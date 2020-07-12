//分析以下代码编译会报错吗
public class Method05{
  public static void main(String[] args){
    //调用m方法
    int result = m();
    System.out.println(result);

    //调用x方法
    int result1 = x(false);
    System.out.println(result1);

  }

  //error:missing return statement
  /*
  public static int m(){
    boolean flag = true;//编译器不负责运行程序，编译器只讲道理
    // 对于编译器来说，编译器只知道flag是个boolean类型的变量
    //编译器认为flag有可能是false，有可能是true
    if(flag){
      //编译器觉得以下这个return不一定会执行
      //所以编译器报错：缺少返回语句
      return 1;
    }
  }
  */

  //如何修改上述代码？
  //第一种方案
  /*
  public static int m(){
    boolean flag = true;
    if(flag){
      return 1;
    }else{
      return 0;
    }
  }
  */

  //第二种方案：该方案实际上是方案一的变形
  /*
  public static int m(){
    boolean flag = true;
    if(flag){
      return 1;
    }
    return 0;
  }
  */


  //在同一个域中，“return”语句下面不能再编写其他代码，会编译报错
  /*
  public static int m(){
    boolean flag = true;
    if(flag){
      return 1;
      //这里可以写代码吗
      //error: unreachable statement
      //System.out.println("HHH");
    }
    //这里可以写代码吗
    //可以，这一行和上一行不在一个域中
    System.out.println("HHH");
    return 0;
    //但是这里不能写代码
  }
  */

  //最优方案，三目运算符
  public static int m(){
    boolean flag = true;
    return flag? 1:0;
  }

  //带有一个参数的方法
  public static int x(boolean flag){
    return flag? 1:0;
  }





}
