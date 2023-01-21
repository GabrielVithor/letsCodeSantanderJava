package livraria;

import livraria.estoque.Estoque;
import livraria.produtos.*;


public class Sistema<T extends Produto> {
    public static void main(String[] args) {

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

        Estoque<AlbunsMusica> albunsMusicaEstoque = new Estoque<>();
        albunsMusicaEstoque.adicionar(albunsMusica);


        Jogo jogo = new Jogo("COD",
                20d,
                "Blizzard",
                "FPS",
                "Actvision");
        Estoque<Jogo> jogosEstoque = new Estoque<>() {{
            adicionar(jogo);
        }};

        Brinquedos brinquedos = new Brinquedos("Hot weels",
                5d,
                "Carrinho");
        Estoque<Brinquedos> brinquedosEstoque = new Estoque<>() {{
            adicionar(brinquedos);
        }};


        Filmes filmes = new Filmes(
                "A espera de um milagre",
                50d,
                "Warner",
                "Steve Spilboard",
                "Drama",
                "HBO"
        );
        Estoque<Filmes> filmesEstoque = new Estoque<>() {{
            adicionar(filmes);
        }};
        Livro livro = new Livro(
                "O assassinato de Roger Arckroid",
                40.5,
                "Romance Policial",
                "Agatha Christie",
                "L & PM"
        );
        Estoque<Livro> livroEstoque = new Estoque<>() {{
            adicionar(livro);
        }};

        Livro livro2 = new Livro(
                "O assassinato de Roger Arckroid",
                60d,
                "Romance Policial",
                "Agatha Christie",
                "Best Bolso"
        );
        Estoque<Livro> livroEstoque1 = new Estoque<>() {
            {
                adicionar(livro2);
            }
        };
        Estoquista estoquista = new Estoquista("Gabriel");

        estoquista.listarProdutos();
        estoquista.listarProdutosPorCategoria(Produtos.AlbunsMusica);
        estoquista.mostrarQuantidadePorCategoria(Produtos.Livro);
        albunsMusicaEstoque.alterar(albunsMusica,albunsMusica2);

        estoquista.listarProdutosPorCategoria(Produtos.AlbunsMusica);

    }
};


enum Produtos {
    Livro,
    Brinquedos,
    Filmes,
    Jogos,
    AlbunsMusica
}


