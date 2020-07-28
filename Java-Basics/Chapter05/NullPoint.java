/*
  空指针异常(NullPointException)

  - 关于垃圾回收器GC
    在java语言中，垃圾回收器主要针对的是堆内存，当一个java对象没有任何引用指向该对象的时候，GC会考虑将该垃圾对象释放回收掉

  - 出现空指针异常的前提条件是？
    “空引用”访问实例【对象相关】相关的数据时，都会出现空指针异常
*/

public class NullPoint{
  public static void main(String[] args){
    //创建客户对象
    Customer c = new Customer();
    //访问这个客户的id
    System.out.println(c.id);

    c.id = 8888;
    System.out.println("客户的id是:"+c.id);

    c = null;
    //NullPointException
    //编译可以通过，因为编译器只检查语法，编译器发现c是Customer类型，Customer类型中有id属性，所以可以c.id，语法是通过的
    //但是运行的时候需要对象的存在，但是对象没了，尴尬了，就只能出现一个异常
    System.out.println(c.id);
  }
}

class Customer{
  int id;
}
