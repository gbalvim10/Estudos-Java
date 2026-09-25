package JavaPoo.ExercíciosChatGpt.test;

import JavaPoo.ExercíciosChatGpt.dominio.ContaBancaria;

public class ContaBancariaTesteExercicio {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Joao";
        conta.saldo = 1200;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo da conta: " + conta.saldo);

        conta.deposito(1200);
        conta.MostrarSaldo();


    }
}
