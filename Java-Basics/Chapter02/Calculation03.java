/*
  - 关于java语言中的浮点型数据
    float         4个字节          单精度
    double        8个字节          双精度
    double更精确
    例：
        10.0/3 采用float来存储的话结果可能是3.3333
        10.0/3 采用double来存储的话结果可能是3.33333333

    但是如果用在银行方面或者用在财务方面，double也是远远不够的，在java中提供了一种精度更高的类型，
    java.math.BigDecimal（不是基本数据类型，属于引用数据类型），专门使用在财务软件方面

    float和double存储数据的时候都是存储的近似值【因为现实世界中有无限循环的数据】

    ！！：任意一个浮点型逗比整数型空间大
         float容量 > long数据

   - java中规定，任意一个浮点型数据默认被当作double来处理，如果想让这个浮点型字面量被当做float类型来
     来处理，要在字面值后面添加F/f
        1.0默认当作double类型处理
        1.0F（1.0f）才是float类型

*/

public class Calculation03{

  public static void main(String[] args){

    double pi = 3.1415926;
    System.out.println(pi);

    //错误：不兼容的类型：从double转换到float可能会有损失
    //float f = 3.14;
    //修改【两种方法】
    float f = 3.14F;
    System.out.println(f);
    float f2 = (float)3.15;
    System.out.println(f2);

    //错误，不兼容的类型：从double转换到int可能会与损失
    //计算顺序 先将5转换成double类型，然后再运算，结果是double
    //int i = 10.0/5;

    //修改【两种方法】
    int i = (int)(10.0/5);
    System.out.println(i);
    int i2 = (int)10.0/5;
    System.out.println(i2);
  }
}
