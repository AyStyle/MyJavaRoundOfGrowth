package ankang.java8.learn.method;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-22
 */
public class Method {

    /*
     * 方法引用：方法应用是Lambda表达式的一种简写形式。如果Lambda表达式方法体中只是调用一个特定的已经存在的方法，则：可以使用方法引用。
     * 常见形式：
     *       对象::实例方法 - 当参数对象使用到某个具体对象的方法时使用，eg：methodDemo1
     *       类::静态方法 - 当参数对象使用到某个具体类的静态方法时使用，eg：methodDemo2
     *       类::实例方法 - 当参数实例对象使用到自身某个实例方法时使用，eg：methodDemo3
     *       类::new - 当需要实例化某个具体类的对象时使用，且该类必须具有无参构造器，eg：methodDemo4
     * */

    public static void main(String[] args) {
        methodDemo1();
        methodDemo2();
        methodDemo3();
        methodDemo4();
    }

    /**
     * 对象::实例方法
     * 当参数对象使用到某个具体对象的方法时使用
     */
    private static void methodDemo1() {
        // Lambda
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("对象::实例方法 -> Lambda");

        // 方法引用
        Consumer<String> c2 = System.out::println;
        c2.accept("对象::实例方法 -> 方法引用");
    }

    /**
     * 类::静态方法
     * 当参数对象使用到某个具体类的静态方法时使用
     */
    private static void methodDemo2() {
        // Lambda
        Comparator<Integer> c1 = (i1 , i2) -> Integer.compare(i1 , i2);
        System.out.println(c1.compare(1 , 2));

        // 方法引用
        Comparator<Integer> c2 = Integer::compare;
        System.out.println(c2.compare(2 , 1));
    }

    /**
     * 类::实例方法
     * 当参数实例对象使用到自身某个实例方法时使用
     */
    private static void methodDemo3() {
        // Lambda
        Function<String, String> f1 = str -> str.toUpperCase();
        System.out.println(f1.apply("abcdefg"));

        // 方法引用
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("abcdefg"));
    }

    /**
     * 类::new
     * 当需要实例化某个具体类的对象时使用，且该类必须具有无参构造器
     */
    private static void methodDemo4() {
        // Lambda
        Supplier<Method> m1 = () -> new Method();
        System.out.println(m1);

        // 方法引用
        Supplier<Method> m2 = Method::new;
        System.out.println(m2);
    }

}
