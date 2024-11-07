abstract class Site {

    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.05;

    // Constructor to initialize units and rate
    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    // Abstract method for subclasses to implement
    public abstract double getBillableAmount();
}