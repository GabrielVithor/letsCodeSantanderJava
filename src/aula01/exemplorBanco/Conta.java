package aula01.exemplorBanco;

public class Conta {
     Integer agencia;
     Integer numero;
    double saldo;

    public boolean saque(Saque saque){
        if(saldo >= saque.valor){
            saldo -= saque.valor;
            return true;
        }
       return false;
    }

    public void poupanca(double valor){
        saldo+=valor;
    }
}
