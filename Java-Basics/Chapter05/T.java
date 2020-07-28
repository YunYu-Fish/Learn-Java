public class T{

  A a;

  public static void main(String[] args) {
    D d = new D();
    C c = new C();
    B b = new B();
    A a = new A();
    T t = new T();

    //这里不写代码会出现NullPointException异常（空指针异常）
    c.d = d;
    b.c = c;
    a.b = b;
    t.a = a;

    //编写代码通过t来访问d中的i
    System.out.println(t.a.b.c.d.i);
  }

}

class A {B b;}

class B {C c;}

class C {D d;}

class D {int i;}
