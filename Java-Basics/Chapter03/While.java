/*
  - while循环

    * while循环的语法机制以及执行原理
      - 语法机制
        while(布尔表达式) {
          循环体;
      }
      - 执行原理：
        判断布尔表达式，如果为true就执行循环体，循环体结束后，再次判断布尔表示的结果，如果还是为true，
        继续执行循坏体。。直至布尔表达式结果为false，while循环结束

    * while循环有没有可能循环次数为0？
      可能，while的循环次数是：0～n次
*/

public class While{
  public static void main(String[] args){
    //死循环
    /*
    while(true){
      System.out.println("死循环");
    }
    */

    //本质上while循环和for循环原理是相同的
    /*
      for(初始表达式;布尔表达式;更新表达式){
        循环体;
      }

      初始表达式;
      while(布尔表达式){
        循环体;
        更新表达式;
      }
    */

    /*
    for(int i=0; i<10; i++){
      System.out.println("i-->"+i);
    }
    */
    //这个while循环和上面的for循环一致
    /*
    int i = 0;
    while(i<10){
      System.out.println("i="+i);
      i++;
    }
    */

    //如果将while循环里的i++换个位置，相对于的for循环要怎么写？
    /*
    int i =0;
    while(i<10){
      i++;
      System.out.println("i="+i);
    }
    */

    for(int i=0; i<10;){
      i++;
      System.out.println("i-->"+i);
    }





  }
}
