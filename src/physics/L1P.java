package physics;
import java.awt.Graphics;
import java.util.ArrayList;

public class L1P {
	
	public static ArrayList<Byte> num;		// # of the element on the pd. table
	
	
	
	//positions defined in 100-picometer scale
	public static ArrayList<Double> x;		// self Xplanatory (LMAO)
	public static ArrayList<Double> y;		
	public static ArrayList<Double> vx;		// also time unit is in 100-picoseconds, just to keep units more or less time-scaled properly
	public static ArrayList<Double> vy;		

	public static double camx;	// idk what the coordinate system is based off. frankly I don't care
	public static double camy;	// when it breaks, I'll fix it ig
	
	
	
	
	public static ArrayList<Double> charge;	
	// describes the electron negativity, 
	// meaning that 1 whole charge increment would mean wanting to get rid of an electron (positive)
	// negative number means "lack" of electrons to make the shell
	// this is to be calculated from the Mendeleev class' "valence" chart.
	// it is to be cross refernced with the bonds arraylist, to subtract 
	
	
	ArrayList<Integer[]> bonds;	// the dynamically sized list lists the lists of atoms in each bond, 1 static list=1 bond
	
	public static boolean isBiggerThan; // if this is a super-level. not applicable here, kept as template
	public static boolean isThisLevel;  // if at this level of sim.
	
	
	
	
	
	public static void paint(Graphics g) {
		
		for(int i=0;i< num.size()-1;i++) {
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
