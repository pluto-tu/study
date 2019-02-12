package test.calllback;

/**
 * Created by tubangwu on 2018/1/21.
 *
 * @author tubangwu
 */
public class A {


    public void executeResult(CallBack callBack,String question){

        System.out.println("B 问的问题是"+question);


        String result = "结果是2";

        callBack.solve(result);

    }
}
