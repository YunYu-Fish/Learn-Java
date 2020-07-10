/*
  - break;语句和return;语句有什么区别？

    * break;用来终止switch和离它最近的循环
    * return;用来终止离它最近的一个方法

*/

public class Break_Return{

  public static void main(String[] args){
    for(int i=0; i<10; i++){
      if(i==5){
        //break; //终止for循环
        return; //终止当前的方法
        //error: incompatible types: unexpect return value
        //return 10;
      }
      System.out.println("i="+i);
    }
    System.out.println("Congratulation!");
  }
}
