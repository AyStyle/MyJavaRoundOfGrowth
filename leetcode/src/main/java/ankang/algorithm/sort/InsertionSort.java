package ankang.algorithm.sort;

import java.util.Arrays;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-07
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] ints = {7 , 1 , 4 , 2 , 6 , 8 , 5 , 3 , 9 , 0};
        System.out.println(Arrays.toString(ints));

        sort(ints);

        System.out.println(Arrays.toString(ints));
    }

    /**
     * 插入排序
     *
     * @param ints
     */
    private static void sort(int[] ints) {
        // 外循环控制排序元素的初始位置
        for (int i = 1 ; i < ints.length ; i++) {
            // 声明一个变量将排序的元素保存起来
            final int t = ints[i];

            // 内循环写插入逻辑，当前一个元素大于排序元素时，将前一个元素向后移动，直到前一个元素小于等于排序元素
            // 变量j控制前一个元素的位置
            int j = i - 1;
            while (j >= 0 && ints[j] > t) {
                ints[j + 1] = ints[j];
                j--;
            }
            // 插入元素位置 = 前一个元素位置 + 1
            ints[j + 1] = t;
        }
    }
}
