package designPattern.dynamicProxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by tubangwu on 2018/11/15.
 *
 * @author tubangwu
 */
@Component
public class DynamicProxyAop implements InvocationHandler {

    private Object subject;

    public DynamicProxyAop(Object subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before doSomething");
        Object invoke = method.invoke(subject, args);
        System.out.println("after doSomething");
        return invoke;
    }

    public static void main(String[] args) {

        RealSubject realSubject1 = new RealSubject();
        RealSubject realSubject2 = new RealSubject();

        InvocationHandler invocationHandler1 = new DynamicProxyAop(realSubject1);
        InvocationHandler invocationHandler2 = new DynamicProxyAop(realSubject2);

       Subject subject1 =(Subject)Proxy.newProxyInstance(realSubject1.getClass().getClassLoader(),
               realSubject1.getClass().getInterfaces(), invocationHandler1);

        Subject subject2 =(Subject)Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(),
                realSubject2.getClass().getInterfaces(), invocationHandler2);

       String teststr_ = subject1.doSomething("teststr ");
       String teststr1 = subject2.doSomething("teststr   ");


    }
}
