package core;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Screen extends JFrame{
	public Dimension prefSize;
	
	
	// the main panel that will intercept all keystrokes and mouse data
	// contains all menus and panels on it
	public JPanel GUIlayer; 
	
	// space for the simulation to be drawn 
	// *WARNING: may dynamically resize, aspect ratio not guaranteed*
	public JPanel simSpace;
	
	public JMenuBar topMenu;
	
	public Screen() {
		super();
		
		
		GUIlayer.add(simSpace);
		this.add(GUIlayer);
		this.setPreferredSize(prefSize);
		this.setContentPane(GUIlayer);
		
		
		
		
		
		
	}
	
	public void addPanes() {}
	
	public void show() {this.setVisible(true);}
	
	
	
	
	
	

}
