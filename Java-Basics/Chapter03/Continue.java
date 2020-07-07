/*
  - continue语句和break语句要对比着学习

  - continue语句的作用是：
    终止当前“本次”循环，直接进入下一次循环继续执行
    for(){
      if(){ //当这个条件成立时，执行continue语句
        continue;//当continue语句执行时，continue下面的代码不执行，直接进入下一次循环
    } //当上述continue执行后，下面的代码不执行直接执行更新表达式
      code 1;
      code 2;
      code 3;
  }

  - continue语句可以指定循环
    a: for(;;更新表达式1){
      b:for(;;更新表达式2){
        if(){
          continue;
      }
      code1;
      code2;
      code3'
    }
  }
*/

public class Continue{
  public static void main(String[] args){

    for(int i =0; i<10; i++){
      if(i == 5){
        break;
      }
      System.out.println(" i= "+i);
    }
    System.out.println("-----------------");

    //上一个break;语句用continue会输出什么样的结果？
    //输出1，2，3，4，6，7，8，9
    for(int i =0; i<10; i++){
      if(i == 5){
        continue;//跳过本次循环，继续循环
      }
      System.out.println(" i= "+i);
    }

  }
}
