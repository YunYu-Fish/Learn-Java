/*
  条件运算符：【三目运算符】

  - 语法格式：布尔表达式？表达式1:表达式2

  - 执行原理：
    布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果
    布尔表达式的结果为flase时，表达式2的执行结果作为整个表达式的结果
*/

public class Operator05{
  public static void main(String[] args){

    //合法的java语句
    int i = 10;

    //报错，不是语句
    //100;

    //报错，不是语句
    //'男';

    boolean sex = false;

    //报错，不是语句
    //sex ? '男':'女'

    //前面接受的变量c的类型不能随意编写
    //最终计算结果是字符型，所以变量也需要使用char类型
    char c = sex ? '男':'女';
    System.out.println(c);

    //报错：不兼容的类型：条件表示中的类型错误
    //char x = sex ?'男':"女";
    //System.out.println(x);
  }
}
