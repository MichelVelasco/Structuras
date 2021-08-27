import java.util.Scanner;

/*Arreglos -- leer por teclado 2 arreglos y crear un 3er arreglo que contenga 
el primer elemento de la matriz 1 y despues el primer elemnto de la matriz 2 
y asi sucesivamente*/

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer A[], B[], C[];

        A = new Integer[6];
        B = new Integer[6];
        C = new Integer[12];

        System.out.println("Digite los elementos del arreglo A");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digita el elemento "+ i+1 + " de arreglo A: ");
            A[i] = entrada.nextInt();
        }

        System.out.println("Digite los elementos del arreglo B");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Digita el elemento "+ i + " de arreglo B: ");
            B[i] = entrada.nextInt();          
        }

 //Combinando Arreglo A y B en el arreglo C     
 int D=0; //Variable de control para la posicion a guardar en el arreglo C
 int E=0;
        
            for (int j=0; j<12;) {
                C[j] = A[j];
                D++; 
                j++; 
                C[j+1] = A[j+1];
                j++; 
                C[j+1] = A[j+1]; 
                j++;
                C[j+1] = B[j+1];
                j++;  
                C[j+1] = B[j+1];
                j++; 
                C[j+1] = B[j+1]; 
                j++;
                
                }
        
        System.out.println("El arreglo C es: ");
        for (Integer i : C) {
            System.out.println(C[i]);
        }
        
    }
    
}
