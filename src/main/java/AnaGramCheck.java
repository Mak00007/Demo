import java.util.*;
public class AnaGramCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String: ");
        String s = sc.next();
        String st = s.replaceAll("//s","");
        System.out.println("Enter the 2nd String: ");
        String s1 = sc.next();
        String st1 = s1.replaceAll("//s","");

        System.out.println(isAnagram(st,st1));
    }
    public static Boolean isAnagram(String st,String st1)
    {
        if(st.length()!=st1.length())
            return false;
        else
        {
          char[] ch = st.toLowerCase().toCharArray();
          char[] ch1 = st1.toLowerCase().toCharArray();
          Arrays.sort(ch);
          Arrays.sort(ch1);
          return Arrays.equals(ch,ch1);
        }


   }
}
