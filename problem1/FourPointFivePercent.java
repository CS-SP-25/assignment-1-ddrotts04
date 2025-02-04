package problem1;

public class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.045;
    }
}
