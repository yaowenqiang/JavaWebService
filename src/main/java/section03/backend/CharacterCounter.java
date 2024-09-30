package section03.backend;

import java.util.Map;
import java.util.HashMap;

public class CharacterCounter {
   public static Map<Character, Integer> counterCharacters(String text) {
       if (text == null) {
           throw new IllegalArgumentException() ;
       }

       Map<Character, Integer> map = new HashMap<>();
       for (char c: text.toCharArray()) {
           if (!map.containsKey(c)) {
               map.put(c, 1);
           } else {
               int curValue = map.get(c);
               map.put(c, ++curValue);
           }
       }
       return map;
   }
}
