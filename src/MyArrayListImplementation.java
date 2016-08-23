import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Objects;

/**
 * Created by Admin on 12.07.2016.
 */
public class MyArrayListImplementation {

    private Object [] myList;
    private int size = 0;

    public MyArrayListImplementation(){
        myList = new Object[10];
    }

    public Object get(int index){
        if(index < size) {
            return myList[index];
        }else{
            throw new  ArrayIndexOutOfBoundsException();
        }
    }

    public  void add(Object objToAdd){
        if((myList.length - size)<=5){
            increaseCapacity();
        }
        else{
            myList[size++] = objToAdd;
        }
    }

    public Object remove(int index){
        if(index < size)
        {
            Object myObj = myList[index];
            myList[index]=null;
            int temp = index;
            while (temp<size){
                myList[temp]= myList[temp+1];
                myList[temp+1]= null;
                temp++;
            }
            size--;
            return myObj;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size(){
         return size;
    }

    private void increaseCapacity() {
        myList = Arrays.copyOf(myList,myList.length*2);
        System.out.println(" new capacity " + myList.length);
    }


    public static void main(String[] args) {
        MyArrayListImplementation listik = new MyArrayListImplementation();
        listik.add(new Integer(10));
        listik.add(new Integer(15));

        listik.add(new Integer(19));

       for(int i = 0; i< listik.size;i++){
           System.out.print(listik.get(i) + " ");
       }

        System.out.println(listik.get(0));
        listik.add(new Double(2.6));
        for(int i = 0; i< listik.size;i++){
            System.out.print(listik.get(i) + " ");
        }

        listik.remove(3);
        System.out.println();
        for(int i = 0; i< listik.size;i++){
            System.out.print(listik.get(i) + " ");
        }

        System.out.println(listik.size);


    }
}
