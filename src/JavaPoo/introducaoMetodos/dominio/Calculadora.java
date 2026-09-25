package JavaPoo.introducaoMetodos.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10 + 10);
    }

    public void sub() {
        System.out.println(10 - 2);
    }

    public void multi(float num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divide(float num1, float num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}