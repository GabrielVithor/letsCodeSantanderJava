package livraria.repositorios;

import livraria.produtos.Produto;

public interface IEstoque<T extends Produto>{
    boolean adicionar(T produto);
    boolean remover(T produto);
    boolean ver(T produto);
   boolean alterar(T produtoAtual,T produtoNovo);

   boolean containsProduto(T produto);
}
