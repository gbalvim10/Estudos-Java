package JavaBasico.Projetos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int option;
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        number1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        number2 = scanner.nextInt();

        do {
        System.out.println("--------------");
        System.out.println("  Calculadora ");
        System.out.println("--------------");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Divisao");
        System.out.println("4 - Multiplicacao");
        System.out.println("0 - Sair");
        System.out.println("--------------");


        System.out.print("Digite sua escolha: ");
         option = scanner.nextInt();

         switch (option) {

             case 1:
                 int resultAddition = number1 + number2;
                 System.out.println("A soma entre " + number1 + " e " + number2 + " fica: " + resultAddition);
                 break;

             case 2:
                 int resultSubtraction = number1 - number2;
                 System.out.println("A soma entre " + number1 + " e " + number2 + " fica: " + resultSubtraction);
                 break;

             case 3:
                 int resultDivision = number1 / number2;
                 System.out.println("A soma entre " + number1 + " e " + number2 + " fica: " + resultDivision);
                 break;

             case 4:
                 int resultMultiplication = number1 * number2;
                 System.out.println("A soma entre " + number1 + " e " + number2 + " fica: " + resultMultiplication);
                 break;

             case 0:
                 System.out.println("ENCERRANDO O PROGRAMA!");
                 break;

             default:
                 System.out.println("Opcao invalida");
             }


         } while (option > 0);

        scanner.close();
    }
}
