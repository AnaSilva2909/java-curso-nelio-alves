package exercicio.entities;

public class OrdemItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrdemItem() {
    }

    public OrdemItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        price = subTotal();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return product.getPrice() * quantity;
    }

    
}
