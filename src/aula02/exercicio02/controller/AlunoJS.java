package aula02.exercicio02.controller;

public class AlunoJS extends Aluno{
    public AlunoJS(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString() {
        return "AlunoJS{" +
                "\n NOME: " + super.getNome()+
                "\n CPF:" + super.getCpf()+
                "}";
    }
}
