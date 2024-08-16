import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero boolean do valor: ");
        boolean x = s.nextBoolean();

        System.out.println("Digite o segundo numero boolean do valor: ");
        boolean y = s.nextBoolean();

        if(x^y){//ou exclusivo, só é verdade quando ambos são diferentes, um verdadeiro e o outro falso
            System.out.println("São diferentes");
        }else if(x & y){
            System.out.print("VERDADEIROS");
        } else {
            System.out.print("FALSO");
        }


    }
}
