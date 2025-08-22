package system_produtos.model.entities;

import system_produtos.model.enums.TipoProduto;

public class ProdutoImportado extends Produto{
    private Double percentualTaxa;

    public ProdutoImportado() {

    }

    public ProdutoImportado(String name, Double preco, Double percentualTaxa, TipoProduto tipoProduto) {
        super(name, preco, tipoProduto);
        this.percentualTaxa = percentualTaxa;
    }

    public Double getpercentualTaxa() {
        return percentualTaxa;
    }

    public void setpercentualTaxa(Double percentualTaxa) {
        this.percentualTaxa = percentualTaxa;
    }

    public double total(){
        return getPreco() + (getPreco() * percentualTaxa);

    }

    @Override
    public String toString() {
        return "Produto Importado = " + getName() + ", Preço: $" + String.format("%.2f", getPreco()) + ", Total: $" + String.format("%.2f", total());
    }
    
}
