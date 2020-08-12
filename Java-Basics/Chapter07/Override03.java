/*
  - 关于object类中的toString()方法
    * toString()方法的作用是什么？
      将“java对象”转换成“字符串的形式”

    * Object类中toString()方法的默认实现是什么？
      public String toString(){
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
      }

    * 那么toString()方法给的默认实现够用吗？
*/

public class Override03{
  public static void main(String[] args){
    //创建一个日期对象
    MyDate d = new MyDate();
    //调用toString()方法（将对象转换成字符串形式）
    System.out.println(d.toString());//MyDate@6ff3c5b5

    System.out.println(d);

    MyDate d2 = new MyDate(1992,10,12);
    System.out.println(d2);

  }
}

class MyDate{
   private int year;
   private int month;
   private int day;

   public MyDate(){
     this(1970,1,1);
   }
   public MyDate(int year, int month, int day){
     this.year = year;
     this.month = month;
     this.day = day;
   }

   public void setYear(int year){
     this.year = year;
   }
   public int getYear(){
     return year;
   }

   public void setMonth(int month){
     this.month = month;
   }
   public int getMonth(){
     return month;
   }

   public void setDat(int day){
     this.day = day;
   }
   public int getDay(){
     return day;
   }

   //希望转换结果是xxxx年xx月xx日，所以要进行方法重写
   public String toString(){
     return year+"年"+month+"月"+day+"日";
   }
}
