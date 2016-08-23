package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Admin on 01.07.2016.
 */
public class TreeSetExample {

    public static void main(String[] args) {
        MyTSStudComparator comptr = new MyTSStudComparator();
        TreeSet<StudetForTreeSet> trset = new TreeSet<StudetForTreeSet>(comptr);
        trset.add(new StudetForTreeSet(1,"A",10));
        trset.add(new StudetForTreeSet(2,"B",11));
        trset.add(new StudetForTreeSet(13,"C",112));
        trset.add(new StudetForTreeSet(1,"D",1));//duplicates are ignored by id - in compare method logic
        trset.add(new StudetForTreeSet(8,"E",140));
        trset.add(new StudetForTreeSet(17,"F",25));
        Iterator<StudetForTreeSet> itr = trset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}

class StudetForTreeSet{
    int id;
    String name;
    int percentage;

    public StudetForTreeSet(int id, String name, int percentage){
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Collections.StudetForTreeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }


}

class MyTSStudComparator implements Comparator<StudetForTreeSet>{

    @Override
    public int compare(StudetForTreeSet o1, StudetForTreeSet o2) {
        if(o1.id == o2.id){
            return 0;
        }else{
            return o2.percentage - o1.percentage;
        }
    }
}
