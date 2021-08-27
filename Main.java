import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase " );
        String frase = entrada.nextLine();

        LongitudString Index = new LongitudString();

        Index.converter(frase);
        
    }
    
}
