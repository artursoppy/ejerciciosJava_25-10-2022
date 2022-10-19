import java.util.Scanner;;

public class ejer5 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;

        boolean comprueba = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();

        System.out.println("Introduce el tercer número");
        n3 = sc.nextInt();

        System.out.println("Números introducidos "+n1+" "+n2+" "+n3);

        if ((n1 == n2 + n3) || (n2 == n1+n3) || (n3 == n2+n1)){

            comprueba = true;
        }

        if (comprueba){

            if (n1 == n2+n3) {

                System.out.println("Se cumple que "+n1+" = "+n2+" + "+n3);

            }

            if (n2 == n1+n3){

                System.out.println("Se cumple que "+n2+" = "+n1+" + "+n3);

            }

            if (n3 == n1+n2){

                System.out.println("Se cumple que "+n3+" = "+n2+" + "+n1);
            }

        }

        if (!comprueba){

            System.out.println("Los números no cumplen la condición");

        }


    }

}