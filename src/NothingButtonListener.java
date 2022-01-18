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
 *  |                   Nothing Button Listener                 |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Performs an action event when a|     Nothing Button        |
 *  |nothing button is pressed      |                           |
 *  |                               |     TreasureGame          |
 *  |                               |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class NothingButtonListener implements ActionListener
{
    //Create an instance variable named button of the JButton class
    private NothingButton button;
    //Create an instance variable named triesRemainingField of the JTextField class
    private JTextField triesRemainingField;
    //Create an instance variable named lastMoveField of the JTextField class
    private JTextField lastMoveField;
    //Create an instance variable named treasureGame of the TreasureGame class
    private TreasureGame treasureGame;
    //Constructor that takes a new JButton and 2 new JTextFields and a newTreasureGame
    public NothingButtonListener(NothingButton newButton, JTextField newRemainingField,
                                 JTextField newLastMoveField, TreasureGame newTreasureGame)
    {
        //assign the instance variable triesRemainingField to the newRemainingField 
        //passed as the parameter
        triesRemainingField = newRemainingField;
        //assign the instance variable lastMoveField to the newLastMoveField 
        //passed as the parameter
        lastMoveField = newLastMoveField;
        //assign the instance variable button to the newButton 
        //passed as the parameter
        button = newButton;
        //assign the instance variable treasureGame to the newTreasureGame 
        //passed as the parameter
        treasureGame = newTreasureGame;
    }
    //actionPerformed method required to implement ActionListener
    public void actionPerformed(ActionEvent ae)
    {
        //clicking the nothing button will disable the button that was clicked
        button.setEnabled(false);
        //Call the reduce number of tries method to reduce the numberOfTries variable in treasure game
        treasureGame.reduceNumberOfTries();
        //change the tries remaining field text to the value returned from 
        //the getNumberOfTries method concatonated with an empty string
        triesRemainingField.setText("" + treasureGame.getNumberOfTries());
        //change the text in the lastMoveField to the string "You got nothing!"
        lastMoveField.setText("You got nothing!");
        //If a nothing button is clicked and the getNumberOfTries method returns zero
        if (treasureGame.getNumberOfTries() == 0)
        {
            //then change the text of the last move field to show game over
            lastMoveField.setText("Game Over! You Lose");
            //set the text in the tries remaining field to the value returned
            //from the getNumberOfTries method concatonated with an emplty string
            triesRemainingField.setText("" + treasureGame.getNumberOfTries());
            //Also use a for loop to then disable all the buttons in the boardButtons array
            treasureGame.disableButtons();
        }
    }
}