// Last updated: 4/22/2026, 3:46:46 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[256];

        for(char c:magazine.toCharArray()){
            freq[c]++;
        }
        for( char c:ransomNote.toCharArray()){
            
            if(freq[c]==0){
                return false;
            }  
            freq[c]--;
        }
        return true;
    }
}