/*
- id,name,password,age都有默认值

- id默认值是0
  name默认值是null
  password默认值是null
  age默认值是0

- 默认赋值时间是在构造方法执行的过程中完成初始化，完成赋值的
*/

public class User{
  //4个属性4个实例变量/对象变量
  //用户id
  int id;
  //用户名
  String name;
  //密码
  String password;
  //年龄
  int age;

  public User(int a){
  }

  public User(){
  //下面的代码表示不再采用系统默认值，手动赋值了
  id = 111;
  name = "Tom";
  password = "12345";
  age = 30;
  }


}
