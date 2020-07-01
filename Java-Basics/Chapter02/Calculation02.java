/*
  多种数据类型做混合运算的时候，最终的结果类型是“最大容量”对应的类型

  ！！：char + short + byte除外
       因为char + short + byte混合运算的时候，会各自先转换成int再做运算

*/

public class Calculation02{

  public static void main(String[] args){

    long a = 10L;
    char c = 'a';
    short s = 100;
    int i =30;

    System.out.println(a+c+s+i);//237

    //检查计算的结果
    //int x = a + c + s + i;//报错，不兼容的类型，从long转换到int可能会有损失
    //计算结果是long类型
    int x = (int)(a+c+s+i);
    System.out.println(x);

    //以下程序结果是？
    int t = 10/3; //结果为3，因为java中规定，int类型和int类型最终的结果还是int类型
    System.out.println(t);

    //在java中计算结果不一定是精确的
    int t2 = 1/2;
    System.out.println(t2); //结果是0

  }
}
