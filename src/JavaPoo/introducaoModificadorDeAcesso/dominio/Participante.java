package JavaPoo.introducaoModificadorDeAcesso.dominio;

public class Participante {
    private String nome;
    private int idade;

    public void imprimeParticipante(){
        System.out.println("Nome do participante: "+getNome());
        System.out.println("Idade do participante: "+getIdade());

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

}

