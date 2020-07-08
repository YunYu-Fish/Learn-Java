/*
  控制语句包括哪几类

  - 选择语句：
    * if语句
    * switch语句

  - 循环语句
    * for循环
    * while循环
    * do..while..循环

  - 转向语句
    * break
    * continue
    * return
*/

/*
  - if语句的语法结构以及运行原理？
    * if语句是粉质语句，也可以叫做条件语句
    * if语句的语法格式
      - if(布尔表达式){
           java语句;
           java语句;
         }
        这里的一个大括号{}叫做一个分之
        如果布尔表达式的结果是true，则执行大括号中的程序，否则大括号中代码不执行

      - if(布尔表达式){//分支1
            java语句;
        }else{       //分支2
            java语句;
        }
        执行原理：如果布尔表达式的结果是true，则只执行分支1
                如果布尔表达式的结果是false，则只执行分支2
        这个写法可以保证一定会有一个分支执行

      - if(布尔表达式1){       //分支1
            java语句;
        }else if(布尔表达式2){ //分支2
            java语句;
        }else if(布尔表达式3){ //分支3
            java语句;
        }else if(布尔表达式4){ //分支4
            java语句;
        }...
        先判断布尔表达式1，如果为true，则执行分支1，if语句结束；
        如果为false，则判断布尔表达式2，如果为ture，执行分支2，if语句结束；
        如果...以此类推，只要其中一个分支执行，整个if结束

      - if(布尔表达式1){       //分支1
            java语句;
        }else if(布尔表达式2){ //分支2
            java语句;
        }else if(布尔表达式3){ //分支3
            java语句;
        }else if(布尔表达式4){ //分支4
            java语句;
        }else{
            java语句;         //以上条件没有一个成立的，这个else就执行了
        }
*/
/*
  - 对于if语句来说，在任何情况下只有一个分支执行，不可能存在两个或者更多个分支执行，if语句中只要
    有一个分支执行了，整个if语句就结束了【相对于一个完整的if语句来说】

  - 以上4种语法机制种，凡是带有else分支的，一定可以保证会有一个分支执行，第一种和第三种没有else分支，
    这样的语句可能会导致最后一个分支都不执行

  - 当分支当中“java语句”只有一条时，大括号{}可以省略，但为了可读性，最好不要省略

  - 控制语句和控制语句直接是可以嵌套的，但是嵌套的时候大家最好一个语句一个语句进行分析，不要冗杂
    在一起

  -
*/

public class If01{
  public static void main(String[] args){

    boolean gender = true;

    if (gender){
      System.out.println("男");
    }else{
      System.out.println("女");
    }

    //可改良成三目运算符
    gender = false;
    System.out.println(gender ? "男":"女");

    //代码可以这样写吗？
    //()小括号当中最终取的值是gender变量的值
    //而gender是布尔类型，所以可以通过
    gender = false;
    if(gender){
      //可改良成三目运算符
      gender = false;
      System.out.println("男");//永远输出男
    }else{
      //虽然这个写法可以，但是会导致else分支永远不能执行
      System.out.println("女");

      //判断下面程序会出现问题吗？会出现什么问题？第几行代码报错？
      if(gender)
        System.out.println("男");
        System.out.println("HelloWorld!");
        //以上三行代码没有问题，分支里只有一个java语句的时候，大括号可以省略，另一个println只是main方法里的一个普通输出
      else//从这里开始报错，因为中间插入里一个普通输出后，这里的else就缺少了if
        System.out.println("女");
    }
}
