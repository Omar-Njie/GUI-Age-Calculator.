package unit1Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//Omar - 2/28/21
//Exam 1 - Age Calculator

public class Exam1 extends JFrame {

    //panel
    static JPanel panel = new JPanel();

    //Labels
    static JLabel BirthYearLabel = new JLabel();
    static JLabel AgeLabel = new JLabel();

    //Button
    static JButton button = new JButton("Enter");

    //Textfield
    static JTextField BirthYearText = new JTextField(15);
    static JTextField AgeText = new JTextField(15);

    public static void main(String[] args) {
	    new Exam1();
    }

    public Exam1() {

        //Adding the frame
        setTitle("Age Calculator");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        add(panel); //add the Panel

        //Setting the font of the user input.
        Font font = new Font("Serif", Font.BOLD, 20);

        //add everything so every components can show up.
        panel.setLayout(null); //setting Layout to null, customize own layout
        panel.add(BirthYearLabel);
        panel.add(AgeLabel);
        panel.add(BirthYearText);
        panel.add(AgeText);
        panel.add(button);
        panel.setBackground(new Color(153, 127, 127, 255));

        //Setting BirthYearLabel and Agelabel Bounds
        BirthYearLabel.setText("Birth Year:");
        BirthYearLabel.setBounds(10, 20, 80, 25);

        AgeLabel.setText("Age:");
        AgeLabel.setBounds(10, 50, 80, 25);

        //Setting BirthYearTextField and AgeTextField Bounds
        BirthYearText.setBounds(100, 20, 165, 25);
        BirthYearText.setText("Enter Birth year:");
        BirthYearText.setFont(font);
        AgeText.setBounds(100, 50, 165, 25);
        AgeText.setFont(font);

        //Setting the button Bound
        button.setBounds(100,80,80,25);

        //Button Action Listener:
        button.addActionListener(this::buttonActionPerformed);

    }


    private void buttonActionPerformed(ActionEvent e) {

        //Calculating Age
        String text = BirthYearText.getText();
        int yourAge = Integer.parseInt(text); //passing BirthTextYear as int when calculating the Age.
        int outputAge = 0;
        int actual_year =  2021;
        if (e.getSource() == button) { //if button pressed it calculate and display the age of the user.
            outputAge = actual_year - yourAge - 1;
        }
        String Age = outputAge + " years old.";
        AgeText.setText(Age); //displaying Age inside the Age TextField
        BirthYearText.setText(""); //blank out the BirthYear Textfield when hitting Enter button.
        
    }
}
