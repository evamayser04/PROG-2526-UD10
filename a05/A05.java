package a05;

import java.util.ArrayList;
import java.util.Collection;

public class A05 {
    public static void main(String[] args) {
        Collection <Integer> colecAle = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            colecAle.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Coleccion aleatoria: \n" + colecAle);

        Collection <Integer> colec5 = new ArrayList<>();
        colec5.add(5);

        colecAle.removeAll(colec5);

        System.out.println("Coleccion aleatoria sin cincos: \n" + colecAle);

    }
}
