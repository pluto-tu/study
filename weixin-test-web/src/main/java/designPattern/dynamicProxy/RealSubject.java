package designPattern.dynamicProxy;

import org.springframework.stereotype.Component;

/**
 * Created by tubangwu on 2018/11/15.
 *
 * @author tubangwu
 */
@Component
public class RealSubject implements Subject{
    @Override
    public String doSomething(String name) {
        System.out.println(name+"doSomething");
        return name+"doSomething";
    }
}
