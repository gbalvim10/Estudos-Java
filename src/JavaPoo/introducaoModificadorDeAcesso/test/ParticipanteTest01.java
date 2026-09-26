package JavaPoo.introducaoModificadorDeAcesso.test;


import JavaPoo.introducaoModificadorDeAcesso.dominio.Participante;

public class ParticipanteTest01 {
    public static void main(String[] args) {
        Participante participante = new Participante();
        participante.setNome("Joao");
        participante.setIdade(10);

        participante.imprimeParticipante();



    }
}

