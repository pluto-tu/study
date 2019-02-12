package exercise;


import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by tubangwu on 2017/12/25.
 *
 * @auther tubangwu
 */

public class CallableTest {

    public static void main(String[] args) {
//        Callable<Integer> callable =  ()->new Random().nextInt(100);
//        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable);
//        new Thread(integerFutureTask).start();
//        try {
//            Thread.sleep(5000);
//            System.out.println(integerFutureTask.get());
//        }catch (Exception e){
//
//        }

        int a = 10;
        Integer ab = 10;
        int i = ab.hashCode();
        printInfo(10);
        //右移
        a = a >> 1;
        printInfo(a);
        // 左移动
        a = a << 1;
        printInfo(a);
        a = a >>> 2;
        printInfo(a);

    }

    /**
     * 输出一个int的二进制数
     *
     * @param num
     */
    private static void printInfo(int num) {
        System.out.println("---" + Integer.toBinaryString(num));
    }


}
