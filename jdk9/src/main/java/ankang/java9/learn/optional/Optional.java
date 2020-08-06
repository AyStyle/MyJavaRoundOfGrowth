package ankang.java9.learn.optional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-06
 */
public class Optional {


    /**
     * Java9中对Optional的实例对象提供了stream方法，可以将一个optional对象转换为stream对象
     * @param args
     */
    public static void main(String[] args){
        final List<Integer> list = List.of(1 , 3 , 5 , 7 , 9);
        final java.util.Optional<List<Integer>> optional = java.util.Optional.ofNullable(list);

        final Stream<List<Integer>> stream = optional.stream();
        stream.flatMap(x->x.stream()).forEach(System.out::println);
    }

}
