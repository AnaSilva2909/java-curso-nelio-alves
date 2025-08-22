package system_produtos.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import system_produtos.model.enums.TipoProduto;

public class ProdutoUsado extends Produto{
    private LocalDate dataFabricacao;
    private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProdutoUsado() {

    }

    public ProdutoUsado(String name, Double preco, LocalDate dataFabricacao, TipoProduto tipoProduto) {
        super(name, preco, tipoProduto);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        
        return "Produto Usado = " + getName() + ", Preço: $" + String.format("%.2f", getPreco()) + ", Data Fabricação: " + dataFabricacao.format(sdf);
    }

   

   

    
}
