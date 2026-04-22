// Last updated: 4/22/2026, 3:48:24 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack <>();

        String[] directoris=path.split("/");

        for(String dry : directoris)
        {
            if(dry.equals(".") || dry.isEmpty())
            {
                continue;
            }
            else if(dry.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(dry);
            }
        }
        return "/"+String.join("/",stack);
        
    }
}