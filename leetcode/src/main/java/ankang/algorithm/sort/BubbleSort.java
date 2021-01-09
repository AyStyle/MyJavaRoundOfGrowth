package ankang.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-06
 */
public class BubbleSort extends AbstractSort<Integer> {

    /**
     * 冒泡排序算法
     */
    @Override
    protected void sort0(Integer[] elements) {
        // 第一圈控制排序轮数，每轮排序完成一个元素：排序轮数 = 元素个数 - 1
        for (int i = 0 ; i < elements.length - 1 ; i++) {
            // 第二圈控制比较次数：比较次数 = 元素个数 - 排序完成数（已排序轮数） - 1
            for (int j = 0 ; j < elements.length - i - 1 ; j++) {
                if (elements[j] > elements[j + 1]) {
                    final int t = elements[j + 1];
                    elements[j + 1] = elements[j];
                    elements[j] = t;
                }
            }
        }
    }
}
