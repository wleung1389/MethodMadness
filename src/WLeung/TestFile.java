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
        System.out.print("isPalindrome : ");
        System.out.println(isPalindrome("abccba"));
        System.out.print("dateStr : ");
        System.out.println(dateStr("08/01/2001"));
        System.out.print("cutOut : ");
        System.out.println(cutOut("catatonic cat","cat"));
        System.out.print("fooBarBaz : ");
        fooBarBaz(10);
        //Unfinished --------------------------------------------
        System.out.print("vigCipher : ");
        System.out.println(vigCipher("Attack","bye"));
        System.out.print("stringUnion : ");
        System.out.println(stringUnion("a","b","c"));

        System.out.print("isFibonnaci : ");
        System.out.println(isFibonnaci(2));
        System.out.println("multiplicationTable : ");
        multiplicationTable(3,4);
        //Unfinished---------------------------------------------
        //Math Methods
        System.out.print("sumUpTo : ");
        System.out.println(sumUpTo(10));
        System.out.print("quadSolver : ");
        System.out.println(quadSolver(2.0,-45.2,16));
        System.out.print("leastCommonMultiple : ");
        System.out.println(leastCommonMultiple(23,124,64));
    }
}
