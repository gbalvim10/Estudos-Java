package JavaBasico.exercicioscurso;

public class ExerciciosEstruturasCondicionais {
    public static void main(String[] args) {
      //dado um determinado salario anual, qual valor da taxa que tenho que pagar

        double salary = 70000;
        double taxesValue;

        if (salary > 0 && salary <= 34712){
            taxesValue = (9.70/100) * salary;
        } else if (salary>= 34713 && salary <=68507) {
            taxesValue = (37.35/100) * salary;
        } else {
            taxesValue = (49.50/100) * salary;
        }

        System.out.println(taxesValue);

    }
}
