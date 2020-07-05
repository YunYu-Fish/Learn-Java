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

    * 用switch模式实现这个功能
*/
public class Homework07{
  public static void main(String[] args){
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入你的考试成绩");
    double grade = s.nextDouble();
    //System.out.println("测试一下，你输入的是成绩"+grade);

    /*
    switch((int)(grade/10)){
    case 0: case 1 : case 2: case 3: case 4:case 5:
      System.out.println("不及格");
      break;
    case 6:
      System.out.println("及格");
      break;
    case 7:
      System.out.println("中");
      break;
    case 8:
      System.out.println("良");
      break;
    case 9: case 10:
      System.out.println("优");
      break;
    default:
      System.out.println("你的输入有误！");
    }
    */
    if(grade<0||grade>100){
      System.out.println("您输入的学生成绩不合法，再见！");
      return;//这个代码的执行会让main方法结束，后面会讲
    }
    String str = "不及格";
    switch((int)(grade/10)){
    case 6:
      str = "及格";
      break;
    case 7:
      str = "中";
      break;
    case 8:
      str = "良";
      break;
    case 9: case 10:
      str = "优";
      break;
    }
    System.out.println("该学生的成绩等级为："+str);

  }
}
