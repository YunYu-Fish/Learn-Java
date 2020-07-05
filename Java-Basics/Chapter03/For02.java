public class For02{
  public static void main(String[] args){

    //for的其他形式
    for(int i=10;i>0;i--){
      System.out.println("i="+i);//10,9,8...1
    }

    //变形
    for(int i=0;i<10;i+=2){
      System.out.println("value1="+i);//0,2,4,6,8
    }

    //死循环
    /*
    for(int i =100; i>0; i%=3){
      System.out.println("value2="+i);//100 1 1...1
    }
    */

    //使用for循环，实现1～100所有奇数求和
    //方法1
    int sum = 0;
    for(int i=1;i<100;i+=2){
          sum += i;
    }
    System.out.println(sum);

    //方法2
    int sum2 =0;
    for(int i=1;i<=100;i++){
      if(i%2==1){
        sum2 +=i;
      }
    }
    System.out.println(sum2);
  }
}
