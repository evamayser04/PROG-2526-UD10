package a03;
import java.util.ArrayList;
import java.util.Collection;

public class A03 {
    public static void main(String[] args) {

        Collection <Integer> num = new ArrayList<>();
        Collection <Integer> numSinRepe = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            num.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Coleccion de 20 numero aleatorios: \n" + num);

    }
}
