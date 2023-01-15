package aula03.chatApplication;

import java.util.ArrayList;
import java.util.List;

public class Sala <T extends Participante>{
    private List<T> participantes = new ArrayList<>();

    public boolean adicionarParticipante(T participante){
        System.out.println(participante.getClass().getSimpleName());;
        return participantes.add(participante);
    }

    public void adicionarListaParticipante(List<T> listT){
        participantes.addAll(listT);
    }

}
