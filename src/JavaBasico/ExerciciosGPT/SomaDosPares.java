package JavaBasico.ExerciciosGPT;

public class SomaDosPares {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 101; i+= 2) {
            total = total + i;
        }
        System.out.println("O valor das somas dos pares fica: " + total);
    }
}
