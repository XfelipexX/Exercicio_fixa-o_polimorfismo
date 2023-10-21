package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    
    Date dataDeFabricacao;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Produto produto;
    
    public ProdutoUsado() {
    }
    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }
    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }
    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    
    @Override
    public String precoTag(){
        return getNome() + " (Usado) $" + String.format("%.2f", getPreco())
         + " (Data de fabricacao: " + sdf.format(dataDeFabricacao) + ")";  
    }
    

    

}
