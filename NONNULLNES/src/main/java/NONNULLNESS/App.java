package NONNULLNESS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Application t = new Application("Khusela");


        if (t.test() == null) {
            System.out.print("Test function returned a null value");
        } else
            System.out.print("Test function returned a non null value");
    }
}
