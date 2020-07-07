/*
  赋值运算符：
  - 赋值运算符包括“基本赋值运算符”和扩展赋值运算符”
  - 基本运算符：
    =
  - 扩展的赋值运算符
    +=
    -=
    *=
    /=
    %=
    ！！：扩展赋值运算符在编写的时候，两个符号之间不能有空格

  - 使用扩展赋值运算符的时候，永远都不会改变运算结果类型

*/

public class Operator04{
  public static void main(String[] args){

//赋值运算符‘=’右边优先级比较高，先执行右边的表达式
//然后将表达式执行结束的结果放到左边的“盒子”当中【赋值】
  int i = 10;
  i = 20;
  System.out.println(i);

  /*
    以 += 运算符为代表，学习扩展赋值运算符
    其他运算符和 += 原理相似
  */

    int k = 500;
    k += 20;
    System.out.println(k);//520,相当于k变量追加20

    int m = 30;
    m %= 7;
    System.out.println(m);//2

  //？：x += 10和x = x + 10 真的完全一样吗？
  //不一样，只能说相思，其实本质上并不是完全相同
    byte x = 100;//没有超出byte赋值范围，直接赋值
    System.out.println(x);//100

    //报错，不兼容的类型，从int转换到byte可能会有损失
    //运算会先转为int类型，int类型不可以直接赋值给byte类型的变量x
    //x = x+1;

    //使用扩展赋值运算符可以编译通过吗？
    //可以，所以x += 1和x = x+1是不一样的
    x += 1;
    System.out.println(x);//101

    //会超出取值范围
    x += 199;//x = (byte)(x+199);
    System.out.println(x);//44

  }
}