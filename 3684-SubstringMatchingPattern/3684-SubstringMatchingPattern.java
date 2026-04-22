// Last updated: 4/22/2026, 3:44:07 PM
class Solution {
    public boolean hasMatch(String s, String p) {

       int starpos=p.indexOf('*');//2
    String head=p.substring(0,starpos);//ee
      String tail=p.substring(starpos+1);//e

       int left=s.indexOf(head);//1
       int right=s.lastIndexOf(tail);//7

       if(left==-1 || right==-1)
       {
        return false;
       }
       return left+head.length()<=right;

        
    }
}