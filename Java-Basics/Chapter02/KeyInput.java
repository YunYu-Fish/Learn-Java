//复制粘贴 现在看不懂
public class KeyInput{
  public static void main(String[] args){

    //创建一个键盘扫描器对象，只要写一次
    //s变量名，可以修改，此处修改了下面也要修改，其他不能改
    java.util.Scanner s = new java.util.Scanner(System.in);

    //接受用户的输入，从键盘上接受一个int类型的数据
    int n = s.nextInt();
    System.out.println("您输入的数字是："+n);

    //如何从键盘上接受一个字符串呢？
    System.out.print("请输入用户名：");
    String name = s.next();
    System.out.println("欢迎"+name+"回来");
  }
}
