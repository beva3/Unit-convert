public class Main {
    public static void main(String[] args) {
        UnitConvert convert = new UnitConvert();
        convert.convert(100, UnitConvert.CURENCY.USD, UnitConvert.CURENCY.AR);
        System.out.println("Converted value: " + convert.getResult() + " AR");
    }
}
