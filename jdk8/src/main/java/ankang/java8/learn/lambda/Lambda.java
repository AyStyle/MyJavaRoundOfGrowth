package ankang.java8.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-20
 */
public class Lambda {

    /*
     * Lambda表达式：特殊的匿名内部类，语法比匿名内部类更简洁
     * 特点：
     *      1.Lambda表达式允许把函数作为一个方法的参数（函数作为方法参数传递），将代码像数据一样传递。
     *      2.Lambda表达式不会生成一个单独的内部类文件，匿名内部类会生成。
     *
     * 语法：<函数式接口> <变量名> = ([参数类型1]参数1, [参数类型2]参数2, [参数类型3]参数3) -> {
     *      // 方法体
     * };
     * 注意事项：
     *      1.形参列表的参数类型会自动推断，即：参数类型可以省略不写。
     *      2.如果形参列表为空，则：用()表示
     *      3.如果形参列表参数个数为1，则：可以省略()，直接使用参数，即：o -> {};
     *      4.当方法体中只有一条语句时：
     *          4.1.无返回值，则：{}可以省略，即：() -> System.out.println();
     *          4.2.有返回值，则：若想省去{}，那么return关键字也必须省去，即：() -> obj;
     */

    public static void main(String[] args) {
        // Lambda表达式线程
        getThreadByLambda().start();

        // Runnable接口线程
        getThreadByRunnable().start();

        // *******************************************************************
        final List<String> list = new ArrayList<String>() {
            {
                add("ccc");
                add("a");
                add("bb");
            }
        };


        // Lambda Comparator
        Collections.sort(list , getComparatorByLambda());
        System.out.println(list);

        // 匿名内部类Comparator
        list.add("");
        System.out.println(list);
        Collections.sort(list , getComparatorByComparator());
        System.out.println(list);

    }

    /**
     * 通过Lambda表达式获取线程
     *
     * @return
     */
    private static Thread getThreadByLambda() {
        /*
         * 写法一：Runnable runnable = () -> {System.out.println()};
         *
         * 写法二：Runnable runnable = () -> System.out.println();
         *        写法二只能在只有一行内容的时候使用
         *
         * 写法三：将写法一/写法二的内容直接写到对象上 new Thread(() -> System.out.println());
         */

        return new Thread(() -> System.out.println("this is a lambda thread."));
    }

    /**
     * 通过Runnable接口获取线程
     *
     * @return
     */
    private static Thread getThreadByRunnable() {
        // 这里使用的是匿名内部类
        return new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("this is a runnable thread.");
            }
        });
    }

    /**
     * 通过Lambda表达式获取Comparator
     *
     * @return
     */
    private static Comparator<String> getComparatorByLambda() {
        return (o1 , o2) -> o1.length() - o2.length();
    }

    /**
     * 通过匿名内部类获取Comparator
     *
     * @return
     */
    private static Comparator<String> getComparatorByComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1 , String o2) {
                return o1.length() - o2.length();
            }
        };
    }

}
