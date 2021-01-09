package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-09
 */
public interface Sort<T extends Comparable<T>> {

    /**
     * 返回一个排序好的数组Copy对象
     *
     * @param elements 被排序元素
     * @return
     */
    T[] sort(T[] elements);

}
