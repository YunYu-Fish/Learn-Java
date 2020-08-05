public class Static07{

  //静态变量在什么时候初始化？类加载时初始化
  //静态变量存储在哪里？方法区
  static int i = 100;

  //静态代码块什么时候执行？类加载时执行
  static{
    //这里可以访问i吗？可以
    System.out.println("i=" + i);
  }

  int k = 111;


  static{
    //k变量可以访问吗？
    //satic静态代码块在类加载时执行，并且只执行一次，类加载时，k变量空间还没有开辟出来呢
    //error: non-static variable k cannot be referenced from a static context
    //System.out.println("k=" + k);

    //System.out.println("name = " + name);
  }

 //静态变量在静态代码块下面，可以访问吗？
 //error: illegal forward reference
 //静态代码块和静态变量都在类加载的时候执行，时间相同，只能靠代码的顺序来决定
  static String name = "Jay";


  //入口
  public static void main(String[] args){
    System.out.println("main begein");
  }
}
