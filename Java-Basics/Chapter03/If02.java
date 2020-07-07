/*
  业务要求：
    - 从键盘上接受一个人的年龄
    - 年龄要求为【0-150】，其他值表示非法，需要提示非法信息
    - 根据人的年龄来动态的判断属于生命的哪个阶段？
      【0-5】     婴幼儿
      【6-10】    少儿
      【11-18】   少年
      【19-35】   青年
      【35-55】   中年
      【55-150】  老年
    - 请使用if语句完成以上的业务逻辑
*/
public class If02{
  public static void main(String[] args){
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("请输入年龄：");
    int age = s.nextInt();
    //System.out.println("测试一下，您输入的年龄是："+age);
    /*if(age<0 || age>150){
      System.out.println("对不起，您的输入不合法");
    }else if(age>=0 && age<=5){//这样比较啰嗦，可以直接写age<6
      System.out.println("您的输入合法，是婴幼儿期");
    }else if(age<11){
      System.out.println("您正处在少儿期");
    }else if(age<19){
      System.out.println("您正处在少年期");
    }else if(age<36){
      System.out.println("您正处在青年期");
    }else if(age<56){
      System.out.println("您正处在中年期");
    }else{
      System.out.println("您已经步入老年期了！");
    }*/

    //改良代码
    String str = "老年";
    if(age<0 || age>150){
      System.out.println("对不起，您的输入不合法");
      return;//不合法就终止程序执行
    }else if(age<6){
      str = "婴幼儿";
    }else if(age<11){
      str = "少儿";
    }else if(age<19){
      str = "少年";
    }else if(age<36){
      str = "青年";
    }else if(age<56){
      str = "中年";
    }
    System.out.println(str);
  }
}
