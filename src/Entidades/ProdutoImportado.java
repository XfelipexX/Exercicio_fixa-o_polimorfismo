package Entidades;



public class ProdutoImportado extends Produto {

    Produto produto;
    private Double importadofrete;

    public ProdutoImportado(){}

    public ProdutoImportado(String nome, Double preco, Double importadofrete) {
        super(nome, preco);
        this.importadofrete = importadofrete;
    }

    public Double getimportadofrete() {
        return importadofrete;
    }

    public void setimportadofrete(Double importadofrete) {
        this.importadofrete = importadofrete;
    }
    public double precoTotal(){
        return getPreco() + importadofrete;
    }

    @Override
    public String precoTag(){
        return getNome() + " $" + getPreco() + " (preco frete: $" + String.format("%.2f", getimportadofrete()) + ")";
    }
}