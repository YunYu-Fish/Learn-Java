public class Student{
  //学号
  int no;
  //姓名
  String name;
  //年龄
  int age;

  //当前的Student类中并没有定义任何构造方法
  //但是系统实际上会自动给Student类提供一个无参数的构造方法
  //将无参数的构造方法（缺省构造器）写出来
  public Student(){
    System.out.println("无参数的构造方法执行了！");
  }

  //当一个类中手动的提供了构造方法，那么系统将不再提供无参数构造方法
  public Student(int i){
  }

  //没有返回值类型，编译器会判定该方法是构造方法，编译器随即会检测方法名是否与类名相同
  //结果不一致，编译器报错
  /*
  public Abc(String name){
  }
  */
}
