import java.util.Scanner;

public class ejer6 {

    public static void main(String[] args) {

        boolean comprueba = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();



        if (num1 % 2 != 0 || num2 % 2 != 0){

            System.out.println("Error, los números deben ser pares");
            comprueba = false;
        }

        if (num1 > 50 || num2 <= 100 || num2 >= 500){

            System.out.println("Error, el primer número debe ser mayor que 50 y el segundo debe estar entre 100 y 500");
            comprueba = false;

        }

        if (comprueba){

            System.out.println(num1+num2);

        }

    }

}
