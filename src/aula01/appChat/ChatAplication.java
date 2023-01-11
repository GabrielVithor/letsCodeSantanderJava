package aula01.appChat;

import java.util.Optional;

public class ChatAplication {

    public static void main(String[] args) {
        Sala<Aluno> salaAluno = new Sala<>();
        Sala<Professor> salaProfessor = new Sala<>();
        Sala<Participante> salaParticipante = new Sala<>();

        Optional<Integer> numero = Optional.of(Integer.valueOf(10));
    }

    public  <T extends Participante> void colocarPrticipanteSala(Sala<T> sala, T participante){
        if(sala.adicionaPaticipante(participante)){
            System.out.println("Participante adicionado");
        }else{
            System.out.println("Erro ao adicionar participante");
        }
    }

}
