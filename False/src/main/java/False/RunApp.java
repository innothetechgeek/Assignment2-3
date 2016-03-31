package False;

/**
 * Created by Game330
 */
public class RunApp {
    public static void main (String[] args)
    {
        AppA t = new AppA("Khusela");


        if (t.test() == true) {
            System.out.print("Test function returned true");
        } else
            System.out.print("Test function return false");

    }
}
