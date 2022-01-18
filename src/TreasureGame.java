
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
 *
 *  |-----------------------------------------------------------|
 *  |                          TreasureGame                     |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |Create the GUI for our game    |     Nothing Button        |
 *  |                               |    Treasure Button        |
 *  |Populate the button grid to    |                           |
 *  |play our game                  |Nothing Button Listener    |
 *  |                               |Treasure Button Listener   |
 *  |-------------------------------+---------------------------|
 */

public class TreasureGame extends JFrame
{
    //Create an instance array of JButtons called boardButtons and set the number of
    //JButton elements to 100
    private JButton[] boardButtons = new JButton[100];
    //Create an instance variable named numberOfTries and set it's value to 50
    private int numberOfTries = 50;
    //Create an instance variable to hold the current point value. 
    private int pointAccumulator = 0;
    //Create an instance variable to hold the number of treaures remaining and set
    //the starting value to 20
    private int treasuresRemaining = 20;
    //Constructor to create our GUI
    public TreasureGame()
    {
        //Set the title of the JFrame to "Treasure Game"
        setTitle("Treasure Game");
        //Set the size to 1100 by 700 pixels
        setSize(1100,700);
        //Create a new Font data type variable named titleFont and set it to
        //a new font passing the font type "Segoe Script" with bold font type
        //and size 50 text font. 
        Font titleFont = new Font("Segoe Script", Font.BOLD,50);
        //Create a new variable of the font class named infoFont and set it to
        //a new font passing the font type "Segoe Script" with bold font type
        //and size 20 text font.  
        Font infoFont = new Font("Segoe Script", Font.BOLD,20);
        //Create a new variable of the font class named lastMoveFont and set it to
        //a new font passing the font type "Segoe Script" with bold font type
        //and size 30 text font. 
        Font lastMoveFont = new Font("Segoe Script", Font.BOLD,30);
        //Create a new variable of the font class named legendFont and set it to
        //a new font passing the font type "Segoe Script" with bold font type
        //and size 15 text font.
        Font legendFont = new Font("Segoe Script", Font.BOLD,15);



        //MAIN PANEL***************************
        //Create a variable named mainPanel of the JPanel class and set
        //it to a new JPanel
        JPanel mainPanel = new JPanel();
        //Create a variable named mainLayout of the BorderLayout class and set
        //it to a new BorderLayout
        BorderLayout mainLayout = new BorderLayout();
        //Call the setLayout method on the mainPanel to set the layout manager to the mainLayout
        //variable we just created
        mainPanel.setLayout(mainLayout);



        //TITLE FIELD*************************
        //Create a new JTextField variable and call it titleField. Set it to 
        //a new JTextField containing the String "Treasure Game"
        JTextField titleField = new JTextField("Treasure Game");

        //Set the title text field font to the new font variable we just created at the top of this class
        titleField.setFont(titleFont);
        //Set the title field color to blue
        titleField.setForeground(Color.BLUE);
        //Set to read only
        titleField.setEditable(false);
        //add the new title text field to the top northern portion of the main panel 
        mainPanel.add(titleField, BorderLayout.NORTH);



        //CENTER PANEL***************************
        //Create a new JPanel variable named game panel and set it to a new JPanel
        JPanel gamePanel = new JPanel();
        //For this gamePanel we call the setLayout method and set the layout 
        //manager for this panel to be a grid layout with 10 by 10 dimensions
        gamePanel.setLayout(new GridLayout(10, 10));
        //We then add this game panel to the center portion of main panel
        mainPanel.add(gamePanel, BorderLayout.CENTER);




        //LEFT PANEL***************************
        //Create a new JPanel variable and name it infoPanel set it to a new JPanel
        JPanel infoPanel = new JPanel();
        //Call the setLayout method on this new panel and set a grid layout with 0 by 1 dimensions
        infoPanel.setLayout(new GridLayout(0, 1));
        //add this new info panel to the western portion of the main panel
        mainPanel.add(infoPanel, BorderLayout.WEST);


        //Tries Left Label
        //Create a label class variable named trieLeftLabel and set it to a new
        //JLabel with the string "Tries Left"
        JLabel triesLeftLabel = new JLabel("Tries left: ");
        //Set the font for this label to the new font variable we created earlier
        triesLeftLabel.setFont(infoFont);
        //Set the color for this label to gray
        triesLeftLabel.setForeground(Color.GRAY);
        //Format the tries left label to be centered
        triesLeftLabel.setHorizontalAlignment(JLabel.CENTER);
        //add this new label to the infoPanel variable we created
        infoPanel.add(triesLeftLabel);



        //Tries Left field
        //Create a new text field and name it triesLeftText set it to a new JTextField
        //with a width of 10
        JTextField triesLeftText = new JTextField(10);
        //Set the text for this new text field to the value returned from 
        //calling the getNumberOfTries method concatonated with an empty string
        triesLeftText.setText("" + getNumberOfTries());
        //set the font for the tries left text field to the infoFont variable 
        //we created earlier
        triesLeftText.setFont(infoFont);
        //set the color for this text field to be gray
        triesLeftText.setForeground(Color.GRAY);
        //format the triesLeft Text field to be centered
        triesLeftText.setHorizontalAlignment(JTextField.CENTER);
        //add this text field to the info panel we created
        infoPanel.add(triesLeftText);



        //Treasures remaining label
        //Create a new label named treasuresRemainingLabel and set it to a new 
        //JLabel with the string "Treasures Remaining"
        JLabel treasuresRemainingLabel = new JLabel("Treasures Remaining: ");
        //set the font for this label to the info font variable we created earlier
        treasuresRemainingLabel.setFont(infoFont);
        //set the color for this label to gray
        treasuresRemainingLabel.setForeground(Color.GRAY);
        //add this label to the info panel
        infoPanel.add(treasuresRemainingLabel);



        ////Treasures reamining field
        //Create new text field variable named treasureRemainingText and set it
        //to a new JTextField with a width of 10 
        JTextField treasuresRemainingText = new JTextField(10);
        //Set the text for this new text field to the value returned from the 
        //getRemainingTreasures method concatonated with an empty string
        treasuresRemainingText.setText("" + getRemainingTreasures());
        //set the font for this text field to the font variable we created earlier
        treasuresRemainingText.setFont(infoFont);
        //set the color for this text field to gray
        treasuresRemainingText.setForeground(Color.GRAY);
        //Format the treasures remaining text field to be centered
        treasuresRemainingText.setHorizontalAlignment(JTextField.CENTER);
        //add this new treasures remaining text field to the info panel
        infoPanel.add(treasuresRemainingText);



        //Points label
        //Create a new JLabel for TreasuresFound and set it to a new JLabel 
        //containing the string "Points"
        JLabel pointsLabel = new JLabel("Points: ");
        //Set the font for this label to the info font variable we created earlier
        pointsLabel.setFont(infoFont);
        //set the color of this label to gray
        pointsLabel.setForeground(Color.GRAY);
        //format the points label to be centered
        pointsLabel.setHorizontalAlignment(JLabel.CENTER);
        //add this label to the info panel
        infoPanel.add(pointsLabel);



        //Treasures found field
        //Create a new text field variable named treausresFoundText and set it 
        //to a new JTextField with a width of 10
        JTextField pointsText = new JTextField(10);
        //set the text for this field to the value returned from the getFoundTreasures
        //method concatonated with an empty string
        pointsText.setText("" + getPointAccumulator());
        //set the font for this new text field to the infoFont variable we created earlier
        pointsText.setFont(infoFont);
        //set the color of this text field to gray
        pointsText.setForeground(Color.GRAY);
        //format the point text field to be centered
        pointsText.setHorizontalAlignment(JTextField.CENTER);
        //add this new text field to the info panel
        infoPanel.add(pointsText);



        //RIGHT PANEL***************************
        //Create a new JPanel variable and name it legendPanel set it to a new JPanel
        JPanel legendPanel = new JPanel();
        //Call the setLayout method on this new panel and set a BoxLayout manager about the y axis
        legendPanel.setLayout(new BoxLayout(legendPanel, BoxLayout.Y_AXIS));
        //Call the setBorder method and pass in the required parameter of a border. Make the border have 175
        //spacing on top and 10 spacing on left, right and bottom. 
        legendPanel.setBorder(BorderFactory.createEmptyBorder(175, 10, 10, 10));
        //add this new info panel to the western portion of the main panel
        mainPanel.add(legendPanel, BorderLayout.EAST);
        //Create a new image icon class variable named treasureIcon and set 
        //the variable to a new ImageIcon and pass in the treasure.jpeg
        //image file we have saved in the project 
        ImageIcon treasureIcon = new ImageIcon("treasure.jpg");
        //Create a new JLabel variable named treasure legend set it to a new JLabel and pass in
        //a string an ImageIcon variable and a JLabel format. 
        JLabel treasureLegend = new JLabel("Gives you between 1-3 points", treasureIcon, JLabel.LEFT);
        //set the font for this new label to the font we created earlier
        treasureLegend.setFont(legendFont);
        //set the foreground color to Red
        treasureLegend.setForeground(Color.RED);
        //add this treasure label to the legend panel
        legendPanel.add(treasureLegend);
        //Create a variable of the ImageIcon class and name it trollImage
        //Set the variable to a new ImageIcon and pass in the troll.png
        //image file we have saved in the project
        ImageIcon trollIcon = new ImageIcon("troll.png");
        //Create a new JLabel variable named troll legend set it to a new JLabel and pass in
        //a string an ImageIcon variable and a JLabel format.
        JLabel trollLegend = new JLabel("Steals all your points", trollIcon, JLabel.LEFT);
        //set the font for this new label to the font we created earlier
        trollLegend.setFont(legendFont);
        //set the foreground color to Red
        trollLegend.setForeground(Color.RED);
        //add this troll label to the legend panel
        legendPanel.add(trollLegend);
        //Create a variable of the ImageIcon class and name it nothingIcon
        //Set the variable to a new ImageIcon and pass in the troll.png
        //image file we have saved in the project
        ImageIcon nothingIcon = new ImageIcon("empty.png");
        //Create a new JLabel variable named nothing legend set it to a new JLabel and pass in
        //a string an ImageIcon variable and a JLabel format.
        JLabel nothingLegend = new JLabel("Gives you nothing!", nothingIcon, JLabel.LEFT);
        //set the font for this new label to the font we created earlier
        nothingLegend.setFont(legendFont);
        //set the foreground color to Red
        nothingLegend.setForeground(Color.RED);
        //add this nothing label to the legend panel
        legendPanel.add(nothingLegend);








        //SOUTH PANEL***************************
        //Create panel variable called last move panel and set it to a new JPanel
        JPanel lastMovePanel = new JPanel();
        //set the layout manager for this panel to a grid layout with 1 by 0 dimensions
        lastMovePanel.setLayout(new GridLayout(1,0));
        //add the last move panel to the southern portion of the main panel  
        mainPanel.add(lastMovePanel, BorderLayout.SOUTH);



        //Last move label
        //Create a new JLabel variable and set it to a new JLabel containing
        //the string "Last Move: 
        JLabel lastMoveLabel = new JLabel("Last Move: ");
        //set the font for this label to the lastMoveFont variable we created earlier
        lastMoveLabel.setFont(lastMoveFont);
        //set the color of this label to red
        lastMoveLabel.setForeground(Color.RED);
        //add this new label to the lastMovePanel we created
        lastMovePanel.add(lastMoveLabel);



        //Last move field
        //Create a new JTextField variable named lastMoveText and set it to a new
        //JTextField 
        JTextField lastMoveText = new JTextField();
        //set the font for this new text field to the lastMoveText font variable
        //we created earlier
        lastMoveText.setFont(lastMoveFont);
        //set the color of this text field to red
        lastMoveText.setForeground(Color.RED);
        //add this last move text field to to the last move panel
        lastMovePanel.add(lastMoveText);




        //MENU BAR***************************
        //Create a new JMenuBar variable named gameMenuBar and set it to a new JMenuBar
        JMenuBar gameMenuBar = new JMenuBar();
        //call the setJMenuBar method for TreasureGame to the new JMenuBar variable named gameMenuBar
        setJMenuBar(gameMenuBar);
        //Create a new JMenu variable named fileMenu and set it to a new JMenu containing a string "File"
        JMenu fileMenu = new JMenu("File");
        //Add this new fileMenu variable to the gameMenuBar
        gameMenuBar.add(fileMenu);
        //Create a new JMenuItem variable named exitItem and set it to a new JMenuItem containing a string
        //"Exit"
        JMenuItem exitItem = new JMenuItem("Exit");
        //Add an action listener to the exit menu item
        exitItem.addActionListener(new ExitItemListener());
        //add this new exit item to the file menu variable we created
        fileMenu.add(exitItem);
        //Create a new JMenuItem variable named exitItem and set it to a new JMenuItem containing a string
        //"About"
        JMenuItem aboutItem = new JMenuItem("About");
        //Add an action listener to the about menu item
        aboutItem.addActionListener(new AboutItemListener());
        //add this new about item to the file menu variable we created
        fileMenu.add(aboutItem);

        //set all text fields to be read only
        triesLeftText.setEditable(false);
        treasuresRemainingText.setEditable(false);
        pointsText.setEditable(false);
        lastMoveText.setEditable(false);

        //GENERATE GAME PANEL BUTTONS

        //Create a new random class variable and name it randomNumberGenerator
        //set it to a new instance of the random class
        Random randomNumberGenerator = new Random();

        //Use a for loop generate 20 random TreasureButtons to the boardButtons array
        for(int treasureButtonIndex = 0; treasureButtonIndex < 20; treasureButtonIndex++)
        {
            //Declare a new integer variable called index
            int index;
            do
            {
                //assign index variable to the next random integer generated between 0-99
                index = randomNumberGenerator.nextInt(100);
            }
            //give me a new random number if the board buttons array already has a 
            //button at that index location
            while(boardButtons[index] != null);
            //Create a new TreasureButton variable and set it to a new TreasureButton
            TreasureButton treasureButton = new TreasureButton();
            //after a random value is generated for the variable index assign
            //that element of the boardButtons array to treasureButton variable we just created
            boardButtons[index] = treasureButton;
            //also add an action listener for the button at the randomly generated
            //array element location. Pass in the parameters required from 
            //for the action listener. 4 Text Fields this TreasureGame class and a button
            boardButtons[index].addActionListener
                    (new TreasureButtonListener(treasureButton, triesLeftText,
                            pointsText, lastMoveText,treasuresRemainingText, this));
        }
        //Use a for loop generate 20 random TrollButtons to the boardButtons array
        for(int trollButtonIndex = 0; trollButtonIndex < 20; trollButtonIndex++)
        {
            //Declare a new integer variable called index
            int index;
            do
            {
                //assign index variable to the next random number generated between 0-99
                index = randomNumberGenerator.nextInt(100);
            }
            //give me a new random number if the board buttons array already has a 
            //button at that index location
            while(boardButtons[index] != null);
            //Create a new TrollButton variable and set it to a new TrollButton
            TrollButton trollButton = new TrollButton();
            //after a random value is generated for the variable index assign
            //that element of the boardButtons array to trollButton variable we just created
            boardButtons[index] = trollButton;
            //also add an action listener for the button at the randomly generated
            //array element location. Pass in the parameters required from 
            //for the action listener. 3 Text Fields this TreasureGame class and a button
            boardButtons[index].addActionListener
                    (new TrollButtonListener(trollButton, triesLeftText,
                            pointsText, lastMoveText, this));
        }
        //Use a for loop to generate the rest of the boardButtons array
        for (int nothingButtonIndex = 0; nothingButtonIndex < (boardButtons.length);
             nothingButtonIndex++)
        {
            //If the element at that index location is null
            if (boardButtons[nothingButtonIndex] == null)
            {
                NothingButton nothingButton = new NothingButton();
                //then set the element at that index locatoin to a new Nothing Button
                boardButtons[nothingButtonIndex] = nothingButton;
                //set the action listener for that nothing button and pass in the
                //needed parameters: 2 TextFields a this Treasure Game class and a button
                boardButtons[nothingButtonIndex].addActionListener
                        (new NothingButtonListener(nothingButton, triesLeftText,
                                lastMoveText, this));
            }
            //If that index location is not null, then just iterate the nothingButtonIndex and try again
        }
        //Use a for loop to add the entire button array boardButtons to the CENTER game panel
        for (int addIndex = 0; addIndex < 100; addIndex++)
        {
            gamePanel.add(boardButtons[addIndex]);
        }
        //add the main panel to our JFrame TreasureGame
        add(mainPanel);
        //set the main panel to be visible
        setVisible(true);
    }
    //Get number of tries method to return the current number of tries remaining
    public int getNumberOfTries()
    {
        return numberOfTries;
    }
    //Reduce number of tries method to reduce the number of tries variable by 1
    public void reduceNumberOfTries()
    {
        numberOfTries = numberOfTries - 1;
    }
    //Get remaining treasures method to return the number of treasures remaining variable
    public int getRemainingTreasures()
    {
        return treasuresRemaining;
    }
    //get point accumulator method to return the value currently set to point accumulator
    public int getPointAccumulator()
    {
        return pointAccumulator;
    }
    //Found treasure method that is used when a treasure is found.
    //Takes an int as a parameter and adds that value to the pointsAccumulator instance variable
    public void foundTreasure(int newPointValue)
    {
        //Calls the reduceNumberOfTries method in the TreasureGame class
        reduceNumberOfTries();
        //Adds the value passed in as the argument to the pointAccumulator instance variable
        pointAccumulator = pointAccumulator + newPointValue;
        //Reduces the instance variable that holds treasures remaining by 1
        treasuresRemaining = treasuresRemaining - 1;
    }
    //Found troll method that is used when a troll is found
    public void foundTroll()
    {
        //set the pointAccumulator variable equal to zero
        pointAccumulator = 0;
    }
    //Disable buttons method to disable all buttons on the grid when the game is over. 
    public void disableButtons()
    {
        //Use a for loop to call the set enabled method on each button in the boardButtons array. 
        for (int i= 0; i < 100; i++)
        {
            boardButtons[i].setEnabled(false);
        }
    }
    //Main method to play our treasure game
    public static void playTreasureGame()
    {
        new TreasureGame();
    }

}