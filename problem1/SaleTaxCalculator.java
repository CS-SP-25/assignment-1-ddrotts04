package problem1;

public class SaleTaxCalculator {
    public static void main(String[] args) {
        // check that exactly two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments: state name and sale amount.");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        // check that the sale amount is a valid number
        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The sale amount must be a valid number.");
            return;
        }

        // create the state object dynamically
        State state = new State(stateName);

        // Set tax behavior dynamically
        if (stateName.equalsIgnoreCase("Indiana")) {
            state.setTaxBehavior(new SevenPercent());
        } else if (stateName.equalsIgnoreCase("Alaska")) {
            state.setTaxBehavior(new NoTax());
        } else if (stateName.equalsIgnoreCase("Hawaii")) {
            state.setTaxBehavior(new FourPointFivePercent());
        } else {
            System.out.println("Error: Unsupported state. Please provide 'Indiana', 'Alaska', or 'Hawaii'.");
            return;
        }

        // Compute and display the tax
        state.showTax(saleAmount);
    }
}
