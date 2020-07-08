/*
  - do..while语法机制：
    do{
      循环体
    }while(布尔表达式);
    !:最后的时候千万不要漏掉分号

  - do..while执行原理：
    先执行循环体中的代码，执行一次循环体之后，判断布尔表达式的结果，如果为true，则继续执行
    循环体；如果为false，则循环结束

  - 对于do..while循环来说，循环体至少执行一次

*/
public class DoWhile{
  public static void main(String[] args){

    /*
    int i = 0;
    do{
      System.out.println(i);//0,1,2,3...9
      i++;
    }while(i<10);
    */

    //换一个方式，输出结果一样吗？
    //是一样的
    /*
    int i = 0;
    do{
      System.out.println(i++);
    }while(i<10);
    */

    //再换个方式，输出结果一样吗？
    //不一样，输出结果是1-10
    int i = 0;
    do{
      System.out.println(++i);
    }while(i<10);

  }
}
