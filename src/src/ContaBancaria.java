import java.util.Scanner;

public class ContaBancaria {
    public class Dados{

        String nome;
        double saldo;
        int agencia;

        Scanner scanner = new Scanner(System.in);


    }

    public static void main(String[] args) {

        System.out.println("Ola, Insira seus dados adiante");

        System.out.println("Nome Completo:")
        nome = scanner.nextLine();

        System.out.println("Número da Agência:")
        nome = scanner.nextInt();

        System.out.println("Saldo a Depositar:")
        nome = scanner.nextFloat();

    }
}