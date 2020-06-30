/*
  使用变量来描述学生的信息
  学生信息包括
  学号【用整数表示】
  姓名【用字符串表示】
  性别【用字符表示】
  身高【用浮点型表示】
  - 第一个学生信息：学号110，姓名张三，性别男，身高1.85米
  - 第二个学生信息：学号120，姓名李四，性别女，身高1.65米
  最终要求将学生的信息输出到控制台
*/

public class Homework02{

  public static void main(String[] args){
    //第一个学生信息
    int xueHao = 110;
    String xingMing = "张三";
    char xingBie = '男';
    double shenGao = 1.85;

    int xueHao2 = 120;
    String xingMing2 = "李四";
    char xingBie2 = '女';
    double shenGao2 = 1.65;

    System.out.println("学号："+ xueHao);
    System.out.println("姓名："+ xingMing);
    System.out.println("性别："+ xingBie);
    System.out.println("身高："+ shenGao);
    System.out.println("---------------");
    System.out.println("学号："+ xueHao2);
    System.out.println("姓名："+ xingMing2);
    System.out.println("性别："+ xingBie2);
    System.out.println("身高："+ shenGao2);
  }
}
