package JavaPoo.introducaoMetodos.ExerciciosCurso.dominio;

public class ImpressoraFuncionario {
    public void imprime(FuncionarioCurso funcionario) {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Salario 1: " + funcionario.salario[0]);
        System.out.println("Salario 2: " + funcionario.salario[1]);
        System.out.println("Salario 3: " + funcionario.salario[2]);
        System.out.println("_____________________");
    }
}
