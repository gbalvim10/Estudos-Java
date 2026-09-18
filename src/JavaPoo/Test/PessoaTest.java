package JavaPoo.Test;

import JavaPoo.introducaoClasses.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome =  "Gabriel";
        p1.idade =  25;
        p1.sexo = 'M';

        p2.nome =  "Gabriel";
        p2.idade =  25;
        p2.sexo = 'M';
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);

        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println(p2.sexo);


    }
}
