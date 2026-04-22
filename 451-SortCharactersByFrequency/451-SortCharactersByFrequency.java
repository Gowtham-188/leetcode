// Last updated: 4/22/2026, 3:46:34 PM
class Solution {
    public String frequencySort(String s) {

        ArrayList<int[]> list = new ArrayList<>();
        int [] arr = new int [256];
        StringBuilder  st = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] > 0)
            {
                list.add(new int[]{arr[j],j});
            }
        }

        list.sort((a,b)->Integer.compare(b[0],a[0]));
        for(int[] ar : list)
        {
            while(ar[0] !=0)
            {
                st.append((char)ar[1]);
                ar[0]--;
            }
        }
        return st.toString(); 
    }
}