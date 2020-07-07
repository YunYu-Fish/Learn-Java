public class Homework03{
  public static void main(String[] args){

    //判断以下程序的输出结果
      int i = 10;
      int a = i+i++;
      System.out.println("a="+a);//"a=20"
      System.out.println("i="+i);//"i=11"

      int b = i + ++i;
      System.out.println("b="+b);//"b=23"
      System.out.println("i="+i);//"i=12"

      int c = i+i--;
      System.out.println("c="+c);//"c=24"
      System.out.println("i="+i);//"i=11"

      int d = i + --i;
      System.out.println("d="+d);//"d=21"
      System.out.println("i="+i);//"i=10"


    //判断以下程序的输出结果：
    int x = 15;
    int y = 2;
    double z = 2;
    System.out.println(x+"/"+y+"="+(x/y));//"15/2=7"
    System.out.println(x+"%"+y+"="+(x%y));//"15%2=1"
    System.out.println(x+"/"+z+"="+(x/z));//"15/2=7.5"
    System.out.println(x+"%"+z+"="+(x%z));//"15%2=1.0"

  }
}
