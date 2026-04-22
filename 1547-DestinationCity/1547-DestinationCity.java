// Last updated: 4/22/2026, 3:45:01 PM
class Solution {
    public String destCity(List<List<String>> paths) {

        HashSet<String > set=new HashSet<String >();

        for(int i=0;i<paths.size();i++)
        {
            set.add(paths.get(i).get(0));
        }

        for(int j=0;j<paths.size();j++)
        {
           // String destination=paths.get(j).get(1);
            if(!set.contains(paths.get(j).get(1)))
            {
               return  paths.get(j).get(1);
                
            }
        }

        return "";
    }
}