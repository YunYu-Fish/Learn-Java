/*
  - 除了静态代码块之外，还有一种语句快叫做：实例语句块

  - 实例语句块在类加载时并没有执行

  - 实例语句块语法？
    {
      java语句;
      java语句;
    }

  - 实例语句块在什么时候执行？
    只要构造方法执行，必然在构造方法执行之前，自动执行实例语句块中的代码
    这也是SUN公司为程序员准备的一个特殊时机，叫做对象构造时机
*/
public class Instance{

  public static void main(String[] args){
    //入口
    System.out.println("Main Begin!");
    new Instance();
    new Instance("Sun");
  }

  //实例语句块
  {
    System.out.println("实例语句块执行");
  }

  //Constructor
  public Instance(){
    System.out.println("无参数构造方法");
  }

  public Instance(String name){
    System.out.println("有参数的构造方法");
  }

}
