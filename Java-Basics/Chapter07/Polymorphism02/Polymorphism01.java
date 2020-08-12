/*
  - 编写程序模拟主人喂养宠物的场景
    要求：只要主人喂宠物，宠物就吃
         主人类中只提供一个喂养方法feed()，可以喂养各种类型的宠物
         调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果
*/
public class Polymorphism01{
  public static void main(String[] args){
    Master yun = new Master();
    //喂养叫douNai的狗
    Dog douNai = new Dog();
    yun.feed(douNai);

    //喂养叫小狗子的猫
    Cat xiaoGouZi = new Cat();
    yun.feed(xiaoGouZi);

    //喂养叫why的鹦鹉
    Parrot why = new Parrot();
    yun.feed(why);
  }
}
