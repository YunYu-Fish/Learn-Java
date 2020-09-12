package VehicleHomework;
/*请定义一个交通工具(Vehicle)的类
其中有属性：
速度(speed)
体积(size)等等
方法移动(move())
设置速度(setSpeed(int speed))
加速speedUp(),
减速speedDown()等等.

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且打印出来。
另外调用加速减速的方法对速度进行改变。*/

public class VehicleTest {
    public static void main(String[] args) {
    //通过无参数的构造方法创建对象
    Vehicle v = new Vehicle();
    v.setSpeed(120);
    v.setSize(5);

    //通过有参数的构造方法创建对象
    //Vehicle v1 = new Vehicle(120,5);

    System.out.println("speed ："+v.getSpeed()+", size ："+v.getSize());
    }
}
