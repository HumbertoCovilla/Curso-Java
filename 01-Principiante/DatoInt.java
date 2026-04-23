import java.util.Scanner;

public class DatoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstname ="";
        String lastname ="";
        String fullname = "";

        System.out.print("Por favor escriba su primer nombre: ");
        firstname = sc.next();
        System.out.print("Por favor escriba su apellido: ");
        lastname = sc.next();

        fullname = firstname + lastname;


        System.out.println("hola " + fullname );

    }
}
