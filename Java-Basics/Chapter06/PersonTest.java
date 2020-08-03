/*
  - 什么是封装？
    现实生活中有很多东西都是封装的，例如：手机，笔记本电脑，电视机，这些都是外部有一个坚硬的壳儿，保证内部的部件都是安全的
    另外封装了之后，对于使用者来说，不需要关心内部有多么复杂，我们只需要操作外部壳儿上的几个按钮就可以完成操作

  - 封装有什么用？
    * 保证内部结构的安全
    * 屏蔽复杂，暴露简单

  - 在代码级别上，封装有什么用？
    一个类体当中的数据，假设封装之后，对于代码的调用人员来说，不需要关心代码的复杂实现，只需要通过一个简单的入口就可以访问了，另外，类体中安全级别较高
    的数据封装起来，外部人员不能随意访问

  - 代码怎么实现封装？
    * 属性私有化（使用private关键字进行修饰）
    * 对外提供简单的操作入口
*/

public class PersonTest{
  public static void main(String[] args){


    Person p1 = new Person();
    /*
    //访问一个对象的属性，通常包括两种操作，一种是读数据，一种是改数据
    System.out.println(p1.age);//读(get表示获取)

    //修改数据(set表示修改/设置)
    p1.age = 50;
    System.out.println(p1.age);


    //目前在PersonTest这个外部程序中是可以随意对age属性进行操作的
    //一个人的年龄按理来说不应该为负数，但是目前的程序还是让它通过了，这就是一个程序的bug
    p1.age = -100;//改
    System.out.println("您的年龄值是："+p1.age);//读
    */


    //通过"类名."可以调用set和get方法吗？不可以
    //只有方法修饰符列表中有static的时候，才能使用"类名."的方式访问

    //读调用getAge()方法
    //int nianLing = p1.getAge();
    //System.out.println(nianLing);
    System.out.println(p1.getAge());//0

    //改调用setAge()方法
    p1.setAge(20);
    System.out.println(p1.getAge());//20

    //但此时更改年龄为-100依然是可以通过但
    p1.setAge(-100);
    System.out.println(p1.getAge());//-100
  }
}
