// Last updated: 4/22/2026, 3:47:22 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        return Math.max(robLinear(nums, 0, n-2), robLinear(nums, 1, n-1));
    }

    public int robLinear(int[] nums, int start, int end) {
        int len = end - start + 1;
        if(len == 1) return nums[start];

        int[] arr = new int[len];

        arr[0] = nums[start];
        arr[1] = Math.max(nums[start], nums[start+1]);

        for(int i = 2; i < len; i++) {
            arr[i] = Math.max(arr[i-1], nums[start+i] + arr[i-2]);
        }

        return arr[len-1];
    }
}