package aula01.exemplorBanco;

public class Main {
    public static void main(String[] args) {
        Usuario kadu = new Usuario();
        kadu.poupanca = new Poupanca();
        kadu.poupanca.saldo = 1000.00;
        kadu.conta = new Conta();

        kadu.conta.agencia = 1111;
        kadu.conta.numero = 12345;
        kadu.conta.saldo = 50.;

        kadu.investir(50.);
        System.out.println(kadu.poupanca.saldo);
    }
}
