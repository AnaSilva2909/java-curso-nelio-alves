package POO.estaticos.exercicios.util;

public class CurrencyConverter {
    private static final double IOF = 0.06;

    public static double currencyConverter(double priceDollar, double valueInDollar){

        double totalInDollarWithIof = valueInDollar + (valueInDollar * IOF);

        double valueInReais = priceDollar * totalInDollarWithIof;

        return valueInReais;
    }
    
}
