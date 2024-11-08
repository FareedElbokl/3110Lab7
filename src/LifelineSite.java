public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }


}
