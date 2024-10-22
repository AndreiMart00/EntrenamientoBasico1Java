import java.util.Enumeration;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduciremos 3 números y hallaremos la suma de estos");
        //Introducir datos

        System.out.println("Introduce el primer número: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int n2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int n3 = teclado.nextInt();
        System.out.println("El primer número introducido es: "+ n1);
        System.out.println("El segudo número introducido es: "+ n2);
        System.out.println("El tercer número introducido es: "+ n3);
//Algoritmo
       int sum = n1+n2;
       if (sum==n3){
           System.out.println("Los dos primeros son la suma del tercero");
       }else {
           System.out.println("Los dos primeros NO son la suma del tercero");
       }

//Mostrar resultados

    }



}
