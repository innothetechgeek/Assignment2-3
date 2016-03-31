package ObjEquality;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ObjEquality object1 = new ObjEquality("Innocent");
        ObjEquality object2 = new ObjEquality("Innocent");
        ObjEquality t = new ObjEquality();
        if((t.compare(object1,object2) == true)){
          System.out.println("Object1 and 0bject2 are equal");
        }
    }
}
