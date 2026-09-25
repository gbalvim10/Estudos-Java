package JavaBasico.ExerciciosGPT;

public class ExercicioUmAoTres {
    public static void main(String[] args) {
        /*
    Exercício 1 - Soma
    Crie duas variáveis inteiras e imprima:
    a soma
    a subtração
    a multiplicação
    a divisão inteira
    o resto da divisão
     */
        System.out.println("EXERCICIO 1");
        int num1 = 45;
        int num2 = 345;

        double s = num1 + num2;
        double sub = num1 - num2;
        double m = num1 * num2;
        int dI = num1 / num2;
        double rD = num1 % num2;
        System.out.println("Soma: " + s);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + m);
        System.out.println("Divisao: " + dI);
        System.out.println("Resto da divisao: " + rD);
        System.out.println("_________________________________");


        System.out.println("EXERCICIO 2");
            /*
            Exercício 2 - Média
            Crie três notas.
            Calcule a média.
            */

            double n1 = 9.8;
            double n2 = 9.76;
            double n3 = 5.0;

            double mid = (n1 + n2 + n3) / 3;
            System.out.println("Media: " + mid);
            System.out.println("_________________________________");


        System.out.println("EXERCICIO 3");
            /*
            Exercício 3 - Dobro e Triplo
            Crie uma variável inteira:
            Mostre:
            número
            dobro
            triplo
            quadrado
            */



            int number = 73;

            int numberSolid = number;
            int d = number * 2;
            int t = number * 3;
            int q = number * number;

            System.out.println("numero: " + number);
            System.out.println("Dobro: " + d);
            System.out.println("Triplo: " + t);
            System.out.println("Quadrado: " + q);

    }
}
