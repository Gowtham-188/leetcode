// Last updated: 4/22/2026, 3:46:06 PM
class Solution {
    public int totalFruit(int[] fruits) {
        

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int start=0,end=0;
        int max=0;

        while(end<fruits.length)
        {

            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);

            while(map.size()>=3)
            {

                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0)
                {
                    map.remove(fruits[start]);
                }
                start++;

            }
            int currentlen=end-start+1;
            max=Math.max(max,currentlen);
            end++;


        }

        return max;
    }
}