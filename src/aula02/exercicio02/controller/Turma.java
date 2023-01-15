package aula02.exercicio02.controller;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno>{
    private Professor professor;
    private List<T> listaAlunos = new ArrayList<>();

    public List<T> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<T> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
