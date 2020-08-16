/*
  - super是一个关键字，全部小写

  - super和this的对比
    * this: this能出现在实例方法和构造方法中
            this的语法是"this.","this()"
            this不能用在静态方法中
            this.大部分情况下是可以省略的
            this.在区分局部变量和实例变量的时候不能省
              public void setName(String name){
                this.name = name;
              }
            this()出现在构造方法第一行，通过当前的构造方法去调用“本类”中其它的构造方法，目的是：代码复用
    * super: super能出现在实例方法和构造方法中
             super的语法是"super.","super()"
             super不能用在静态方法中
             super.大部分情况下是可以省略的
             super.在xxx时候不能省略【在super04讲解】

             super()出现在构造方法第一行，通过当前的构造方法去调用“父类”中其它的构造方法，目的是：创建子类对象的时候，先初始化父类型特征

    * !!:
      - 当一个构造方法第一行，既没有this()也没有super()的话，默认会有一个super()，表示通过当前子类的构造方法调用父类的无参数构造，所以必须保证父类
        的无参数构造方法是存在的

      - this()和super()不能共存，它们都是只能出现在构造方法的第一行
*/
public class Super01{
  public static void main(String[] args){
    //创建子类对象
    new B();
    /*
    A类的无参数构造方法！
    B类的无参数构造方法！
    */
  }
}

class A{
  public A(){
    System.out.println("A类的无参数构造方法！");
  }
}

class B extends A{
  public B(){
    System.out.println("B类的无参数构造方法！");
  }
}
