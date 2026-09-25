package JavaPoo.ExercíciosChatGpt.test;

import JavaPoo.ExercíciosChatGpt.dominio.Produto;

public class ProdutoTestExercicio {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome="Mousse";
        produto1.preco=80.00F;
        produto1.quantidade=5F;

        System.out.println("Nome do produto: "+produto1.nome);
        System.out.println("Preco do produto: R$"+produto1.preco);
        System.out.println("Quantidade do produto: "+produto1.quantidade);
        float valorEstoque = produto1.preco * produto1.quantidade;


        System.out.println("Valor do estoque: " + valorEstoque);

    }
}
