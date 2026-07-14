import java.util.Scanner;

public class ContaBancaria {
    public class Dados{

        String nome;
        double saldo;
        int agencia;

        Scanner scanner = new Scanner(System.in);


    }

    public void Consulta(){

        System.out.println("Qual dado deseja consultar?");
        System.out.println("1-nome");
        System.out.println("2-saldo");
        System.out.println("3-agencia");
        int dado = scanner.nextInt();

        switch(dado){
            switch (dado) {
                case 1:
                    System.out.println(nome);
                    break;
                case 2:
                    System.out.println(saldo);
                    break;
                case 3:
                    System.out.println(agencia);
                    break;
                default:
                    System.out.println("Opção inválida"); // Se nenhum caso for atendido
        }


    }

    public static void main(String[] args) {

        System.out.println("Ola, Insira seus dados adiante");

        System.out.println("Nome Completo:");
        nome = scanner.nextLine();

        System.out.println("Número da Agência:");
        agencia = scanner.nextInt();

        System.out.println("Saldo a Depositar:");
        saldo = scanner.nextFloat();

        System.out.println("Deseja consultar algum dado?");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case "sim":
                Consulta();
                break;
            case "não":
                "programa encerrado"
                break;
        }





    }
}