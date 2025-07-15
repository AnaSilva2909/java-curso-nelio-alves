package POO.OO.resolvendoSegundoProblema.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public double totalVaueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity+= quantity;

    }

    public void removeProducts(int quantity){
        this.quantity-= quantity;

    }

    @Override
    public String toString() {
        return name +
        ", $ "+ String.format("%.2f", price) 
        + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalVaueInStock());
      
    }

    
}
