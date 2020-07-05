/*
  - 在java中 boolean只有两个值，没有其他值：
    true和false
    【c或c++中，1和0也可以表示布尔类型】

  - boolean类型在实际开发中使用在哪里呢
    使用在逻辑判断当中，通常放在条件的位置上（充当条件）
*/

public class BooleanTest{

  public static void main(String[] args){

    //error: incompatible types: int cannot be converted to boolean
    //boolean gender = 1;

    boolean gender = true;

    int a = 10;
    int b = 20;
    System.out.println(a<b);
    System.out.println(a>b);

    boolean c = a<b;
    System.out.println(c);

    //后面会学习if语句，先看个例子，不懂没关系
    //假设这个布尔型true表示男性，false表示女性
    if(gender){
      System.out.println("男");
    }else{
      System.out.println("女");
    }
  }
}
