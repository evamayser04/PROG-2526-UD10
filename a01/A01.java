package a01;

import java.util.Arrays;

public class A01 {
public static void main(String[] args) {
        Integer[] tablaIntegers = {4,6,3,2};
        Integer numInt = 5; 

        System.out.println("Tabla Integers inicial:");
        System.out.println(Arrays.toString(tablaIntegers));
        tablaIntegers = guardar(numInt, tablaIntegers);
        System.out.println("Tabla Integers modificada");
        System.out.println(Arrays.toString(tablaIntegers));  
    }

    public static <E> E[] guardar (E elemento,E tabla []){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        tabla[tabla.length-1]= elemento;
        return tabla;
    }
}
