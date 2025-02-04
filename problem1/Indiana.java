package problem1;

public class Indiana extends State {
    public Indiana(){
        super("problem1.Indiana");
        setTaxBehavior(new SevenPercent());  // Set behavior dynamically
    }
}
