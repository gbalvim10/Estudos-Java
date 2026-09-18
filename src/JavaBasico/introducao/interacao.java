package JavaBasico.introducao;

import java.util.Scanner;

public class interacao {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String Name = name.nextLine();

        System.out.print("Sua idade: ");
        int age = name.nextInt();

        name.close();

        System.out.println(age);
        System.out.println(Name);
    }
}
