package a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A08 {
    public static void main(String[] args) {
        List <String> listaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        List <String> listaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));

        System.out.println("Son iguales? " + listaA.equals(listaB));

        System.out.println("Primer Luis: " + listaA.indexOf("Luis"));
        System.out.println("Último Luis: " + listaB.lastIndexOf("Luis"));

        listaA.sort(null);

        System.out.println("Son iguales? " + listaA.equals(listaB));

        listaB.sort(Comparator.reverseOrder());

        System.out.println("Orden inverso de la listaB: " + listaB);
    }
}
