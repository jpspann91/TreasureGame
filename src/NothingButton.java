import java.awt.*;
import javax.swing.*;



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
 *  |                          Nothing Button                   |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Holds the functionality of the |      TreasureGame         |
 *  |buttons on the board           |      TreasureButton       |
 *  |                               |                           |
 *  |Extends JButton to have same   | Nothing Button Listener   |
 *  |methods and functionality      |                           |
 *  |-------------------------------+---------------------------|
 */
public class NothingButton extends JButton
{
    //Constructor for the nothing button
    public NothingButton()
    {
        //Create a new image icon class variable named nothingIcon and set
        //the variable to a new ImageIcon and pass in the empty.png
        //image file we have saved in the project
        ImageIcon nothingIcon = new ImageIcon("src/empty.png");
        //Create a variable of the ImageIcon class and name it buttonImage
        //Set the variable to a new ImageIcon and pass in the button.jpeg
        //image file we have saved in the project
        ImageIcon buttonImage = new ImageIcon("src/button.jpg");
        //Call the setIcon method to set the icon to the buttonIcon variable we just created
        this.setIcon(buttonImage);
        //Set the disabled icon for this button to the emptyIcon variable we
        //created earlier
        this.setDisabledIcon(nothingIcon);
    }
}
