package ReferenceTypes;

import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 12.08.2016.

 */
public class TetsvarReferenceTypes {
    List<BigObject> strongList; // сильные ссылки
    List<Reference<BigObject>> softList; // мягкие ссылки
    List<Reference<BigObject>> weakList; // слабые ссылки
    List<Reference<BigObject>> phantomList; // фантомные ссылки
    ReferenceQueue<BigObject> queue; // очередь
    List<String> loadMemoryList; // здесь будут храниться ссылки на строки, которые
    // используются для загрузки памяти

    private void printLists() {
        System.out.println("Strong references: ");
        for (BigObject bo : strongList) System.out.print(bo + " ");
        System.out.println();
        System.out.println("SoftReferences: ");
        printList(softList);
        System.out.println("WeakReferences: ");
        printList(weakList);
        System.out.println("PhantomReferences: ");
        printList(phantomList);
    }

    private void printList(List<Reference<BigObject>> pList) {
        for (Reference<BigObject> ref : pList)
            System.out.print(ref.get() + " ");

        System.out.println();
    }

    private void init() {
        strongList = new ArrayList<BigObject>();
        softList = new ArrayList<Reference<BigObject>>();
        weakList = new ArrayList<Reference<BigObject>>();
        phantomList = new ArrayList<Reference<BigObject>>();
        loadMemoryList = new ArrayList<String>();
        queue = new ReferenceQueue<BigObject>();
        for (int i = 0; i < 3; i++) {
            strongList.add(new BigObject(i));
            softList.add(new SoftReference<BigObject>(new BigObject(i)));

            weakList.add(new WeakReference<BigObject>(new BigObject(i)));
            phantomList.add(new PhantomReference<BigObject>(new BigObject(i), queue));
        }
        printLists();
    }

    private void loadMemory() {
        for (int i = 0; i < 1200000; i++) {
            loadMemoryList.add(i + "");
        }
    }

    public void testPhantomReferences(){
        init(); // инициализация
        System.gc(); // вызов сборщика мусора
        System.out.println("garbage collector invoked");
        printLists(); // вывод
    }

    public void testSoftRefences(){
        init();
        System.gc();
        System.out.println("garbage collector invoked");
        printLists();
        System.out.println("memory usage increased");
        loadMemory(); // загрузка памяти
        System.out.println("loadMemoryList.size() = "+loadMemoryList.size());
        System.gc();
        System.out.println("garbage collector invoked");
        printLists();
    }
    public static void main(String[] args) {
        TetsvarReferenceTypes tv = new TetsvarReferenceTypes();
        //tv.testPhantomReferences();
        tv.testSoftRefences();
    }
}

    class BigObject {
        private int value;

        public BigObject(Integer pValue) {
            value = pValue;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("BigObject (" + value + ") finalize()");
        }

        @Override
        public String toString() {
            return value + "";
        }

    }

