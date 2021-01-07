package ankang.algorithm.sort;

import java.util.Arrays;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-07
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {7 , 1 , 4 , 2 , 6 , 8 , 5 , 3 , 9 , 0};
        System.out.println(Arrays.toString(ints));

        sort(ints);

        System.out.println(Arrays.toString(ints));
    }

    /**
     * 选择排序算法
     *
     * @param ints
     */
    private static void sort(int[] ints) {
        // 外循环控制排序元素的位置，排序元素个数 = 元素个数 - 1（最后一个元素不需要排序，因为前面的都排好了）
        for (int i = 0 ; i < ints.length - 1 ; i++) {
            // 内循环控制比较元素的位置，比较元素的位置总是从i+1开始（不需要自己和自己比较）
            for (int j = i + 1 ; j < ints.length ; j++) {
                if (ints[i] > ints[j]) {
                    final int t = ints[i];
                    ints[i] = ints[j];
                    ints[j] = t;
                }
            }
        }
    }

}
