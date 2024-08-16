import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = s.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC é %.2f", imc , " Abaixo do peso");
        } else if (imc >= 18.5 &&  imc <= 24.9) {
            System.out.printf("Seu IMC é %.2f%s", imc ," Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu IMC é %.2f%s", imc ," Acima do peso");
        } else if (imc >= 30 ) {
            System.out.printf("Seu IMC é %.2f%s", imc , " Acima de 30 obeso");
        }
    }

}