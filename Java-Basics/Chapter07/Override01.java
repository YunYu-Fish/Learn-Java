/*
  - 什么时候需要“方法覆盖”？
    子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，子类有权利对这个方法进行重新编写

  - 方法覆盖又叫做方法重写

  - 当子类对父类继承过来对方法进行“方法覆盖”之后，子类调用该方法对时候，一定执行覆盖之后对方法

  - 什么样当代码构成方法覆盖？
    * 两个类必须要有继承关系
    * 重写之后当方法和之前的方法具有
      相同的返回值类型、相同的方法名、相同的形式参数列表
    * 访问权限不能更低，可以更高
    * 重写之后的方法不能比之前的方法抛出更多的异常，可以更少

  - ！！：
    * 方法覆盖只是针对方法，和属性无关
    * 私有方法无法覆盖
    * 构造方法不能被继承，所以构造方法也不能被覆盖
    * 方法覆盖只是针对实例方法，静态覆盖没有意义

*/

public class Override01{
  public static void main(String[] args){

    //创建鸟类对象
    Bird b = new Bird();
    b.move();

    //创建猫类对象
    Cat c = new Cat();
    c.move();

  }
}

//父类
class Animal{
  //移动
  public void move(){
    System.out.println("动物在移动！");
  }
}

//子类继承父类
class Bird extends Animal{
  //子类继承父类中，有一些“行为”可能不需要改进，有一些“行为”可能面临着必须改进
  //鸟儿移动的时候希望输出鸟儿在飞翔

  //对move方法进行方法覆盖，最好讲父类的方法原封不动的复制过来【不建议手动编写】
  public void move(){
    System.out.println("鸟儿在飞翔！");
  }
}

class Cat extends Animal{
  //猫在移动的时候，希望输出 猫在走猫步
  public void move(){
    System.out.println("猫在走猫步！");
  }
}
