package PATTERNS.Behaivoural.ChainOfResponsibility;

/**
 * Created by Admin on 30.07.2016.
 */
public abstract class SupportEngineer {

    public static final int TYPE_BASIC = 1;
    public static final int TYPE_FINANCIAL= 2;
    public static final int TYPE_APPLICATION = 3;

    protected int type;
    protected SupportEngineer next ;

    public void setNext(SupportEngineer next){
        this.next = next;
    }

    public void message(String message, int type){
        if(type == this.type){
            process(message);
        }else if(next!=null){
              next.message(message,type);
        }
    }

    protected abstract void  process(String messge);


}
