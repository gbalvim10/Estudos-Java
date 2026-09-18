package JavaBasico.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Se a idade for meor do que 15, imprima na tela categoria infantil
        // se idade for maior ou igual a 15 e menor ou igual a 18 categoria juvenil
        // se idade for maior ou igual a 18 categoria adulto

        int age1 = 17;

        if (age1 < 15){
            System.out.println("Categoria: Juvenil");
        } else if (age1 >= 15 && age1 <= 18) {
            System.out.println("Categoria: Juvenil");
        }else {
            System.out.println("Categoria: Adulto");
        }

    }
}
