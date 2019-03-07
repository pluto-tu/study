package leecode;

/**
 * @author tubangwu
 * @Date 2019/2/14 15:28
 */
public class SortStudy<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

    }

    /**
     * 选择排序
     *
     * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
     * 不断进行这样的操作，直到将整个数组排序。
     * 选择排序需要 ~N2/2 次比较和 ~N 次交换，它的运行时间与输入无关，这个特点使得它对一个已经排序的数组也需要这么多的比较和交换操作
     *
     * @param nums
     */
    public void selectSort(T[] nums){
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

    /**
     * 冒泡排序
     *
     * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
     * 在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
     *
     */
    public void ebullitionSort(T[] nums){
        int n = nums.length;
        boolean isFinish = false;
        for (int i=n-1; i >0 && !isFinish ;i--){
             isFinish = true;
            for(int j=0;j<i;j++){
                if(less(nums[j+1],nums[j])){
                    isFinish = false;
                    swap(nums, j, j+1);
                }
            }
        }
    }


    public static void main(String[] args) {
        SortStudy sortStudy = new SortStudy();
        Integer[] ints = {7, 3, 5, 1};
        sortStudy.ebullitionSort(ints);
        System.out.println("---"+ints[0]+ints[1]+ints[2]+ints[3]);
    }












}
