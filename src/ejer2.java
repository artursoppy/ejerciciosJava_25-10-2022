import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();

        if (num1 <= 0 || num2 <= 0){

            System.out.println("No se calcula la suma porque algunos de los números o los dos no son positivos.");

        } else {

            System.out.println("Números introducidos: "+num1+" y "+num2);
            System.out.println("La suma de los dos números es: "+(num1+num2));

        }

    }

}
