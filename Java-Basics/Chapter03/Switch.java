/*
  - switch语句：
    * switch语句也是选择语句，也可以叫做分支语句

    * switch语句的语法格式
      switch(值){
      case 值1:
        java语句;
        java语句;
        break;
      case 值2：
        java语句;
        java语句;
        break;
      case 值3:
        java语句;
        java语句;
        break;
      default:
        java语句;
    }
      以上是一个完整的switch语句：其中break语句不是必须的，defalut分支也不是必须的

      swithc语句支持int类型和string类型【但JDK8之前但不支持string只支持int】，但是byte，short，
      char也可以使用在switch语句中，因为他们可以进行自动类型转换

      switch中“值”和“值1”，“值2”等比较时会使用“==”进行比较

    * switch语句的执行原理
      拿“值”与“值1”进行比较，如果相同，则执行该分支中的语句，遇到break结束；
      若与“值1”不想等，则与“值2”相比较，如果相同，执行该分支中的语句，遇到break结束；
      ......以此类推
      如果分支中没有break，则会case发生穿透，直到遇到break位置
      如果所有的case的值都没有匹配成功，那么defalut分支则会执行
*/
public class Switch{
  public static void main(String[] args){

    //分析这个程序是否能通过？
    //不能，switch只支持int和String类型
    //报错：错误类型：从long转换到int可能会有损失
    /*
    long x = 100L;
    switch(x){
  }
  */

  //写一个完整的switch语句
  //接受键盘输入，根据输入的数字来判断星期几
  //星期日 0； 星期一 1；。。。
  java.util.Scanner s = new java.util.Scanner(System.in);
  System.out.print("请输入【0-6】的整数：");
  int num = s.nextInt();
  /*
  switch(num){
  case 0:
    System.out.print("星期日");
    break;
  case 1:
    System.out.print("星期一");
    break;
  case 2:
    System.out.print("星期二");
    break;
  case 3:
    System.out.print("星期三");
    break;
  case 4:
    System.out.print("星期四");
    break;
  case 5:
    System.out.print("星期五");
    break;
  case 6:
    System.out.print("星期六");
    break;
  }
  */

  //case穿透现象
  /*
  switch(num){
  case 0:
    System.out.print("星期日");
    break;
  case 1:
    System.out.print("星期一");
  case 2:
    System.out.print("星期二");
  case 3:
    System.out.print("星期三");
  case 4:
    System.out.print("星期四");
  case 5:
    System.out.print("星期五");
  case 6:
    System.out.print("星期六");
  }
  */

  //关于defalut语句
  /*
  switch(num){
  case 0:
    System.out.print("星期日");
    break;
  case 1:
    System.out.print("星期一");
    break;
  case 2:
    System.out.print("星期二");
    break;
  case 3:
    System.out.print("星期三");
    break;
  case 4:
    System.out.print("星期四");
    break;
  case 5:
    System.out.print("星期五");
    break;
  case 6:
    System.out.print("星期六");
    break;
  default:
    System.out.print("你到底想问星期几？？");
  }
  */

  //关于case合并的问题
  switch(num){
  case 0: case 1: case 2:
    System.out.print("星期日");
    break;
  case 3:
    System.out.print("星期三");
    break;
  case 4:
    System.out.print("星期四");
    break;
  case 5:
    System.out.print("星期五");
    break;
  case 6:
    System.out.print("星期六");
    break;
  default:
    System.out.print("你到底想问星期几？？");
  }

  }
}
