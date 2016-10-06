import com.google.common.collect.Lists;
import javaslang.Tuple;
import javaslang.Tuple2;
import javaslang.collection.LinkedHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(100);

        long startTime = System.currentTimeMillis();
        RangeBuilder2.split(list).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime2 = System.currentTimeMillis();
        RangeBuilder.split(list).forEach(System.out::println);
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);

        //Oczekiwany wynik:
        //Range{begin=2, end=5, numbers=[2, 3, 4, 5]}
        //Range{begin=10, end=11, numbers=[10, 11]}
        //Range{begin=20, end=20, numbers=[20, 20]}
        //Range{begin=24, end=26, numbers=[24, 25, 26]}
        //Range{begin=100, end=100, numbers=[100, 100]}



    }
}
