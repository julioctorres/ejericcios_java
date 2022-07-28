import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese el numero");
        int a = Entrada.nextInt();

        for(int b = a; a<= 1000; a++ )
        {
            if(a%2 == 0)
            {
                System.out.print(a);
            }
        }

}
}