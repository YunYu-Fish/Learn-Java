/*
  九九乘法表

  1*1=1
  1*2=2 2*2=4
  1*3=3 2*3=6 3*3=9
  ...
  ......
  1*9=9 2*9=18....................9*9=81

  * 总共9行
  * 第一行1个，第二行2个，第n行n个
*/
public class For04{
  public static void main(String[] args){


    //重复不出现的九九乘法表
    for(int i=1; i<10;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i+"*"+j+"="+(i*j) +" ");
      }
      //换行
      System.out.println();
    }
  }
}
