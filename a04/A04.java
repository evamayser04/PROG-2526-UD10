package a04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04 {
    public static void main(String[] args) {
        Collection <Integer> numAle = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numAle.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Coleccion de 100 numero aleatorios: \n" + numAle);

        Iterator<Integer> it = numAle.iterator();

        while (it.hasNext()) {
            int num = it.next();

            if (num == 5)
                it.remove(); 
            }
    System.out.println("Coleccion de 100 numero aleatorios sin 5: \n" + numAle);

    }

}
