/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author aeliu
 */
public class Act13 {

    /**
     * @param args the command line arguments
     */
    
    
   static List<String> lista = new ArrayList();
    public static void main(String[] args) {
    lista.add("Eliud");
    lista.add("Roberto");
    lista.add("Ahiran");
    lista.add("Carlos");
    lista.add("Perla");
    lista.add("Johanna");
    lista.add("Fernanda");
    lista.add("Sofia");
    lista.add("Armando");
    lista.add("Ernesto");
    lista.add("Esmeralda");
    System.out.println ("Lista de estudiantes:" + lista );
    Collections.sort(lista);
    System.out.println("Orden alfabetico con sort:" +lista);  
    lista.sort(Comparator.comparingInt(String::length));
    System.out.println("Orden por longitud con lamda:" +lista);  
    lista.sort((String p1 ,String p2) -> p1.compareTo(p2));
    System.out.println("Orden alfabetico con lamda:" +lista);
    lista.sort((p1, p2) -> {
            byte result;
            if (p1.length() > p2.length()) {
                result = 1;
            } else if (p1.length() < p2.length()) {
                result = -1;
            } else {
                result = 0;
            }

            return 0;   
    });
    System.out.println("Orden alfabetico con referencia:" +lista);
    
 
    }
   
    }

