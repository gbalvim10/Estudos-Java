package JavaBasico.exerciciosgpt;

public class MaiorNumeroArray {
    public static void main(String[] args) {

        int [] number = new int [3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        int biggestNumber = number[0];

        for (int i = 0; i < 3; i++) {
            if (number[1] > biggestNumber && number[1] > number[2]) {
                biggestNumber = number[1];
            } else {
                biggestNumber = number[2];
            }

            System.out.println(biggestNumber);
        }
    }
}
