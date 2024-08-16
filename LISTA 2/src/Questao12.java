import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o número de identificação:");
        String numeroID = s.nextLine();
        System.out.println("digite o primeiro nota:");
        double nota1 = s.nextDouble();
        System.out.println("digite o segundo nota:");
        double nota2 = s.nextDouble();
        System.out.println("digite o terceira notais:");
        double nota3 = s.nextDouble();
        System.out.println("Digite a média dos exercícios:");
        double me = s.nextDouble();

        double ma = (nota1+nota2*2+nota3*3+me)/7;
        String conceito = "";//aqui já tá declarado como string
        String status = "";
        if(ma>=90){
             conceito = "A";
             status = "Aprovado";
        }else if(ma>=75 && ma<90){
             conceito = "B";
             status = "Aprovado";
        }else if (ma>=60 && ma< 75){
             conceito = "C";
             status = "Aprovado";
        }else if(ma>= 40 && ma<60){
             conceito = "D";
             status = "Reprovado";
        } else if (ma < 40) {
            conceito = "E";
            status = "Reprovado";
        }
        System.out.printf("O aluno: %s%nNota 1: %f%nNota 2: %f%nNota 3: %f%n" +
                    "Media dos exercícios: %f%nMeida do Aprovado: %f%nConceito: %s%nStatus: %s",
                    numeroID, nota1, nota2, nota3, me, ma, conceito, status);
        }
    }

