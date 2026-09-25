package JavaBasico.ExerciciosGPT;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tabuada deseja descobrir: ");
        int number = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < 11; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

        }
    }
}
