package JavaBasico.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1= 324;
        int n2 = 124;
        int result = n1+n2;
        int reace = n1%2;
        System.out.println("O resultado de " + n1 + " + " + n2 + " fica " + result);
        System.out.println(reace);

        //operadores logicos
        // && (AND); || (or); !

        int age = 35;
        int salary = 4615;
        boolean isInsideTheRule = age>=30 && salary >= 4612;
        boolean isOutsideTheRule = age<30 && salary >= 3381;
        System.out.println("isInsideTheRule " + isInsideTheRule);
        System.out.println("isOutsideTheRule " + isOutsideTheRule);

        double creditAccount = 1314.78;
        double debitAccount = 3125.90;

        boolean playStation = creditAccount >= 1500 || debitAccount >= 1500;
        System.out.println("Posso comprar o Play? " + playStation);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int cont = 0;
        cont += 1;
        cont++;
        System.out.println(cont);
    }
}