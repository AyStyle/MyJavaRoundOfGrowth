package ankang.java10.learn.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-06
 */
public class Collection {

    /**
     * java10 新增了只读集合的创建方法，copyOf
     * 注意：
     * 如果copyOf传入的集合是一个只读集合，那么copyOf返回的只读集合与传入的集合相同（地址相同）
     * 否则copyOf将创建一个只读集合，此时的集合与传入的集合不同
     *
     * @param args
     */
    public static void main(String[] args) {
        var list = List.of(1 , 3 , 5 , 7 , 9);
        var copyOf = List.copyOf(list);

        System.out.println(list == copyOf);

        var l = new ArrayList<Integer>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        var c = List.copyOf(l);

        System.out.println(l == c);
    }

}
