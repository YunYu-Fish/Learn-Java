/*
  - 什么是变量？
    变量其实就是内存当中存储数据的最基本的单元

  - java语言当中任何数据都是由数据类型的，例如整数型：int

  - 数据类型有什么用呢？
    不同的数据类型，在内存中分配的空间大小不同
    也就是说，java虚拟机到底给一个数据分配多大的空间，主要看变量的数据类型

  ！！：1个字节 = 8个比特位
       1个比特位就是一个1或0【比特位是二进制】

  - 变量三要素：变量值，变量名，数据类型

  - 标量名属于标识符，命名遵循驼峰命名方式，首字母小写，后面每个单词首字母大写

  - 在java中给变量赋值
    使用“=”， 这个运算符被称为赋值运算符，特点为，等号右边先执行，执行完之后赋值给左边的变量

  - 变量可以在声明的时候赋值

*/
public class varTest02{
  public static void main(String[] args){

    //定义一个int类型的变量，起名nianLing
    int nianLing;

    //变量声明之后，没有手动赋值，不可以直接访问，会编译报错
    //System.out.println(nianLing);

    //给变量赋值
    nianLing = 20;
    System.out.println(nianLing);//这是访问变量

    System.out.println("nianLing");//这是访问字符串

    //变量就是可以变化的量
    //重新赋值
    nianLing = 18;
    System.out.println(nianLing);

    int weight = 55;
    System.out.println(weight);

  }
}
