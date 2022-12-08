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
    JButton gpsButton = new JButton("Add GPS");
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
    JComboBox<String> animalBox = new JComboBox<String>(animals); // drop down box
    JComboBox<String> genderBox = new JComboBox<String>(genders); // drop down box
    JComboBox<String> dentalHealthBox = new JComboBox<>(dentalHealth); // drop down box
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

        // Gps Coordinates Label
        gpsCoordinatesLabel.setBounds(240,20,400,15);
        add(gpsCoordinatesLabel);

        // Coordinates Field
        coordinatesField.setBounds(240,50,300,20);
        add(coordinatesField);

        // AddGpS Button
        gpsButton.setBounds(550,50,90,20);
        add(gpsButton);

        // Coordinates Box
        coordinateList.setBounds(240,75,400,110);
        add(coordinateList);

        // ViewReports Button
        viewReportsButton.setBounds(520,200,110,30);
        add(viewReportsButton);

        //Animal Observed Label
        animalObservedLabel.setBounds(10,20,100,15);
        add(animalObservedLabel);

        // Animal Label
        animalLabel.setBounds(10,50,90,20);
        add(animalLabel);

        // AnimalBox Label
        animalBox.setBounds(115,50,90,20);
        add(animalBox);

        // GenderLabel
        genderLabel.setBounds(10, 75,90,20);
        add(genderLabel);

        // GenderBox Label
        genderBox.setBounds(115,75,90,20);
        add(genderBox);

        // WeightLabel
        weightLabel.setBounds(10, 100, 90, 20);
        add(weightLabel);

        // Weight Text Box
        weightField.setBounds(115,100, 90, 20);
        add(weightField);


        // Blood Pressure Label
        bloodPressureLabel.setBounds(10,125,90,20);
        add(bloodPressureLabel);

        // Blood Pressure Text Field
        bloodPressureField.setBounds(115,125,90,20);
        add(bloodPressureField);

        // Add Entry Box
        addEntryButton.setBounds(55,150,110,30);
        add(addEntryButton);

        //DentalBox Label
       // dentalHealthBox.setBounds(10,125,90,20);
      //  add(dentalHealthBox);

        // BloodPressureBox
       // bloodPressureField.setBounds(10,115,50,15);
        //add(bloodPressureField);


        setVisible(true);
    }
}
