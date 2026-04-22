import java.util.Scanner;

public class DatoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int suma;

        System.out.print("Por favor digita un numero: ");
        num1 = sc.nextInt();
        System.out.print("Por favor digita un segundo numero: ");
        num2 = sc.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de la suma es: " + suma);

    }
}
