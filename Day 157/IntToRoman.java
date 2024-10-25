/**
 * IntToRoman
 */
public class IntToRoman {
    public static String inttoRoman(int num) {
        String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < value.length && num > 0; i++) {
            while (num >= value[i]) {
                roman.append(symbol[i]);
                num -= value[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(inttoRoman(44));
        System.out.println(inttoRoman(90));
        System.out.println(inttoRoman(1034));
        System.out.println(inttoRoman(4024));
        /*
         * XLIV
         * XC
         * MXXXIV
         * MMMMXXIV
         */
    }
}