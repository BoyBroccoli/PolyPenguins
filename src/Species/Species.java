package Species;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Species implements Iloggable{

    // member variables
    private String name;
    private String gender;
    private String coordinates;
    private double weight;

    // Empty Constructor
    public Species(){}

    // Constructor
    public Species(String name, String gender, String coordinates, double weight){
        this.name=name;
        this.gender=gender;
        this.coordinates=coordinates;
        this.weight=weight;
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

    public double getWeight() {
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString method
    @Override
    public String toString(){

        return String.format("""
                Species: %s
                Gender: %s
                Weight: %s
                """, getName(), getGender(), getWeight());
    }

    public void createFile(){
        try{
            FileWriter fileWriter = new FileWriter("./outputFile.txt",true);
            fileWriter.append(toString());
            //fileWriter.append(getCoordinates()).append("\n");
            fileWriter.append("--------------------------------------\n");
            fileWriter.append("\n");
            fileWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }


    }

    // Create Method to read file
    public static String readFile(String fileName){
        try{
            Path filePath = Paths.get("./" + fileName);

            return new String (Files.readAllBytes(filePath));
        } catch(Exception ex){
            return "There is an error";
        }
    }
}


