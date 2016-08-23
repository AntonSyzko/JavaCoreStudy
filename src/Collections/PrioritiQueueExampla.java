package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Admin on 21.07.2016.
 */
public class PrioritiQueueExampla {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        PriorityQueue<Rabotnik> myQuue = new PriorityQueue<>(10,myComparator);
        myQuue.add(new Rabotnik("A",1000000));
        myQuue.add(new Rabotnik("B",2000000));
        myQuue.add(new Rabotnik("C",3000000));
        myQuue.add(new Rabotnik("B",2000000));
        myQuue.add(new Rabotnik("y",2));


        System.out.println(myQuue.poll());
        System.out.println(myQuue.poll());
        System.out.println(myQuue.poll());
        System.out.println(myQuue.poll());

    }
}

class Rabotnik{
    String name;
    int salary;

    public Rabotnik(String name, int salary ){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Rabotnik{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

class MyComparator implements Comparator<Rabotnik>{

    @Override
    public int compare(Rabotnik o1, Rabotnik o2) {

        return o1.salary - o2.salary;
    }
}
