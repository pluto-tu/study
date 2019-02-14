package leecode;

/**
 * @author tubangwu
 * @Date 2019/2/14 15:28
 */
public class SortStudy<T extends Comparable<T>> extends Sort<T> {


    /**
     * 选择排序
     * <p>
     * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
     * 不断进行这样的操作，直到将整个数组排序。
     * 选择排序需要 ~N2/2 次比较和 ~N 次交换，它的运行时间与输入无关，这个特点使得它对一个已经排序的数组也需要这么多的比较和交换操作
     *
     * @param nums
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }


    public static void main(String[] args) {
        SortStudy sortStudy = new SortStudy();
        Integer[] ints = {7, 3, 5, 1};
        sortStudy.sort(ints);
        System.out.println("---"+ints[0]);
    }
}
