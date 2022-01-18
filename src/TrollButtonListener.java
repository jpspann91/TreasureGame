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
 *  |                    TrollButton Listener                   |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Performs an action event when a|       TreasureGame        |
 *  |troll button is clicked        |       Troll Button        |
 *  |                               |                           |
 *  |                               |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class TrollButtonListener implements ActionListener
{
    //Create a new JButton instance variable called button
    private TrollButton button;
    //Create a new JTextField instance variable called triesRemaining
    private JTextField triesRemaining;
    //Create a new JTextField instance variable called pointsField
    private JTextField pointField;
    //Create a new JTextField instance variable called lastMoveField
    private JTextField lastMoveField;
    //Create an instance variable named treasureGame of the TreasureGame class
    private TreasureGame treasureGame;
    //Constructor that takes 3 JTextFields a TreasureGame and a button as the parameters
    public TrollButtonListener(TrollButton newButton, JTextField newTriesRemaining,
                               JTextField newPointField, JTextField newLastMoveField,TreasureGame newTreasureGame)
    {
        //Assign the instance variable button to the newButton passed in
        //as the parameter
        button = newButton;
        //Assign the instance variable triesRemaining to the newTriesRemaining passed in
        //as the parameter
        triesRemaining = newTriesRemaining;
        //Assign the instance variable lastMoveField to the newLastMoveField passed in
        //as the parameter
        lastMoveField = newLastMoveField;
        //Assign the instance variable pointsField to the newpointsField passed in
        //as the parameter
        pointField = newPointField;
        //assign the instance variable treasureGame to the newTreasureGame
        //passed as the parameter
        treasureGame = newTreasureGame;
    }
    //actionPerformed method required to implement ActionListener
    public void actionPerformed(ActionEvent ae)
    {
        //clicking the nothing button will disable the button that was clicked
        button.setEnabled(false);
        //Call the reduce number of tries method to reduce the numberOfTries variable in TreasureGame class
        treasureGame.reduceNumberOfTries();
        //change the tries remaining field text to the value returned from
        //the getNumberOfTries method concatonated with an empty string
        triesRemaining.setText("" + treasureGame.getNumberOfTries());
        //change the text in the lastMoveField to the string "You got nothing!"
        lastMoveField.setText("You found a troll!");
        //call the foundTroll() method on the treasureGame instance variable
        treasureGame.foundTroll();
        //set the text in the treasureFound test field to the value returned from the getPointAccumulator() method
        //to an empty string
        pointField.setText("" + treasureGame.getPointAccumulator());
        //If a nothing button is clicked and the getNumberOfTries method returns zero
        if (treasureGame.getNumberOfTries() == 0)
        {
            //then change the text of the last move field to show game over
            lastMoveField.setText("Game Over! You Lose");
            //set the text in the tries remaining field to the value returned
            //from the getNumberOfTries method concatonated with an emplty string
            triesRemaining.setText("" + treasureGame.getNumberOfTries());
            //Also use a for loop to then disable all the buttons in the boardButtons array
            treasureGame.disableButtons();
        }
    }
}



