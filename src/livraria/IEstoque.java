package livraria;

public interface IEstoque<T extends Produto>{
    void adicionar(T produto);
    void remover(T produto);
    void ver(T produto);
   void alterar(T produtoAtual,T produtoNovo);
}
