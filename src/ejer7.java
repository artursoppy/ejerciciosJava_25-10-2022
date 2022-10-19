import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el importe bruto de la venta");
        int num = sc.nextInt();

        if(num <= 20000){

            System.out.println("El precio neto es: "+num);

        }

        if (num > 20000 && num <= 100000){

            System.out.println("El precio neto es: "+(num-(num*0.05)));
        }

        if (num > 100000){

            System.out.println("El precio neto es: "+(num-(num*0.10)));

        }

    }

}
