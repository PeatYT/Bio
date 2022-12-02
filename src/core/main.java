package core;

public class main {

	public static Screen screen;
	
	
	public static void main(String[] args) {
		
		//welcome to the bio game. a lot of work lies ahead
		
		
		
		
		//TODO load prefs
		//TODO load 'projects'
		//TODO load current simulation (start a simulator)
		//creates the main screen, visible
		screen = new Screen();
		
		screen.create();
		while(true) {
			//keeps the thread running, idk if this is useful, but it can't hurt that much
		}
	}

}
