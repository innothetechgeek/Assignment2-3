package ObjIdentity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book a = new Book("Witney's Kiss");
        Book b =  new Book("Java, How to program by Detel");
        if((b.equals(a) == true)){
        System.out.println("Object a and b are identical");
        }
        else{
            System.out.println("Object a and b are two non identical objects");
        }
    }


}
