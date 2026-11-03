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

	int choices = 0;//the idea is to store all choices in one variable
	boolean finish = false;

	final String intro = "Welcome to the L4Game!\nIt is a short interactive story,\nwhere your choices might change\nthe plot.\nChoose your genre";
	final String rageQuit = "Do ya really think u betta than me!?";
	
	String selectOneOfTwo[] = {"Sci-Fi Comedy", "Contemporary Romance"};
	String sciFiBeginning = "A long time ago in a galaxy far far away";
	
	do {//I want the Player to play at least once
	    IO.println(intro);
	    IO.println("1. " + selectOneOfTwo[0] +
		       "\n2. " + selectOneOfTwo[1]);

	    switch (IO.readln("Your choice: ")) {
	    case "1" -> {
		IO.println("Sci-Fi Beginning"); //TODO Sci-Fi Beginning of the story
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.println("Sci-Fi Development 1"); //TODO Sci-Fi Development 1
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			IO.println("Sci-Fi Conclusion 1"); //TODO Sci-Fi Conclusion 1
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
			IO.println("Sci-Fi Conclusion 2"); //TODO Sci-Fi Conclusion 2
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
		    IO.println("Sci-Fi Development 2"); //TODO Sci-Fi Development 2
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
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
		IO.println("Romance Beginning"); //TODO Romance Beginning of the story
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.println("Sci-Fi Development 1"); //TODO Romance Development 1
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
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
		    IO.println("Sci-Fi Development 2"); //TODO Romance Development 2
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
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
    }
}
