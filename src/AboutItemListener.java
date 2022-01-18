import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Contributor(s): Joseph Spann (5205035)
 * Nancy Barry; 5674724
 *
 * Sources:
 * Starting Out with Java, 6th edition, T. Gaddis
 * http://MyProgrammingLab.com: Starting Out with Java, 6th edition
 *
 * Version: November 29th 2019

 *  |-----------------------------------------------------------|
 *  |                      AboutItemListener                    |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  | Open a new window that will   |       TreasureGame        |
 *  |                               |                           |
 *  |provide developer contact info |                           |
 *  |                               |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class AboutItemListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        //Create a new JFrame variable named about window and set it to a new JFrame
        JFrame aboutWindow = new JFrame();
        //Set the title for this JFrame to "Developer Contact Information"
        aboutWindow.setTitle("DevelopersContactInformation");
        //Set the dimensions of this new window to 300 by 100
        aboutWindow.setSize(300,100);
        //Create a new string variable called aboutInfo and provide the information we want to display with formatting
        String aboutInfo = "Developers Contact Information" + "\n" +
                "Joseph Spann: joespann91@gmail.com" + "\n" +
                "Nancy Barry: nancy.barry26@yahoo.com";
        //Create a new variable of the Font class type called aboutFont, set it to sego script bold and italic with size 12 font
        Font aboutFont = new Font("Segoe Script", Font.BOLD + Font.ITALIC,12);
        //Create a new JTextArea variable named aboutTextArea and set it to a new JTextArea, pass in
        //the string variable named aboutInfo with our developers contact information.
        JTextArea aboutTextArea = new JTextArea(aboutInfo);
        //Set the dont for this next JTextArea to the font variable named aboutFont we created earlier
        aboutTextArea.setFont(aboutFont);
        //Call the add method on the about window to add this new aboutTextArea variable to the window.
        aboutWindow.add(aboutTextArea);
        //Set the text area to read only
        aboutTextArea.setEditable(false);
        //Set the window as visiable so it can be seen.
        aboutWindow.setVisible(true);
    }
}
