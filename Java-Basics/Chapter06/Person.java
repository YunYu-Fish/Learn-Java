/*
  - 程序不封装有什么缺点？
    Person类的age属性对外暴露，可以在外部程序中随意访问，导致了不安全

  - 如何解决？
    对程序进行封装
*/

/*
  这是没有封装的Person
public class Person{
  //年龄
  int age;
}
*/

//尝试封装一下，对外只提供简单的操作入口
public class Person{
  //被private修饰之后，该数据只能在本类中访问
  private int age;

  //但无法修改这个方法意义就不大了
  //可以对外提供简单的访问入口，外部程序只能通过调用以下的代码来完成访问
  //写一个方法专门来完成读(get)
  //写一个方法专门来完成写(set)
  //!!: get和set方法不应该带有static，因为get读年龄和set改年龄都是操作的一个对象的年龄

  /*
    封装的语法格式：
    [修饰符列表]返回值类型 方法名(形式参数列表){
  }
    !!: java开发规范中有要求，set方法和get方法要满足以下格式
        get方法
        public 返回值类型 get + 属性名首字母大写(无参){
        return xxx;
      }
        set方法
          public void set + 属性名首字母大写(有1个参数){
          xxx = 参数;
        }
  */

  //get方法
  public int getAge(){
    return age;
  }

  //set方法
  public void setAge(int nianLing){
    //在这个位置设置关卡
    if(nianLing<0||nianLing>120){
      System.out.println("对不起，年龄值不合法，请重新赋值！");
      return;
    }
    age = nianLing;
  }
}
