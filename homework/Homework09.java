public class Homework{
  public static void main(String[] args){

    /* 从键盘接受一个正整数，该正整数作为行数，输出以下图形
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *

      例如：输入5，则打印如上图5行

    */

    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入一个正整数");
    int row = s.nextInt();

    //n行循环n次
    for(int h=1; h<=row;h++){//这里h要=1不能是h=0;h<row不然最终编译会多一行
      for(int space=0; space<row-h; space++){
        System.out.print(" ");
      }
      for(int x=0;x<h*2-1;x++){
        System.out.print("*");
      }
      System.out.println();
    }

    //小芳的妈妈每天都给她2.5元钱，她都会存起来，每当这一天是存钱的第5天或者是5的倍数的话，她都会
    //花去6元钱，请问，经过多少天，小芳才可以存到100元钱
    double money = 0.0;
    int day = 0;
    while(money<100){
      day++;
      money += 2.5;
      if(day %5 == 0){
        money -= 6;
      }
    }
    System.out.println("小芳经过"+day+"存到了"+money+"元");



  }
}
