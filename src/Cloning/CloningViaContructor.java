package Cloning;

/**
 * Created by Admin on 08.08.2016.
 */
public class CloningViaContructor {

    private String name;
    private int id;

    public CloningViaContructor(String name,int id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CloningViaContructor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    //copy contructor
    public CloningViaContructor(CloningViaContructor instance){
        this(instance.getName(),instance.getId());
    }


    public static CloningViaContructor newInstance(CloningViaContructor a){

        return new CloningViaContructor(a.getName(),a.getId());

    }

    public static void main(String[] args) {
        CloningViaContructor a = new CloningViaContructor("A",1);

        System.out.println(a.toString());
        System.out.println(CloningViaContructor.newInstance(a));
    }
}
