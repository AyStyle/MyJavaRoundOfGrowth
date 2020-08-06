package ankang.java9.learn.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-06
 */
public class JavaStream {

    /**
     * Java9在Stream中提供了四个新方法：
     * 1. takeWhile：从开头开始获取尽可能多的元素，直到条件不成立为止
     * 2. dropWhile: 从开头开始删除尽可能多的元素，直到条件不成立为止
     * 3. ofNullable：创建一个单元素的Stream对象，如果该元素为null，则：返回一个空Stream对象，否则返回单元素的Stream对象
     * 4. iterate：java9提供了一个iterate的重载方法，可以实现控制Stream元素的个数
     */

    public static void main(String[] args) {
        // takeWhileDemo();
        // dropWhileDemo();
        // ofNullableDemo();
        iterateDemo();
    }

    /**
     * 从开头开始获取尽可能多的元素，直到条件不成立为止
     */
    private static void takeWhileDemo() {
        final Stream<Integer> stream = Stream.of(52 , 68 , 27 , 78 , 42 , 76 , 9 , 24 , 79 , 53 , 14 , 66);
        stream.takeWhile(x -> x > 9).forEach(System.out::println);
    }

    /**
     * 从开头开始删除尽可能多的元素，直到条件不成立为止
     */
    private static void dropWhileDemo() {
        final Stream<Integer> stream = Stream.of(52 , 68 , 27 , 78 , 42 , 76 , 9 , 24 , 79 , 53 , 14 , 66);
        stream.dropWhile(x -> x > 9).forEach(System.out::println);
    }

    /**
     * 创建一个单元素的Stream对象，如果该元素为null，则：返回一个空Stream对象，否则返回单元素的Stream对象
     */
    private static void ofNullableDemo() {
        Stream.ofNullable(1).forEach(System.out::println);
    }

    /**
     * java9提供了一个iterate的重载方法，可以实现控制Stream元素的个数
     */
    private static void iterateDemo() {
        // java8，创建只有100个元素的Stream对象
        Stream.iterate(0 , x -> ++x).limit(100).forEach(System.out::print);

        System.out.println();

        // java9，创建只有100个元素的Stream对象
        Stream.iterate(0 , x -> x < 100 , x -> ++x).forEach(System.out::print);
    }

}
