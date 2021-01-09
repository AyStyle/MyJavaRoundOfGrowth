package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-07
 */
public class InsertionSort extends AbstractSort<Integer> {


    /**
     * 插入排序
     *
     * @param elements
     */
    @Override
    protected void sort0(Integer[] elements) {
        // 外循环控制排序元素的初始位置
        for (int i = 1 ; i < elements.length ; i++) {
            // 声明一个变量将排序的元素保存起来
            final int t = elements[i];

            // 内循环写插入逻辑，当前一个元素大于排序元素时，将前一个元素向后移动，直到前一个元素小于等于排序元素
            // 变量j控制前一个元素的位置
            int j = i - 1;
            while (j >= 0 && elements[j] > t) {
                elements[j + 1] = elements[j];
                j--;
            }
            // 插入元素位置 = 前一个元素位置 + 1
            elements[j + 1] = t;
        }
    }
}
