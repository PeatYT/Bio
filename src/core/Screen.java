package core;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.util.EventListener;

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
		GUIlayer = new JPanel();
		simSpace = new JPanel();
	}
	
	public void create() {
		GUIlayer.add(simSpace);
		this.add(GUIlayer);
		this.setPreferredSize(prefSize);
		this.setContentPane(GUIlayer);
		
		// this is in order to allow for a popup confirming closure as autosave implementation would be a pain
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent we) {
				  System.out.println("closing");
				  System.exit(0);
			  }
			});
		this.setVisible(true);
	}
}
