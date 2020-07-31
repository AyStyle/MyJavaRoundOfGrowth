package ankang.java9.learn.generic;

import java.util.Comparator;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-31
 */
public class Generic {

    /**
     * java9允许匿名实现类的泛型省略不写，但是变量声明的泛型不可省略
     */

    public static void main(String[] args) {
        /* java9 允许使用new Comparator<>()实现一个匿名实现类
         * java8 不允许，java8使用new Comparator<T>()实现一个匿名实现类（泛型T不能省略）
         * */
        final Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1 , Integer o2) {
                return o1 - o2;
            }
        };
    }

}
