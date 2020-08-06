/*
  - this除了可以使用在实例方法中，还可以用在构造方法中

  - 通过当前的构造方法去调用另一个本类的构造方法，可以使用以下语法格式：
    this(实际参数列表);

  - this()这个语法的作用是什么？
    代码复用
    通过一个构造方法1去调用构造方法2，可以代码复用，但需要注意的是，构造方法1和构造方法2都是在同一个类当中

  - ！！：this()的调用只能出现在构造方法的第一行，且只能出现一次
*/

public class This03{
  public static void main(String[] args){
    Date d1 = new Date();
    d1.detail();

    Date d2 = new Date(2020,8,5);
    d2.detail();

  }
}

/*
  - 定义一个日期类，可以表示年月日信息
  - 如果调用无参数构造方法，默认创建的日期为：1970年1月1日
  - 同时可以调用有参数的构造方法来创建日期对象
*/

//创建日期类
class Date{
  //年
  private int year;
  //月
  private int month;
  //日
  private int day;

  //无参数的构造方法
  public Date(){
    /*
    this.year = 1970;
    this.month = 1;
    this.day = 1;
    */
    //System.out.println("test");
    //error: call to this must be first statement in constructor
    this(1970,1,1);
  }

  //有参数的构造方法
  public Date(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }

  //setter and getter
  public void setYear(int year){
    if(year<1900){
      System.out.println("您的输入有误，返回默认值");
      this.year = 1970;
      return;
    }
    this.year = year;
  }
  public int getYear(){
    return year;
  }

  public void setMonth(int month){
    if(month<0 || month>12){
      System.out.println("您的输入有误，返回默认值");
      this.month = 1;
      return;
    }
    this.month = month;
  }
  public int getMonth(){
    return month;
  }

  public void setDay(int day){
    if(day<0 || day>31){
      System.out.println("您的输入有误，返回默认值");
      this.day = 1;
      return;
    }
    this.day = day;
  }
  public int day(){
    return day;
  }

//提供一个打印日期的方法
  public void detail(){
    System.out.println("现在是"+year+"年"+month+"月"+day+"日");
  }
}
