// Last updated: 4/22/2026, 3:46:25 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int g=flowerbed.length;
        int count=0;
        for (int i = 0; i < g; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == g - 1 || flowerbed[i + 1] == 0;
            
            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return n <= count;        
    }
}