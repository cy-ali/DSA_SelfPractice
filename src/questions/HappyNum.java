package questions;

import java.util.HashSet;

public class HappyNum {

    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> numSet = new HashSet<>();
        while (n != 1) {
            int tempNum = 0;
            while (n != 0) {
                tempNum += (n % 10) * (n % 10);
                n /= 10;
            }

            if (numSet.contains(tempNum)) return false;
            n = tempNum;
            numSet.add(n);
        }
        return true;
    }
}
