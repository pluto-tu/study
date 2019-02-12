package test.exercise;

import java.lang.reflect.Method;

/**
 * Created by tubangwu on 2018/4/26.
 *
 * @author tubangwu
 */
public class Reflect {
    //反射学习

    public static void main(String[] args) throws Exception {
        Proxy target = new Proxy();
        Method method = Proxy.class.getDeclaredMethod("run");
        method.invoke(target);
    }
    static  class Proxy{
        public void run(){
            System.out.println("run");
        }

    }
}
