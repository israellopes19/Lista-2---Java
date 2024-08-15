import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num = s.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
    }
}
