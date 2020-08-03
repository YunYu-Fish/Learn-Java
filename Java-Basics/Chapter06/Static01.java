/*
 - Static
    * 所有static修饰的都是类相关的，类级别的

    * 所有static修饰的，都是采用"类名."的方式访问

    * static修饰的变量：静态变量

    * static修饰的方法：静态方法

  - 变量的分类
    * 变量根据声明的位置进行划分：
      在方法体当中声明的变量叫做：局部变量
      在方法体外声明的变量叫做：成员变量

    * 成员变量又可以分为：
      实例变量
      静态变量
*/
public class Static01{
  public static void main(String[] args){
  }

  class VarTest{

    //以下实例，都是对象相关的，访问时采用"引用."的方式访问，需要先new对象
    //成员变量中的实例变量
    int i;

    //实例方法
    public void m1(){
    }

    //以下静态的，都是类相关的，访问时采用"类名."的方式访问，不需要new对象
    //不需要对象的参与即可访问，没有空指针异常的发生
    //成员变量中的静态变量
    static int k;

    //静态方法
    public static void m2(){
    }

}
