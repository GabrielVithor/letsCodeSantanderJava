package livraria;
import livraria.repositorios.Carrinho;
import livraria.produtos.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static livraria.Caixa.registrarCompra;
import static livraria.Estoquista.*;

public class Cliente {
    private Carrinho carrinho = new Carrinho();
    private List pedido = new ArrayList();
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
        if(getQuantidadeProduto(produto) > 0){
            this.carrinho.adicionar(produto);
            getEstoqueGeral().remover(produto);
        }
    }

    public <T extends Produto> void cancelarProduto(T produto){
        if(carrinho.remover(produto)){
            getEstoqueGeral().adicionar(produto);
        }
    }

    public void concluirCompra(){
        pedido = carrinho.getCarrinho();
        registrarCompra(carrinho.calculaValorCarrinho());
        carrinho = null;
    }

    public void mostrarCarrinho(){
        System.out.println(carrinho);
    }

    public void mostrarPedido(){
        System.out.println(pedido);
    }
}
