import java.util.Scanner;

// Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Integer arreglo[] = new Integer[5];
       
        System.out.println("Guardango los datos del arreglo");
        for(int i=0;i<5;i++) {
            System.out.print("Digite el numero de la posision "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\nMostrando los datos del arreglo de forma invertida: ");
        for (int i = arreglo.length;i>0;i--) {
            System.out.println(arreglo[i-1]);
        }
      }
}