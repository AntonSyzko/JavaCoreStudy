package PATTERNS.Behaivoural.ChainOfResponsibility;

/**
 * Created by Admin on 30.07.2016.
 */
public class ChainOfResponsibilityExample {

    static SupportEngineer createChain(){
        SupportEngineer se = new BasicSupportManager();
        SupportEngineer finEng = new FinancialSupportManager();
        se.setNext(finEng);
        SupportEngineer appEng = new ApplicationSupportManager();
        finEng.setNext(appEng);

        return se;
    }

    public static void main(String[] args) {
        SupportEngineer sup = createChain();
        sup.message("to basic engeneer",SupportEngineer.TYPE_BASIC);
        sup.message("to financial ",SupportEngineer.TYPE_FINANCIAL);
        sup.message("to app manager ",SupportEngineer.TYPE_APPLICATION);
    }
}

class FinancialSupportManager extends SupportEngineer{

    public FinancialSupportManager() {
        type = TYPE_FINANCIAL;
    }

    @Override
    protected void process(String messge) {
        System.out.println("financial  engeneer received : "+ messge);
    }
}


class BasicSupportManager extends SupportEngineer{

    public BasicSupportManager() {
        type = TYPE_BASIC;
    }

    @Override
    protected void process(String message) {
        System.out.println("basic engeneer received : "+ message);
    }
}



class ApplicationSupportManager extends SupportEngineer{

    public ApplicationSupportManager() {
        type = TYPE_APPLICATION;
    }

    @Override
    protected void process(String messge) {
        System.out.println(" application engeneer received " + messge);
    }
}
