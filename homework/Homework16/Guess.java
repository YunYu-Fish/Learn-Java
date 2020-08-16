/*
猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功
*/

public class Guess{
  public static void main(String[] args) {

  A a = new A(100);
  B b = new B(a);

  java.util.Scanner s = new java.util.Scanner(System.in);
  while(true){
    System.out.println("请输入要猜测的数字：");
    int guessNum = s.nextInt();
    b.guess(guessNum);
    }


  }
}

//A类
class A{
  private int v;

  public A(){}

  public A(int v){
    this.v = v;
  }

  public void setV(int v){
    this.v = v;
  }

  public int getV(){
    return v;
  }

}

class B{
  //把A作为B的实例变量
  private A a;

  public B(){}

  public B(A a){
    this.a = a;
  }

  public void setA(A a){
    this.a = a;
  }

  public A getA(){
    return a;
  }
  //猜测的方法
  public void guess(int guessNum){
    //this.getA().getV()
    int trueNum = a.getV();
    if(guessNum == trueNum){
      System.out.println("恭喜你！猜测成功！");
      //终止程序的执行，退出jvm
      System.exit(0);
    }else if(guessNum < trueNum){
      System.out.println("小了");
    }else{
      System.out.println("大了");
    }
  }
}
