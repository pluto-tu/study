package leecode;

/**
 * @author tubangwu
 * @Date 2019/2/11 10:48
 */
public class TwoSum {
    /**
     * Leetcode ：167. Two Sum II - Input array is sorted (Easy)
     * <p>
     * Input: numbers={2, 7, 11, 15}, target=9
     * Output: index1=1, index2=2
     *
     */
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return null;
    }

    /**
     * Input: 5
     * Output: True
     * Explanation: 1 * 1 + 2 * 2 = 5
     */
    public static boolean judgeSequareNum(int number){
        int i=0;
        int j= (int)Math.sqrt(number);
        while (i<=j){
            int sum = i*i+j*j;
            if(sum == number){
                return true;
            }else if (sum > number) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }



    public static void main(String[] args) {
//        System.out.println("---------------");
//        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 26);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println("--/--" + ints[i]);
//        }

        System.out.println("---"+judgeSequareNum(13));
    }


}
