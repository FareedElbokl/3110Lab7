public class ResidentialSite extends Site{
    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }


}
