package Collections;

import java.util.*;

/**
 * Created by Admin on 06.07.2016.
 */
public class ConvertMapToArrayList {

    public static void main(String[] args) {

        HashMap<String,String> mapa = new HashMap<String, String>();
        mapa.put("A","1");
        mapa.put("4","3");

        List<String> keys = convertMapsKeysToList(mapa);
        System.out.println(Arrays.toString(keys.toArray()));

        List<String> vals = convertMapsValuesToList(mapa);
        System.out.println(Arrays.toString(vals.toArray()));

        ArrayList<Map.Entry<String,String>> entries = convertMapEntriesToList(mapa);
        System.out.println(Arrays.toString(entries.toArray()));

    }

    public static <T> List<T> convertMapsKeysToList(HashMap<T,T> mapa){
        Set<T> keySet = mapa.keySet();
        List<T> listofkeys = new ArrayList<T>(keySet);

        return listofkeys;
    }



    public static <T> List <T> convertMapsValuesToList(HashMap<T,T> mapa){
        Collection<T> valuesSetSet = mapa.values();
        List<T> listofvalues = new ArrayList<T>(valuesSetSet);

        return listofvalues;
    }


    public static <T> ArrayList<Map.Entry<T, T>> convertMapEntriesToList(HashMap<T,T> mapa){

        Set<Map.Entry<T,T>> entries = mapa.entrySet();
        ArrayList<Map.Entry<T,T>> listOfEntries = new ArrayList<Map.Entry<T, T>>(entries);

        return listOfEntries;
    }



}
