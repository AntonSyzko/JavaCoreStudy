package Collections;

import java.util.*;

/**
 * Created by Admin on 20.07.2016.
 */
public class MapaToLista {

    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<String, String>();
        mapa.put("a","aa");
        mapa.put("b","bb");

        Set<Map.Entry<String,String>> mapEntrySet = mapa.entrySet();
        List<Map.Entry<String,String>> lista = new ArrayList<Map.Entry<String, String>>(mapEntrySet);
        System.out.println(lista.toArray().toString());
        for(Map.Entry<String,String> each : lista){
            System.out.println(each.toString());
        }

    }
}
