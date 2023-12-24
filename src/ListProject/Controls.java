package ListProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class is where the control JPanel of the 'To Do List' and the panel's buttons are initiated
 * 
 * addNote A JButton that represents the 'Add a Note' button of the control panel
 * 
 * clearNotes A JButton that represents the 'Clear Notes' button of the control panel
 * 
 * saveNotes A JButton that represents the 'Save Notes' button of the control panel
 * 
 * checkIfSaved A JLabel that represents the notification which indicates weather all the tasks of the 'To Do List' are saved or not
 * 
 * @author  Prantik Roy
 * @version 1.0
 * @since   2023 December 22th
 */

public class Controls extends JPanel{
	private JButton addNote;
	private JButton clearNotes;
	private JButton saveNotes;
	private JLabel checkIfSaved;
	private boolean saved = false;
	
	// Constructor for initializing the JPanel and its fields
	Controls() {
		// Sets the back ground color and size of the Control JPanel
		this.setBackground(new Color(255, 174, 66)); // sets the background color of this JPanel to be orange
		this.setPreferredSize(new Dimension(400, 40));
		
		setAddNoteButton();
		
		// makes sure that the buttons are spaced out horizontally by 20 pixels
		this.add(Box.createHorizontalStrut(20));

		setClearNotesButton();
		
		setSaveNotesButton();
		
		setCheckIfSavedNotification ();
	}
	
	/**
	 * This method generates the add note button of this control panel that adds a task
	 */
	public void setAddNoteButton() {
		// makes the JButton representing "Add a Note" button.
		addNote = new JButton("Add Task");
		// sets the size of the button
		addNote.setPreferredSize(new Dimension(150, 30));
		// sets the font of the text in the JButton
		addNote.setFont(new Font("Sans-serf", Font.PLAIN, 20));
		// sets the JButton to have not border
		addNote.setBorder(BorderFactory.createEmptyBorder());
		// adds the JButton into the control panel
		this.add(addNote);
	}
	
	/**
	 * This method generates the clear notes button of this control panel that deletes all the tasks currently shown
	 */
	public void setClearNotesButton() {
		// makes the JButton representing "Clear All Notes" button.
		clearNotes = new JButton("Clear Tasks");
		// sets the size of the button
		clearNotes.setPreferredSize(new Dimension(150, 30));
		// sets the font of the text in the JButton
		clearNotes.setFont(new Font("Sans-serf", Font.PLAIN, 20));
		// sets the JButton to have not border
		clearNotes.setBorder(BorderFactory.createEmptyBorder());
		// adds the JButton into the control panel
		this.add(clearNotes);
	}
	
	/**
	 * This method generates the save button of this control panel that saves the text information of all the tasks currently shown
	 */
	public void setSaveNotesButton() {
		// makes the JButton representing "Save" button.
		saveNotes = new JButton("Save Tasks");
		// sets the size of the button
		saveNotes.setPreferredSize(new Dimension(150, 30));
		// sets the font of the text in the JButton
		saveNotes.setFont(new Font("Sans-serf", Font.PLAIN, 20));
		// sets the JButton to have not border
		saveNotes.setBorder(BorderFactory.createEmptyBorder());
		// adds the JButton into the control panel
		this.add(saveNotes);
	}
	
	/**
	 * This method generates the right hand notification of this control panel that determines weather all the tasks are saved or not.
	 */
	public void setCheckIfSavedNotification () {
		// makes the JLabel representing the notification which indicates weather all the tasks of the 'To Do List' are saved or not
		checkIfSaved = new JLabel();
		checkIfSaved.setText("Saved");
		// sets the size of the JLabel
		checkIfSaved.setPreferredSize(new Dimension(150, 30));
		// sets the JLabel to have not border
		checkIfSaved.setBorder(BorderFactory.createEmptyBorder());
		// adds the JLabel into the control panel
		this.add(checkIfSaved);
	}
	
	// getter method for the addNote JButton
	public JButton getAddNote() {
		return this.addNote;
	}
	
	// getter method for the clearNotes JButton
	public JButton getclearNotes() {
		return this.clearNotes;
	}
	
	// getter method for the saveNotes JButton
	public JButton getSave() {
		return this.saveNotes;
	}
	
	// getter method for the notification JLabel
	public JLabel getCheckIfSaved() {
		return this.checkIfSaved;
	}
}
