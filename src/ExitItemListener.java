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
 *  |                       ExitItemListener                    |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |    Closes the TreasureGame    |       TreasureGame        |
 *  |            window             |                           |
 *  |                               |                           |
 *  |                               |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class ExitItemListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        //call the exit method on the System to close the window
        System.exit(0);
    }
}
