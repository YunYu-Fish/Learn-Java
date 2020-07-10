/*
  - break;语句和return;语句有什么区别？
*/

public class Break-Return{

  public static void main(String[] args){
    for(i=0; i<10; i++){
      if(i==5){
        break;
      }
      System.out.println("i="+i);
    }
    System.out.println("Congratulation!");
  }
}
