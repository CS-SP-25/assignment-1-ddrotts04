package problem1;

public class Alaska extends State {
    public Alaska() {
        super("Alaska");
        setTaxBehavior(new NoTax());  // Set behavior dynamically
    }
}
