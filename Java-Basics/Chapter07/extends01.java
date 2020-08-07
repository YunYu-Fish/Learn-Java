/*
  - 继承的作用
    * 基本作用：子类继承父类，代码可以得到复用
    * 主要（重要）作用：因为有了继承关系，才有了后期的方法覆盖和多态机制

  - 继承的相关特性
    * B类继承A类，则称A类为超类(supeclass)、父类、基类，B类则称为子类(subclass)、派生类、扩展类
    * java中的继承只支持单继承，不支持多继承，C++中支持多继承，这也是java体现简单性的一点，换句话说，java中不允许这样写代码：class B extends A,C();
    * 虽然java中不支持多继承，但有的时候会产生间接继承的效果，例如：class C extends B; class B extends A;
      也就是说，C直接继承B，其实C还间接继承A
    * java中规定，子类继承父类，除构造方法不能继承外，剩下的都可以继承,但是私有的属性无法在子类中直接访问，只能间接访问
    * java中的类没有显示的继承任何类，则默认继承Object类，Object类是java语言提供的根类（老祖宗类），也就是说，一个对象与生俱来就有Object类型中的所有特征
    * 继承也存在一些缺点，比如耦合度高，父类发生改变之后会马上影响到子类

  */


public class extends01{
  public static void main(String[] args){
    Account a = new Account();
    a.setActNo("11111");
    a.setBalance(10000);
    System.out.println(a.getActNo()+"，余额："+a.getBalance());

    CreditAccount c = new CreditAccount();
    c.setActNo("22222");
    c.setBalance(20000);
    c.setCredit(65.5);
    System.out.println(c.getActNo()+"，余额："+c.getBalance()+",信用度："+c.getCredit());
  }
}
//银行账户号
//账户的属性：账号、余额
class Account{//父类
  private String actNo;
  private double balance;

  public Account(){  }

  public void setActNo(String actNo){
    this.actNo = actNo;
  }
  public String getActNo(){
    return actNo;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }
  public double getBalance(){
    return balance;
  }
}

//信用卡账户号
//属性：账号、余额、信用值
class CreditAccount extends Account{//子类
  private double credit;

  public CreditAccount(){  }

  public void setCredit(double credit){
    this.credit = credit;
  }
  public double getCredit(){
    return credit;
  }
}
