package JavaPoo.ExercíciosChatGpt.dominio;

public class Funcionario {
    public String nome;
    public double salario;
    public int idade;
    public float mesEAnoNascimento;

    public double salarioAumenta(double percentual) {
        percentual = percentual / 100;
        salario = (salario * percentual) + salario;
        return salario;
    }

    public void mostrarDados() {
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salario com aumento R$"+salario);
        System.out.println("Idade do funcionario: " + idade);
        System.out.println("Mes e ano do seu nascimento: " + mesEAnoNascimento);

    }
}


