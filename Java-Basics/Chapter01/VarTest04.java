/*
  - 关于变量的一个分类
    * 变量根据出现的位置进行划分：
      在方法体当中声明的变量：局部变量
      在方法体之外，类体内声明的变量：成员变量

    * 局部变量只在方法体当中有效，方法体执行结束该变量的内存就释放了

 - 变量的作用域？
   * 变量的有效范围叫做变量的作用域
   * 出了大括号就不认识了
   * Java中有一个很重要的原则：
     就近原则，哪个近就访问哪个
*/
public class VarTest04{

  //这里可以定义变量吗，可以
  //属于成员变量
  int i = 10;

  //如果在这里重新定一个k，是成员变量
  int k =10000;

  //主方法
  public static void main(String[] args){
    //局部变量，有效范围是main方法
    int k = 20;
    //成员变量中再定义了一个k，这里输出的k是多少？
    //就近原则，依旧是main方法里的k值
    System.out.println(k);

      //在这里编写一个for方法
      for(int n =0; n<10; n++){
      //这里的n属于for域，出了大括号就不可以了
      }
      //for循环执行结束之后，在这里访问n变量行吗？
      //不可以
      //System.out.println(n);

      //再编写一个for方法
      int b;
      for (b=0;b<10;b++ ) {
      }
      //for循环结束之后，在这里可以访问b变量吗？
      //可以，因为b属于main域
      System.out.println(b);
  }

  public static void x(){
    //在这个位置可以访问k吗
    //不可以，会报错
    //System.out.println(k);

    //这里可以再定义一个变量起名k吗？
    //可以，这里的k有效,有效范围是x方法
    int k =30;
    System.out.println(k);//这个k和main方法中的k不在同一个域当中，不冲突
  }
}
