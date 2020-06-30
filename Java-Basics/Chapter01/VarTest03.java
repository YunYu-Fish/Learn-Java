/*
  - 在同一个域中，变量可以重新复制但不可以重名【也就是不可以重新声明】

  - 在同一个域中，不同类型的数据也不可以重名

  - 同一行可以声明多个变量，用逗号隔开就行，但是只有最后一个变量被赋值了
*/
public class varTest03{
  public static void main(String[] args){
    //可以用以下顺序访问变量k吗？
    //！！：不可以，方法体当中的代码遵循从上而下的顺序依次执行，会编译报错
    //System.out.println(k);

    //只有执行了这一行代码，k变量才会开辟空间
    //声明一个整数型的变量起名k，存储值20
    int k =10;
    //给变量k重新赋值
    k = 30;
    System.out.println(k);

    //下面操作可以吗？
    //不可以，会编译报错
    //int k = 40;
    //System.out.println(k);

    //下面操作可以吗？
    //不可以，编译报错
    //double k = 48.8;
    //System.out.println(k);

    //声明三个类型，起名a,b,c
    //通过测试得知：a,b都没有赋值，c赋值1
    int a,b,c = 1;
    //System.out.println(a);
    //System.out.println(b);
    System.out.println(c);

  }
}
