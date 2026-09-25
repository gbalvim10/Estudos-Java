package JavaPoo.introducaoMetodos.test;

import JavaPoo.introducaoMetodos.dominio.Estudante;
import JavaPoo.introducaoMetodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante.nome = "Gabriel";
        estudante.sexo = 'M';
        estudante.idade = 18;

        estudante2.sexo = 'F';
        estudante2.nome = "Livia";
        estudante2.idade = 18;

        impressora.imprime(estudante);
        impressora.imprime(estudante2);

    }
}
