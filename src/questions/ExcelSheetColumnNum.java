package questions;

public class ExcelSheetColumnNum {
    public static void main(String[] args) {
        int A = 'A';
        int Z = 'Z';
        System.out.println(A);
        System.out.println(Z);

        System.out.println(titleToNumber("ZY"));


    }

    public static int titleToNumber(String columnTitle) {
        int tempNum;
        int colLevel = 1;
        int res = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            tempNum = columnTitle.charAt(i) - 64;
            res += tempNum * colLevel;
            colLevel *= 26;
        }

        return res;
    }
}
