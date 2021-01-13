package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-13
 */
public class QuickSort2 extends AbstractSort<Integer> {
    @Override
    protected void sort0(Integer[] elements) {
        sort1(elements , 0 , elements.length - 1);
    }

    /**
     * 快速排序
     *
     * @param elements 排序数组
     * @param left     数组的开始坐标，包含
     * @param right    数组的结束坐标，包含
     */
    private void sort1(Integer[] elements , int left , int right) {
        if (left >= right) {
            return;
        }

        // 随机选择一个在[left, right]之间的元素作为轴元素，并将其放到right位置上
        swap(elements , (left + right) / 2 , right);

        // 设置两个指针i、j，其中i指向大于轴元素的元素，j指向小于轴元素的元素
        // 当j找到了比轴元素小的元素，那么i与j交换位置
        int i, j;
        for (i = left , j = left; j < right ; j++) {
            if (elements[j] <= elements[right]) {
                swap(elements , i++ , j);
            }
        }

        // 最后交换轴元素与i元素
        swap(elements , i , j);
        // 递归排序轴元素左边部分和右边部分
        sort1(elements , left , i - 1);
        sort1(elements , i + 1 , right);
    }

    /**
     * 位运算不使用自己与自己换位置
     *
     * @param elements 数组元素
     * @param a        第一个数组位置
     * @param b        第二个数组位置
     */
    private void swap(Integer[] elements , int a , int b) {
        if (a != b) {
            elements[a] ^= elements[b];
            elements[b] ^= elements[a];
            elements[a] ^= elements[b];
        }
    }
}
