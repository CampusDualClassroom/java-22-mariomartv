package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
    List<String> lista = new ArrayList<String>();
    lista.add("GKFFD");
        lista.add("TNANA");
        lista.add("MPMSL");
        lista.add("PSWME");
        lista.add("LZMLF");
        lista.add("JYEBV");
        lista.add("YELNT");
        lista.add("JSNKR");
        lista.add("JFESF");
        lista.add("TMJLL");

        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
    for(String elem : customList){
        System.out.println(elem);
    }
    }

    public static boolean addElementToList(List<String> customList, String element) {
    return customList.add(element);
    }

    public static void main(String[] args) {

    }


}
