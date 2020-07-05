/*
  - 题目：
    * 系统接受一个学生的考试成绩，根据考试成绩输出成绩的等级

    * 等级
      优【90～100】
      良【80～90】
      中【70～80】
      及格【60～70】
      不及格【0～60】

    * 要求成绩是一个合法的数字，成绩必须在0～100直接，成绩可能带有小数

    * 用if模式实现这个功能
*/

public class Homework05{
  public static void main(String[] args){

    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入成绩：");
    double grade = s.nextDouble();
    // System.out.println("测试一下，您输入的成绩是："+grade);

    String str = "不及格";
    if(grade<0 || grade >100){
      System.out.println("成绩不合法！！！");
      return;
    }else if(grade>=90){
      str = "优";
    }else if(grade>=80){
      str = "良";
    }else if(grade>=70){
      str = "中";
    }else if(grade>=60){
      str = "及格";
    }
    System.out.println(str);
  }
}
