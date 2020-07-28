   /*
    - 构造方法
      * 构造方法是一个比较特殊的方法，通过构造方法可以完成对象的创建，以及实例变量的初始化
        换句话说，构造方法是用来创建对象，同时给对象的属性赋值的（实例变量没有手动赋值的时候，系统会赋默认值）

      * 当一个类没有提供任何构造方法，系统会默认提供一个无参数的构造方法【这个犯法被称为缺省构造器】

      * 调用构造方法怎么调用呢？
        使用new运算符来调用构造方法
        new 构造方法名(实际参数列表);

      * 构造方法的语法结构是
        【修饰符列表】构造方法名（形式参数列表）{
            构造方法体；
            （通常在构造方法体当中给属性赋值，完成属性的初始化）
      }
        ！！：修饰符列表目前统一写public，千万不要写public static
             构造方法名和类名必须一致
             构造方法不需要指定返回值类型，也不能写void，写上void表示普通方法，就不是构造方法了

      *  普通方法的语法结构是？
        【修饰符列表】返回值类型 方法名（形式参数列表）{
            方法体;
      }

      * 构造方法支持方法重载，在一个类中构造方法可以有多个，所有的构造方法名字都是一样的
        方法重载特点：在同一个类中，方法名相同，参数列表不同
   */
   public class Constructor01{
     public static void main(String[] args){

       //调用Student类的无参数构造方法
       new Student();

       //调用普通方法
       Constructor01.doSome();
       doSome();


       //创造Student类型的对象
       Student s1 = new Student();
       //输出“引用”
       //只要输出的不是null,说明这个对象一定是创建完成了
       //此处的输出结果目前是看不懂的，后面再说
       System.out.println(s1);//Student@7440e464

       Student s2 = new Student(100);
       System.out.println(s2);

       //

     }
     public static void doSome(){
       System.out.println("do some !!!!");
     }



   }
