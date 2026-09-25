package JavaPoo.introducaoMetodos.ExerciciosCurso.test;

import JavaPoo.introducaoMetodos.ExerciciosCurso.dominio.FuncionarioCurso;
import JavaPoo.introducaoMetodos.ExerciciosCurso.dominio.ImpressoraFuncionario;
import JavaPoo.introducaoMetodos.ExerciciosCurso.dominio.MediaSalarial;

public class FuncionarioCursoTest {
    public static void main(String[] args) {
        FuncionarioCurso funcionario = new FuncionarioCurso();
        ImpressoraFuncionario imprimeDados = new ImpressoraFuncionario();
        MediaSalarial media = new MediaSalarial();

        funcionario.nome = "Joao";
        funcionario.idade = 18;
        funcionario.salario= new double[] {1200, 1500, 3200};

        imprimeDados.imprime(funcionario);
        media.media(funcionario);
    }
}
