package JavaBasico.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char = '\u0000' ' '
        //boolean = false
        //String = null

        String [] name = new String[3];
         name[1] = "Biel";
         name[0] = "Livia";
         name[2] = "Miguel";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
