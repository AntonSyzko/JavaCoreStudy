package ObjectReferenceTypes;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/**
 * Created by Admin on 22.08.2016.
 */
public class TypesOfReferencesApi {

    public static void main(String[] args) {

        ReferenceQueue<CounterForReferences> refQueue = new ReferenceQueue<CounterForReferences>();//queue for refs check - traverse yhis to check
        // weak - god for METADATA
        CounterForReferences counter = new CounterForReferences();//strong
        WeakReference<CounterForReferences> weakCounter = new WeakReference<CounterForReferences>(counter,refQueue);//weak - doest not save for GC - cause  it is  week - agter strong is null - GC kills it - weak does nto save
      //  counter = null;// now Counter object is eligible for garbage collection

        //soft ref - good for CASH

        CounterForReferences counter2 = new CounterForReferences();//strong
        SoftReference<CounterForReferences> softCounter = new SoftReference<CounterForReferences>(counter2,refQueue);//saves counter - GC will kill only in urgent need of sapce
        counter2 = null;// now Counter object is eligible for garbage collection but only be collected when JVM absolutely needs memory


        //PHANTOM REF
        CounterForReferences counter3 = new CounterForReferences();
        PhantomReference<CounterForReferences> phantomCounter = new PhantomReference<CounterForReferences>(counter3,refQueue);
        counter3 = null;//at any moment gc kills






    }
}
