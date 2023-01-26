package livraria;
import livraria.repositorios.Carrinho;
import livraria.produtos.Produto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static livraria.Caixa.registrarCompra;
import static livraria.Estoquista.*;

public class Cliente {
    private Carrinho carrinho = new Carrinho();
    private Map<String,List<? extends Produto>> pedido = new HashMap<>();
    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;

    public Cliente(String nome, String rg, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public boolean verificaMaiorIdade(){
        return LocalDate.now().getYear() - dataNascimento.getYear() >= 18;
    }

    public <T extends Produto> void selecionarProduto(T produto){
        if(verificarEstoque().quantidadeProduto(produto) > 0){
            this.carrinho.adicionar(produto);
            verificarEstoque().remover(produto);
        }
    }

    public <T extends Produto> void cancelarProduto(T produto){
        if(carrinho.remover(produto)){
            verificarEstoque().adicionar(produto);
        }
    }

    public void concluirCompra(){
        pedido = carrinho.getEstoque();
        registrarCompra(carrinho.getValor());
        carrinho = null;
    }

    public void mostrarCarrinho(){
        System.out.println(carrinho);
    }

    public void mostrarPedido(){
        System.out.println(pedido);
    }

}
