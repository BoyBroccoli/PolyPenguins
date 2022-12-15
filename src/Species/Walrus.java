package Species;

public class Walrus extends Species implements Iloggable{

    // member variables
    private String dentalHealth;

    // Empty Constructor
    public Walrus(){}

    // Constructor
    public Walrus(String name, String gender, String coordinates, double weight, String dentalH){

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

        return String.format("""
                Species: %s
                Gender: %s
                Weight: %s
                Coordinates: %s
                DentalHealth: %s
                """, getName(), getGender(), getWeight(), getCoordinates(), getDentalHealth());
    }

}
