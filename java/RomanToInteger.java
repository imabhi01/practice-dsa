import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public void romantoInt(String s){
        int len = s.length();
        Map<String, Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 1);

        String value = "";
        
        for(int i = 0; i < len; i++){
            // if(s.charAt(i) == 'I'){
            //     value.concat("1");
            // }
        }

        System.out.println(value);
    }
    
    public static void main(String[] args){
        String st = "III";
        RomanToInteger obj = new RomanToInteger();
        obj.romantoInt(st);
    }
}
