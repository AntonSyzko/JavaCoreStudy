package MultiThreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 28.07.2016.
 *
 ConcurrentHashMap

 You should use ConcurrentHashMap when you need very high concurrency in your project.
 It is thread safe without synchronizing the whole map.
 Reads can happen very fast while write is done with a lock.
 There is no locking at the object level.
 The locking is at a much finer granularity at a hashmap bucket level.
 ConcurrentHashMap doesn’t throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it.
 ConcurrentHashMap uses multitude of locks


 SynchronizedHashMap

 Synchronization at Object level.
 Every read/write operation needs to acquire lock.
 Locking the entire collection is a performance overhead.
 This essentially gives access to only one thread to the entire map & blocks all the other threads.
 It may cause contention.
 SynchronizedHashMap returns Iterator, which fails-fast on concurrent modification.



 */
public class HashMapaTypesConcurrency {

    public static final int THREAD_POOL_SIZE = 5;

   static Map<String,Integer> simpleMap = null;
    static Map<String,Integer> concurentmapa = null;
    static Map<String,Integer> syncMapa = null;

    public static void main(String[] args) throws InterruptedException {

        simpleMap  = new Hashtable<String, Integer>();
       concurentmapa  = new ConcurrentHashMap<String, Integer>();
        syncMapa = Collections.synchronizedMap(new HashMap<String, Integer>());

        crunchifyPerformTest(simpleMap);
        crunchifyPerformTest(concurentmapa);
        crunchifyPerformTest(syncMapa);

    }

    public static void crunchifyPerformTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {

        System.out.println("Test started for: " + crunchifyThreads.getClass());
        long averageTime = 0;
        for (int i = 0; i < 5; i++) {

            long startTime = System.nanoTime();
            ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
                crunchifyExServer.execute(new Runnable() {
                    @SuppressWarnings("unused")
                    @Override
                    public void run() {

                        for (int i = 0; i < 500000; i++) {
                            Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);

                            // Retrieve value. We are not using it anywhere
                            Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));

                            // Put value
                            crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
                        }
                    }
                });
            }

            // Make sure executor stops
            crunchifyExServer.shutdown();

            // Blocks until all tasks have completed execution after a shutdown request
            crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

            long entTime = System.nanoTime();
            long totalTime = (entTime - startTime) / 1000000L;
            averageTime += totalTime;
            System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
        }
        System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
    }

}
