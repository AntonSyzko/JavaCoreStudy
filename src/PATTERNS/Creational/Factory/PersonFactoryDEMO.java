package PATTERNS.Creational.Factory;

/**
 * Created by Admin on 30.07.2016.
 */
public class PersonFactoryDEMO {


    public static void main(String[] args) {
        PersonFactory pfactory = new PersonFactory();

        Student studik = (Student) pfactory.getPersonDependsOnInput(1);
        OfficeWorker worker = (OfficeWorker) pfactory.getPersonDependsOnInput(2);

        System.out.println(worker.toString());
        studik.setAverageMark(5208);
        System.out.println(studik.toString());
    }
}
