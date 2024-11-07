abstract public class Site {

    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.05;

    // Constructor to initialize units and rate
    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();



}
