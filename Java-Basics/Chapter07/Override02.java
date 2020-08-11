public class Override02{
  public static void main(String[] args){
    Chinese c = new Chinese();
    c.setName("孙河清");
    c.speak();

    English e = new English();
    e.setName("Yu");
    e.speak();
  }
}

//创建人类类
class People{
  //姓名
  private String name;

  public People(){}
  public People(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void speak(){
    System.out.println(name+"......");
  }
}

//中国人
class Chinese extends People{
  public void speak(){
    System.out.println(this.getName()+"正在说汉语！");
  }
}

//美国人
class English extends People{
  public void speak(){
    System.out.println(this.getName()+" is speaking English!");
  }
}
