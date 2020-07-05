/*
  运算符 +
  - 运算符+在java语言中有两种作用
    * 求和
    * 字符串的拼接

  - 什么时候求和？什么时候进行字符串的拼接呢？
    * 运算符两边都是数字类型的时候，求和
    * 运算符两边的任意一遍是字符串类型的是，进行字符串拼接

  - 字符串拼接完之后的结果还是一个字符串
*/
public class Operator06{
  public static void main(String[] args){

    //定义一个年龄的变量
    int age = 18;

    //+在这里会进行字符串的拼接
    System.out.println("年龄"+age);//"年龄=18"

    int a = 100;
    int b = 200;
    //+在这里做加法运算
    System.out.println(a+b);//300

    //当一个表达式当中有多个加号的时候
    //遵循自左向右的顺序依次执行，除非额外添加了小括号
    //第一个+先运算，左右两边都是数字，所以先求和，答案是300
    //再和"110"相加，+做字符串拼接
    System.out.println(a+b+"110");//"300110 "

    System.out.println(a+(b+"110"));//"100200110"

    //String是字符串类型，属于引用类型数据，name是变量名
    String name = "Jack";

    //错误，类型不兼容
    //String name = 100;

    System.out.println("登陆成功欢迎" + name +"回来");
  }
}
