package a02;
import java.util.*;


public class A02 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        
        Collection <Integer> numeros = new ArrayList<>();
        
        System.out.println("Introduce los numeros que quieras guardar, dale a -1 si quieres acabar");
        int n = sc.nextInt();

        while(n != -1){
            if(n > 0){
                numeros.add(n);
            } else{
                System.out.println("Introduce solo numeros positivos");
            }

            System.out.println("Introduce los numeros que quieras guardar, -1 si quieres acabar");
            n = sc.nextInt();
        }

        System.out.println("\nLista completa: " + numeros);

        for (int num_par : numeros){
            if(num_par % 2 == 0){
                System.out.println( "Valores pares de la lista: " + num_par);
            }
        }

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){
            int num_act = it.next();

            if(num_act % 3 == 0){
                it.remove();
            }
        }

        System.out.println("Lista sin multiplos de 3: " + numeros);
    
        } catch (Exception e) {
            System.out.println("Error: ¡Debes introducir un número entero!");
        }
    }
}
