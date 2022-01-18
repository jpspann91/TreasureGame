import javax.swing.*;
import java.awt.*;
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
 *  |                          TrollButton                      |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Creates functionality of a     |      NothingButton        |
 *  |a troll on the game board      |       TreasureGame        |
 *  |                               |                           |
 *  |Shows a troll when clicked     |  TrollButton Listener     |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class TrollButton extends NothingButton
{
    //Since troll button extends nothing button, it inherits the constructor
    //from nothing button to set the button image icon we set
    public TrollButton()
    {
        //Create a variable of the ImageIcon class and name it buttonImage
        //Set the variable to a new ImageIcon and pass in the button.jpeg
        //image file we have saved in the project
        ImageIcon buttonImage = new ImageIcon("src/button.jpg");
        //Create a variable of the ImageIcon class and name it trollImage
        //Set the variable to a new ImageIcon and pass in the troll.png
        //image file we have saved in the project
        ImageIcon trollImage = new ImageIcon("src/troll.png");
        //Call the setIcon method to set the icon to the buttonIcon variable we just created
        this.setIcon(buttonImage);
        //Set the disabled icon for this button to the trollIcon variable we
        //created earlier
        this.setDisabledIcon(trollImage);
    }
}
