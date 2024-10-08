import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public void romantoInt(String s){
        // int len = s.length();
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 1);
        System.out.print(romanMap);
    }
    
    public static void main(String[] args){
        String st = "III";
        RomanToInteger obj = new RomanToInteger();
        obj.romantoInt(st);
    }
}
