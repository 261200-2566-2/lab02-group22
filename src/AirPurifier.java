// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AirPurifier {
    String SerialNo,Brand,Model,Color;
    String Mode = "Balance";
    int CurrentSpeed = 0;
    double PowerCons;
    double[] Dimension;
    boolean power = false;
    static int ModelCount;
    public void TurnOn(){ power = true; }
    public void TurnOff(){ power = false; }
    public void SetSpeed(int Speed){ CurrentSpeed = Speed; }
    public void setMode(String mode) {
        Mode = mode;
    }

    public int GetPM(){
        return 1;
    }
    public AirPurifier(String Model,String Brand,String SerialNo,String Color,double PowerCons,double[] Dimension){
        this.Model = Model;
        this.Brand = Brand;
        this.SerialNo = SerialNo;
        this.Color = Color;
        this.PowerCons = PowerCons;
        this.Dimension = new double[]{Dimension[0],Dimension[1],Dimension[2]};
        ModelCount++;
    }

}