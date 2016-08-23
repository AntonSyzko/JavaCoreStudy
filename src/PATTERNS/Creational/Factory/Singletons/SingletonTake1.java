package PATTERNS.Creational.Factory.Singletons;

/**
 * Created by Admin on 31.07.2016.
 */
public class SingletonTake1 {

    public static void main(String[] args) {
        SingletonInstance instance = SingletonInstance.getInstance();
        System.out.println(instance.hashCode());
        SingletonInstance instance2 = SingletonInstance.getInstance();
        System.out.println(instance2.hashCode());


    }

    public static class SingletonInstance{
        private static SingletonInstance instance ;

        private SingletonInstance(){};

        public static SingletonInstance getInstance(){
            if (instance == null){
                synchronized (SingletonInstance.class){
                    if(instance==null) {
                        instance = new SingletonInstance();
                    }

                }
            }

            return instance;
        }
    }
}
