package livraria.produtos;

public class Brinquedos extends Produto{
    private String tipo;

    @Override
    public String toString() {
        return "Brinquedos{" +super.toString()+
                "tipo='" + tipo + '\'' +
                '}';
    }

    public Brinquedos(String nome, Double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;


    }
}
