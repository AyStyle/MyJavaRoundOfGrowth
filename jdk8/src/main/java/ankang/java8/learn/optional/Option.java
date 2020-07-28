package ankang.java8.learn.optional;

import java.util.Optional;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-28
 */
public class Option {

    public static void main(String[] args) {
        /*
         * 创建一个Optional对象：
         *     1.Optional.empty() - 创建一个空Optional对象
         *     2.Optional.of(T t) - 创建一个Option对象
         *     3.Optional.ofNullable(T t) - 创建一个可以为空的Optional对象
         * */
        final Optional<String> optional = Optional.of("ankang");

        /*
         * 获取optional中的对象：
         *      optional.get() - 获取存储的对象，如果为null，则引发NullPointException异常
         *      optional.orElse(T t) - 获取存储对象，如果为null，则使用默认值
         *      optional.orElseGet(Supplier<? extends T> supplier) - 获取存储对象，如果为null，则使用创建型工厂创建一个
         *      optional.orElseThrow(Supplier<? extends Throwable> supplier) - 获取存储对象，如果为null，则使用创建型工厂创建一个异常并引发
         */
        final String str = optional.orElse("wangdong");
        System.out.println(str);
    }

}
