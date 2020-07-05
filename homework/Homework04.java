public class Homework04{
  public static void main(String[] args){

    //判断以下程序的输出结果
    boolean x,y,z;
    int a = 15;
    int b =2;
    x = a>b;//true
    y = a<b;//false
    z = a != b;//true
    System.out.println("x="+x);//"x=true"
    System.out.println("y="+y);//"y=flase"
    System.out.println("z="+z);//"z=true"

    //判断以下程序的输出结果
    int d;
    double e;
    d = (int)22.5 + (int)34.7;
    e = (double)d;
    System.out.println("d="+d);//"d=56"
    System.out.println("e="+e);//"e=56.0"

    //判断以下程序的输出结果
    int i =5;
    int j =5;
    int m =5;
    int n =5;
    i++;
    j = j+1;
    m--;
    n = n-1;
    System.out.println(i);//6
    System.out.println(i++);//6
    System.out.println(++i);//8
    System.out.println(i--);//8
    System.out.println();
    System.out.println(j);//6
    System.out.println(j++);//6
    System.out.println(j--);//7
    System.out.println(--j);//5
    System.out.println();
    System.out.println(m);//4
    System.out.println(n);//4

    //判断以下程序的输出结果
    int p = 0;
    int q = 0;
    System.out.println(p);//0
    System.out.println(q);//0
    p++;
    ++q;
    System.out.println(p);//1
    System.out.println(q);//1
    System.out.println("--------------------");
    System.out.println(p++);//1
    System.out.println(++q);//2
    System.out.println("--------------------");
    System.out.println(p);//2
    System.out.println(q);//2
  }
}
