public class Couple{
  public static void main(String[] args){
    //创建丈夫对象
    Husband h1 = new Husband("1111111","Sun","19941028",null);
    //创建妻子对象
    Wife w1 = new Wife("777777","Yu","19921012",null);
    //让丈夫和妻子关联
    h1.wife = w1;
    w1.husband = h1;

    //输出丈夫对象的妻子名字
    System.out.println(h1.name+"的妻子是"+h1.wife.name);
    System.out.println(w1.name+"的丈夫是"+w1.husband.name);


  }
}

class Husband{
  //身份证号
  String idCard;

  //姓名
  String name;

  //出生日期
  String birth;

  //妻子
  Wife wife;

  //无参数构造方法
  public Husband(){

  }

  //有参数的构造方法
  public Husband(String s1, String s2, String s3, Wife w){
    idCard = s1;
    name = s2;
    birth = s3;
    wife = w;
  }
}

class Wife{
  String idCard;

  String name;

  String birth;

  Husband husband;

  //无参数构造方法
  public Wife(){

  }

  //有参数的构造方法
  public Wife(String s1, String s2, String s3, Husband h){
    idCard = s1;
    name = s2;
    birth = s3;
    husband = h;
  }
}
