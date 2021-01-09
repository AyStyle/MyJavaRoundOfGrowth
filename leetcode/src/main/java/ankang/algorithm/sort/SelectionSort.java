package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-07
 */
public class SelectionSort extends AbstractSort<Integer> {

    /**
     * 选择排序算法
     *
     * @param elements
     */
    @Override
    protected void sort0(Integer[] elements) {
        // 外循环控制排序元素的位置，排序元素个数 = 元素个数 - 1（最后一个元素不需要排序，因为前面的都排好了）
        for (int i = 0 ; i < elements.length - 1 ; i++) {
            // 内循环控制比较元素的位置，比较元素的位置总是从i+1开始（不需要自己和自己比较）
            for (int j = i + 1 ; j < elements.length ; j++) {
                if (elements[i] > elements[j]) {
                    final int t = elements[i];
                    elements[i] = elements[j];
                    elements[j] = t;
                }
            }
        }
    }
}
