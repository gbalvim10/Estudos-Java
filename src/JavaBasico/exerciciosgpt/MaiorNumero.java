package JavaBasico.exerciciosgpt;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int number2 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int number3 = scanner.nextInt();

        scanner.close();

        int biggestNumber = number1;

        if (number2 > biggestNumber) {
            biggestNumber = number2;
        }

        if (number3 > biggestNumber) {
            biggestNumber = number3;
        }

        System.out.println("O maior numero foi: " + biggestNumber);
    }
}
