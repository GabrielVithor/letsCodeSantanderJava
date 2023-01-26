package livraria;

import livraria.repositorios.Estoque;

public final class Utils {
    static int id = 1;
    static String tipo;
    private static Utils singleton = null;
    private static Estoque estoqueGeral = null;

    private Utils(){
    }

    public static Utils getInstance(){
        if(singleton == null){
            singleton = new Utils();
            estoqueGeral  = Estoque.getEstoqueGeral();
        }
        return singleton;
    }
    public Integer getId(){
       return id++;
    }


}
