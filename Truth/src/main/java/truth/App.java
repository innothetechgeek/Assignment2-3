package truth;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        Application t = new Application("Khusela");


        if (t.test() == true) {
            System.out.print("Test function returned true");
        } else
            System.out.print("Test function return false");
    }
}
