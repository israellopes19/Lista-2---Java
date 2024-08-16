import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num = s.nextDouble();

        if (num % 2 == 0) {
            num = num + 5;
            System.out.println("Número par " + num);
        }else{
            num += 8;
            System.out.println("Número ímpar" + num );
        }
    }
}