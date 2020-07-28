//分析程序的输出结果
//java中规定：参数传递的时候，和类型无关，不管是基本数据还是引用类型数据统一都是将盒子保存的那个“值”复制一份，传递下去

//内存地址也是值，也是盒子中保存的一个东西

public class Test{
  public static void main(String[] args){
    //局部变量i，域是main
    int i = 10;
    //将i变量中保存的10复制一份，传给add方法
    add(i);
    System.out.println("main --->" + i);//10
  }

  public static void add(int k){//k是局部面料，域是add
    k++;
    System.out.println("add --->" + k);//11
  }
}
