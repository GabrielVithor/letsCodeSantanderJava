package aula01.appChat;

import java.util.ArrayList;
import java.util.List;

public class Sala<T extends Participante> {
    private List<T> participantes =new ArrayList<>();

public boolean adicionaPaticipante(T participante){
    participantes.add(participante);
    return true;
}

}
