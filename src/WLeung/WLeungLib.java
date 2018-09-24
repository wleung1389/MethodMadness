package WLeung;

/** 9/18/2018 By Wai Hin Leung
 *
 */
public class WLeungLib {
    /**
     *
     * @param str
     */
    public static void println(String str){
        System.out.println(str);
    }

    /**
     *Checks if a word is a palindrome.
     * @param str
     * @return
     */
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

    /**
     *Returns MM/DD/YY in DD-MM-YY format.
     * @param str
     * @return
     */
    public static String dateStr(String str)
    {
        String[] array = str.split("/");
        String str1 = array[1] + "-" + array[0] + "-" + array[2];
        return str1;
    }

    /**
     *Returns the main string with the first instance of the sub string cut out.
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr)
    {
        return mainStr.substring((mainStr.indexOf(subStr))+subStr.length());
    }

    /**
     Prints out 1 to num and swaps out multiples of 3 for "foo", multiples of 5 for "bar" and multiples of 3 and 5 for "baz".
     * @param num1
     */
    public static void fooBarBaz(int num1)
    {
        System.out.print("1,");
        for(int i = 2; i < num1; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.print("baz,");
            }
            else
            {
                if(i%3 == 0)
                {
                    System.out.print("foo,");
                }
                else
                {
                    if(i%5 == 0)
                    {
                        System.out.print("bar,");
                    }
                    else
                    {
                        System.out.print(i + ",");
                    }
                }
            }
        }
        if(num1%3 == 0 && num1%5 == 0)
        {
            System.out.println("baz.");
        }
        else
        {
            if(num1%3 == 0)
            {
                System.out.println("foo.");
            }
            else
            {
                if(num1%5 == 0)
                {
                    System.out.println("bar.");
                }
                else
                {
                    System.out.println(num1 + ".");
                }
            }
        }
    }

    /**
     *Returns a message encoded in Vignere Cipher.
     * @param Message
     * @param Key
     * @return
     */
    public static String vigCipher(String Message, String Key)
    {
        String Key2 = "";
        int i = 0;
        while(Key2.length() <+ Message.length())
        {
            if(i == Key.length())
            {
                i = 0;
            }
            else
            {
                Key2 += Key.substring(i,i+1);
                i++;
            }
        }
        Key2 = Key2.toLowerCase();
        Message = Message.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int c = 0; c <= Message.length(); i++)
        {
            int num = alphabet.indexOf(Key.substring(c,c-1));
        }
    }

    /**
     *Returns number of times a letter appears in at least 2 words.
     * @param word1
     * @param word2
     * @param word3
     * @return
     */
    public static String stringUnion(String word1, String word2, String word3)
    {
        return word1 + word2 + word3;
    }

    /**
     *Checks if number is in Fibonnaci sequence.
     * @param num
     * @return
     */
    public static boolean isFibonnaci(int num)
    {
        return true;
    }

    /**
     *Prints out multiplication table.
     * @param base
     * @param range
     */
    public static void multiplicationTable(int base, int range)
    {

    }

    /**
     *Return sum of the numbers from 0 to input.
     * @param a
     * @return
     */
    public static int sumUpTo(int a)
    {
        int sum = 0;
        for(int i = 0; i <= a; i++)
        {
            sum += i;
        }
        return sum;
    }

    /**
     *Finds roots using the quadratic equation.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static String quadSolver(double a, double b, double c)
    {
        String str3 = "";
        if((b*b)-4*a*c < 0)
        {
            return "The roots are imaginary because the discriminant is less than zero.";
        }
        else
        {
            double root1 = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
            double root2 = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
            String str1 = String.valueOf(root1);
            String str2 = String.valueOf(root2);
            str3 += "The roots are " + str1 + " and " + str2 + ".";
        }
        return str3;
    }

    /**
     *Returns least common multiple.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int leastCommonMultiple(int a, int b , int c) {
        int LCM = 0;
        if (a == 0) {
            a = 1;
        }
        if (b == 0) {
            b = 1;
        }
        if (c == 0) {
            c = 1;
        }
        int max = a * b * c;
        for (int i = 1; !(i > max); i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                LCM = i;
                return LCM;
            }
        }
        return LCM;
    }
}
