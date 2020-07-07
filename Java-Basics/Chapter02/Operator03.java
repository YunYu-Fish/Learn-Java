/*
    逻辑运算符
    &   [逻辑与]
    |   [逻辑或]
    !   [逻辑非]
    &&  (短路与)
    ||  (短路或)

    - 用代码描述100大于99且100大于98:
      100>99 & 100>98

    - ！！：切记逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型

    100 & true 不行，语法错误
    100 & 200 不行，没有这种语法
    true & false，可以

*/

public class Operator03{
  public static void main(String[] args){

    //对于逻辑与&运算符来说，只要有一边是false，结果就是false
    //只有两边同时为true，结果才是true
    System.out.println(true & true);//true
    System.out.println(true & false);//false
    System.out.println(false & false );//false

    //对于逻辑或|运算符来说，只有有一边是true，结果都是ture
    //只有两边同时为false，结果才是false
    int a = 1;
    int b = 2;
    int c = 3;
    System.out.println(a<b | a>c);//true
    System.out.println(a>b | b>c);//false

    //!就是取反符号，表示不是的意思【需要加()】
    System.out.println(!(a>b));//true

    /*
      关于短路与&& 和短路 ||
      短路与&& 和逻辑与& 有什么区别？
      - 这两个运算符的运算结果没有任何区别，完全相同
        只不过短路与&&会发生短路现象

      - 什么是短路现象？
        右边表达式不执行，这种现象叫做短路现象

      - 什么时候使用&&，什么时候使用&？
        从效率方面来说，&&比&的效率高一些
        因为逻辑与& 不管第一个表达式结果是什么，第二个表达式一定会执行

      - 以后的开发中，短路与&& 和逻辑与& 还是需要同时并存的
        大部分情况下都建议使用短路与&&

      - 短路||的情况类似
        当左边的表达式结果是true的时候，右边的表达式不需要执行，此时使用短路||会短路
    */

    //左边的a>b表达式结果已经式false了，所以整个表达式的结果已经确定是false了
    //按道理右边的表达式不应该执行，但是用&依旧被执行了
    System.out.println(a>b & a>b++);
    System.out.println(b);//3

    //使用&&的时候，当左边表达式为false的时候，右边的表达式不执行
    //倘若左边表达式为true，右边的依旧会执行
    //这种现象被称为短路
    int x = 1;
    int y = 2;
    System.out.println(x>y && x>y++);
    System.out.println(y);//2

  }
}
