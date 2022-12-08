package Species;

public class Penguin extends Species{

    private double bloodPressure;

    // Empty Constructor
    public Penguin(){}

    // Constructor
    public Penguin(String name, String gender, String coordinates, int weight, double bloodP){
        super(name, gender, coordinates, weight);
        this.bloodPressure=bloodP;
    }

    // Getter

    public double getBloodPressure(){
        return bloodPressure;
    }

    // Setter

    public void setBloodPressure(double bloodP){
        this.bloodPressure=bloodP;
    }

    // toString method
    @Override
    public String toString(){
        return getName() + " " + getGender() + " " + getWeight() + " " + getCoordinates() + " " + getBloodPressure();
    }
}
