package aula02.exercicio02.model;
import aula02.exercicio02.controller.Aluno;
import aula02.exercicio02.controller.AlunoJS;
import aula02.exercicio02.controller.AlunoJava;

import java.util.ArrayList;
import java.util.List;

public class BD{
    private List<? extends Aluno> alunos = new ArrayList<>(){{
        add(new AlunoJava("Gabriel","123456789"));
        add(new AlunoJava("Vithor","987654321"));
        add(new AlunoJava("Thiago","789465132"));
        add(new AlunoJS("Lucas","147258390"));
        add(new AlunoJS("Jose","147258392"));
        add(new AlunoJS("Daniel","147258399"));
    }};

    public List<? extends Aluno> getAlunos() {
        return alunos;
    }

    public <T extends Aluno> List<T> retornaListaFiltrada(String tipo) {
        List<T> listaFiltrada = new ArrayList<>();
        for (Aluno object : getAlunos()) {
            if(compararTipo(object,tipo)) {
                listaFiltrada.add((T) object);
            }
        }
        return listaFiltrada;
    }

    public boolean compararTipo(Object o1, Object o2){
        return o1.getClass().getSimpleName().equals(o2);
    }
};

;