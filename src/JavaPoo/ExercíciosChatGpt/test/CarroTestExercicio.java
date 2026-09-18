package JavaPoo.ExercíciosChatGpt.test;

import JavaPoo.ExercíciosChatGpt.dominio.Carro;

public class CarroTestExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2021;
        carro1.marca = "Fiat";
        carro1.modelo = "Palio\n";

        carro2.ano = 2017;
        carro2.marca = "Chevrolet";
        carro2.modelo = "Prisma";

        System.out.println(carro1.ano);
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);

        System.out.println("-------------------------");

        System.out.println(carro2.ano);
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
    }
}
