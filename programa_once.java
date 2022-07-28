import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio18MenuDiaSemana {
  public static void main(String[] args) {
    String sPalabra ="contador de vocales ";
    int contador = 0;
    for(int x=0;x<sPalabra.length();x++) {
        if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){ 
           contador++;
         }
       }
  }
}