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
        stream1.limit(2).forEach(System.out::println);
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(1,1,"zhangsan"));
        employees.add(new Employees(2,1,"lisan"));
        employees.add(new Employees(3,14,"zhangqia"));
        employees.stream().map((e) ->e.getAge()).filter(e ->e>10).forEach(System.out::println);
    }
}
