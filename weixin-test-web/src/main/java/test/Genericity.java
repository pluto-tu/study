package test;

/**
 * Created by tubangwu on 2017/12/18.
 */
public class Genericity {

    public static  class Box<T>{
        private T data;

        public Box(){

        }

        public Box(T data){
            this.data =data;
        }

        public T getData(){
            return data;
        }
    }


    public static void main(String[] args) {
        Box<String> box = new Box<String>("aaaa");
        Box<Integer> boxInterger = new Box<Integer>(3);

        System.out.println(box.getData()+boxInterger.getData());
    }


}
