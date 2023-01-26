package livraria;

import livraria.produtos.*;

import java.time.LocalDate;

import static livraria.Estoquista.*;


public class Sistema<T extends Produto> {
    public static void main(String[] args) {
        Caixa caixa = Caixa.abrirCaixa();

        AlbunsMusica albunsMusica = new AlbunsMusica("Hillsong",
                10.00d,
                "Hillsong",
                "Gospel",
                "Ouro");

        AlbunsMusica albunsMusica2 = new AlbunsMusica("Lets get started",
                10.00d,
                "The black eyed peas",
                "Pop",
                "Ouro");

        Jogo jogo = new Jogo("COD",
                20d,
                "Blizzard",
                "FPS",
                "Actvision");

        Brinquedos brinquedos = new Brinquedos("Hot weels",
                5d,
                "Carrinho");


        Filmes filmes = new Filmes(
                "A espera de um milagre",
                50d,
                "Warner",
                "Steve Spilboard",
                "Drama",
                "HBO"
        );

        Livro livro = new Livro(
                "O assassinato de Roger Arckroid",
                100d,
                "Romance Policial",
                "Agatha Christie",
                "L & PM"
        );


        Livro livro2 = new Livro(
                "O assassinato de Roger Arckroid",
                100d,
                "Romance Policial",
                "Agatha Christie",
                "Best Bolso"
        );


        Cliente cliente = new Cliente("Gabriel",
                "123456789",
                "1234567900",
                LocalDate.of(1999,01,26));

        verificarEstoque().adicionar(livro);
        verificarEstoque().adicionar(livro2);
        verificarEstoque().adicionar(albunsMusica);
        verificarEstoque().adicionar(albunsMusica2);
        verificarEstoque().adicionar(brinquedos);
        verificarEstoque().adicionar(jogo);
        verificarEstoque().adicionar(filmes);
        verificarEstoque().adicionar(brinquedos);

        cliente.selecionarProduto(livro);
        cliente.selecionarProduto(livro2);
        cliente.selecionarProduto(albunsMusica);
        cliente.selecionarProduto(albunsMusica2);
        listarProdutosPorCategoria(Produtos.Livro);
        cliente.mostrarCarrinho();
        listarProdutosPorCategoria(Produtos.Livro);

        caixa.mostrarCaixa();
        cliente.mostrarPedido();
        cliente.concluirCompra();
        cliente.mostrarPedido();
        caixa.mostrarCaixa();
        listarProdutos();
    }
};


enum Produtos {
    Livro,
    Brinquedos,
    Filmes,
    Jogos,
    AlbunsMusica
}


