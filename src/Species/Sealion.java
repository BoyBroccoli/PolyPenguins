package Species;

public class Sealion extends Species implements Iloggable{

    private int numOfSpots;

    // Empty Constructor
    public Sealion(){}

    // Constructor
    public Sealion(String name, String gender, String coordinates, double weight, int spots){
        super(name,gender,coordinates,weight);
        this.numOfSpots=spots;
    }

    // Getter
    public int getNumOfSpots() {
        return numOfSpots;
    }

    // Setter
    public void setNumOfSpots(int numOfSpots) {
        this.numOfSpots = numOfSpots;
    }

    // toString method
    @Override
    public String toString(){

        return String.format("""
                Species: %s
                Gender: %s
                Weight: %s
                Coordinates: %s
                Spots: %s
                """, getName(), getGender(), getWeight(), getCoordinates(), getNumOfSpots());
    }
}
