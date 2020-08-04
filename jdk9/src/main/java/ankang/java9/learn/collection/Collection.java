package ankang.java9.learn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-04
 */
public class Collection {

    /*
     * Java9对集合进行了升级:
     *      1.添加了不可变集合：Collection、List、Set、Map
     *      2.
     *
     * */

    public static void main(String[] args) {
//        arraysUnmodifiableList();
//        unmodifiableList();
        quickUnmodifiableList();
    }

    /**
     * 使用Arrays创建不可变集合
     */
    private static void arraysUnmodifiableList() {
        final List<Integer> list = Arrays.asList(1 , 2 , 3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);
    }

    /**
     * 使用Collections创建不可变集合
     */
    private static void unmodifiableList() {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        final List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add(4);
        System.out.println(unmodifiableList);
    }

    /**
     * 使用List（Set Map）创建不可变集合
     */
    private static void quickUnmodifiableList() {
        final List<Integer> list = List.of(1 , 2 , 3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);
    }

}
