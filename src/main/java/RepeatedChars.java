
import java.util.*;
import java.util.Map.Entry;

public class RepeatedChars
{
    public static void repeatedChar(String str)
    {
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c : ch)
        {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c)+1);
            } else {
                hm.put(c, 1);
            }
        }
        System.out.println(hm);

        }

    public static void main(String[] args) {
        repeatedChar("Mannnoj");

    }
}


