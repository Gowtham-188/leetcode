// Last updated: 4/22/2026, 3:46:00 PM
class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        int s, last, n;
        s = 0;

        Arrays.sort(arr);
        n = arr.length;

        if (n == 0) return 0;
        if (arr[0] > power) return 0;

        last = n-1;
        int i = 0;
        int max = Integer.MIN_VALUE;

        while (i <= last) {
            if (arr[i] <= power) {
                s++;
                power -= arr[i];
                max = Math.max(max, s);
                i++;
            } else {
                s--;
                power += arr[last];
                last--;
            }
        }

        return max;
    }
}