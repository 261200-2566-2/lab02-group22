import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AirPurifier {
    String SerialNo,Brand,Model,Color;
    String Mode = "Balance";
    double PowerCons;
    double[] Dimension;
    private int CurrentSpeed = 0,CurrentPM;
    boolean Power = false;
    static int[] ModelCount = new int[]{0,0,0,0};
    static String[] ModelType = new String[]{"lit","Pro","Pro Max","Pro Max Plus"};
    public void TurnOn(){
        Power = true;
        switch (Mode){
            case "Safety" : SetSpeed(50);
            case "Balance" : SetSpeed(75);
            case "High-performance" : SetSpeed(100);
        }
    }
    public void TurnOff(){ Power = false; SetSpeed(0); }
    public void SetSpeed(int Speed){ CurrentSpeed = Speed; }
    public void setMode(String mode) {
        Mode = mode;
        if(Power){
            switch (Mode){
                case "Safety" : SetSpeed(50);
                case "Balance" : SetSpeed(75);
                case "High-performance" : SetSpeed(100);
            }
        }
    }
    static String MostPopularModel(){
        int model = Arrays.stream(ModelCount).max().getAsInt();
        return ModelType[model];
    }
    public AirPurifier(String Model, String Brand, String SerialNo, String Color, double PowerCons, double[] Dimension){
        this.Model = Model;
        this.Brand = Brand;
        this.SerialNo = SerialNo;
        this.Color = Color;
        this.PowerCons = PowerCons;
        this.Dimension = new double[]{Dimension[0],Dimension[1],Dimension[2]};
        switch (Model){
            case "lit" : ModelCount[0]++;
            case "Pro" : ModelCount[1]++;
            case "Pro Max" : ModelCount[0]++;
            case "Pro Max Plus" : ModelCount[1]++;
        }
    }

    public String getMode() {
        return Mode;
    }
    public int getCurrentSpeed() {
        return CurrentSpeed;
    }
    public int getCurrentPM() {
        return CurrentPM;
    }
}