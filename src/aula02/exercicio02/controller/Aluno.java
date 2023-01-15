package aula02.exercicio02.controller;

import java.util.Collections;

public class Aluno extends Pessoa{
    private Integer matricula;
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getAlunoInfo(){
        return "\n NOME: " + this.getNome() +
                "\n CPF: " + this.getCpf() +
                "\n Matricula " + this.getMatricula();
    }
    @Override
    public int compareTo(Aluno o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
