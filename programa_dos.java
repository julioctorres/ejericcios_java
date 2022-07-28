import java.util.Scanner;

public class programa_dos {
    public static void main(String[] args) {
      
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num_uno = enter.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num_dos = enter.nextInt();

        if (num_dos < num_uno)
      {
            System.out.println("El numero mayor es "+ num_uno);
      }
      else if (num_dos > num_uno)
      {
          System.out.println("El numero mayor es "+ num_dos);
      }
      else
      {
          System.out.println("Los numeros son iguales");
      } 
  }
  }