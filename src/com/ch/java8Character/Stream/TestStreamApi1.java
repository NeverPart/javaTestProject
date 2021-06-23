package com.ch.java8Character.Stream;

import com.ch.java8Character.entity.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @className: TestStreamApi1
 * @Auther: ch
 * @Date: 2021/5/24 17:34
 * @Description: Stream的三个操作步骤:1,创建stream 2,中间操作 3,终止操作(终端操作)
 */
public class TestStreamApi1 {
    // 创建stream的四种方式
    @Test
    public void test1() {
        // 1,可以通过Collection 系列集合提供的stream()或parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // 2,通过Arrays中的静态方法stream()获取数组流
        Employee[] emps = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(emps);

        // 3,通过Stream类的静态方法of()
        Stream<String> stream3 = Stream.of("aa", "bb", "cc", "dd");

        // 4,创建无限流
        // 迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10)
                .forEach(System.out::println);
        // 生成
        Stream.generate(()->Math.random())
                .limit(10)
                .forEach(System.out::println);
    }
}
