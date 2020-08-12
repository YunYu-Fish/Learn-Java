 /*
  - 多态的基础语法
    * 多态语法有两个概念：
      - 向上转型
        子------>父（自动类型转换）[upcasting]
      - 向下转型
        父------>子（强制类型转换，需要加强制类型转换）[downcasting]
      ！！！java允许向上和向下转型，但是两种类型直接必须有继承关系，不然会报错
      但是工作的时候不要说自动、强制转型，显得没那么专业，说向上和向上转型

    * 多态指的是：
      父类型引用指向子类型对象，包括编译阶段和运行阶段
      编译阶段：绑定父类的方法
      运行阶段：动态绑定子类型对象的方法
      多种形态

    * 什么时候使用“向下转型”？
      当需要访问的是子类对象中“特有”的方法，此时必须进行向下转型
 */
public class Test01{
  public static void main(String[] args){

    Animal a = new Animal();
    a.move();

    Bird b = new Bird();
    b.move();

    Cat c = new Cat();
    c.move();

    //这样可以吗？ 可以
    Animal c2 = new Cat();
    c2.move();//猫在走猫步

    Animal b2 = new Bird();
    b2.move();//鸟儿在飞翔


    System.out.println("------------------------------");
    //这里可以实现子类的特有特征？ 不能,因为编译器识别c3的类型是Animal
    Animal c3 = new Cat();
    //c3.meow();

    //非要调用meow()方法怎么办？
    //使用向下转型
    //c3是Animal类型，转成Cat，Animal和Cat直接存在继承关系，所以编译运行都通过
    Cat x = (Cat)c3;
    x.meow();//一起喵喵喵喵喵～

    //向下转型有风险吗？
      Animal b3 = new Bird();
      /* 分析以下程序，是编译报错还是运行报错？
         编译器检测到b3这个引用是Animal类型，而Animal和Cat之间存在继承关系，所以可以向下转型，编译没有问题

         在实际运行过程中，堆内存实际创建对对象是Bird对象，Bird和Cat之间没有继承关系，所以无法运行
      */
      //Exception in thread "main" java.lang.ClassCastException: class Bird cannot be cast to class Cat (Bird and Cat are in unnamed module of loader 'app')
      //Cat y = (Cat)b3;
      //y.meow();


      //如何避免ClassCastException异常的发生？？
      /*
        - 运算符：instanceof
          * instanceof可以在运行阶段动态判断引用指向的对象的类型
          * instanceof的语法：
            (引用instanceof类型)
          * instanceof运算符的运算结果只能说：true/false
          * c是一个引用，c变量保存了内存地址指向了堆中的对象
            假设(c instanceof Cat)为true表示：
              c引用指向的堆内存中的java对象是一个Cat
            假设(c instanceof Cat)为false表示：
              c引用指向的堆内存中的java对象不是一个Cat
      */

      //任何时候，对类型进行向下转型时，一定要使用instanceof运算符进行判断（java规范中规定）
      //System.out.println(b3 instanceof Cat);
      if(b3 instanceof Cat){
        Cat y = (Cat)b3;
        y.meow();
      }
  }
}
