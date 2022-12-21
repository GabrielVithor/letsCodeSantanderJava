package aula01;

import java.util.List;

interface Veiculo {
    default void ligaMotor() {
        System.out.println("Veiculo ligado");
    }

    private  void regulaBanco(){
        System.out.println("Melhore a posição");
    }

    static  void ligaParaBrisa(){
        System.out.println("Tirando água do vidro");
    }

    private static void ligaFarol(){
        System.out.println("Ilumina tudo");
    }

}
public interface Carro {
    default void abaixarVidro() {
        System.out.println("Abaixando vidro");
    }

}



class Ferrari implements Carro,Veiculo {
    String model = "";
}

class Trator implements Veiculo {
}

class Motorista {
    public void dirigir(Ferrari ferrari) {
        //dirigir
    }
}

class Sistema{
    public static void main(String[] args) {


        List<Ferrari> ferraris =
                List.of(new Ferrari(),new Ferrari());

        ferraris.remove(null);
        ferraris.add(null);
        ferraris.set(0,new Ferrari());
    }
}

