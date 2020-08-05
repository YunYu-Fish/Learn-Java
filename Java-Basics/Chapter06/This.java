/*
  this:
  - this是一个关键字，求安部消协

  - this是什么？在内存方面是怎么样的？
    * 一个对象一个this
    * this是一个变量，是一个引用，this保存当前对象的内存地址，指向自身，所以严格意义上来说，this代表的就是“当前对象”
    * this存储在堆内存当中对象的内部

  - this只能使用在实例方法中，谁调用这个实例方法，this就是谁，所以this代表的是当前对象

  - "this."大部分情况下是可以省略的

  - this不能出现在静态方法中
    this代表当前对象，静态方法中，不存在对象
*/
public class This{
  public static void main(String[] args){

  Customer c1 = new Customer("Sun");
  c1.shopping();
  Customer c2 = new Customer("Yun");
  c2.shopping();
  }
}

class Customer{

  //实例变量，属性(必须使用“引用.”调用)
  String name;

  //构造方法
  public Customer(){

  }
  public Customer(String s){
    name = s;
  }

  //实例方法
  public void shopping(){
    //这里的this是谁？是当前对象
    //c1调用shopping(),this是c1
    //c2调用shopping(),this是c2
    //System.out.println(this.name + "正在购物");
    //this是可以省略的，还是默认访问“当前对象”的name
    System.out.println(this.name + "正在购物");

  }
}
