package MultiThreading.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Admin on 06.08.2016.
 */
public class ConcurrencyLockExample implements Runnable{

    private Resource resource;
    private Lock lock;

    public ConcurrencyLockExample(Resource r){
        this.resource = r;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            // лочим на 10 секунд
            if(lock.tryLock(10, TimeUnit.SECONDS)){
                resource.doSomething();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            //убираем лок
            lock.unlock();
        }
        // Для логгирования не требуется потокобезопасность
        resource.doLogging();
    }

}




 class Resource {

    public void doSomething(){
        // пусть здесь происходит работа с базой данных
    }

    public void doLogging(){
        // потокобезопасность для логгирования нам не требуется
    }
}



class SynchronizedLockExample implements Runnable{

    // экземпляр класса Resource для работы с методами
    private Resource resource;

    public SynchronizedLockExample(Resource r){
        this.resource = r;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.doSomething();
        }
        resource.doLogging();
    }
}
