package WLeung;

/** 9/18/2018 By Wai Hin Leung
 *
 */
public class WLeungLib {
    public static void println(String str){
        System.out.println(str);
    }
    public static boolean isPalindrome(String str)
    {
        String str1 = "";
        str = str.toLowerCase();
        for(int i = str.length(); i > 0; i--)
        {
            str1 += str.substring(i-1,i);
        }
        return str1.equals(str);
    }
    public static String dateStr(String str)
    {
        String[] array = new String[10];
        array = str.split("/");
        String str1 = array[1] + "-" + array[0] + "-" + array[2];
        return str1;
    }
    public static int sumUpTo(int a)
    {
        int sum = 0;
        for(int i = 0; i <= a; i++)
        {
            sum += i;
        }
        return sum;
    }
    public static int leastCommonMultiple(int a, int b , int c)
    {
        int LCM = 0;
        for(int i = 2; i > a*b*c; i++)
        {
            if(i%a == 0 && i%b == 0 && i%c == 0)
            {
                LCM = i;
            }
        }
        return LCM;
    }
}
