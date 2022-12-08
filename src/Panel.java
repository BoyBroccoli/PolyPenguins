import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Panel extends JPanel {

    // Arrays for textFieldBoxes
    String[] animals = {"Penguin", "Sea Lion", "Walrus"};
    String[] genders = {"Male", "Female"};
    String[] dentalHealth = {"good", "average", "poor"};


    // Buttons
    JButton addEntryButton = new JButton("Add Entry");
    JButton addGpsButton = new JButton("Add GPS");
    JButton viewReportsButton = new JButton("View Reports");
    JButton showNewEntriesButton = new JButton("Show New Entries");
    JButton showGpsLogsButton = new JButton("Show GPS Logs");
    JButton backButton = new JButton("Back");


    // Labels
    JLabel animalObservedLabel = new JLabel("Animal Observed:");
    JLabel animalLabel = new JLabel("Animal");
    JLabel genderLabel = new JLabel("Gender");
    JLabel weightLabel = new JLabel("Weight in Kg");
    JLabel bloodPressureLabel = new JLabel("Blood Pressure");
    JLabel gpsCoordinatesLabel = new JLabel("GPS Coordinates: (-)##.####### (-)(##or###).#######");
    JLabel dentalHealthLabel = new JLabel("Dental Health");
    JLabel spots = new JLabel("Spots");


    // Text fields and Boxes
    JComboBox<String> animalField = new JComboBox<String>(animals); // drop down box
    JComboBox<String> genderField = new JComboBox<String>(genders); // drop down box
    JComboBox<String> dentalHealthField = new JComboBox<>(dentalHealth); // drop down box
    JTextField weightField = new JTextField(7);
    JTextField bloodPressureField = new JTextField(7);
    JTextField coordinatesField = new JTextField(20);
    JTextField spotsField = new JTextField(6);
    JTextArea coordinateList = new JTextArea(); // textArea bc need more space

    // Scroll for CoordinateList
    JScrollPane scrollPane = new JScrollPane(coordinateList);


    public Panel(){

        this.setBorder(new EmptyBorder(5,5,5,5));
       // this.setLayout(new CardLayout(0,0));
        // define layout
        setLayout(null);

        //Animal Observed Label
        animalObservedLabel.setBounds(10,20,100,15);
        add(animalObservedLabel);

        // Animal Label
        animalLabel.setBounds(10,50,100,15);
        add(animalLabel);

        // AnimalField Label
        animalField.setBounds(120,45,100,25);
        add(animalField);

        // GenderField Label
        genderField.setBounds(10,80,100,25);
        add(genderField);

        //DentalField Label
        dentalHealthField.setBounds(10,145,100,25);
        add(dentalHealthField);

        // BloodPressureField
       // bloodPressureField.setBounds(10,115,50,15);
        //add(bloodPressureField);
        bloodPressureLabel.setBounds(10,165,100,15);
        add(bloodPressureLabel);

        setVisible(true);
    }
}
