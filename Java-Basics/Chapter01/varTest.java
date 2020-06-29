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

public class varTest{
  public static void main(String[] args){

    System.out.println(100);//整数型
    System.out.println(3.14);//浮点型
    System.out.println("国");//字符串型
    System.out.println('好');//字符型
    System.out.println("true");//字符串型
    System.out.println(true);//布尔型

  }
}
