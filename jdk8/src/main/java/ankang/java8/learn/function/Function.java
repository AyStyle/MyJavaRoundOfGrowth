package ankang.java8.learn.function;

import java.util.function.Consumer;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-21
 */
@FunctionalInterface
public interface Function {

    /*
     * 函数式接口：如果一个接口只有一个抽象方法，则：该接口为函数式接口
     * 特点：1.只有函数式接口才可以使用Lambda表达式
     *       2.函数式接口只有一个抽象方法
     *
     * 检测函数式接口：@FunctionalInterface注解可以检测一个接口是否为函数式接口
     *
     * 常见函数式接口：
     *      Consumer<T>：参数类型 - T, 返回类型 - void, 说明：该接口为消费型，void accept(T t); 对类型为T的对象应用accept操作
     *      Supplier<T>：参数类型 - 无, 返回类型 - T, 说明：该接口为供给型，T get(); 返回一个类型对T的对象
     *      Function<T,R>：参数类型 - T, 返回类型 - R, 说明：该接口为函数型，R apply(T t); 对类型为T的对象应用apply操作，并返回一个类型为R的对象
     *      Predicate<T>：参数类型 - T, 返回类型 - boolean, 说明：该接口为断言型，boolean test(T t); 确定类型为T的对象是否满足test条件，并返回boolean对象
     *
     *
     * */

    public static void main(String[] args) {
        final Function function = () -> System.out.println("Functional Interface demo.");
        function.func();
    }

    void func();

}

