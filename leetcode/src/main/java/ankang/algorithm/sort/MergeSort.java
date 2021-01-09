package ankang.algorithm.sort;

import java.util.Arrays;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-09
 */
public class MergeSort extends AbstractSort<Integer> {

    /**
     * 归并排序
     *
     * @param elements
     */
    @Override
    protected void sort0(Integer[] elements) {
        // 当元素个数少于2时，不用排序
        if (elements.length < 2) {
            return;
        }

        // 将数组才分为2半，再进行归并排序
        final int mid = elements.length / 2;
        final Integer[] left = Arrays.copyOfRange(elements , 0 , mid);
        final Integer[] right = Arrays.copyOfRange(elements , mid , elements.length);

        sort0(left);
        sort0(right);

        // i控制left数组元素，j控制right数组元素，p控制elements元素的位置（该排序的位置）
        int i = 0;
        int j = 0;
        int p = 0;
        while (i < left.length || j < right.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    elements[p] = left[i];
                    i++;
                } else {
                    elements[p] = right[j];
                    j++;
                }
            } else if (i < left.length) {
                elements[p] = left[i];
                i++;
            } else {
                elements[p] = right[j];
                j++;
            }
            p++;
        }

    }
}
