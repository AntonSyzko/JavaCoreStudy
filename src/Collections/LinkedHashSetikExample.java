package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Admin on 20.07.2016.
 */
public class LinkedHashSetikExample {
    public static void main(String[] args) {
        LinkedHashSet<Customer> linkhashaseta = new LinkedHashSet<Customer>();
        linkhashaseta.add(new Customer("A",1));
        linkhashaseta.add(new Customer("B",2));
        linkhashaseta.add(new Customer("A",3));
        linkhashaseta.add(new Customer("C",3));
        Iterator itr = linkhashaseta.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
class Customer{
    String name;
    int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int hashCode(){
        return id;
    }
    // id based comparement
    public boolean equals(Object sec){
        Customer cust = (Customer)sec;

        return (id == cust.id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
