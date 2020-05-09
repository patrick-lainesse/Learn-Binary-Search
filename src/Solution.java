public class Solution {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left<=right) {
            int middle = (left + right) / 2;
            if(nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle -1;
            } else return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};

        System.out.println(search(nums1, 9));
        System.out.println(search(nums1, 2));
    }
}