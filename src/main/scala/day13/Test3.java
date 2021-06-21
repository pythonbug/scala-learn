package day13;

/**
 * java中，属性是静态绑定的，
 * 方法是动态绑定的
 */
public class Test3 {
    public static void main(String[] args) {
        SB sb = new Rb();
        System.out.println(sb.name); // 属性是静态绑定，所以还是qy
        sb.show(); // 方法是动态绑定，所以是Rb中的方法
    }
}

class SB{
    String name = "qy";

    public void show(){
        System.out.println("zgwjb");
    }
}

class Rb extends SB{
    String name = "wc";

    @Override
    public void show(){
        System.out.println("zghwjbdez");
    }
}