import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = s.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = s.nextInt();

        int maior, meio, menor;

        // Determine the largest number
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        System.out.printf("Os números na ordem são: %d, %d, %d%n", menor, meio, maior);


    }
}
