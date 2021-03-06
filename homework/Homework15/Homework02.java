/*
写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate；
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
*/

public class Homework02{
  public static void main(String[] args){
    Account a1 = new Account("Smith, Jane","1000",2000,1.23);
    a1.deposit(100);
    a1.withdraw(960);
    a1.withdraw(2000);

    Account a2 = new Account("Sun","12345",0,20);
    a2.deposit(5000);
    a2.withdraw(8000);
  }
}

//Account的类模拟账户
class Account{
  //客户名
  private String name;

  //账户
  private String id;

  //余额
  private double balance;

  //年利率
  private double annualInterestRate;

  //无参数的构造方法
  public Account(){
  }

  //有参数的构造方法
  public Account(String name,String id, double balance, double annualInterestRate){
    this.name = name;
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  //setter and getter
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setId(String id){
    this.id = id;
  }
  public String getId(){
    return id;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }
  public double getBalance(){
    return balance;
  }

  public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
  }
  public double getAnnualInterestRate(){
    return annualInterestRate;
  }

  public void withdraw(int i){
    if(balance>=i){
      System.out.println("成功取出："+i);
      this.balance = balance - i;
    }else{
      System.out.println("余额不足，取钱失败");
      System.out.println("Customer [" +name+"] " + "has a account ：id is " +id+ " annualInterestRate is "+annualInterestRate+"%"+ " balance is "+balance);
    }
  }


  public void deposit(int k){
    System.out.println("成功存入："+ k);
    this.balance = balance + k;
  }
}
