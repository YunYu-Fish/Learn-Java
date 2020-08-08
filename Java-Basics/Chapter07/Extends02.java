/*
  - 测试：子类继承父类之后，能使用子类对象调用父类方法吗

  - 在实际开发中，满足什么条件的时候，可以使用继承呢？
    凡是采用“is a ”能描述的，都可以继承

  - 任何一个类，没有显示继承任何类，默认继承Object，那么Object类当中有哪些方法呢？
    Java内置类一套庞大的类库，程序员不需要从0开始写代码，可以基于这套庞大的类库进行“二次”开发
    例如：String是SUN编写的字符串类、System是SUN编写的系统类
      JDK源代码在什么位置 /Library/Java/JavaVirtualMachines/jdk-14.0.1.jdk/Contents/Home/lib/src.zip
*/

public class Extends02{
  public static void main(String[] args){
    /*
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    */
    Extends02 e = new Extends02();
    //5fdba6f9可以“等同看作对象在堆内存当中当内存地址”【实际上是内存地址经过“哈希算法”得出当十六进制当结果】
    System.out.println(e.toString());//Extends02@5fdba6f9
    //如果直接输入“引用”？
    //println方法会自动调用pro的toString()方法
    System.out.println(e);////Extends02@5fdba6f9


  }
}

//默认Object类中有哪些方法？
/*
public class Object {
    //无参数构造方法
    public Object() {}

    //当源代码当中一个方法以“;”结尾，并且修饰符列表中有“native”关键字表示底层调用C++写的dll程序(dll动态链接库文件)
    public final native Class<?> getClass();

    public native int hashCode();

    public boolean equals(Object obj) {
        return (this == obj);
    }

    protected native Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public final native void notify();

    public final native void notifyAll();

    public final void wait() throws InterruptedException {
        wait(0L);
    }

    public final native void wait(long timeoutMillis) throws InterruptedException;

    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }

    protected void finalize() throws Throwable { }
}
*/
