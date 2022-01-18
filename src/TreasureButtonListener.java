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
 *  |                    TreasureButton Listener                |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Performs an action event when a|    TreasureButton         |
 *  |treasure button is clicked     |     TreasureGame          |
 *  |                               |                           |
 *  |                               |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class TreasureButtonListener implements ActionListener
{
    //Create a new JButton instance variable called button
    private TreasureButton button;
    //Create a new JTextField instance variable called triesRemaining
    private JTextField triesRemaining;
    //Create a new JTextField instance variable called pointsField
    private JTextField pointField;
    //Create a new JTextField instance variable called lastMoveField
    private JTextField lastMoveField;
    //Create a new JTextField instance variable called treasureRemaining
    private JTextField treasuresRemaining;
    //Create an instance variable named treasureGame of the TreasureGame class
    private TreasureGame treasureGame;
    //Constructor that takes 4 JTextFields a TreasureGame and a button as the parameters
    public TreasureButtonListener(TreasureButton newButton, JTextField newTriesRemaining,
                                  JTextField newPointsField, JTextField newLastMoveField, JTextField newTreasuresRemaining, TreasureGame newTreasureGame)
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
        //Assign the instance variable pointsField to the newPointsField passed in
        //as the parameter
        pointField = newPointsField;
        //Assign the instance variable treasuresRemaining to the newTreasuresRemaining passed in
        //as the parameter
        treasuresRemaining = newTreasuresRemaining;
        //assign the instance variable treasureGame to the newTreasureGame 
        //passed as the parameter
        treasureGame = newTreasureGame;
    }
    //Action performed method required to implement the ActionListener class
    public void actionPerformed(ActionEvent ae)
    {
        //If a treasure button is clicked disable it so it can't be clicked again
        button.setEnabled(false);
        //Call the found treasure method on the treasureGame instance variable and pass in the 
        //value of the int returned from the getPointValue method on the button instance variable
        treasureGame.foundTreasure(button.getPointValue());
        //Set the text for treasuresRemaining text field to the value returned
        //from the getRemainingTreasures method concatonated with an empty string
        treasuresRemaining.setText(""+ treasureGame.getRemainingTreasures());
        //Set the text for points text field to the value returned
        //from the getPointAccumulator method concatonated with an empty string
        pointField.setText("" + treasureGame.getPointAccumulator());
        //Set the text for triesRemaining text field to the value returned
        //from the getNumberOfTries method concatonated with an empty string
        triesRemaining.setText("" + treasureGame.getNumberOfTries());
        //If the getPointValue method from the button instance variable returns one
        if(button.getPointValue() == 1)
        {
            //Change the last move field to say "You found a treasure!" and be singular, point
            lastMoveField.setText("You found a treasure! " + button.getPointValue() + " pt");
        }
        else
        {
            //Change the last move field to say "You found a treasure!" and be plural, points
            lastMoveField.setText("You found a treasure! " + button.getPointValue() + " pts");
        }
        //If the found treasures hits more than 10 or if the remaining treasures hits zero
        //after clicking a treasure button
        if (treasureGame.getPointAccumulator() >= 10 || treasureGame.getRemainingTreasures() == 0)
        {
            //then set the last move field to "You Win!"
            lastMoveField.setText("You Win!");
            //Use a for loop to disable all the buttons
            treasureGame.disableButtons();
        }
        //If after clicking a treasure button the get number of tries method returns zero
        if (treasureGame.getNumberOfTries() == 0)
        {
            //Then set the last move field to "Game Over! you Lose"
            lastMoveField.setText("Game Over! You Lose");
            //Use a for loop to disable all the button on the boardButtons array
            treasureGame.disableButtons();
        }
    }
}