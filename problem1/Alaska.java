package problem1;

public class Alaska extends State {
    public Alaska() {
        super("problem1.Alaska");
        setTaxBehavior(new NoTax());  // Set behavior dynamically
    }
}
