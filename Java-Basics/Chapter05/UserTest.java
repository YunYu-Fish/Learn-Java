public class UserTest{

  public static void main(String[] args){

    Address a = new Address();
    a.city = "南京市";
    a.street = "栖霞区";
    a.zipcode = "210000";

    User u = new User();
    //System.out.println(u.id);
    //System.out.println(u.username);
    //System.out.println(u.addr);
    u.id = 11111;
    u.username = "Sun";
    u.addr = a;

    //思考：我想知道Sun是哪个城市的，代码该怎么写？
    System.out.println(u.addr.city);
    System.out.println(u.username + "是"+u.addr.city+"的！");
  }
}
