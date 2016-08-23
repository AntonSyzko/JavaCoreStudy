package PATTERNS.Creational.Factory;

/**
 * Created by Admin on 30.07.2016.
 */
public class Student extends Person {



    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "averageMark=" + averageMark +
                "} " + super.toString();
    }
}
