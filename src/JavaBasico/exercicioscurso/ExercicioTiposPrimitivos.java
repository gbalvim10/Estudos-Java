package JavaBasico.exercicioscurso;

/*
Pratica
    Crie variaveis para as seguintes palavras que estao entre <> e imprima a mensagem

    Eu <nome>, morando no endereco <endereco>,
    confirmo que recebi o salario de <salario>, na data <data>
 */

public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String name = "Gabriel Alvim";
        String addres = "Rua Antonio Conselheiro, 56 - Jardim Crao";
        double salary = 1350.87;
        String paymentDate = "19.07.2026";
        System.out.println("Eu " + name + ", morando no endereco " + addres + ",");
        System.out.println("confirmo que recebi o salario de " + salary + "R$, na data " + paymentDate);
    }

}