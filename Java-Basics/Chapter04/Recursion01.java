/*
  - 什么是方法递归？
    方法自己调用自己，这就是方法递归

  - 当递归程序没有结束条件，一定会发生
    栈内存溢出错误：StackOverflowError
    所以，递归必须要有结束条件

    JVM发生错误之后只有一个结果，就是退出JVM

  - 递归有结束条件当情况下，就一定不会发生栈内存溢出错误吗？
    假设这个结束条件是对的，是合法当，递归有的时候也会出现内存溢出错误
    因为有可能递归的太深，栈内存不够了，因为一直在压栈

  - 不建议轻易选择递归
    但是在极少数的情况下，不用递归，这个程序没法实现

  - 在实际的开发中，假设有一天遇到了StackOverflowError，怎么解决？
    * 首先检查递归的结束条件对不对，如果结束条件不对，必须对条件进一步修改，直到正确位置
    * 若是递归结束没问题，这个时候需要手动调整JVM的栈内存初始化大小，可以将栈内存的空间调大
    * 如果调整了大小还是出现这个错误，没办法只能继续调整栈内存的大小
    （java -X）这个命令可以查看调整栈堆大小的参数

*/

public class Recursion01{
  public static void main(String[] args){
    doSome();
  }

  public static void doSome(){
    System.out.println("doSome begin!");
    //doSome()既然是个方法，那么doSome()方法可以调用doSome()吗？
    //可以
    doSome();
    //下面这行代码永远执行不到
    System.out.println("doSome over!");

  }

}
