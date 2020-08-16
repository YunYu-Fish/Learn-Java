public class Super06{
  public static void main(String[] args){
  Cat c = new Cat();
  c.run();
  }
}

class Animal{
  public void move(){
    System.out.println("Animal move!");
  }
}

class Cat extends Animal{
  public void move(){
    System.out.println("Cat move!");
  }

  public void run(){
    this.move();
    move();
    super.move();
  }
}
