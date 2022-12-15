package core;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import physics.L1P;

public class Screen extends JFrame {
	// the main panel that will intercept all keystrokes and mouse data
	// contains all menus and panels on it
	public JPanel GUIlayer;

	public static double zoom; // the global zoom variable. we pray to this.

	public static Rectangle region;
	// the part of the thing we're looking at. this defined as relative to the area
	// that has been zoomed in on the higher level
	// so basically IDK, do this later
	// TODO figure this out somehow

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
		this.setContentPane(GUIlayer);

		// this is in order to allow for a popup confirming closure as autosave
		// implementation would be a pain
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("closing");
				System.exit(0);
			}
		});
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.out.println("opening RUS window");
					JFrame RUS = new JFrame(); // R U Sure that you wanna close it?
					RUS.setSize(300, 200);
					JLabel dywq = new JLabel("do you want to quit?");
					JPanel options = new JPanel();
					JButton close = new JButton("yes");
					JButton cancel = new JButton("no");
					close.setSize(50, 50);
					close.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("click dies");
							System.exit(0);
						}
					});
					cancel.setSize(50, 50);
					cancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							RUS.dispose();
						}
					});
					options.add(close);
					options.add(cancel);
					RUS.add(dywq, BorderLayout.NORTH);
					RUS.add(options, BorderLayout.SOUTH);
					RUS.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent we) {
							RUS.dispose();
						}
					});
					RUS.setVisible(true);
				}
			}
		});

		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.decode("#000000"));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		switch ((int) zoom) {
		case 1:
			L1P.paint(g);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			// /shrug
			break;
		}

	}

}
