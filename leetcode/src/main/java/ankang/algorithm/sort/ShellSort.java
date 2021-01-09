package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-09
 */
public class ShellSort extends AbstractSort<Integer> {

    @Override
    protected void sort0(Integer[] elements) {
        // 每次排序的元素的步长
        for (int i = elements.length / 2 ; i > 0 ; i--) {
            // 内层是一个插入排序，步长为i
            // j控制元素位置
            for (int j = i ; j < elements.length ; j += i) {
                // 记录当前插入元素
                final int t = elements[j];

                // 插入元素的前一个位置
                int k = j - i;
                while (k >= 0 && elements[k] > t) {
                    elements[k + i] = elements[k];
                    k -= i;
                }

                // 插入元素
                elements[k+i] = t;
            }
        }

    }
}
