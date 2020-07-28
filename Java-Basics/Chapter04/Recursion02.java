public class Recursion02{
  public static void main(String[] args) {
    System.out.println(sum(17));
    System.out.println(sum(5));
    System.out.println(factorial(4));
  }

//先不使用递归，编写一个方法计算1～n的和
/*
  public static int sum(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
      sum = sum + i;
    }
    return sum;
  }
  */

//用递归的方法编写一个方法计算1～n的和
  public static int sum(int n){
    if(n == 1)
      return 1;
    return n+sum(n-1);
  }

//使用递归的方式计算N的阶乘
public static int factorial(int n){
  if(n==1)
    return 1;
  return n*factorial(n-1);
}



}
