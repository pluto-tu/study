package dataStructure;


/**
 * Created by tubangwu on 2019-04-07.
 *
 * @author tubangwu
 */
public class SortTest {

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public void selectSort(int[] nums){
        int length = nums.length;
        for(int i=0;i<length;i++){
            int min = nums[i];
            for(int j=i+1;j<length;j++){
                if(nums[j]<min){
                    min = nums[j];
                }
            }
            swap(nums,i,min);
        }

    }


    public static void main(String[] args) {
        SortTest sortTest = new SortTest();
        int[] nums = {3, 1, 6, 2, 5, 8, 4, 7};
        sortTest.selectSort(nums);



        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + "--");

        }
    }



}
