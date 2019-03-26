package test;

/**
 * @author tubangwu
 * @Date 2019/3/26 16:38
 *
 * test volatile 关键字
 *
 * 加 volatile 第二个线程修改了通知第一个线程 不加 第一个线程不知道修改了
 * （在第一个线程不读取或操作running 这个关键字的时候 这样就回去读取最新的值了）
 *
 * 如果 第一个线程去读取running的值 就会督导最新的值
 *          while (running) {
 *                 System.out.println（running）
 *                 counter++;
 *          }
 */
public class ThreadTest {

    volatile  boolean running = true;

    public void test() {

        new Thread(new Runnable() {
            public void run() {
                int counter = 0;
                while (running) {
                    counter++;
                }
               System.out.println("Thread 1 finished. Counted up to " + counter);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                // Sleep for a bit so that thread 1 has a chance to start
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                    // catch block
                }
                System.out.println("Thread 2 finishing");
                running = false;
            }
        }).start();
    }

    public static void main(String[] args) {
        new ThreadTest().test();
    }

}
