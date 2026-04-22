// Last updated: 4/22/2026, 3:47:59 PM
class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();

       func(0,s,path,res);
       return res;
        
    }


    void func(int index,String s,List<String> path,List<List<String>> res)
    {
        if(index==s.length())
        {
            res.add(new ArrayList<>(path));
            return ;
        }

        for(int i=index;i<s.length();i++)
        {
            if(ispolintrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                func(i+1,s,path,res);
                path.remove(path.size()-1);

            }
        }
    }
  boolean  ispolintrome(String s,int start,int end)
  {
    while(start<=end)
    {
        if(s.charAt(start++)!=s.charAt(end--))
        {
            return false;
        }
    }
    return true;
  }
}