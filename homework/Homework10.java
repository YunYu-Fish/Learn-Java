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


    //给一个不多于5位数的正整数，
    //* 求它是几位数  * 逆序打印出各位数字


    //先接受一个不多于5位数的正整数
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入一个不超过5位的正整数：");
    int num = s.nextInt();

    //判断几位数
    if(num<10){
      System.out.println(num+"这是一个个位数");
    }else if(num<100){
      System.out.println(num+"这是一个十位数");
    }else if(num<1000){
      System.out.println(num+"这是一个百位数");
    }else if(num<10000){
      System.out.println(num+"这是一个千位数");
    }else if(num<100000){
      System.out.println(num+"这是一个万位数");
    }




  }
}
