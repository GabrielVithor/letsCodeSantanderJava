package livraria;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;

    public Cliente(String nome, String rg, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public boolean verificaMaiorIdade(){
        return LocalDate.now().getYear() - dataNascimento.getYear() >= 18;
    }
}
