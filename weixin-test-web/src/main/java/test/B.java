package test;

/**
 * Created by tubangwu on 2018-12-05.
 *
 * @author tubangwu
 */
public class B {

    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("-111");
    }
    static {
        System.out.println(222);
    }

    public static void main(String[] args) {
        B t = new B();
    }
}
