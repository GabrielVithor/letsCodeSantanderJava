package livraria;

public final class Utils {
    static int id = 1;
    static String tipo;
    private static Utils singleton = null;

    private Utils(){
    }

    public static Utils getInstance(){
        if(singleton == null){
            singleton = new Utils();
        }
        return singleton;
    }
    public Integer getId(){
       return id++;
    }


}
