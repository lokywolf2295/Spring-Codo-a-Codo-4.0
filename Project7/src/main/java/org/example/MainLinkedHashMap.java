package org.example;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashMap {

    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Casillas");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(3, "Pique");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(11, "Capdevila");
        linkedHashMap.put(14, "Xabi Alonso");
        linkedHashMap.put(16, "Busquets");
        linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(18, "Pedrito");
        linkedHashMap.put(6, "Iniesta");
        linkedHashMap.put(7, "Villa");

        // Imprimimos el Map con un Iterador
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
    }
}
