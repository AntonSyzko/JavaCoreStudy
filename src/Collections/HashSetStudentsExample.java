package Collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Admin on 28.06.2016.
 */
public class HashSetStudentsExample {

    public static void main(String[] args) {
        HashSet<Student> studentGropup = new HashSet<Student>();
        studentGropup.add(new Student("ajoijoij",1,"aa"));
        studentGropup.add(new Student("a",1,"aa"));
        studentGropup.add(new Student("b",2,"bb"));
        studentGropup.add(new Student("d",3,"aa"));
        studentGropup.add(new Student("new",1,"aa"));
        Iterator<Student> itr = studentGropup.iterator();
        while(itr.hasNext()){
            Student std = itr.next();
            System.out.println(std);
        }



    }

}

class Student{
    String name;
    int rollNumber;
    String departmaent;

    public Student(String name, int rollNumber, String departmaent) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.departmaent = departmaent;
    }

    @Override
    public boolean equals(Object o){
        Student std = (Student)o;

        return (rollNumber == std.rollNumber);
    }
@Override
    public int hashCode(){
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Collections.Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", departmaent='" + departmaent + '\'' +
                '}';
    }
}
