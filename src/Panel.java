import Species.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Panel extends JPanel {

    // Array List of Species
    public ArrayList <Species> species = new ArrayList<Species>();
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
    JLabel spotsLabel = new JLabel("Spots");
    JLabel bloodPressureLabel = new JLabel("Blood Pressure");
    JLabel gpsCoordinatesLabel = new JLabel("GPS Coordinates: (-)##.####### (-)(##or###).#######");
    JLabel dentalHealthLabel = new JLabel("Dental Health");



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

        // DentalBox Label
        dentalHealthLabel.setBounds(10,125,90,20);
        dentalHealthLabel.setVisible(false);
        add(dentalHealthLabel);

        // Dental Health Box
        dentalHealthBox.setBounds(115,125,90,20);
        dentalHealthBox.setVisible(false);
        add(dentalHealthBox);

        //Spots label
        spotsLabel.setBounds(10,125,90,20);
        spotsLabel.setVisible(false);
        add(spotsLabel);

        // Spots field
        spotsField.setBounds(115,125,90,20);
        spotsField.setVisible(false);
        add(spotsField);



        // Action listener For Add Gps Button
        gpsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                String userCoords = coordinatesField.getText();

                // Defining the regex
                String regexCoords = "^(-?90|-?[0-8]?[0-9])(\\.[0-9]{1,7})?\\s*(-?180|-?1[0-7][0-9]|-?[0-9]?[0-9])(\\.[0-9]{1,7})?$";


                // Defining the pattern
                Pattern p = Pattern.compile(regexCoords);
                Matcher m = p.matcher(userCoords);

                if(!m.find()){
                    gpsError(); // if regex is false printing error message
                } else {
                    coordinateList.append(userCoords+"\n"); // adding userCoords to textArea
                }
            }
        });

        // Action Listener and Display based off animal being chosen
        animalBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // variable for selectedAnimalBox
                String selectedAnimal = (String) animalBox.getSelectedItem();

                if(selectedAnimal.contains("Penguin")){
                    bloodPressureField.setVisible(true);
                    bloodPressureLabel.setVisible(true);
                    dentalHealthBox.setVisible(false);
                    dentalHealthLabel.setVisible(false);
                    spotsLabel.setVisible(false);
                    spotsField.setVisible(false);

                } else if (selectedAnimal.contains("Walrus")){
                    dentalHealthLabel.setVisible(true);
                    dentalHealthBox.setVisible(true);
                    bloodPressureField.setVisible(false);
                    bloodPressureLabel.setVisible(false);
                    spotsLabel.setVisible(false);
                    spotsField.setVisible(false);

                } else if (selectedAnimal.contains("Sea Lion")){
                    spotsLabel.setVisible(true);
                    spotsField.setVisible(true);
                    bloodPressureField.setVisible(false);
                    bloodPressureLabel.setVisible(false);
                    dentalHealthBox.setVisible(false);
                    dentalHealthLabel.setVisible(false);
                }
            }

        });

        // Action Listener for addEntry button
        addEntryButton.addActionListener(new ActionListener(){

            // Validating input is not blank

            @Override
            public void actionPerformed(ActionEvent e){
                String animalChosen = (String) animalBox.getSelectedItem();

                // storing field values in variables
                String name = animalChosen;
                String gender =getGender();
                int weight = getWeight();

                String coords = getCoordinates();

                if(animalChosen.contains("Penguin")){

                    double bloodPressure = getBloodPressure();
                    Penguin penguin = new Penguin(name,gender,coords,weight,bloodPressure);
                    penguin.createFile();
                    species.add(penguin);


                } else if (animalChosen.contains("Walrus")){

                    String dentalHealth = getDentalHealth();
                    Walrus walrus = new Walrus(name,gender,coords,weight,dentalHealth);
                    walrus.createFile();
                    species.add(walrus);

                } else if (animalChosen.contains("Sea Lion")){
                    int numOfSpots = getSpots();
                    Sealion seaLion = new Sealion(name,gender,coords,weight,numOfSpots);
                    seaLion.createFile();
                    species.add(seaLion);
                }

                animalAdded();

            }
        });

        // Action Listener for viewReports Button
        viewReportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Read contents of the file
                String file = "outputFile.txt";

                String textFromFile = Species.readFile(file);

                JOptionPane.showMessageDialog(null,textFromFile);
            }
        });

        setVisible(true);
    }

    public void animalAdded(){
      JOptionPane.showMessageDialog(null,animalChosen()+ " saved as a new entry.");
    };

    // Method for printing gps Error
    public void gpsError(){

        String gpsErrorMessage = """
                            Invalid GPS format
                            Latitude values range from -90 to 80.
                            Longitudes values range from -180 to 180.
                            Both values must have 7 digits after the decimal.
                            Separate latitude and longitude values with a space.
                            (-)##.####### (-)(## or ###).#######
                        """;

        JOptionPane.showMessageDialog(null,
                gpsErrorMessage);
    }

    // Storing Field variables

    public String animalChosen(){
        return (String)animalBox.getSelectedItem();
    }


    // storing weight field value
    public int getWeight(){
        if (weightField.getText().isEmpty() || weightField.getText() == null){
            weightError();
        }
        return Integer.parseInt(weightField.getText());

    }

    // Method for weight Error
    public void weightError(){

        String weightErrorMessage = """
                [Weight]: Invalid input:
                Enter a whole number greater than 0.
                """;

        JOptionPane.showMessageDialog(null,weightErrorMessage);
    }

    // Method for blood pressure error
    public void bloodPressureError(){
        String bloodPressureErrorMessage = """
                [Blood Pressure]: Invalid input:
                Enter a whole number greater than 0.
                """;

        JOptionPane.showMessageDialog(null,bloodPressureErrorMessage);
    }

    // storing blood pressure value
    public double getBloodPressure(){
        if (bloodPressureField.getText().isEmpty() || bloodPressureField.getText() == null){
            bloodPressureError();
        }
        return Double.parseDouble(bloodPressureField.getText());
    }

    // storing coords value
    public String getCoordinates(){
        return coordinatesField.getText();
    }

    // storing dental value
    public String getDentalHealth(){
        return dentalHealthBox.getSelectedItem().toString();
    }

    // storing gender value
    public String getGender(){
        return genderBox.getSelectedItem().toString();
    }

    // Method for Spots Error
    public void spotsError(){
        String spotsErrorMessage = """
                [Spots]: Invalid input:
                Enter a whole number greater than 0.
                """;

        JOptionPane.showMessageDialog(null,spotsErrorMessage);
    }

    // Storing spots value
    public int getSpots(){
        if (spotsField.getText().isEmpty() || spotsField.getText() == null){
            spotsError();
        }
        return Integer.parseInt(spotsField.getText());
    }


}
