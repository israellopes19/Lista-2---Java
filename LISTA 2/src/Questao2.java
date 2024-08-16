import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.println("Digite o seu sexo: (M/F)");
        String sexo = s.nextLine();

        System.out.println("Digite o seu estado civil: ");
        String estadoCivil = s.nextLine();


        if(sexo.equalsIgnoreCase("f") && estadoCivil.equalsIgnoreCase("Casado")){
            System.out.println("Digite o tempo de casado: ");
            int tempoCasado = s.nextInt();
            System.out.printf("Nome: %s%nSexo: %s%nEstado Civil: %s%nTempo de casado: %s%n", nome, sexo, estadoCivil,tempoCasado);
        }else{
            System.out.printf("Nome: %s%nSexo: %s%nEstado Civil: %s%n", nome, sexo, estadoCivil);
        }

    }
}
