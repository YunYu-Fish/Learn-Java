/*
  * 软件在处理数据之前需要能够表示数据，在java代码中怎么去表示数据呢？
    在java中有这样的一个概念：字面值

    10，1.23，true，'a'，"abc"
    以上这些都是数据，在java中都被叫做字面值

  * 字面两可以氛围很多种类：
    整数型字面量：1 2 3 100 -11...
    浮点型字面量：1.3 1.2 2.6...
    布尔型字面量：true、false【只有这两个值】

    字符型字面量：'a','b','中'
    字符串字面量："abc","a","b","中国"

    ！！：其中字符型和字符串型都是描述了现实世界中的文字
         字符型只能用英文单引号括起来
         字符串型只能用英文双引号括起来

*/

public class varTest01{
  public static void main(String[] args){

    System.out.println(100);//整数型
    System.out.println(3.14);//浮点型
    System.out.println("国");//字符串型
    System.out.println('好');//字符型
    System.out.println("true");//字符串型
    System.out.println(true);//布尔型

    //如果只有字面值，没有变量机制的话，有什么问题？
    /*例：10是一个整数型数据，在内存中占有一定 空间（CPU 内存 硬盘）
      假设计算10 +20 =30
      计算机将在内存中找一块空间存储10，再找一块空间存储20，CPU运算完再找一块空间存储结果30
    */
    //以下虽然都是10，但是这三个10占用三块不同的空间
    System.out.println(10);
    System.out.println(10);
    System.out.println(10);
    //只有字面量机制，内存是无法重复利用的

    //定义/声明一个变量i
    int i =10;
    //以下这3次访问都是访问的同一块访问空间
    System.out.println(i);
    System.out.println(i);
    System.out.println(i);

    //以下程序表示访问的是字符i和字符串i，以下的两个i和上面的变量i没有任何关系
    System.out.println('i');
    System.out.println("i");


  }
}
