package JavaBasico.Projetos;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int saldo = 1000;
        int option;

        System.out.print("Crie uma senha de numeros: ");
        int senha = scanner.nextInt();


        System.out.print("Digite sua senha: ");
        int password = scanner.nextInt();

        if (password == senha) {

            do {
                System.out.println("==========================");
                System.out.println("        BANCO ALVIM       ");
                System.out.println("==========================");

                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Transferir");
                System.out.println("5 - Alterar Senha");
                System.out.println("6 - Simular investimento");
                System.out.println("0 - Sair ");

                System.out.print("Escolha: ");
                option = scanner.nextInt();
                System.out.println("==========================");

                int operacoes = 0;

                switch (option) {

                    case 1:
                        System.out.println("O seu saldo é de: R$" + saldo);
                        break;

                    case 2:
                        System.out.print("Qual valor deseja depositar: R$");
                        int valorDeposito = scanner.nextInt();

                        saldo = saldo + valorDeposito;
                        break;

                    case 3:
                        System.out.print("Qual valor deseja sacar: R$");
                        int saque = scanner.nextInt();

                        if (saque > saldo) {
                            System.out.println("==========================");
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo = saldo - saque;
                            System.out.println("==========================");
                            System.out.println("Saque efetuado com sucesso!");
                        }
                        break;

                    case 4:
                        System.out.print("Quanto quer transferir: R$");
                        int transfer = scanner.nextInt();

                        if (transfer > saldo) {
                            System.out.println("==========================");
                            System.out.println("Saldo indisponivel");
                        } else {
                            saldo = saldo - transfer;
                            System.out.println("==========================");
                            System.out.println("Transferencia efetuada com sucesso!");
                        }
                        break;


                    case 5:
                        System.out.print("Digite sua nova senha: ");
                        int newPassword = scanner.nextInt();
                        password = newPassword;

                        break;


                    case 6:
                        System.out.println("===== SIMULADOR DE INVESTIMENTOS =====");

                        System.out.print("Quanto deseja investir por mes: R$ ");
                        double aporte = scanner.nextDouble();

                        System.out.print("Por quantos anos deseja investir: ");
                        int anos = scanner.nextInt();

                        System.out.print("Qual o rendimento anual esperado (%): ");
                        double taxaAnual = scanner.nextDouble();

                        // Convertendo anos para meses
                        int meses = anos * 12;

                        // Convertendo a taxa anual para mensal
                        double taxaMensal = Math.pow(1 + taxaAnual / 100, 1.0 / 12) - 1;

                        // Fórmula dos aportes mensais
                        double valorFinal = aporte *
                                (Math.pow(1 + taxaMensal, meses) - 1) / taxaMensal;

                        // Total colocado pelo usuário
                        double totalInvestido = aporte * meses;

                        // Quanto veio dos rendimentos
                        double rendimento = valorFinal - totalInvestido;

                        System.out.println("==========================");
                        System.out.printf("Total investido: R$ %.2f%n", totalInvestido);
                        System.out.printf("Rendimento: R$ %.2f%n", rendimento);
                        System.out.printf("Patrimônio final: R$ %.2f%n", valorFinal);
                        System.out.println("==========================");

                        break;


                    case 0:
                        System.out.println("PROGRAMA SE ENCERRANDO");
                        break;

                    default:
                        System.out.println("Essa opcao nao existe");
                        break;


                }

            } while (option != 0);


        } else {
            System.out.println("Acesso Negado!");
        }



    }

}
