package a10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A10 {
    public static void main(String[] args) {
        Set<Socio> conjuntoSocios = new HashSet<>();

        conjuntoSocios.add(new Socio("111", "Eva"));
        conjuntoSocios.add(new Socio("222", "Claudia"));
        conjuntoSocios.add(new Socio("333", "Leo"));

        boolean duplicado = conjuntoSocios.add(new Socio("222", "Sylvia"));

        System.out.println("¿Se ha duplicado? " + duplicado);
        System.out.println("Lista de HashSet desordenado : \n" + conjuntoSocios);

        Set<Socio> sociosOrdenados = new TreeSet<>(conjuntoSocios);
        sociosOrdenados.add(new Socio("555", "Delia"));
        System.out.println("Lista de TreeSet, ordenado por DNI: \n" + sociosOrdenados);

        List<Socio> listaSocios = new ArrayList<>(sociosOrdenados);

        Socio ganador = listaSocios.get(1);
        System.out.println("\nEl ganador del premio es: " + ganador);
    }
}
