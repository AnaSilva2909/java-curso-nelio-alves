import java.util.function.Function;

public class UperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product t) {
        return t.getName().toUpperCase();
    }
    
}
