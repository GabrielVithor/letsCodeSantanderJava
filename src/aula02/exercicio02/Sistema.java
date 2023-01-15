package aula02.exercicio02;

import aula02.exercicio02.controller.*;
import aula02.exercicio02.model.BD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        BD bd = new BD();
        Secretaria secretaria = new Secretaria();
        Professor professor = new Professor("Jose", "321654987");
        List<AlunoJava> alunosJava = new ArrayList<>() {{
            addAll(bd.retornaListaFiltrada("AlunoJava"));
        }};
        List<AlunoJS> alunosJS = new ArrayList<>() {{
            addAll(bd.retornaListaFiltrada("AlunoJS"));
        }};

        Turma<AlunoJava> turmaJava = new Turma<>();
        Turma<AlunoJS> turmaJS = new Turma<>();

        secretaria.matricula(turmaJava, professor, alunosJava);
        secretaria.matricula(turmaJS, professor, alunosJS);
        printarListasString(listarOrdemAlfabetica(turmaJava));
        printarListasString(listarOrdemAlfabetica(turmaJS));
        printarListasString(listarPorMatricula(turmaJava));
        printarListasString(listarPorMatricula(turmaJS));
    }

    public static <T extends Aluno> void listarPorCPF(Turma<T> turma) {
        System.out.println("Professor:" + turma.getProfessor().getNome());
        System.out.println("-------------------------------");
        Collections.sort(turma.getListaAlunos(), (a, b) -> a.getCpf().compareToIgnoreCase(b.getCpf()));
        for (T aluno : turma.getListaAlunos()) {
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Matricula " + aluno.getMatricula());
        }
    }

    public static <T extends Aluno> List<String> listarOrdemAlfabetica(Turma<T> turma) {
        Collections.sort(turma.getListaAlunos(), (a, b) -> a.getNome().compareToIgnoreCase(b.getNome()));
        return  gerarListaString(turma);
    }

    public static <T extends Aluno> List<String> listarPorMatricula(Turma<T> turma) {
        Collections.sort(turma.getListaAlunos(), (a, b) -> a.getMatricula().compareTo(b.getMatricula()));
        return gerarListaString(turma);
    }

    public static <T extends Aluno> List<String> gerarListaString(Turma<T> turma) {
        List<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("\n-------------------------------" +
                "\nProfessor:" + turma.getProfessor().getNome() +
                "\n-------------------------------");
        for (T aluno : turma.getListaAlunos()) {
            listaAlunos.add(aluno.getAlunoInfo());
        }
        return listaAlunos;
    }

    public static void printarListasString(List<String> lista){
        for (String string : lista){
            System.out.println(string);
        }
    }
}
