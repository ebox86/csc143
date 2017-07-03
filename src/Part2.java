/**
 * 
 * @author Evan Kohout
 * @version Assignment 1: Class tools
 */
public class Part2 {
	
	/**
	 * Main -- application method which executes the main logic in this application
	 * 
	 * @param args -- command line arguments
	 */
	public static void main(String[] args){
		// prints my name
		System.out.println("My name is Evan Kohout");
		// prints my interesting fact
		System.out.println("Each year, the United States celebrates the signing of the Declaration of Independence on July 4th.");
		// handle args
		if(args.length == 0){
			System.out.println("No command-line arguments given."); System.exit(0);
		} else if (args[0].equals("OOP")){
			System.out.println("The command-line arguments say \"" + args[0] + "\".");
		} else if (args[0].equals("CSC") && args[1].equals("143")){
			System.out.println("The command-line arguments say \"" + args[0] + " " + args[1] + "\".");
		} else {
			System.out.println("The command-line arguments are not recognized.");
		}
	}
}
