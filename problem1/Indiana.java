package problem1;

public class Indiana extends State {
    public Indiana(){
        super("Indiana");
        setTaxBehavior(new SevenPercent());  // Set behavior dynamically
    }
}
