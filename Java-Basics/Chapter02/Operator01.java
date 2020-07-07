/*
名称                                符号
--------------------------------------------------------------------------------
算术运算符                 +,-,*,/,%[取余]，++【自加1（单目）】
                          --【自减1（单目）】
关系运算符                 >,>=,<,<=,==,!=

赋值运算符                 =,+=,-=,*=,/=,%=,^=,&=,|=,<<=,>>=
位运算符                   &（按位与）,|（按位或）,^（按位异或）,~（按位取反【单目】）,
                          <<（左移）,>>（带符号右移）,>>>（无符号右移）
条件运算符                 布尔表达式？表达式1:表达式2（三目）
字符串连接运算符            +
*/

/*
  -算术运算符：
   求和      +
   相减      -
   相乘      *
   相除      /
   求余数    %
   自加1     ++
   自减1     --
*/

public class Operator01{
  public static void main(String[] args){

    int a = 10;
    int b = 3;
    System.out.println(a+b);//13
    System.out.println(a-b);//7
    System.out.println(a*b);//30
    System.out.println(a/b);//3
    System.out.println(a%b);//1

    //重点++和————[++和--可以出现在变量前，也可以出现在变量后]
    int i =10;
    i++;
    System.out.println(i);//11
    --i;
    System.out.println(i);//10

    /*++或--出现在变量前和变量后的相同点：运算结果都是变量值自加或自减1
      ++或--出现在变量前和变量后的区别：
      当++或--出现在变量后，会先做赋值，再自加或自减1
      */
    int m =20;
    int n = m++;
    System.out.println(n);//20
    System.out.println(m);//21

    //当++或--出现在变量前，
    int x = 100;
    int y = --x;
    System.out.println(x);//99
    System.out.println(y);//99

    //??提问，以下输出是什么
    int c = 90;
    System.out.println(c++);//90
    System.out.println(c);//91

    int d = 80;
    System.out.println(++d);//81
    System.out.println(d);//81
  }
}
