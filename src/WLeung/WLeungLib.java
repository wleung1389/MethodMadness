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
        if(a == 0)
        {
            a = 1;
        }
        if(b == 0)
        {
            b = 1;
        }
        if(c == 0)
        {
            c = 1;
        }
        int max = a*b*c;
        for(int i = 1; !(i > max); i++)
        {
            if(i%a == 0 && i%b == 0 && i%c == 0) {
                LCM = i;
                return LCM;
            }
        }
        return LCM;
    }
    public static String quadSolver(double a, double b, double c)
    {
        String str3 = "";
        if((b*b)-4*a*c < 0 )
        {
            return "The roots are imaginary because the discriminant is less than zero.";
        }
        else
        {
            double root1 = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
            double root2 = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
            String str1 = String.valueOf(root1);
            String str2 = String.valueOf(root2);
            str3 = "The roots are " + str1 + " and " + str2 + ".";
        }
        return str3;
    }
}
