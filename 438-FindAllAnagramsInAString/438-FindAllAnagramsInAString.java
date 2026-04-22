// Last updated: 4/22/2026, 3:46:36 PM
class Solution {
      
    public List<Integer> findAnagrams(String s, String p) {
         

        List<Integer> list=new ArrayList<>();
   



         char[] pc = p.toCharArray();
                Arrays.sort(pc);
                String p1 = new String(pc);

        int n=s.length()-p.length();

        for(int i=0;i<=n;i++)
        {
            String temp=s.substring (i,i+p.length());
  
            char[] c=temp.toCharArray();
                Arrays.sort(c);
                String str=new String (c);

               


                if(p1.equals(str))
                {
                    list.add(i);
                }
        }

        return list;

    }
}