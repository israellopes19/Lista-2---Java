import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = s.nextLine();

        System.out.println("Digite seu sexo: ");
        String sexo= s.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estado = s.nextLine();

        String A = ("F");
        String B = ("CASADA");

        if (sexo = A && estado = B) {
            System.out.println("qUAL TEMPO DE CASADA?");


        }

    }
}