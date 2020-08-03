/*
  什么时候变量声明为实例的，什么时候声明为静态的？
  - 如果这个类型的所有对象的某个属性值都是一样的，不建议定义为实例变量，浪费内存空间，建议定义为类级别特征，定义为静态变量，在方法区
    中只保留一份，节省内存开销

  - 一个对象一份的是实例变量，所有对象一份的是静态变量

  - 实例的：一定需要使用"引用."来访问
    静态的：建议使用"类名."来访问，但使用"引用."也行，但不建议，静态的如果使用"引用."来访问会让别的程序员产生困惑

  - 空指针异常只会出现在空引用访问实例相关的时候
*/

public class Static02{
  public static void main(String[] args){

    //访问中国人类的国籍，应该使用类名.的方式访问
    System.out.println(Chinese.nationality);

    Chinese c1 = new Chinese("123456789876543","张三");
    System.out.println(c1.idCard);
    System.out.println(c1.name);
    //可以使用c1访问nationality吗 可以
    System.out.println(c1.nationality);

    //假设c1是空引用
    c1 = null;
    //这里会出现空指针异常吗？不会，因为静态变量不需要对象的存在
    System.out.println(c1.nationality);

    //这个一定会空指针异常
    //System.out.println(c1.name);

    Chinese c2 = new Chinese("123457983978439","李四");
    System.out.println(c2.idCard);
    System.out.println(c2.name);
  }
}


//定义一个类：中国人
class Chinese{
  //身份证
  String idCard;
  //姓名
  String name;
  //国籍
  //凡是中国人，国籍必定是中国，此处可以改成静态变量
  //String nationality;

  /*！！！：加static的变量叫做静态变量
           静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了【静态变量存储在方法区】
  */
  static String nationality = "中国";

  //无参数
  public Chinese(){
  }

  //有参数
  public Chinese(String s1, String s2){
    idCard = s1;
    name = s2;
  }

}
