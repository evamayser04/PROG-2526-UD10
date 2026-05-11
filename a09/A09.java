package a09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A09 {
    public static void main(String[] args) {
        List<Integer> numerosOriginal = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            numerosOriginal.add((int) (Math.random() * 100 + 1));
        }

        System.out.println("Lista con repetidos: " + numerosOriginal);

        Set<Integer> numerosHash = new HashSet<>(numerosOriginal);

        System.out.println("Numeros sin repes, no garantiza orden: " + numerosHash);

        Set<Integer> numerosTree = new TreeSet<>(numerosOriginal);

        System.out.println("Numeros  sin repes y ordenados de menor a mayor (orden natural) " + numerosTree);

        Set<Integer> numerosLinked = new LinkedHashSet<>(numerosOriginal);

        System.out.println("Numero sin repes y ordenados por insercion" + numerosLinked);



    }
}
