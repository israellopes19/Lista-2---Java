import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = s.nextInt();

        int c = 0;

        if(n1 == n2){
            c = n1 + n2;
        }else{
            c = n1 * n2;
        }
        System.out.println("O valor é: "+ c);
    }
}
