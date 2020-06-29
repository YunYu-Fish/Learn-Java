/*
  1.如identifierTest和args都是标识符

  2.标识符可以标识：
    * 类名
    * 方法名
    * 变量名
    * 接口名
    * 常量名
    ......

  3.凡是程序员自己有权利命名的单词都是标识符

  4.标识符有命名规则，属于语法机制，必须遵守，不遵守命名标识不符合语法，编译器会报错
    * 标识符只能由数字、字母（包括中文）、下划线_、美元符号💲组成

    * 首字母不能以数字开头

    * 关键字不能做标识符

    * 标识符是严格区分大小写的，大写A和小写a不一样

    * 标识符理论上是没有长度限制的

  5.标识符除了命名规则之外，还有命名规范：
    * 命名规则和规范的区别？
      - 命名规则是语法，不遵守就会编译报错
      - 命名规范是大家尽量同意的规范来命名，不符合规范编译可以通过，但是与大家的代码风格不一致
      - 统一按照规范进行的话，代码的可读性很好

    * 具体的命名规范：
      - 见名知义

      - 遵循驼峰命名方式【一高一低一高一低】，有利于单词与单词直接的分隔

      - 类名、接口名
        类名和接口名首字母大写，后面每个单词首字母大写

      - 变量名、方法名
        变量名和方法名首字母小写，后面每个字母首字母大写

      - 所有常量名全名大写，并且单词和单词直接采用下划线衔接
        USER_AGE：用户年龄
        MATH_PI： 固定不变的常量3.1415926......
*/

public class identifierTest{
  //main是一个方法的名称，属于标识符
  //但是这个标识符不能修改，是SUN固定死的
  public static void main(String[] args){
    int age = 20;
    String name = "yun yu";
  }

  //doSome是一个方法名，可以改成其他的名字
  public static void doSome(){
    //k是一个变量名
    int k = 100;
  }
}

//虽然java中的标识符严格区分大小写，但是对于类名，如果一个java源文件中同时出现了A类和a类
//那么谁在前生成谁，所以最好类名不要“相同”
class A{
}

class a{
}
