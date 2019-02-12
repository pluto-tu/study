package test.leecode;

public class LeeCode {

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int[] ints = twoSum(nums, 26);
//        System.out.println(ints[0] + "---" + ints[1]);

        int number = 5;
        number = number >> 1;
        System.out.println("右移动"+number);
        number = number << 1;
        System.out.println("左移动"+number);
        number = number >>> 1;
        System.out.println("无符号右移动"+number);
    }


    //one
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //two
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return null;
    }

}
