package PATTERNS.Creational.Factory;

/**
 * Created by Admin on 30.07.2016.
 */
public class OfficeWorker extends Person {

    private double salary ;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "OfficeWorker{" + super.toString()+

                "   salary=" + salary +
                '}';
    }
}
