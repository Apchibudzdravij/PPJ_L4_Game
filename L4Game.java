/*
 * Copyright (C) 2026 Apchibudzdravij
 *
 * This file is part of PPJ_L4_Game project.
 *
 * PPJ_L4_Game is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 3.
 *
 * MyProject is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

public class L4Game {
    public static void main(String[] Args) {

	//TODO add info for -h and --help keys

	//TODO add texts as one huge array

	//TODO endings counter

	final String os = System.getProperty("os.name");

	IO.print("\033[?1049h");//proceed to alternate screen
	
	int choices = 0;//the idea is to store all choices in one variable
	boolean finish = false;

	final String intro = "\tWelcome to the L4Game!\n\tIt is a short interactive story,\n\twhere your choices might change\n\tthe plot.\nChoose your genre";
	final String rageQuit = "Do ya really think u betta than me!?";
	
	String sciFiBeginning = "\tThe far future. Humanity has\n\tconquered millions of planets\n\tacross hundreds of galaxies.\n\tAll of this became possible\n\tthanks to technology concepts\n\tthat were first developed in\n\tthe XXI century on Earth:";
	String sciFiBeginningChoices = "1. A Flawless Weapon of Mass Destruction\t2. The Contents of a Very Sturdy Briefcase";

	String sciFiDevelopment1 = "\tThis weapon was extremely\n\teffective both in space and on\n\tplanetary surfaces. A single use\n\twas enough to make enemy armies\n\tuseless. And it was...";
	String sciFiDevelopment1Choices = "1. Terrifying\t2. Peaceful";

	String sciFiConclusion1 = "\tThroughout the entire area, the\n\tquestion was visible, audible,\n\tand palpable: English or Spanish?";
	String sciFiConclusion2 = "🥺👉👈";
	
	do {//I want the Player to play at least once
	    IO.print("\033[H\033[2J");//clear the CLI
	    
	    IO.println(intro);
	    IO.println("1. Sci-Fi Comedy\t2. Contemporary Romance");

	    switch (IO.readln("Your choice: ")) {
	    case "1" -> {
		IO.print("\033[H\033[2J");//clear the CLI
				
		IO.println(sciFiBeginning);
		IO.println(sciFiBeginningChoices);
		
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(sciFiDevelopment1);
		    IO.println(sciFiDevelopment1Choices);
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println(sciFiConclusion1);
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
		
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    case "2" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println(sciFiConclusion2);
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    default -> {
			IO.println(rageQuit);
			finish = true;
		    }
		    }
		}
		case "2" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println("Sci-Fi Development 2"); //TODO Sci-Fi Development 2
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 3"); //TODO Sci-Fi Conclusion 3
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    case "2" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 4"); //TODO Sci-Fi Conclusion 4
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    default -> {
			IO.println(rageQuit);
			finish = true;
		    }
		    }
		}
		default -> {
		    IO.println(rageQuit);
		    finish = true;
		}
		}
	    }
	    case "2" -> {
		IO.print("\033[H\033[2J");//clear the CLI
		
		IO.println("Romance Beginning"); //TODO Romance Beginning of the story
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println("Sci-Fi Development 1"); //TODO Romance Development 1
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 1"); //TODO Romance Conclusion 1
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    case "2" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 2"); //TODO Romance Conclusion 2
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    default -> {
			IO.println(rageQuit);
			finish = true;
		    }
		    }
		}
		case "2" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println("Sci-Fi Development 2"); //TODO Romance Development 2
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 3"); //TODO Romance Conclusion 3
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    case "2" -> {
			IO.print("\033[H\033[2J");//clear the CLI
		
			IO.println("Sci-Fi Conclusion 4"); //TODO Romance Conclusion 4
			switch (IO.readln("Your choice: ")) {
			case "1" -> {
			    finish = false;
			}
			default -> {
			    IO.println("Thank you!"); // TODO Thank you message
			    finish = true;
			}
			}
		    }
		    default -> {
			IO.println(rageQuit);
			finish = true;
		    }
		    }
		}
		default -> {
		    IO.println(rageQuit);
		    finish = true;
		}
		}
	    }
	    default -> {
		IO.println(rageQuit);
		finish = true;
	    }
	    }
	} while (!finish);

	IO.readln("Press Enter to quit... ");
	
	IO.print("\033[?1049l");//return back from alternate screen
    }
}
