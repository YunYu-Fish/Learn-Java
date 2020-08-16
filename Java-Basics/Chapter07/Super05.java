/*
  通过这个测试得出的结论：
    super不是引用，super也不保存内存地址，super也不指向任何对象
    super只是代表当前对象内部的那一块父类型的特征
*/


public class Super05{
  //实例方法
  public void doSome(){
    System.out.println(this);
    //输出“引用”的时候，会自动调用toString()方法
    //所以等同于System.out.println(this.toString());

    //super可以输出吗？
    //不可以 error: '.' expected
    //System.out.println(super);
  }
  public static void main(String[] args){
    Super05 st = new Super05();
    st.doSome();//Super05@d716361
  }
}
