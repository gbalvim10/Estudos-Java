package JavaPoo.introducaoClasses.test;

import JavaPoo.introducaoClasses.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome="Shampoo";
        produto1.categoria="Cosméticos";
        produto1.fornecedor="Elseve";
        produto1.preco= 34.50F;

        produto2.nome="Carne";
        produto2.categoria="Alimentos";
        produto2.fornecedor="Sadia";
        produto2.preco= 20.50F;

        System.out.println(produto1.nome);
        System.out.println(produto1.categoria);
        System.out.println(produto1.fornecedor);
        System.out.println(produto1.preco);

        System.out.println("-------------------\n");

        System.out.println(produto2.nome);
        System.out.println(produto2.categoria);
        System.out.println(produto2.fornecedor);
        System.out.println(produto2.preco);

    }
}
