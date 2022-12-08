package Species;

public class Walrus extends Species{

    // member variables
    private String dentalHealth;

    // Empty Constructor
    public Walrus(){}

    // Constructor
    public Walrus(String name, String gender, String coordinates, int weight, String dentalH){

        super(name,gender,coordinates,weight);

        this.dentalHealth=dentalH;
    }

    // Getter
    public String getDentalHealth() {
        return dentalHealth;
    }

    // Setter
    public void setDentalHealth(String dentalHealth) {
        this.dentalHealth = dentalHealth;
    }

    // toString method
    @Override
    public String toString(){
        return getName() + " " + getGender() + " " + getWeight() + " " + getCoordinates() + " " + getDentalHealth();
    }
}
