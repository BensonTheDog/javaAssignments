import java.util.*;

public class main
{
    public static void test(){
        System.out.println("Can this be called");
    }
    public static int counter = 5;

    public void callingTest(){
        test();
        System.out.println("I can call");
        System.out.println(counter);
    }

    public static void main (String[] args)
    {
        System.out.println(counter);
        main dummy = new main();
        dummy.callingTest();
    }
}