// Last updated: 4/22/2026, 3:49:18 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        int [] merged =new int[nums1.length+nums2.length];

           int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            merged[k]=nums1[i];
            k++;
        }
        for(int j=0;j<nums2.length;j++)
        {
            merged[k]=nums2[j];
            k++;
        }

        Arrays.sort(merged);

        int total=merged.length;
        
        if(total%2!=0)
        {
            return (double) merged[total/2];
        }
        else
        {
            int m1=merged[total/2-1];
            int m2=merged[total/2];

            return ((double)m1+(double)m2)/2;
        }
    }
}