package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by tubangwu on 2017/12/19.
 */
public class FunctionTest {


    Comparator<Apple> byWeight = new Comparator<Apple>() {
        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    };

    Comparator<Apple> byWeight1 = Comparator.comparing(Apple::getWeight);



    public static <T>List<T> filterList(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t :list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }




    static void modifyTheValue(int valueToBeOperated,
                               Function<Integer, Integer> function){
        int newValue = function.apply(valueToBeOperated);

        System.out.println(newValue);
    }

    public static void main(String[] args) {
        int incr = 20;
        int myNumber = 10;

        Function<Integer, Object> integerObjectFunction = (Integer a) -> a + myNumber;


        modifyTheValue(incr,val -> val+myNumber);

//        modifyTheValue(myNumber, val-> val + incr);
//
//        myNumber = 15;
//        modifyTheValue(myNumber, val-> val * 10);
//        modifyTheValue(myNumber, val-> val - 100);
//        modifyTheValue(myNumber, val-> "somestring".length() + val - 100);
    }









}
