package StreamExample;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MainStreamExample {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println(IntStream.range(1, 4));
        IntStream.range(1, 4).forEach(System.out::println); // 1 2 3

        System.out.println("-------------------");
        System.out.println(IntStream.of(1, 2, 3));
        IntStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3

        System.out.println("-------------------");
        System.out.println(DoubleStream.of(1, 2, 3));
        DoubleStream.of(1, 2, 3).forEach(System.out::println); // 1.0 2.0 3.0

        System.out.println("-------------------");
        System.out.println(LongStream.range(1, 4));
        LongStream.range(1, 4).forEach(System.out::println); // 1 2 3
        System.out.println("------------------");
        System.out.println(LongStream.of(1, 2, 3));
        LongStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3

    }
}
