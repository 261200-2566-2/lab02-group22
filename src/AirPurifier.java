import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AirPurifier {
    String SerialNo,Brand,Model,Color;
    String Mode;
    int CurrentSpeed;
    double PowerCons;
    double[] Dimension = new double[3];
    boolean power = false;
    public void TurnOn(){ power = true; }
    public void TurnOff(){ power = false; }
    public void SetSpeed(int Speed){ CurrentSpeed = Speed; }
    public void SetMode(int num){
        switch (num){
            case 1: Mode = "Safety";
            case 2: Mode = "H";
        }
    }
    public int GetPM(){
        return 1;
    }
    public AirPurifier(String Model,String Brand,String SerialNo){

    }
}