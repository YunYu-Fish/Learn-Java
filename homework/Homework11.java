public class Homework11{

  public static void main(String[] args) {
    int result = factorial(5);
    System.out.println(result);

    //上面的两行调用代码是否可以并为一行？
    //可以
    System.out.println(factorial(6));

    //对一个单独的方法进行测试
    prime(20);
  }

  /*
  编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
  思考：这个方法应该起什么名字，形参是什么，方法的返回值类型是什么
  */
  public static int factorial(int a){
    int x = 1;
    while(a>1){
      x = x*a;
      a--;
    }
    //谁调用就返回谁
    return x;
  }


  //编写一个方法，输出大于某个正整数n的最小的质数
  /*
  public static void prime(int n){
  while(true){
    n++;
    boolean flag = primeNumber(n);
    if(flag){
      System.out.println(n);
      break;
      }
    }
  }

  //定义一个方法，来判断某个数字是否为质数
  //返回true是质数，false是非质数
  public static boolean primeNumber(int num){
    //如何判断primeNumber
    for(int i=2; i<num; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
  */

//优化上两个代码
  public static void prime(int n){
    while(!primeNumber(++n)){
    }
    System.out.println(n);
  }

  public static boolean primeNumber(int num){
    for(int i=2; i<num; i++) if(num % i == 0)
        return false;
    return true;
  }


}
