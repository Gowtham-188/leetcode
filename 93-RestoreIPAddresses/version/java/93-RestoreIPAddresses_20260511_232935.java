// Last updated: 5/11/2026, 11:29:35 PM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3
4        List<String > list = new ArrayList<>();
5        if(s.length() > 12) return list;
6
7        for(int i=0;i<3;i++)
8        {
9            for(int j=i+1;j<=i+3;j++)
10            {
11                for(int k=j+1;k+1 < s.length();k++)
12                {
13                    String s1 = s.substring(0,i+1);
14                    String s2 = s.substring(i+1,j+1);
15                    String s3 = s.substring(j+1,k+1);
16                    String s4 = s.substring(k+1,s.length());
17
18                    if(isvalid(s1) && isvalid(s2) && isvalid(s3) && isvalid(s4))
19                    {
20                        list.add(s1+"."+s2+"."+s3+"."+s4);
21                    }
22                }
23            }
24
25        }
26        return list;
27    }
28
29        boolean isvalid(String s)
30        {
31            if((s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
32            {
33                return false;
34            }
35            return true;
36        }
37        
38    }
39