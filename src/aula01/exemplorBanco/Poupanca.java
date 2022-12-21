package aula01.exemplorBanco;

public class Poupanca {
    Double saldo;
    public boolean investir(Double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }


}
