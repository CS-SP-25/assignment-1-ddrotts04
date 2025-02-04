package problem1;

public class State {
    private String name;
    private SalesTaxBehavior taxBehavior;

    public State(String name) {
        this.name = name;
    }

    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}

