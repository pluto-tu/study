package dataStructure;

import leecode.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author tubangwu
 * @Date 2019/2/14 15:28
 */
public class SortStudy<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {

    }

    /**
     * 数字交换
     *
     * @param nums
     * @param i
     * @param j
     */
    public void swapNums(T[] nums, int i, int j) {
        T temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 大小比较
     */
    public boolean lessNums(T a, T b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 大小比较
     */
    public boolean lessOrEqualNums(T a, T b) {
        return a.compareTo(b) <= 0;
    }


    /**
     * 选择排序
     * <p>
     * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
     * 不断进行这样的操作，直到将整个数组排序。
     * 选择排序需要 ~N2/2 次比较和 ~N 次交换，它的运行时间与输入无关，这个特点使得它对一个已经排序的数组也需要这么多的比较和交换操作
     *
     * @param nums
     */
    public void selectSort(T[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for(int j =i+1;j<n;j++){
                if(lessNums(nums[j],nums[min])){
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }


    /**
     * 冒泡排序
     * <p>
     * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
     * 在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
     */
    public void ebullitionSort(T[] nums) {
        int n = nums.length;
        boolean isFinish = false;
        for(int i = n-1;i>0 && !isFinish;i--){
            isFinish = true;
            for(int j=0;j<i;j++){
                if(less(nums[j+1],nums[j])){
                    swapNums(nums,j+1,j);
                    isFinish = false;
                }
            }
        }
    }


    /**
     * 插入排序
     * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序
     *
     * @param nums
     */
    public void insertSort(T[] nums) {
        int l = nums.length;
        for (int i=1;i<l;i++){
            for(int j = i;j<l;j++){
                if(lessNums(nums[j] , nums[j-1])){
                    swapNums(nums,j,j-1);
                }
            }
        }
    }

    /**
     * 快速排序
     * <p>
     * 归并排序将数组分为两个子数组分别排序，并将有序的子数组归并使得整个数组排序；
     * 快速排序通过一个切分元素将数组分为两个子数组，左子数组小于等于切分元素，右子数组大于等于切分元素，将这两个子数组排序也就将整个数组排序了。
     * <p>
     * 取 a[l] 作为切分元素，然后从数组的左端向右扫描直到找到第一个大于等于它的元素，再从数组的右端向左扫描找到第一个小于它的元素，交换这两个元素。不断进行这个过程，
     * 就可以保证左指针 i 的左侧元素都不大于切分元素，右指针 j 的右侧元素都不小于切分元素。当两个指针相遇时，将切分元素 a[l] 和 a[j] 交换位置。
     *
     * @param nums
     */
    public void quickSort(T[] nums, int start, int end) {
        int i = start;
        int j = end;
        if(i>j){
            return ;
        }

        T temp =  nums[start];

        while (i<j){
            while(lessOrEqualNums(temp,nums[j]) && i<j){
                j--;
            }

            while(lessOrEqualNums(nums[i],temp) && i<j){
                i++;
            }

            if(i<j){
                swapNums(nums,i,j);
            }
        }
        swapNums(nums,start,j);

        quickSort(nums,start,j-1);
        quickSort(nums,j+1,end);

    }


    public static void main(String[] args) {
        SortStudy sortStudy = new SortStudy();
        Integer[] nums = {3, 1, 6, 2, 5, 8, 4, 7};
        sortStudy.quickSort(nums,0,nums.length-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "--");
        }
    }



}
