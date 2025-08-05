package exercicios.system_sales_registration.model.entities;

public class Sale {
    private Product product;
    private Customer customer;

    public Sale() {

    }

    public Sale(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double total(){
        return getProduct().getUnitPrice() * getProduct().getQuantity();
    }

    public String toCSV(){
        return  getCustomer().getName() + "," + getProduct().getName() + "," + String.format("%.2f", total());

    }


    
}
