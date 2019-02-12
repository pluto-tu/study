package test.sort;

/**
 * Created by tubangwu on 2018/2/26.
 *
 * @author tubangwu
 */
public class QuickSort {

    private static void quickSort(int[] a, int left, int right) {
        int start = left;
        int end = right;
        int key = a[left];

        while (start < end) {
            //往右
            while (a[end] >= key && start < end) {
                end--;
            }
            //找到比key小的  交换
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            //往左
            while (a[start] <= key && start < end) {
                start++;
            }
            //找到比key大的 交换
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

            }
        }
        //左边序列。第一个索引位置到关键值索引-1
        if (left < start) {
            quickSort(a, left, start - 1);
        }
        //右边序列。从关键值索引+1到最后一个
        if (end < right) {
            quickSort(a, end + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,4,5,0,77};
        int start = 0;
        int end = a.length - 1;
        quickSort(a, start, end);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
