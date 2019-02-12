package test;

import java.io.PrintStream;

/**
 * Created by tubangwu on 2017/4/16.
 */
public class Minstrel {

    private PrintStream stream;


    //构造器注入
    public Minstrel(PrintStream printStream){
        this.stream=printStream;
    }


    public void output(){
        stream.print("111");

    }

}
