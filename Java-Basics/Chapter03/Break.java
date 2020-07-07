/*
  break;语句：
  - break;语句比较特殊，特殊在：break;语句是一个单词称为一个完整的java语句
    另：continue也是这样，他俩都是一个单词成为一条语句

  - break;语句可以用在两个地方：
    * switch语句当中，用来终止switch语句的执行
    * 用在循环语句当中，用来终止循环的执行

  - break;语句的执行并不会让整个方法结束，break;语句主要是用来终止离它最近的那个循环语句

  - 如何用break;终止指定的循环？
    * 给循环起个名字
    * break名字；

*/
public class Break{
  public static void main(String[] args){

    //在i=5的时候停止循环怎么做？
    for(int i = 0; i<10; i++){
      if(i==5){
        //break;语句会让离它最近的循环
        break;
      }
      System.out.println("i = "+i);
    }
    //这里的代码照常执行，break;的执行并不会影响这里
    System.out.println("Hello");

    //让这个for循环两次
    for(int k = 0; k<2; k++){//外层for
      for(int i =0; i<10; i++){//内层for
        if(i == 5){
          break;//这个break;语句只能终止最近的for
        }
        System.out.println("i---->"+i);
      }
    }
    System.out.println("----------------------------");
    //以下讲解的内容，开发很少用
    a:for(int k = 0; k<2; k++){
      b:for(int i =0; i<10; i++){
        if(i == 5){
          break a;//终止指定的循环
        }
        System.out.println("i---->"+i);
      }
    }
    System.out.println("haha");

  }
}
