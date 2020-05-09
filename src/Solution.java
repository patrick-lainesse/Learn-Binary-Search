public class Solution {

    // Binary Search Template I (sqrt)
    public static int mySqrt(int x) {

        int left = 1;
        int right = x-1;
        int middle = -1;

        if(x == 1 || x == 0) return x;
        while(left<= right) {
            // int mid = left + (right - left) / 2;
            //middle = (left + right) / 2;
            middle = left + (right - left) / 2;
            if(middle*middle < x) {
                left = middle + 1;
            } else if(middle*middle > x) {
                right = middle - 1;
            } else return middle;
        }
        if(middle*middle>x) return middle-1;
        return middle;
    }

    // Introduction
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

        // Introduction
        /*int[] nums1 = {-1,0,3,5,9,12};
        System.out.println(search(nums1, 9));
        System.out.println(search(nums1, 2));*/

        // Binary Search Template I (sqrt)
        System.out.println(mySqrt(16));
        System.out.println(mySqrt(2147395599));
    }
}