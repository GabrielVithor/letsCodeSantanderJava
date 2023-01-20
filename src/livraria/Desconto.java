package livraria;

public interface Desconto <T extends Produto>{
    Double gerarDesconto(T produto);
}
