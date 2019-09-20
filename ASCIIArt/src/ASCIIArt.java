/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void printEars() {
		System.out.print(" ()");
	}

	public static void printHead() {
		System.out.println("    (*   *)");
		System.out.println("    \\\\   //");
		System.out.println("    -- ^ --");
		System.out.println("    //   \\\\");
	}

	public static void printStomach() {
		System.out.println("   (      )");
	}

	public static void printArms() {
		System.out.println("$- |      | -$");
	}

	public static void printLegs() {
		System.out.print("   | |");
	}

	public static void printFoot() {
		System.out.print("  (--)");
	}

	public static void main(String[] args) {
		// MY RABBIT
		System.out.println("This is my phat rabbit");
		System.out.print("    ");
		printEars();
		printEars();
		System.out.println();
		printHead();
		printStomach();
		printArms();
		printStomach();
		printLegs();
		printLegs();
		System.out.println();
		System.out.println("    \\\\  //");
		printFoot();
		printFoot();
		System.out.println();
		System.out.println("The fattest rabbit alive with skinny arms and MASSIVE whiskers");

	}
}