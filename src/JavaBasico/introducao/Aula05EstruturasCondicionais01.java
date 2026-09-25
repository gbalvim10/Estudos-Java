package JavaBasico.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 10;
        boolean decade = age >= 20;
         if (decade){
             System.out.println("Voce tem duas decadas ou mais de vida");

        }else{
             System.out.println("Voce nao tem duas decadas ou mais de vida");
         }

         boolean tDecade = age >= 30;
         if (tDecade == false) {
             System.out.println("Voce nao tem tres decadas de vida ainda!");
         }

        boolean fDecade = age >= 40;
        if (!fDecade) {
            System.out.println("Voce nao tem quatro decadas de vida ainda!");
        }
    }
}
