/*
1、在java中任何有效的代码必须写到“类体”当中，最外层必须是一个类的定义

2、public表示公开的，class表示定义一个类，HelloWorld是一个类名，类名后面必须是一对大括号，
  这一对大括号被称为“类体”

3、括号都必须是成对的，建议成对编写，不会遗忘
  {}      []      ()

4、什么时候代码缩进？
  被大括号包着的内容比括号外低一级，需要缩进
  没有合理的缩进，代码可读性很差
  所以大括号里的都要缩进
*/

public class HelloWorld{//声明/定义一个公开的类，名字为HelloWorld
//类体

//整个这一块的代码被称为：main方法（程序的入口，SUN公司java语言规定的）
//也就是说，JVM在执行程序的时候，会主动去找这样一个方法，没有这个规格的方法，程序无法运行
//main方法也被称为主方法
//！！：方法必须放到“类体”中，不能放到“类体”外面
//！！：任何一个程序都要有一个入口，没有入口进不来，无法执行

//主方法里 只有args可以改名字，其它位置不能动
  public static void main(String[] args){//这是一个入口方法

    //方法体
    //！！：方法体由一行一行的“java”语句构成
    //任何一条java语句必须以“;”结尾【一定是英文的;】
    //方法体中的代码遵循自上而下的顺序依次逐行执行


    //System.out.println();这行代码的唯一作用是向控制台输出一句话
    //！！：println后的括号的内容是一个“字符串”的话，必须是用英文双引号扩起来
      System.out.println("Hello World!");

}

//能不能再来一个一摸一样的入口？
//不行，有语法错误
/*
  public static void main(String[] args){

}
*/

//可以定义另外的方法，但是编译后执行的依然是第一个方法
//但现在不执行，以后学习其他语法可以让他执行
  public static void main2(String[] args){
    System.out.println("hahahaha");
  }


}
