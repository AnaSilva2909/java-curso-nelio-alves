package pratica.exer_01.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufacturDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacturDate) {
        super(name, price);
        this.manufacturDate = manufacturDate;
    }

    public Date getManufacturDate() {
        return manufacturDate;
    }

    public void setManufacturDate(Date manufacturDate) {
        this.manufacturDate = manufacturDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: "
                + sdf.format(manufacturDate) + ")";

    }

}
