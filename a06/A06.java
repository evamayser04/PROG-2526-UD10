package a06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class A06 {
    public static void main(String[] args) {
        Collection <Integer> colecAle = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            colecAle.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Coleccion aleatoria: \n" + colecAle);

        Integer[] tabla = colecAle.toArray(new Integer[0]);

         Arrays.sort(tabla);

         Collection <Integer> colecDin = new ArrayList<>(Arrays.asList(tabla));

         System.out.println("Coleccion aleatoria ordenada: \n" + colecDin);

    }
}
