package JavaPoo.introducaoMetodos.test;

import JavaPoo.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma();
        System.out.println("CalculadoraTest01 Finalzado\n");

        Calculadora calc2 = new Calculadora();
        calc2.sub();
        System.out.println("CalculadoraTest02 Finalzado\n");

        Calculadora calc3 = new Calculadora();
        calc3.multi(10,40);
        System.out.println("CalculadoraTest03 Finalzado\n");

        Calculadora calc4 = new Calculadora();
        System.out.println(calc4.divide(16,0));
        System.out.println("CalculadoraTest04 Finalzado\n");

    }
}
