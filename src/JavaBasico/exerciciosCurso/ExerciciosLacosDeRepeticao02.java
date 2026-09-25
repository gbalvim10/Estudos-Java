package JavaBasico.exerciciosCurso;

public class ExerciciosLacosDeRepeticao02 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condicao valorParcela >=1000

    //ex: carro de 40k, pode parcelar em 40x de 1k
    public static void main(String[] args) {
        int carValue = 20000;

        for (int parcela = 1; parcela <= carValue; parcela++) {
            int valorParcela = carValue / parcela;
            if (parcela < 1000){
                break;
            }
            System.out.println(parcela);
        }
    }
}