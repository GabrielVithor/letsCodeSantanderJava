package formasGeometricas;

public class Retangulo {

    int largura;
    int altura;

    String cor;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void colorir(String cor){
        this.cor = cor;

    }
}


class Quadrado extends Retangulo{
    @Override
    public void setAltura(int altura){
        this.altura = altura;
        this.largura = altura;
    }

    @Override
    public void setLargura(int largura){
        this.largura = largura;
        this.altura = largura;
    }

   @Override
    public void colorir(String cor){
        this.cor = cor;
   }

}