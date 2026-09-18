package JavaPoo.ExercíciosChatGpt.test;

import JavaPoo.ExercíciosChatGpt.dominio.Pessoa;

public class PessoaTestExercicio {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.altura = 1.78F;
        pessoa1.nome = "Joao";
        pessoa1.idade = 19;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.altura);
    }
}
