import java.util.Locale;

public class Bank {
    public static void main(String[] args) {
        double buyingEUR = 4.5940;
        double sellingEUR = 4.6250;

        double spread = sellingEUR - buyingEUR;
        
        System.out.printf(Locale.US,"Spread: %.4f",spread);
    }
}
