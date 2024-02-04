package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	
	
	//  ||    STATIC =====>>>>> BAD     |
	////////////////////////////////
	
	
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel();
	JButton addNameButton = new JButton("Add name");
	JButton viewNamesButton = new JButton("view Names");
	
	ArrayList <String> namesList = new ArrayList <String> ();
	public static void main(String[] args) {
		new GuestBook().setup();
	}
	
	public void setup () {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.add(addNameButton);
		panel.add(viewNamesButton);
		
		namesList.add("Bob Banders");
		namesList.add("Sandy Summers");
		namesList.add("Greg Ganders");
		namesList.add("Donny Doners");
		
		addNameButton.addActionListener(this);
		viewNamesButton.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		
		if (buttonClicked == addNameButton) {
			
			String newName = JOptionPane.showInputDialog("Please add a name!");
			namesList.add(newName);
			
		} else if (buttonClicked == viewNamesButton) {
			
			for (int x = 0; x < namesList.size(); x++) {
			JOptionPane.showMessageDialog(null, namesList.get(x));
			}
			
		}
		
	}
}
