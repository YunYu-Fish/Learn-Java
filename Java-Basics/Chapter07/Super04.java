/*
  - this.什么时候不能省略？
    public void setName(String name){
      this.name = name;
    }

  - super.什么时候benign省略？
    父中有，子中又有，如果想在子中访问“父的特征”，super.不能省略
*/
public class Super04{
  public static void main(String[] args){

  Vip v = new Vip("张三");
  v.shopping();

  }
}

class Customer{
  String name;

  public Customer(){}

  public Customer(String name){
    this.name = name;
  }
}

class Vip extends Customer{

  //假设子类也有一个同名属性
  String name;

  public Vip(){}

  public Vip(String name){
    super(name);
  }

  public void shopping(){

    System.out.println(this.name + "正在购物！");
    System.out.println(super.name + "正在购物！");
    System.out.println(name + "正在购物！");
  }
}
