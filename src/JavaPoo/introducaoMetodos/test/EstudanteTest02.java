package JavaPoo.introducaoMetodos.test;

import JavaPoo.introducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Gabriel";
        estudante.sexo = 'M';
        estudante.idade = 18;

        estudante2.sexo = 'F';
        estudante2.nome = "Livia";
        estudante2.idade = 18;

        estudante.imprime();
        estudante2.imprime();
    }
}
