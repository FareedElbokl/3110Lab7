public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }




}
