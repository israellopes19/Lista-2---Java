import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = s.nextInt();

        if (numero > 0) {
            int mult = numero * 2;
            System.out.println("O postivio é " + mult);
        } else if (numero < 0) {
            int triplo = numero * 3;
            System.out.println("O negativo é " + triplo);
        }
    }
}