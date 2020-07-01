/*
  - 整数型在java语言中共有四种类型：
    * byte      1个字节        最大值127
    * short     2个字节        最大值32767
    * int       4个字节        最大值2147483647
    * long      8个字节

    1个字节 = 8个二进制；1byte = 8bit

  - 在java中，有一条非常重要的结论：
    在任何情况下，整数型的“字面量/数据”默认被当作int类型处理
    如果希望该”整数型字面量”被当作long类型来处理，需要在“字面量”后面添加L/l【推荐大写L】

*/

public class IntTest01{
  public static void main(String[] args){

    //十进制
    int a = 10;
    System.out.println(a);

    //八进制
    int b = 010;
    System.out.println(b);

    //十六进制
    int c = 0x10;
    System.out.println(c);

    //二进制
    int d = 0b10;
    System.out.println(d);

    //这个代码存在类型转换吗？
    //不存在，100这个字面量被当作int类型处理
    //x变量是int类型，所以不存在类型的转换
    int x = 100;
    System.out.println(x);

    //这个代码存在类型转换吗？
    //存在，200字面量默认当作int类型处理
    //y变量是long类型，int类型占4个字节，long类型占8个字节
    //小容量可以自动转换成大容量，这种操作被称为：自动类型转换
    long y = 200;
    System.out.println(y);

    //这个代码存在类型转换吗？
    //不存在
    //在整数型字面量300后面添加一个L之后，300L联合起来就是一个long类型的字面值
    long y1 = 300L;
    System.out.println(y1);

    //提问：可以吗？存在类型转换吗？
    //2147483647默认被当作int来处理
    //e变量是long类型，小容量可以自动赋值给大容量，自动类型转换
    long e = 2147483647;//2147483647是int最大值
    System.out.println(e);

    //提问：编译会报错吗？为什么？
    //在java中，整数型字面量一上来编译器就会将它看做int类型
    //而2147483648已经超出了int的范围，所以在没有赋值之前就出错了
    //所以不是f放不下2147483648，f是long类型，完全可以容纳2147483548，但是它本身超出了int范围
    //会报错：整数挨打
    //long f = 2147483548;

    //如何解决这个报错呢？在2147483548字面量后面添加L/l
    long f = 2147483548L;
    System.out.println(f);
  }
}
