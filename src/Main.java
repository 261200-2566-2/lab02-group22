// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        AirPurifier A = new AirPurifier("Pro","Xiaomi","0124651","Blue",12.34, new double[]{10.0, 10.0, 10.0});
        System.out.println(A.getMode());
        System.out.println(A.getCurrentSpeed());
        A.TurnOn();
        A.setMode("High-performance");
        System.out.println(A.getMode());
        System.out.println(A.getCurrentSpeed());
        A.TurnOff();
        System.out.println(AirPurifier.MostPopularModel());
    }
}