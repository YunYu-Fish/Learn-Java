/*
  关系运算符：
    >
    >=
    <
    <=
    ==
    !=
    切记！：所有的关系运算符的运算结果都是布尔类型，不是true就是false，不可能是其他值
           关系运算符中如果有两个符号的话，两个符号之间不能有空格
*/

public class Operator02{
  public static void main(String[] args){

    int a = 10;
    int b = 10;
    System.out.println(a<b);//false
    System.out.println(a<=b);//true
    System.out.println(a>b);//false
    System.out.println(a>=b);//true
    System.out.println(a==b);//true
    System.out.println(a!=b);//false
  }
}
