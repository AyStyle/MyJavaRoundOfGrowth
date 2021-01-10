package ankang.algorithm.sort;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-10
 */
public class QuickSort extends AbstractSort<Integer> {

    @Override
    protected void sort0(Integer[] elements) {
        sort1(elements , 0 , elements.length - 1);
    }

    /**
     * 快排细节
     *
     * @param elements 排序数组
     * @param left     左边起点
     * @param right    右边起点
     */
    private void sort1(Integer[] elements , int left , int right) {
        if (left >= right) {
            return;
        }

        // 计算轴元素
        int pivot = pivotValue(elements , left , right);

        // 将小于轴元素的元素放到左边，将大于轴元素的元素放到右边
        int l = left;
        int r = right;
        while (l < r) {
            // 从左侧找比轴元素大的value
            while (l < r && elements[l] < pivot) {
                l++;
            }

            // 从右侧找比轴元素小的value
            while (l < r && elements[r] > pivot) {
                r--;
            }

            // 如果轴元素重复，需要一边打破这个关系
            if (elements[l] == elements[r]) {
                l++;
            } else {
                // 交换两个元素的位置
                int t = elements[l];
                elements[l] = elements[r];
                elements[r] = t;
            }
        }

        sort1(elements , left , pivot - 1);
        sort1(elements , pivot + 1 , right);
    }

    /**
     * 获取快排轴元素
     *
     * @param elements 快排数组
     * @param left     左边元素位置
     * @param right    右边元素位置
     * @return 返回轴元素，轴元素是left、mid、right对应value中中间的那一个
     */
    private int pivotValue(Integer[] elements , int left , int right) {
        final int mid = (left + right) / 2;

        final Integer l = elements[left];
        final Integer m = elements[mid];
        final Integer r = elements[right];

        if ((m > l && l > r) || (r > l && l > m)) {
            return l;
        } else if ((m > r && r > l) || (l > r && r > m)) {
            return r;
        } else {
            return m;
        }
    }

}
