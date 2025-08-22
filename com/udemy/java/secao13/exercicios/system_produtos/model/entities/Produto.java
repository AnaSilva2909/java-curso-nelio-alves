package system_produtos.model.entities;

import system_produtos.model.enums.TipoProduto;

public  class Produto implements Comparable<Produto>{
    private String name;
    private Double preco;
    private TipoProduto tipoProduto;

    public Produto() {

    }

    public Produto(String name, Double preco, TipoProduto tipoProduto) {
        this.name = name;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public int compareTo(Produto other) {
        return this.name.compareTo(other.getName());
    }

    

    

}
