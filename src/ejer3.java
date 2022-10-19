import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();

        if (num1 <= 0 || num2 <= 0){

            if (num1 <= 0 && num2 > 0){

                System.out.println("No se calcula la suma porque el primer número es negativo.");

            }

            if (num1 > 0){

                System.out.println("No se calcula la suma porque el segundo número es negativo");

            }

            if (num1 <= 0 && num2 <= 0){

                System.out.println("No se calcula la suma porque los dos números son negativos");

            }

        } else {

            System.out.println("Números introducidos: "+num1+" y "+num2);
            System.out.println("La suma de los dos números es: "+(num1+num2));

        }

    }

}
