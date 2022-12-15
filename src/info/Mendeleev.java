package info;

public class Mendeleev {

	public static double[] PMRad = { 53, 31, 167, 112, 87, 67, 56, 48, 42, 38, 190, 145, 118, 111, 98, 88, 79, 71, 243,
			194, 184, 176, 171, 166, 161, 156, 152, 149, 145, 142, 136, 125, 114, 103, 94, 88, 265, 219, 212, 206, 198,
			190, 183, 178, 173, 169, 165, 161, 156, 145, 133, 123, 115, 108, 298, 253, 226, 210, 247, 206, 205, 238,
			231, 233, 225, 228, 226, 226, 222, 222, 217, 208, 200, 193, 188, 185, 180, 177, 174, 171, 156, 154, 143,
			135, 127, 120, };

	// Allen Scale electronegativity.
	public static double[] ElecNeg = { 2.3, 4.16, 0.912, 1.576, 2.051, 2.544, 3.066, 3.61, 4.193, 4.787, 0.869, 1.293,
			1.613, 1.916, 2.253, 2.589, 2.869, 3.242, 0.734, 1.034, 1.19, 1.38, 1.53, 1.65, 1.75, 1.8, 1.84, 1.88, 1.85,
			1.588, 1.756, 1.994, 2.211, 2.424, 2.685, 2.966, 0.706, 0.963, 1.12, 1.32, 1.41, 1.47, 1.51, 1.54, 1.56,
			1.58, 1.87, 1.521, 1.656, 1.824, 1.984, 2.158, 2.359, 2.582, 0.659, 0.881, 1.09, 1.16, 1.34, 1.47, 1.6,
			1.65, 1.68, 1.72, 1.92, 1.765, 1.789, 1.854, 2.01, 2.19, 2.39, 2.6, 0.67, 0.89 };

	// one electron charge is 1.6 x 10-19, yeah.
	// thus we have a problem
	// because we need another table for electron-wantingness
	// this is somewhat described by valence electrons
	// and it also comes in handy other places
	// also, these are out of 8 (except boron but nobody cares), so a general
	// rule-of thumb is
	// that 8-valence = how many covalent bonds it wants to make
	// of valence # is how much it wants to get rid of
	// when it's less than 4 ig, more likely to give them away entirety when low electroneg.
	// ionic bonding determined by this and electronegativity
	// I hate Coloumb
	// why
	// our constant is 8.99/(1.6*10-19)
	// why
	public static byte[] ElecWant = { 1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 2, 2, 2, 1, 2, 2, 2,
			2, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 3, 2, 2, 2, 2, 2 };

	public static String[] name = { "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen",
			"Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulfur",
			"Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese",
			"Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine",
			"Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium",
			"Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium",
			"Iodine", "Xenon", "Caesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium",
			"Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium",
			"Lutetium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold",
			"Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium",
			"Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium",
			"Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium",
			"Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium",
			"Nihonium", "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson" };

	
	// units for "molar mass" are grams per 6.02214x10^23 atoms (avogadro's constant)
	public static double[] MolMass = {
			1.0079, 4.0026, 6.941, 9.0122, 10.811, 12.0107, 14.0067, 15.9994, 18.9984, 20.1797, 22.9897, 24.305,
			26.9815, 28.0855, 30.9738, 32.065, 35.453, 39.0983, 39.948, 40.078, 44.9559, 47.867, 50.9415, 51.9961,
			54.938, 55.845, 58.6934, 58.9332, 63.546, 65.39, 69.723, 72.64, 74.9216, 78.96, 79.904, 83.8, 85.4678,
			87.62, 88.9059, 91.224, 92.9064, 95.94, 98, 101.07, 102.9055, 106.42, 107.8682, 112.411, 114.818, 118.71,
			121.76, 126.9045, 127.6, 131.293, 132.9055, 137.327, 138.9055, 140.116, 140.9077, 144.24, 145, 150.36,
			151.964, 157.25, 158.9253, 162.5, 164.9303, 167.259, 168.9342, 173.04, 174.967, 178.49, 180.9479, 183.84,
			186.207, 190.23, 192.217, 195.078, 196.9665, 200.59, 204.3833, 207.2, 208.9804, 209, 210, 222, 223, 226,
			227, 231.0359, 232.0381, 237, 238.0289, 243, 244, 247, 247, 251, 252, 257, 258, 259, 261, 262, 262, 264,
			266, 268, 272, 277 };
	
	
	

	// Credit where it's due:

	/*
	 * For the atomic radii:
	 * https://en.wikipedia.org/wiki/Atomic_radii_of_the_elements_(data_page)
	 * 
	 * For electronegativity:
	 * https://en.wikipedia.org/wiki/Electronegativities_of_the_elements_(data_page)
	 * 
	 * for valence electrons:
	 * https://en.wikipedia.org/wiki/List_of_elements_by_atomic_properties
	 * 
	 * for molar mass:
	 * https://www.lenntech.com/periodic/mass/atomic-mass.htm
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
