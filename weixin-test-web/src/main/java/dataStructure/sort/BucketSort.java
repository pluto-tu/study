package dataStructure.sort;

/**
 * @author tubangwu
 * @Date 2018/11/5 10:19
 */
public class BucketSort {

    /**
     * 1）桶排序是稳定的；
     * 2）桶排序是常见排序算法中最快的一种，大多数情况下比快排和归并排序还要快
     * 3）桶排序非常快但是也非常消耗空间，典型的以空间换时间，基本上是最耗内存的一种排序算法。
     *
     * 地址 https://blog.csdn.net/u010853261/article/details/54933236
     */
    public static int[] bucketSort(int[] nums,int maxNum){
        int[] sortNum = new int[maxNum+1];
        for(int i=1;i<nums.length;i++){
            sortNum[nums[i]] = nums[i];
        }
        return sortNum;
    }

    public static void main(String[] args) {
//        int[] nums = {1,8,5,6,4,2};
//        int[] sort = bucketSort(nums,8);
//        for(int i=0;i<sort.length;i++){
//            if(sort[i]>0){
//                System.out.print(sort[i]);
//            }
//        }
        System.out.println(1 << 4);
    }



}
