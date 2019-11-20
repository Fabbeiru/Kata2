package kata2;

/**
 *
 * @author Fabián B.
 */
public class Kata2 {
    
    public static void main(String[] args) {
        HistogramDisplay display = new HistogramDisplay(new Histogram(9,1,5,1,5,1,5,2,13,9,2,4,5,4,5,10,13));
        display.execute(); 
    }
    
}
