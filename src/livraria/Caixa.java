package livraria;

public class Caixa{
    private static Double saldo = 0d;
    private static Caixa singleton = null;

    private Caixa() {

    }
    public static Caixa abrirCaixa() {
        if (singleton == null){
            singleton = new Caixa();
        }
        return singleton;
    }

    public static void registrarCompra(Double saldo) {
        Caixa.saldo = saldo;
    }

    public void mostrarCaixa(){
        System.out.println("Saldo atual: "+saldo);
    }
}
