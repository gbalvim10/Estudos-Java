package JavaPoo.ExercíciosChatGpt.test;

import JavaPoo.ExercíciosChatGpt.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao";
        funcionario.salario = 2000;
        funcionario.mesEAnoNascimento = 06.1971F;
        funcionario.idade = 55;

        funcionario.salarioAumenta(20);
        funcionario.mostrarDados();

    }
}
