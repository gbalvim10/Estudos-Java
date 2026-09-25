package JavaBasico.ExerciciosGPT;

import java.util.Scanner;

public class ExercicioParOuImpar {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number = count.nextInt();

        count.close();

        if (number % 2 == 0){
            System.out.println("Seu numero e par");
        } else {
            System.out.println("Seu numero e impar");
        }
    }
}
