public class Homework08{
  public static void main(String[] args){

    // 计算1000以内所有不能被7整除的整数之和
    int t1 = 0;
    for(int a = 0; a<= 1000; a++){
      if(a%7 != 0){
        t1 = t1 + a;
      }
    }
    System.out.println(t1);

    // 计算1+2-3+4-5+6-7...+100的结果
    int t2 = 1;
    for(int b = 2; b<=100; ++b){
      if(b%2==0){
        t2 = t2 + b;
      }else{
        t2 = t2 - b;
      }
    }
    System.out.println(t2);

    //从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为5*4*3*2*1
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入一个正整数:");
    int c = s.nextInt();
    int t3 = 1;
    do{
      t3 = t3 * c;
      c--;
    }while(c>1);
    System.out.println(t3);


    //从控制台接受一个正整数，判断该数字是否为质数
    //【质数：在大于1 的自然数中，除了1和它本身以外不再有其他因数的自然数】
    java.util.Scanner z = new java.util.Scanner(System.in);
    System.out.print("请输入一个正整数:");
    int num = z.nextInt();
    boolean zhiShu = true;//ture表示是质数
    for(int d=2; d<num; d++){
      if(num%d == 0){
        zhiShu = false;
        break;
      }
    }
    System.out.println(num+(zhiShu?"是":"不是")+"质数");


  }
}
