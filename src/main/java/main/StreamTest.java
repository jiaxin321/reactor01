package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jiaxin on 2020/10/15.
 */

public class StreamTest {
    @Test
    public  void test(){
        System.out.println("123");
        List<String> list  = new ArrayList<>();
        //Stream<String> stream = list.stream();
        Stream<Integer> stream1 = Stream.iterate(0 ,(x) ->x+1 );
        stream1.forEach(System.out::print);
    }
}