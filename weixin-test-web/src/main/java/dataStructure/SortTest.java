package dataStructure;


/**
 * Created by tubangwu on 2019-04-07.
 *
 * @author tubangwu
 */
public class SortTest {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    /**
     * 选中排序
     *
     * @param nums
     */
    public void selectSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }

    /**
     * 冒泡
     *
     * @param
     */
    public void ebullitionSort(int[] nums) {
        int length = nums.length;
        boolean isFinish = false;
        for (int i = length - 1; i > 0 && !isFinish; i--) {
            isFinish = true;
            for (int j = 1; j <= i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    isFinish = false;
                }
            }
        }
    }

    /**
     * 插入
     *
     * @param
     */
    public void insertSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    public void quickSort(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        if (i > j) {
            return;
        }

        int temp = nums[start];
        while (i < j) {
            while (temp <= nums[j] && i < j) {
                j--;
            }

            while (temp >= nums[i] && i < j) {
                i++;
            }

            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums,start,j );
        quickSort(nums, start, j - 1);
        quickSort(nums, j + 1, end);

    }


    public static void main(String[] args) {


        SortTest sortTest = new SortTest();
//        // int[] nums = {3, 1, 6, 2, 5, 8, 4, 7};
//
        int[] nums = {3, 1, 5, 6, 2, 4};

        sortTest.quickSort(nums, 0, nums.length-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "--");
        }


    }







}
