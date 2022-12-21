package aula01.exemplorBanco;

public class Usuario {
    String nome;
    String sobrenome;
    Conta conta;
    Poupanca poupanca;

    public void investir(Double valor){
        this.poupanca.investir(valor);
    }

}
