package leecode;

/**
 * Created by tubangwu on 2019-02-14.
 *
 * @author tubangwu
 */
public class Search {

    /**
     * 有序的数组使用二分查找
     */
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] < target){
                left = mid+1;
            }else {
                right = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};
        System.out.println(binarySearch(numbers,31));
    }
}
