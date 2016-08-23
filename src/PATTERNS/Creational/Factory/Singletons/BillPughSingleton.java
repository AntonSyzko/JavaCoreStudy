package PATTERNS.Creational.Factory.Singletons;

/**
 * Created by Admin on 31.07.2016.
 */
public class BillPughSingleton {

    public static void main(String[] args) {
        BillPughSingleton instance = BillPughSingleton.getInstance();
        System.out.println(instance.hashCode());

        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        System.out.println(instance2.hashCode());
    }

    private BillPughSingleton(){}

    private static class Helper{
      private static final BillPughSingleton  instance = new BillPughSingleton()   ;

    }

    public static BillPughSingleton getInstance (){
        return Helper.instance;
    }
}
