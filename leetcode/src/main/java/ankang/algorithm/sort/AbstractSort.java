package ankang.algorithm.sort;

import java.util.Arrays;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-09
 */
public abstract class AbstractSort<T extends Comparable<T>> implements Sort<T> {

    /**
     * 返回一个排序好的数组Copy对象
     *
     * @param elements 被排序元素
     * @return
     */
    public final T[] sort(T[] elements) {
        final T[] copy = Arrays.copyOf(elements , elements.length);

        sort0(copy);
        return copy;
    }

    /**
     * 排序算法的具体实现
     *
     * @param elements
     */
    protected abstract void sort0(T[] elements);

}
