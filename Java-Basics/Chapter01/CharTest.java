/*
  字符型：
    char

    * char占用两个字节
    * char的取值范围
    * char采用unicode编码方式
    * char类型的字面值使用单括号括起来
    * char可以存储一个汉字
*/

public class CharTest{
  public static void main(String[] args){
    //char可以存储1个汉字吗？
    //可以，汉字占用两个字节，java中的char类型占用两个字节
    char c1 = '中';
    System.out.println(c1);

    char c2 = 'a';
    System.out.println(c2);

    char c3 = '1';
    System.out.println(c3);

    //编译报错：不兼容的类型：String无法转换为char
    //char c4 = "a";
    //System.out.println(c4);

  }
}
