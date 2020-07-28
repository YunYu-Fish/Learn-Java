public class Constructor03{
  public static void main(String[] args){
    //调用不同的构造方法
    Vip v1 = new Vip();
    System.out.println(v1.no);
    System.out.println(v1.name);
    System.out.println(v1.birth);
    System.out.println(v1.gender);

    Vip v2 = new Vip(11111L,"喜羊羊");
    System.out.println(v2.no);
    System.out.println(v2.name);
    System.out.println(v2.birth);
    System.out.println(v2.gender);

    Vip v3 = new Vip(22222L,"美羊羊","1998-10-10");
    System.out.println(v3.no);
    System.out.println(v3.name);
    System.out.println(v3.birth);
    System.out.println(v3.gender);

    Vip v4 = new Vip(33333L,"懒羊羊","2000-01-01",true);
    System.out.println(v4.no);
    System.out.println(v4.name);
    System.out.println(v4.birth);
    System.out.println(v4.gender);
  }


}
