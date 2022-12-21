package aula02.exercicio02;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Turma<T extends Aluno>{
    private Professor professor;
    private List<T> listaAlunos = new ArrayList<>();

    private int INCREMENT = 1;

    public Turma(Professor professor) {
        this.professor = professor;
    }

    public void  setListaAlunos(T aluno) {
        this.listaAlunos.add(aluno);
    }

    public List<T> getListaAlunos() {
        return listaAlunos;
    }

    public void inserirAlunoTurma(Turma turma,T... alunos) {
        for (T aluno : alunos) {
            turma.setListaAlunos(aluno);
        }
    }
    public void printarTurma() {
        System.out.println("Professor:" + this.professor.getNome() );
        System.out.println("-------------------------------");
        Collections.sort(this.listaAlunos);
        for (T aluno : this.listaAlunos) {
            System.out.println("NOME: "+aluno.getNome());
            System.out.println("CPF: "+aluno.getCpf());
        }
    }
}
