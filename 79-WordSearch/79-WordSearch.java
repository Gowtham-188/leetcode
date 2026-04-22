// Last updated: 4/22/2026, 3:48:17 PM
class Solution {
    public boolean exist(char[][] board, String word) {

        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                if(board[row][col]==word.charAt(0))
                {
                    if(Wordsearch(word,board,row,col,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

        public  boolean Wordsearch(String word,char[][] board,int row,int col,int position)
        {
            if(word.length()==position)
            {
                return true;
            }
            if(row<0||row>=board.length ||
               col<0||col>=board[0].length ||
               board[row][col]!= word.charAt(position)||
               position>=word.length()||
               board[row][col]=='$')
               
               {
                return false;
               }

               char temp=board[row][col];
               board[row][col]='$';

               boolean left=Wordsearch(word,board,row,col-1,position+1);
               boolean right=Wordsearch(word,board,row,col+1,position+1);
               boolean up=Wordsearch(word,board,row-1,col,position+1);
               boolean down=Wordsearch(word,board,row+1,col,position+1);

               if(left||right||up||down)
               {
                return true;
               }

               board[row][col]=temp;
           
         return false;
        }

        
    }
