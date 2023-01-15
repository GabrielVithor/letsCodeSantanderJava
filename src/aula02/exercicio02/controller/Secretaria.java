package aula02.exercicio02.controller;

import java.util.List;

public class Secretaria {
    private Integer INCREMENT = 1;

    public <T extends Aluno> void matricula(Turma<T> turma, Professor professor, List<T> alunos){
            turma.setListaAlunos(setMatriculaAlunos(alunos));
            turma.setProfessor(professor);
    }
    public <T extends Aluno> List<T> setMatriculaAlunos(List<T> alunos){
        for(T aluno : alunos){
            aluno.setMatricula(getINCREMENT());
        }
        return alunos;
    }

    public Integer getINCREMENT() {
        return INCREMENT++;
    }
}
