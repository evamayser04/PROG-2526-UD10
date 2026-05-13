package a11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A11 {
    public static void main(String[] args) {
        Map<String, Integer> repuestos = new TreeMap<>();

        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n--- TIENDA DE REPUESTOS ---");
                System.out.println("1. Alta producto");
                System.out.println("2. Baja producto");
                System.out.println("3. Actualizar stock");
                System.out.println("4. Listar existencias");
                System.out.println("5. Salir");
                System.out.print("Elige opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                
                    if(opcion == 1) {
                        System.out.print("Dame tu codigo del producto: ");
                        String codAlta = sc.nextLine();
                        if (repuestos.containsKey(codAlta)) {
                            System.out.println("¡El producto ya existe!");
                        } else {
                            System.out.print("Dame el stock inicial: ");
                            int stock = sc.nextInt();
                            repuestos.put(codAlta, stock);
                            System.out.println("Producto registrado.");
                        }
                    }
                    else if(opcion == 2) {
                        System.out.print("Dame el codigo del producto que quieres dar de baja: ");
                        String codBaja = sc.nextLine();
                        if (repuestos.remove(codBaja) != null) {
                            System.out.println("Producto eliminado.");
                        } else {
                            System.out.println("El producto no existe.");
                        }
                    }
                    else if(opcion == 3){
                        System.out.print("Dame el codigo del producto que quieres actualizar: ");
                        String codAct = sc.nextLine();
                        if (repuestos.containsKey(codAct)) {
                            System.out.print("Dame el actual stock: ");
                            int nuevoStock = sc.nextInt();
                            repuestos.put(codAct, nuevoStock);
                            System.out.println("Stock actualizado.");
                        } else {
                            System.out.println("El producto no existe.");
                        }
                    }
                    else if(opcion == 4){
                        System.out.println("\n--- LISTADO DE EXISTENCIAS ---");
                        if (repuestos.isEmpty()) {
                            System.out.println("No hay productos en el sistema.");
                        } else {
                            for (String codigo : repuestos.keySet()) {
                                System.out.println("Código: " + codigo + " | Stock: "+ repuestos.get(codigo));
                            }
                        }
                    }
                    else if(opcion == 5){
                        System.out.println("Saliendo del sistema...");
                    } 
                    else{
                        System.out.println("Opción incorrecta.");
                    }
                } while (opcion != 5);
            }
        }
    }