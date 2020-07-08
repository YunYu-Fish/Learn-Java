public class Homework10{
  public static void main(String[] args){

    //一个数如果恰好等于它的因子之数，这个数就是完数，例如6=1+2+3，编程找出1000内所有的完数

    //1不属于完数，从2开始判断
    //将判断范围取出来
    for(int a=2; a<=1000; a++){
      int num = 0;
      for(int y=1; y<=a/2; y++){
        if(a%y == 0){
          num += y;
        }
      }
      if(num==a){
        System.out.println(a);
      }
    }


  }
}
