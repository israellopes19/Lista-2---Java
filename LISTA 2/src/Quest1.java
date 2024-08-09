import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um valor para A:");
        int A = s.nextInt();

        System.out.println("Digite um valor para B: ");
        int B = s.nextInt();

        System.out.println("Digite um valor para C: ");
        int C = s.nextInt();

        int i = (A + B);

        if (i % 2 < C) {
            System.out.println("A soma de A e B é menor que C");
            ;

        }
    }
}
