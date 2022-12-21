package aula02.exercicio02;

public class Pessoa <T extends Aluno> implements Comparable<T>{
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = formataCPF(cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String formataCPF(String cpf){
        this.cpf = cpf;
        while (this.cpf.length() < 11){
            this.cpf = ("0" + this.cpf);
        }

        return this.cpf;
    }

    @Override
    public int compareTo (T aluno) {
        return this.getCpf().compareToIgnoreCase(aluno.getCpf());
    }
}
