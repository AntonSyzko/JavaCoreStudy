package PATTERNS.Creational.Factory;

/**
 * Created by Admin on 30.07.2016.
 */
public class PersonFactory {

    public static final int EXCELENT_STUDENT = 1;
    public static final int RICH_PERSON = 2;

    public Person getPersonDependsOnInput(int input){
        if(input==EXCELENT_STUDENT){
            Student result = new Student();
            result.setName("Studika ");
            result.setAge(20);
            result.setAverageMark(100);
            return result;
        }else if(input == RICH_PERSON){
            OfficeWorker result = new OfficeWorker();
            result.setName(" Workerik ");
            result.setAge(15);
            result.setSalary(100000);
            return result;
        }

        return null;//make compiler  happy
    }
}
