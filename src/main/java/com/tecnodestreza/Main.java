package com.tecnodestreza;

import java.util.*;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ordenarLista();
    }

    public static void ordenarLista() {

        //Varias formas de instanciar una lista:
        // List<String> lista = new ArrayList<>(Arrays.asList("Erika","Andres", "Ines"));
        //List<String> lista = Arrays.asList("Pedro", "Lenin", "José");
        List<String> lista = new ArrayList<>(Arrays.asList("manzana", "pera","durazno"));
        //List<String> lista = List.of("manzana", "pera", "durazno");

        //ordena la lista de forma ascendente pero se recomienda la lista
        //instanciarla con un ArrayList asi:
        // List<String> lista = new ArrayList<>(List.of("manzana", "pera", "durazno"));
        lista.sort((x,y)->x.compareTo(y));
        //tambien se puede hacer mediante metodo de referencia:
        lista.sort(String::compareTo);
        //Para ordenar de forma descendente, se puede hacer así tambien:
        lista.sort(Collections.reverseOrder());

        //Ordenar Lista de manera descendente, incorporandole el forEach
        /*lista.stream()
                .sorted((x,y)->y.compareTo(x)) // Orden ascendente
                .toList().forEach(System.out::println);*/

        //Ordenar Lista de manera ascendente, sin el forEach (se tendría que hacer una nueva lista
        // que va a tener los componentes ordenados de la lista previa y despues se debe iterar
        List<String> nuevaLista = lista.stream()
                .sorted(String::compareTo) // Orden ascendente
                .toList();

        System.out.println("For tradicional:");
        for (int i = 0; i < nuevaLista.size(); i++) {

            System.out.println(nuevaLista.get(i));
        }

        System.out.println("For each sin expresión lambda:");
        for (String list : nuevaLista) {

            System.out.println(list);

        }

        //ForEach con epresion lambda

        System.out.println("For Each con expresión Lambda");
        // nuevaLista.forEach(x->System.out.println(x));

        nuevaLista.forEach(System.out::println);

        System.out.println("For Each con indice y donde se puede acceder a los elementos de la lista");

        IntStream.range(0, nuevaLista.size()).forEach(i -> System.out.println("indice:" + i + " fruta: " + nuevaLista.get(i)));

///Agrego este comentario al final para probar el push a la rama.

        // Ahora quiero comparar los cambios.
        // Estoy modificando desde el git a ver que pasa
        //cambio desde git nuevamente
        //Otra pruebas mas....
    }
}


