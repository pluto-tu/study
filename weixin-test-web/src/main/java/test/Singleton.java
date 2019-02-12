package test;

/**
 * Created by tubangwu on 2017/4/12.
 */
public class Singleton {

    /*

    1、私有化构造器
    2、提供一个返回实例的方法（全局访问点）
    这种方法叫做懒汉式  高并发时候会有问题


    //懒汉式单列  第一次调用就实例化自己

    private static test.Singleton instance = null;

     //私有化构造器 不希望其他类创建本类的对象
     private test.Singleton(){
     }
     //静态工厂方法
     public static test.Singleton getInstance(){
         if(instance == null){
             instance = new test.Singleton();
         }
         return instance;
    }


    //线程同步
    private static test.Singleton instance = null;
    //私有化构造器
    private test.Singleton(){
    }
    //静态工厂方法
    public static synchronized test.Singleton getInstance(){  //ynchronized同步锁
        if(instance == null){
            instance = new test.Singleton();
        }
        return instance;
    }

     */

    //饿汉式
//    //当被类加载器加载的时候就把这个类给实例化
//    private static Singleton instance = new Singleton();
//    //私有化构造器
//    private Singleton(){
//    }
//    //静态工厂方法
//    public static Singleton getInstance(){
//        return instance;
//    }
//
//
//    private Minstrel minstrel;
//
//    public static void main(String[] args) {
//
//
//    }

    /**
     * iodh  最好的java单列模式实现  既可以实现延迟加载 又可以保证线程安全 又不影响线程安全
     */

    private Singleton(){

    }


    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }


    private Singleton getInstance(){
        return HolderClass.instance;
    }



}
