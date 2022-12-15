package Species;

public class Penguin extends Species implements Iloggable{

    private double bloodPressure;

    // Empty Constructor
    public Penguin(){}

    // Constructor
    public Penguin(String name, String gender, String coordinates, double weight, double bloodP){
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

        return String.format("""
                Species: %s
                Gender: %s
                Weight: %s
                Coordinates: %s
                BloodPressure: %s
                """, getName(), getGender(), getWeight(), getCoordinates(), getBloodPressure());
    }
}
