// Last updated: 4/22/2026, 3:47:35 PM
class Solution {
    public String largestNumber(int[] nums) {

   
          String [] arr=new String[nums.length];
          for(int i=0;i<nums.length;i++)
          {
            arr[i]=String.valueOf(nums[i]);
          }
          Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

          if(arr[0].equals("0"))
          {
            return "0";
          }

          StringBuilder st=new StringBuilder();

          for(int j=0;j<arr.length;j++)
          {
            st.append(arr[j]);
          }
          return st.toString();
    }
}