public class LongitudString{
    String frase;
    
    // metodo para convertir un String a una cadena de caracteres
    public char[] converter (String frase) {  
        char [] arreglo = frase.toCharArray();
        indexCounter(arreglo); // invocamos el metodo indexCounter
        return arreglo;
    }
     
    //Metodo para contar la longitud de la cadena previamente convertida
    public int indexCounter (char[] arreglo) {
        Integer contador=0;       
        for (char i : arreglo) {
            contador++;
        }
        System.out.println("La longitud del string es: " + contador);
        noSpaces(arreglo, contador);
        return contador;
    }
  
    public void noSpaces(char[] arreglo, int contador){
        int newCounter=0;
        char[] noEspaces= {};
        for (int i = 0; i < contador-1;) {
            if(arreglo[i] == ' '){
                i++;
            }
            else {
                i++;
               newCounter++;
            }
        }
            System.out.println("La longitud del arreglo sin espacios es: "+newCounter);
            /*if(arreglo[i] == ' '){
                i++;
            }
            else {
                noEspaces[newCounter] = arreglo[i];
                i++;
               newCounter++;
            }
            //System.out.println("La longitud del arreglo sin espacios es: "+newCounter);
            for (char c : noEspaces) {
                System.out.println(noEspaces[c]);                
            }*/
        

    }
}