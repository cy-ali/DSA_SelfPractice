package questions;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MMMCMXCIX"));
    }

    static Map<Character, Integer> romanMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static int romanToInt(String s) {
        int temp = 0;
        int result = 0;
        int actual;

        for (int i = s.length() - 1; i >= 0; i--) {
            actual = romanMap.get(s.charAt(i));
            if (actual >= temp) {
                temp = actual;
                result += actual;
            } else {
                result -= actual;
            }
        }
        return result;
    }
}
