package problem1;

public class Hawaii extends State {
    public Hawaii() {
        super("Hawaii");
        setTaxBehavior(new FourPointFivePercent());
    }
}
