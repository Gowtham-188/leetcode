// Last updated: 4/22/2026, 3:49:13 PM
class Solution {
  public int myAtoi(String s) {

   
 boolean gow = false;
    long num = 0;  

    String str=s.trim();
    int n = str.length();

    int i = 0;
  
    if (i < n && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
        gow = (str.charAt(i) == '-') ? true: false;
        i++;
      
    }
   
      

    while (i < n && Character.isDigit(str.charAt(i))) {
        num = num * 10 + (str.charAt(i) - '0');

        if (!gow  && num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (gow  && -num< Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        i++;
    }
     
     return gow?(int)-num:(int)num;
}

}