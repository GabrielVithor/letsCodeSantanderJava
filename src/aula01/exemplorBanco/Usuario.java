package aula01.exemplorBanco;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String login;
    Conta conta;
    Poupanca poupanca;

    public void investir(Double valor){
        this.poupanca.investir(valor);
    }

}
