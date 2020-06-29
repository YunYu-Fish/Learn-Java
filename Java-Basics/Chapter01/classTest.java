/*
  此类型程序可以通过编译并会生成三个分别名为“A，B，C”的class文件

    * 一个java源文件可以定义多个class

    * public的类不是必须的

    * 在源文件中只要有一个class的定义，那么必然会对应生成一个class文件

    * public类可以没有，但如果有的话，public修饰但类名必须和源文件名称保持一致

    * 一般一个软件的执行入口是一个，不会出现多个，此次只是测试

*/
class A{
  //想从这个入口进去执行怎么办？java A
  public static void main(String[] args){
    System.out.println("Test A...");
  }
}

class B{
  ////想从这个入口进去执行怎么办？java B
  public static void main(String[] args){
    System.out.println("Test B...");
  }
}

class C{
  //想从这个入口进去执行怎么办？java C
  public static void main(String[] args){
    System.out.println("Test C...");
  }
}
