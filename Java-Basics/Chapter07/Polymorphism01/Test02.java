public class Test02{
  public static void main(String[] args){

    Animal a = new Bird();
    Animal b = new Cat();

    if(a instanceof Bird){
      Bird x = (Bird)a;
      x.sing();
    }else if(a instanceof Cat){
      Cat y = (Cat)a;
      y.meow();
    }

    if(b instanceof Bird){
      Bird x = (Bird)b;
      x.sing();
    }else if(b instanceof Cat){
      Cat y = (Cat)b;
      y.meow();
    }

  }
}
