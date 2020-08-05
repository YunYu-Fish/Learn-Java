/*
  - 带有static的方法怎么调用?
    通过"类名."的方式访问【同一个类中可以省去类名】

  - 没有static的方法怎么调用
    创建对象，通过"引用."的方式访问实例方法
*/

public class Method{
  public static void main(String[] args){

    //调用带有static的方法
    Method.doSome();
    doSome();

    //调用不带static的方法
    //创建对象，再以"引用."的方法访问
    Method mt = new Method();
    mt.doOther();


  }

  public static void doSome(){
    System.out.println("do some!");
  }

  //没有static的方法称为实例方法，也叫对象方法，对象级别的方法
  //目前无法解释，先记住
  public void doOther(){
    System.out.println("do other!");
  }

}
