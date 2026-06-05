// Last updated: 6/5/2026, 12:37:13 PM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int count = 0;
4        for(int i=num1;i<=num2 ;i++)
5        {
6            char [] ch = String.valueOf(i).toCharArray();
7            
8
9            for(int j=1;j<ch.length-1;j++)
10            {
11                if(ch[j] >ch[j-1] && ch[j] > ch[j+1])
12                {
13                    count++;
14                }
15                if(ch[j] < ch[j-1] && ch[j] < ch[j+1])
16                {
17                    count++;
18                }
19            }
20
21        }
22        return count;
23        
24    }
25}