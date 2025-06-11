public class UnitConvert {
    private double curentValue;
    private double result;

    public enum CURENCY {
        USD, AR, RS
    }

    private final double[][] conversionRates = {
        { 1.0       , 4500.0, 83.0      }, // USD to USD, AR, RS
        { 0.00022   , 1.0   , 0.0185    }, // AR to USD, AR, RS
        { 0.012     , 54.0  , 1.0       }  // RS to USD, AR, RS
    };

    public UnitConvert() {
        this.curentValue = 0;
        this.result = 0;
    }

    public double getResult() {
        return result;
    }

    public void convert(double value, CURENCY from, CURENCY to) {
        this.curentValue = value;
        int fromIndex = from.ordinal();
        int toIndex = to.ordinal();
        this.result = curentValue * conversionRates[fromIndex][toIndex];
    }
}