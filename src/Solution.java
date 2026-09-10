import java.util.HashMap;

//Example 1:
//Input: num = 3749
//Output: "MMMDCCXLIX"
//
//Explanation:
//
//3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
// 700 = DCC as 500 (D) + 100 (C) + 100 (C)
//  40 = XL as 10 (X) less of 50 (L)
//   9 = IX as 1 (I) less of 10 (X)
//Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
//Example 2:
//
//Input: num = 58
//
//Output: "LVIII"
//
//Explanation:
//
//50 = L
// 8 = VIII

class Solution {
    public String intToRoman(int num) {

        HashMap<Integer, String> roman = new HashMap<>();

        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");

        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        StringBuilder answer = new StringBuilder();

        for (int value : values) {

            while (num >= value) {
                answer.append(roman.get(value));
                num -= value;
            }
        }

        return answer.toString();
    }
}