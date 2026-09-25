package JavaPoo.introducaoMetodos.ExerciciosCurso.dominio;

public class MediaSalarial {
    public void media(FuncionarioCurso funcionario) {
        double valorTotal = funcionario.salario[0] + funcionario.salario[1] + funcionario.salario[2];

        double mediaTotal = valorTotal / 3;

        System.out.printf("Média total de salário: %.2f%n", mediaTotal);
    }
}
