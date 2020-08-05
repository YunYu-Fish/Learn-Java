//判断以下程序的执行顺序
public class CodeOrder{

  static{
    System.out.println("A");
  }

  public static void main(String[] args){
    System.out.println("Main begin!");
    new CodeOrder();
    System.out.println("Main over!");
  }

  public CodeOrder(){
    System.out.println("B");
  }

  {
    System.out.println("C");
  }

  static{
    System.out.println("X");
  }

}
/*
  A
  X
  Main begein!
  C
  B
  Main over!
*/
