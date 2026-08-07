// Last updated: 8/7/2026, 12:54:23 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3
4        char[][] board = new char[n][n];
5
6        for(int i=0;i<n;i++) {
7
8            for(int j=0;j<n;j++) {
9                board[i][j] = '.';
10            }
11        }
12        List<List<String>> ans = new ArrayList<>();
13        queen(board, 0 , ans);
14        return ans ;
15
16        
17    }
18    void queen (char[][] board , int col ,List<List<String>> ans) {
19        
20        if(col == board.length) {
21            ans.add(constuct(board));
22            return ;
23        }
24        for(int row = 0;row<board.length;row++) {
25
26            if(isSafe(board ,row,col)) {
27
28                board[row][col] = 'Q';
29                queen(board,col+1,ans);
30                board[row][col] = '.';
31
32            }
33        }
34         
35    }
36
37    List<String> constuct(char[][] board )
38    {
39        List<String> list = new ArrayList<>();
40
41        for(int i=0;i<board.length;i++) {
42            String st = new String(board[i]);
43            list.add(st);
44        }
45        return list;
46    }
47
48    boolean isSafe(char[][] board ,int row,int col ) {
49
50        int j=col;
51
52        for(int i=row;0<=i;i--) {
53            if(j>=0) {
54                if(board[i][j] == 'Q') return false ;
55            }
56            j--;
57        }
58        
59        j=col;
60
61        for(int i=col;0<=i;i--) {
62            if(j>=0) {
63                if(board[row][j] == 'Q') return false;
64            }
65            j--;
66        }
67
68        j= col;
69        for(int i=row;i<board.length;i++) {
70
71            if(j>=0) {
72                if(board[i][j] == 'Q') return false;
73            }
74            j--;
75        }
76        
77
78        return true;
79
80
81    }
82}