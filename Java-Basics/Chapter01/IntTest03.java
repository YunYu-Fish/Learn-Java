/*
  - 计算机在任何情况下都只能识别二进制

  - 计算机在底层存储数据的时候，一律存储的是“二进制的补码形式”
    补码形式效率最高

  - 二进制存在原码 反码 补码

  - 对于正整数来说 原码 = 反码 = 补码
    例 int i = 1;
    相对应的二进制原码是：00000000 00000000 00000000 00000001
    相对应的二进制反码是：00000000 00000000 00000000 00000001
    相对应的二进制补码是：00000000 00000000 00000000 00000001

  - 对于负整数来说
    例 byte i = -1；
    相对应的二进制原码是：10000001
    相对应的二进制反码是：11111110【符号位不变，其他位取反】
    相对应的二进制补码是：11111111【反码+1】


*/

public class IntTest03{

  public static void main(String[] args){

    char c1 = 'a';
    System.out.println(c1);

    //c2是int类型，97是int类型，类型会转换吗？
    //不会，因为没有超出char的取值范围
    //char c2 = char(97);//不需要这么做
    char c2 = 97;
    System.out.println(c2);

  //char数值取值范围【0～65535】
    char c3 = 65535;
    System.out.println(c3);//实际是一个“看不懂”的字符

    //超出范围需要强制转换
    char c4 = (char)65536;
    System.out.println(c4);

    //？？：分析byte b = (byte)150;
    //150是默认int类型，其相对应的
    //二进制：00000000 00000000 00000000 10010110
    //byte转换后：10010110【这是补码】
    //【可以使用逆推的方式推算出对应的原码】
    //反码：10010101
    //原码：11101010【-106】

    byte b = (byte)150;
    System.out.println(b);
  }
}
