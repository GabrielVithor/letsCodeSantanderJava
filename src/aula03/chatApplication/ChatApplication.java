package aula03.chatApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChatApplication {
    public static void main(String[] args) {
        Optional<Integer> numero = Optional.of(1);
        Integer numero_ = Optional.of(Integer.valueOf(1)).get();
        int novoNumero = numero_;

        Object teste = "";
        System.out.println(teste.getClass());

        List<Participante> participantes = null;

        adicionarNaList(participantes);
    }

    public <T extends Participante> void colocaSala(Sala<T> sala, T t) {
        if (sala.adicionarParticipante(t)) {
            System.out.println("Participante Adicionado");
        } else {
            System.out.println("Err ao adicionar participante");
        }
    }

    public static <T extends Participante> void colocaListaSala(Sala<T> sala) {

        List<T> novosParticipantes = new ArrayList<>();

        sala.adicionarListaParticipante(novosParticipantes);
    }

    public static void adicionarNaList(List<? super Participante> turma) {
        turma.add(new Participante());
    }

}
