/*
  业务需求：
    - 从键盘上接受天气的信息：
      1表示：雨天
      0表示：晴天

    - 同时从键盘上接受性别的信息：
      1表示：男
      0表示：女
      * 当天气是雨天的时候
        男：打一把大黑伞
        女：打一把小花伞
      * 当天气是雨天的时候
        男：直接走起，出去玩耍
        女：擦点防晒霜，出去玩耍

    - 需要使用if语句以及嵌套的方式展现
*/
public class Homework06{
  public static void main(String[] args){
    java.util.Scanner w = new java.util.Scanner(System.in);
    System.out.print("请输入天气：");
    int weather = w.nextInt();
    // System.out.println("测试一下，您输入的天气是："+weather);

    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入性别：");
    int gender = s.nextInt();
    // System.out.println("测试一下，您输入的性别是："+gender);

    if(weather!=0 && weather!=1 || gender!=0 && gender!=1){
      System.out.println("您的输入有误");
      return;
    }if(weather == 1){
      if(gender ==1){
        System.out.println("打一把大黑伞");
      }else{
        System.out.println("打一把小花伞");
      }
    }else{
      if(gender == 1){
        System.out.println("直接走起，出去玩耍");
      }else{
        System.out.println("擦点防晒霜，出去玩耍");
      }
    }

  }
}
