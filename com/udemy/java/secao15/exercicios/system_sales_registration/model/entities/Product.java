package exercicios.system_sales_registration.model.entities;

public class Product {
    private String name;
    private Double unitPrice;
    private Integer quantity;

    public Product() {

    }

    public Product(String name, Double unitPrice, Integer quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    
}
