/*
  关于java中的转义字符

  * java语言中"\ "负责转义
  * \t表示制表符tab
  * \n表示换行符
*/
public class EscapesChara{
  public static void main(String[] args){

    //普通的't'字符
    char c1 = 't';
    System.out.println(c1);

    //根据之前所学，以下代码应该报错
    //经过测试以下代码\t实际上是一个字符，不是字符串
    //\t表示“制表符tab”
    char c2 = '\t';

    System.out.println("abcdef");
    //\的出现会将紧挨着的后面的字符进行转义，表示tab
    System.out.println("abc\tdef");

    /*
      System.out.println(); 换行
      System.out.print(); 不换行
    */
    System.out.print("HelloWorld");
    System.out.println("123abcdefg");

    System.out.print("abc");
    char c3 = '\n';
    //"\n"是换行符
    System.out.print(c3);
    System.out.println("123");

    //如果想向控制台输入一个’字符怎么办？
    //\'表示一个普通的单引号字符
    System.out.println('\'');

    //如果想向控制台输出一个\字符怎么办？
    //在java中两个反斜杠代表了一个普通的反斜杠字符
    System.out.println('\\');

    //双引号括起来的是字符串
    //如果想向控制台输出"test"怎么办？
    System.out.println("\"test\"");

    //这个可以输出，这个'在这里只是个普通的字符，不需要专门转义
    System.out.println("'");

    //编译报错，因为4e2d是一个字符串
    //char x = '4e2d';

    //反斜杠u表示后面的是一个字符的unicode编码
    //unicode编码是十六进制的
    char x = '\u4e2d';
    System.out.println(x);

  }
}
