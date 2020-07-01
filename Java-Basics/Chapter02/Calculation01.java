/*
  - byte、char、short做混合运算的时候，各自先转成int再做运算
*/

public class Calculation{

  public static void main(String[] args){

    char c1 = 'a';
    byte b = 1;

    //这里的“+”是负责求和的
    System.out.println(c1 + b);//98

    //编译报错：不兼容的类型：从int转换到short可能会损失精度
    //short s = c1 + b;//编译器不知道这个加法最后的结果是多少，只知道int类型

    short s = (short)(c1 + b);

    int i = 1;
    //错误，不兼容的类型：从int转换到short可能会有损失
    //short x = 1;可以
    //short x = i;//不可以，编译器只知道a是int类型，不知道a的值
    //System.out.println(x);a
    
  }
}
