package kata2;

/**
 *
 * @author Fabián B.
 */
public class HistogramDisplay {

    private final Histogram histogram;

    public HistogramDisplay(Histogram histogram) {
        this.histogram = histogram;
    }

    public void execute() {
        for (int value : histogram.getValues()) {
            System.out.println(value + ": " + histogram.getCount(value));
        }
    }
}
