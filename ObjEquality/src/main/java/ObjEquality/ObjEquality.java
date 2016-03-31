package ObjEquality;

/**
 * Created by Game330 on 2016-03-23.
 */
public class ObjEquality {
    private String name;

    public ObjEquality(){

    }
    public ObjEquality(String nm){
        name = nm;
    }

    public boolean compare(ObjEquality obj1, ObjEquality obj2){
        return(obj1.name == obj2.name);
    }

}
