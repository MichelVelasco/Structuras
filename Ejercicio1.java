import java.util.Scanner;

// leer 5 numeros, guardarlos y mostrarlos en el mismo orden

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos del arreglo");
        for (int i=0;i<5; i++) {
            System.out.print ((i+1) + ". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nMostrando los elementos del arreglo: ");
        for (float i : numeros) {
            System.out.println(i);
        }

    }
}