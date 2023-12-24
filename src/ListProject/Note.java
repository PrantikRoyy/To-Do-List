package ListProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class is a JPanel thats used to represent a task of the 'To Do List'. It initiates all the buttons and 
 * single text area associated with this JPanel. 
 * 
 * note The JTextArea of this JPanel that's used store the text specifying the task
 * 
 * delete The JButton that represents the 'delete' button in this JPanel
 * 
 * completed The JButton that represents the 'Completed' button in this JPanel
 * 
 * complete A boolean that represents the current state of this task. True indicates that the task is complete and false 
 *          indicates that the task is uncompleted
 *          
 * ID An integer that represents the id of this task
 * 
 * text A string that specifies the task
 */

public class Note extends JPanel{
	private JTextArea note;
	private JButton delete;
	private JButton completed;
	
	private boolean complete = false;
	private int ID = 0;
	private String text;
	
	/**
	 * Constructor for initializing the JPanel and its fields
	 *  
	 * @param ID The id address used to identify the task
	 * @param text The string that specifies the task
	 * @param state A boolean that represents the current state of this task. True indicates that the task is complete and false 
     *        indicates that the task is uncompleted
	 */
	Note(int ID, String text, boolean state) {
		this.ID = ID;
		this.complete = state;
		this.text = text;
		//this.setPreferredSize(new Dimension(500, 100));
		
		setTextArea();
		
		setDeleteButton();
		
		setCompletedButton();
		
		// adds the JButton into the control panel
		this.add(completed);
		
	}
	
	public void setTextArea() {
		// makes the JTextArea of this JPanel that holds the string from 'text' of this task
		note = new JTextArea(text);
		// sets the border of this text area to be empty
		note.setBorder(BorderFactory.createLineBorder(Color.black));
		// sets the size of the text area
		note.setPreferredSize(new Dimension(300, 90));
		// sets the background color of this text area to be a darker yellow that contrasts with the yellow background of the frame
		note.setBackground(new Color(225, 215, 0));
		// adds the JTextArea into the control panel
		this.add(note);
	}
	
	public void setDeleteButton() {
		// makes the JButton representing "delete" button.
		delete = new JButton("delete");
		// sets the font of the text in the JButton
		delete.setFont(new Font("Sans-serf", Font.PLAIN, 10));
		// sets the color of this button to be a darker yellow that contrasts with the yellow background of the frame
		delete.setBackground(new Color(225, 215, 0));
		// sets the size of the button
		delete.setPreferredSize(new Dimension(70, 30));
		// adds the JButton into the control panel
		this.add(delete);
	}
	
	public void setCompletedButton() {
		// makes the JButton representing "Completed" button.
		completed = new JButton("Completed");
		// sets the font of the text in the JButton
		completed.setFont(new Font("Sans-serf", Font.PLAIN, 10));
		// sets the color of this button to be a darker yellow that contrasts with the yellow background of the frame
		completed.setBackground(new Color(225, 215, 0));
		// sets the size of the button
		completed.setPreferredSize(new Dimension(100, 30));
		
		/* If this task is uncompleted then the background color of this JPanel becomes a darker yellow and the text of this button is 
		 * set to 'Uncompleted', while if task is completed then the background of this JPanel become green and the text of this button
		 * if set to 'Completed'*/
		if (complete == false) {
			this.setBackground(new Color(225, 215, 0));
			completed.setText("Ucompleted");
		}
		else {
			this.setBackground(Color.green);
			completed.setText("Completed");
		}
	}
	
	// getter method for the JButton delete
	public JButton getDelete() {
		return this.delete;
	}
	
	// getter method for the JButton completed
	public JButton getCompleted() {
		return this.completed;
	}
	
	// getter method for the JTextArea note
	public JTextArea getTextArea() {
		return this.note;
	}
	
	// getter method for boolean complete
	public boolean getState () {
		return this.complete;
	}
	
	// getter method for the integer ID that represents the id address of this task. 
	public int getID() {
		return this.ID;
	}
}