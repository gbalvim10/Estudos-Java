package JavaBasico.exerciciosCurso;

public class ExerciciosEstruturasCondicionaisSwitch02 {
    public static void main(String[] args) {
    //Utilizando Switch e Dados os valores de a 7, imprima se e dia util ou fim de semana
    //Considerando 1 como domingo

        //FEITO DE AMBOS JEITOS, TANTO COM IF, QUANTO COM ELSE

        byte isDayOfWeek = 0;

        if (isDayOfWeek <= 2 && isDayOfWeek > 0){
            System.out.println("Fim de Semana");
        }else if (isDayOfWeek >= 3 && isDayOfWeek <=7){
            System.out.println("Dia Util");
        }else {
            System.out.println("Invalido");
        }

        byte dayOfWeek = 5;

        switch (dayOfWeek){
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terca");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");

        }


    }
}
