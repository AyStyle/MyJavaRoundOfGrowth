package ankang.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-06
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] ints = {7 , 1 , 4 , 2 , 6 , 8 , 5 , 3 , 9 , 0};
        System.out.println(Arrays.toString(ints));

        sort(ints);

        System.out.println(Arrays.toString(ints));
    }

    /**
     * 冒泡排序算法
     */
    private static void sort(int[] ints) {
        // 第一圈控制排序轮数，每轮排序完成一个元素：排序轮数 = 元素个数 - 1
        for (int i = 0 ; i < ints.length - 1 ; i++) {
            // 第二圈控制比较次数：比较次数 = 元素个数 - 排序完成数（排序轮数） - 1
            for (int j = 0 ; j < ints.length - i - 1 ; j++) {
                if (ints[j] > ints[j + 1]) {
                    final int t = ints[j + 1];
                    ints[j + 1] = ints[j];
                    ints[j] = t;
                }
            }
        }
    }

}
