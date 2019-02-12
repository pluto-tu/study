package com.bingkun.eight;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public void get(){

        //List<String> collect = Stream.of("aaa", "bb", "ccc").collect(Collectors.toList());


        Integer reduce = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println(reduce);
    }

}
