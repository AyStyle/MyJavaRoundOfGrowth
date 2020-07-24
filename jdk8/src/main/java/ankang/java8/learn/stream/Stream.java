package ankang.java8.learn.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-23
 */
public class Stream {
    /*
     * 流（Stream）：保存的是对集合或数组数据的操作。和集合类似，但集合中保存的是数据。
     * 特点：
     *      1.流自己不会存储元素
     *      2.流不会改变源对象
     *      3.流会返回一个持有结果对象的新Stream
     *      4.流的操作是延迟执行的，等需要结果的时候才会执行
     *
     * 使用：
     *      1.创建流 - 新建一个流
     *      2.中间操作 - 在一个或多个步骤中，将初始的Stream转化为另一个Stream的操作
     *      3.终止操作 - 使用终止操作来产生结果对象，该操作会强制它之前的延迟操作立即执行。在这之后，该Stream就不能使用了
     *
     * 创建流：
     *      1.通过Collection对象的stream()或parallelStream()创建
     *          1.1.stream()方法创建普通流
     *          1.2.parallelStream()创建并行流
     *      2.通过Arrays类的stream()方法创建
     *      3.通过Stream接口的of()、iterate()、generate()方法创建
     *      4.通过IntStream、LongStream、DoubleStream接口中的of()、range()、rangeClosed()方法创建
     *
     * 中间操作：
     *      filter - 过滤：过滤符合条件的数据
     *      limit - 限制：限制数据数量
     *      skip - 跳过：跳过指定数据
     *      distinct - 去重：去除重复数据
     *      sorted - 排序：对数据排序
     *      map - 映射：将数据变为另一个数据
     *      parallel - 并行化：多线程并行处理数据
     *
     * 终止操作：
     *      forEach - 遍历：与for功能相同
     *      min - 最小值：返回流中最小值
     *      max - 最大值：返回流中最大值
     *      count - 统计：返回流中数据的个数
     *      reduce - 规约：对数据进行运算
     *      collect - 收集：将数据收集在一起
     *  */

    public static void main(String[] args) {
//        collectionStreamDemo();
//        arraysStreamDemo();
//        streamStreamDemo();
//        otherStreamDemo();
        operationDemo();
    }

    /**
     * 通过Collection集合创建流
     */
    private static void collectionStreamDemo() {
        final ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(0);

        // 串行流
        final java.util.stream.Stream<Integer> stream = integers.stream();
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 并行流
        final java.util.stream.Stream<Integer> parallelStream = integers.parallelStream();
        parallelStream.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    /**
     * 通过Arrays创建流
     */
    private static void arraysStreamDemo() {
        final int[] ints = {0 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1};
        final IntStream stream = Arrays.stream(ints);

        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    /**
     * 通过Stream.of()、Stream.iterate()、Stream.generate()创建流
     */
    private static void streamStreamDemo() {
        // 通过Stream.of()方法创建流
        java.util.stream.Stream<Integer> stream = java.util.stream.Stream.of(1 , 3 , 5 , 7 , 9);
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 通过Stream.iterate()创建流
        final java.util.stream.Stream<Integer> iterate = java.util.stream.Stream.iterate(0 , i -> i * 2 + 1).limit(10);
        iterate.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 通过Stream.generate()创建流
        final java.util.stream.Stream<Integer> generate = java.util.stream.Stream.generate(() -> 0).limit(10);
        generate.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    /**
     * 通过IntStream、LongStream、DoubleStream接口中的of()、range()、rangeClosed()方法创建
     * 此处以IntStream为例
     */
    private static void otherStreamDemo() {
        // of方法创建
        final IntStream intStream = IntStream.of(2 , 4 , 6 , 8 , 0);
        intStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // range()方法创建
        final IntStream rangeStream = IntStream.range(0 , 10);
        rangeStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // rangeClosed()方法创建。与range()创建的区别，rangeClosed()包含最后一个元素，range()不包含最后一个元素
        final IntStream rangeClosedStream = IntStream.rangeClosed(0 , 10);
        rangeClosedStream.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    /**
     * 操作filter、limit、skip、distinct、sorted、map、parallel
     */
    private static void operationDemo() {
        // filter 过滤操作：过滤出符合条件的数据
        final IntStream filterStream = IntStream.range(0 , 100).filter(x -> x % 7 == 0);
        filterStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // limit 限制操作：限制数据的数量
        final IntStream limitStream = IntStream.range(0 , 100).limit(5);
        limitStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // skip 跳过操作：跳过指定个数的数据，
        final IntStream skipStream = IntStream.range(0 , 100).skip(90);
        skipStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // distinct 去重操作：去除重复数据，如果是对象的话需要重写equals和hashCode()
        final IntStream distinctStream = IntStream.of(1 , 3 , 5 , 3 , 7 , 9 , 7 , 5 , 3 , 1).distinct();
        distinctStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // sorted 排序操作：对数据进行排序
        final IntStream sortedStream = IntStream.of(1 , 3 , 5 , 3 , 7 , 9 , 7 , 5 , 3 , 1).sorted();
        sortedStream.forEach(x -> System.out.print(x + " "));
        System.out.println();
        // sorted 排序操作：对数据进行排序
        final java.util.stream.Stream<Integer> descSortedStream = java.util.stream.Stream.of(1 , 3 , 5 , 3 , 7 , 9 , 7 , 5 , 3 , 1).sorted((i , j) -> j - i);
        descSortedStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // map 映射操作：将数据转换为领一个数据
        final IntStream mapStream = IntStream.range(0 , 10).map(i -> i * i);
        mapStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // parallel 并行化操作：使用多线程操作数据
        final LongStream parallelStream = IntStream.range(0 , 10).parallel().mapToLong(i -> i * i * i * i * i * i * i * i);
        parallelStream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // forEach 遍历操作
        IntStream.range(0 , 10).forEach(System.out::print);
        System.out.println();

        // min 最小值操作
        final OptionalInt min = IntStream.of(5 , 3 , 7 , 1 , 9 , 2 , 8 , 6 , 4).min();
        System.out.println(min.getAsInt());

        // max 最大值操作
        final OptionalInt max = IntStream.of(5 , 3 , 7 , 1 , 9 , 2 , 8 , 6 , 4).max();
        System.out.println(max.getAsInt());

        // count 计算元素个数
        final long count = IntStream.of(5 , 3 , 7 , 1 , 9 , 2 , 8 , 6 , 4).count();
        System.out.println(count);

        // reduce 规约操作
        final OptionalInt reduce = IntStream.of(5 , 3 , 7 , 1 , 9 , 2 , 8 , 6 , 4).reduce(Integer::compare);
        System.out.println(reduce.getAsInt());

        // collect 收集操作
        final List<Integer> collect = IntStream.of(5 , 3 , 7 , 1 , 9 , 2 , 8 , 6 , 4).collect(ArrayList::new , List::add , List::addAll);
        System.out.println(collect);
    }

}
