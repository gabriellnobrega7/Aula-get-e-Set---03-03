 package ex02;

import java.util.Scanner;

public class Main {
 

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        

        System.out.println("Digite o nome do departamento:");
        String nomeDepart = input.nextLine();

        System.out.println("Digite o código do departamento:");
        int codigoDepart = input.nextInt();
        input.nextLine();

        Depart departamento = new Depart(nomeDepart, codigoDepart);

        System.out.println("Digite o nome do funcionário:");
        String nomeFunc = input.nextLine();

        System.out.println("Digite a matrícula:");
        int matricula = input.nextInt();

        Funcionario f = new Funcionario(matricula, nomeFunc, departamento);

        System.out.println("\nDados do funcionário:");
        System.out.println(f);
    }
}
