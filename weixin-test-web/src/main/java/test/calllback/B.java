package test.calllback;


/**
 * Created by tubangwu on 2018/1/21.
 *
 * @author tubangwu
 */
public class B implements CallBack {

    private A a;

    public B(A a) {
        this.a = a;
    }


    public void askQuestion(String question) {

        a.executeResult(this, question);

        play();
    }

    public void play() {
        System.out.println("我逛街去了!");
    }

    @Override
    public void solve(String result) {
        System.out.println("A----》B 结果为:" + result);
    }


    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        b.askQuestion("1+1=？");
    }


}
