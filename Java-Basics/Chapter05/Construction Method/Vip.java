public class Vip{
  //会员号
  long no;
  //姓名
  String name;
  //生日
  String birth;
  //性别
  boolean gender;

  public Vip(){
  }

  public Vip(long huiYuanHao, String xingMing){
    no = huiYuanHao;
    name = xingMing;
    //实际上这里还有两行代码（没有手动赋值，系统都会默认赋值）
    //birth = null;
    //gender = false;
  }

  public Vip(long huiYuanHao, String xingMing, String shengRi){
    no = huiYuanHao;
    name = xingMing;
    birth = shengRi;
  }

  public Vip(long huiYuanHao, String xingMing, String shengRi, boolean xingBie){
    no = huiYuanHao;
    name = xingMing;
    birth = shengRi;
    gender = xingBie;
  }
}
