import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        if (num >= 0){

            System.out.println("El número "+num+" es positivo");

        } else {

            System.out.println("El número "+num+" es negativo");
        }

    }
}