package JavaBasico.introducao;

public class Aula06LacosDeRepeticao03 {
    public static void main(String[] args) {
        double totalValue = 50000;
        for (int parcela = (int) totalValue; parcela >= 1; parcela--) {
            double parcelumValue = totalValue / parcela;
            if (parcelumValue <= 1000) {
                continue;
            }
            System.out.println("Parcela" + parcela + " = R$" + parcelumValue);

        }
    }
}
