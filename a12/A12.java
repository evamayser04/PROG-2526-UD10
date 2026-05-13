package a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A12 {
    public static void main(String[] args) {
        List<Integer> premios = new ArrayList <>(Arrays.asList( 1000, 50, 500, 50, 200));

        int premiosCant = Collections.frequency(premios, 50);
        System.out.println("Hay " + premiosCant + " premios de 50.\n");

        int premioMax = Collections.max(premios);
        int premioMin = Collections.min(premios);
        System.out.println("El premio maximo es de: " + premioMax + "\n");
        System.out.println("El premio minimo es de: " + premioMin + "\n");

        Collections.shuffle(premios);
        System.out.println("Desordenamos la lista... \n" + premios);

        Collections.sort(premios);
        System.out.println("Ordenamos la lista...\n" + premios);

        int premioPosicion = Collections.binarySearch(premios, 500);
        System.out.println("La posicion del premio de 500 euros es: " + premioPosicion);

    }
}
