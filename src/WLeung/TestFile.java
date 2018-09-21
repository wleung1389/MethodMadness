package WLeung;

/** 9/18/2018 By Wai Hin Leung
 *
 */
import static WLeung.WLeungLib.*;

public class TestFile {
    public static void  main(String[] args)
    {
        println("I love a" + " cup of java in the morning");
        //String Methods
        System.out.println(isPalindrome("abccba"));
        System.out.println(dateStr("08/01/2001"));
        System.out.println(cutOut("catatonic cat","cat"));
        fooBarBaz(10);
        //Unfinished
        System.out.println(vigCipher("hi","bye"));
        System.out.println(stringUnion("a","b","c"));

        System.out.println(isFibonnaci(2));
        multiplicationTable(3,4);
        //Unfinished
        //Math Methods
        System.out.println(sumUpTo(10));
        System.out.println(quadSolver(2.0,-45.2,16));
        System.out.println(leastCommonMultiple(23,124,64));
    }
}
