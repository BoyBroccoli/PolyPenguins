package Species;

public abstract class Species {

    // member variables
    private String name;
    private String gender;
    private String coordinates;
    private int weight;

    // Empty Constructor
    public Species(){}

    // Constructor
    public Species(String name, String gender, String coordinates, int weidhgt){
        this.name=name;
        this.gender=gender;
        this.coordinates=coordinates;
        this.weight=weidhgt;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int getWeight() {
        return weight;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // toString method
    @Override
    public String toString(){
        return getName() + " " + getGender() + " " + getWeight();
    }

}
