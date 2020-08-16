/*
  - 在恰当的时间使用：super(实际参数列表)
*/

//测试程序
public class Super03{
  public static void main(String[] args){
    CreditAccount c1 = new CreditAccount();
    System.out.println(c1.getActNo()+","+c1.getBalance()+","+c1.getCredit());
    CreditAccount c2 = new CreditAccount("12345678",2000000.0,98.9);
    System.out.println(c2.getActNo()+","+c2.getBalance()+","+c2.getCredit());
  }
}

//父类,账号
class Account{
  private String actNo;
  private double balance;

  public Account(){  }

  public Account(String actNo, double balance){
    this.actNo = actNo;
    this.balance = balance;
  }

  //setter and getter
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

//子类，信用卡账户号
//属性：账号、余额、信用值
class CreditAccount extends Account{
  private double credit;

  public CreditAccount(){  }

  //提供有参数构造方法
  //分析以下程序是否存在编译错误
  public CreditAccount(String actNo, double balance, double credit){
    super(actNo,balance);
    //this.actNo = actNo;
    //this.balance = balance;
    this.credit = credit;
  }

  //setter and getter
  public void setCredit(double credit){
    this.credit = credit;
  }
  public double getCredit(){
    return credit;
  }
}
