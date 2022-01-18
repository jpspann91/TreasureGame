import javax.swing.*;
import java.awt.*;
import java.util.*;
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
 *  |                          TreasureButton                   |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Creates functionality of a     |       Nothing Button      |
 *  |a treasure on the game board   |       TreasureGame        |
 *  |                               |                           |
 *  |Shows a treasure when clicked  |  TreasureButton Listener  |
 *  |Randomly generates a points 1-3|                           |
 *  |-------------------------------+---------------------------|
 */
public class TreasureButton extends NothingButton
{
    //Create an instance variable of int data type called pointValue
    private int pointValue;
    //Create an instance variable of the Random class named randomNumberGenerator
    //and set it to a new random Class.
    private Random randomNumberGenerator = new Random();
    public TreasureButton()
    {
        //Set the instance variable for pointValue to a randomly generated number between 0-2 and add
        //1 to get 1-3 we dont want zero points
        pointValue = randomNumberGenerator.nextInt(3) + 1;
        //Create a variable of the ImageIcon class and name it treasureButtonImage
        //Set the variable to a new ImageIcon and pass in the button.jpeg
        //image file we have saved in the project
        ImageIcon buttonImage = new ImageIcon("src/button.jpg");
        //Create a new image icon class variable named treasureIcon and set
        //the variable to a new ImageIcon and pass in the treasure.jpeg
        //image file we have saved in the project
        ImageIcon treasureIcon = new ImageIcon("src/treasure.jpg");
        //Set the disabled icon for this button to the treasureIcon variable we
        //created earlier
        this.setDisabledIcon(treasureIcon);
        //Call the setIcon method to set the icon to the variable we just created
        this.setIcon(buttonImage);
    }
    //get point value method to return the value of the pointValue instance variable
    public int getPointValue()
    {
        return pointValue;
    }
}
