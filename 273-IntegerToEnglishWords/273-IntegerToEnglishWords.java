// Last updated: 4/22/2026, 3:47:08 PM
class Solution {
    public String numberToWords(int num) {
             if (num == 0) {
            return "Zero";
        }

        String[] unitPlace = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine " };
        String[] tenPlace = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

        String[] oneCase = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};

            int[] digits = new int[10];

        int i = 0;
        while (num > 0) {
            digits[i] = num % 10;
            num = num / 10;
            i++;



        } 
    
           return convertIntegerToEnglishWords(digits, unitPlace, tenPlace, oneCase);
    }

    private String convertIntegerToEnglishWords(int[] digits, String[] unitPlace, String[] tenPlace, String[] oneCase) {
        String result = "";

        if (digits[9] != 0) {
            result += unitPlace[digits[9]] + "Billion ";
        }

        if (digits[8] != 0) {
            result += unitPlace[digits[8]] + "Hundred ";
        }
        if (digits[7] == 1) {
            result += oneCase[digits[6]];
        } else {
            result += tenPlace[digits[7]];
            result += unitPlace[digits[6]];
        }
        if (digits[8] != 0 || digits[7] != 0 || digits[6] != 0) {
            result += "Million ";
        }

        if (digits[5] != 0) {
            result += unitPlace[digits[5]] + "Hundred ";
        }
        if (digits[4] == 1) {
            result += oneCase[digits[3]];
        } else {
            result += tenPlace[digits[4]];
            result += unitPlace[digits[3]];
        }
        if (digits[5] != 0 || digits[4] != 0 || digits[3] != 0) {
            result += "Thousand ";
        }

        if (digits[2] != 0) {
            result += unitPlace[digits[2]] + "Hundred ";
        } 
        if (digits[1] == 1) {
            result += oneCase[digits[0]];
        } else {
            result += tenPlace[digits[1]];
            result += unitPlace[digits[0]];
        }

        return result.strip();
    } 
}
