package JavaPoo.ExercíciosChatGpt.dominio;

public class ContaBancaria {
    public String titular;
    public float saldo;

    public void deposito(float valor){
        valor = 1200F;
        System.out.println("Deposito da conta: " + valor);
        saldo = saldo + valor;
    }

    public void MostrarSaldo(){
        System.out.println("Saldo: " + saldo);

    }
}
