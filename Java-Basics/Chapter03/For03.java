/*
  - 所有合法的“控制语句”都可以嵌套使用
  - for循环嵌套一个for循环执行原理是什么？
    for(){
      for(){
      //在分析外层for循环的时候，把里面的for就当作一段普通的java语句/代码
    }
  }
*/

public class For03{
  public static void main(String[] args){

    //单层for循环
    for(int i=0; i<10; i++){
      System.out.println("i="+i);
    }

    //循环2次
    for(int k=0; k<2; k++){
      System.out.println("k="+k);
    }

    //输出什么？
    //输出两遍i=0,1，2，3...9
    for(int k=0; k<2; k++){
      for(int i=0; i<10; i++){
        System.out.println("i="+i);
      }
    }

    //只输出一次0,1,2,3...9
    int i =0;
    for(int k=0;k<2;k++){
      for(;i<10;i++){
        System.out.println("value--->"+i);
      }
    }
  }
}
