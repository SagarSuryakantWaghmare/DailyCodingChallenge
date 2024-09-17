import java.util.HashMap;
import java.util.Map;

/**
 * RomanToInt
 */
public class RomanToInt {
    public int romantoInt(String s){
        Map<Character,Integer> romantoInt=new HashMap<>();
        romantoInt.put('I', 1);
        romantoInt.put('V', 5);
        romantoInt.put('X', 10);
        romantoInt.put('L', 50);
        romantoInt.put('C', 100);
        romantoInt.put('D', 500);
        romantoInt.put('M', 1000);
        int total=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            int currentValue=romantoInt.get(s.charAt(i));
            if(i+1<length&&currentValue<romantoInt.get(s.charAt(i+1))){
                total-=currentValue;
            }
            else{
                total+=currentValue;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        
        // Test cases
        String romanNumeral1 = "III";
        String romanNumeral2 = "IX";
        String romanNumeral3 = "LVIII";
        String romanNumeral4 = "MCMXCIV";

        System.out.println(romanNumeral1 + " -> " + converter.romantoInt(romanNumeral1)); // Output: 3
        System.out.println(romanNumeral2 + " -> " + converter.romantoInt(romanNumeral2)); // Output: 9
        System.out.println(romanNumeral3 + " -> " + converter.romantoInt(romanNumeral3)); // Output: 58
        System.out.println(romanNumeral4 + " -> " + converter.romantoInt(romanNumeral4)); // Output: 1994 
    }
}