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

	//TODO add localization to another languages

	//TODO endings counter

	IO.print("\033[?1049h");//proceed to alternate screen
	
	boolean finish = false;

	final String intro = "\tWelcome to the L4Game! It is a\n\tshort interactive story, where\n\tyour choices might changethe plot.\n\tAll endings are independent.";
	final String rageQuit = "Do ya really think u betta than me!?";
	
	String sciFiBeginning = "\tThe far future. Humanity has\n\tconquered millions of planets\n\tacross hundreds of galaxies.\n\tAll of this became possible\n\tthanks to technology concepts\n\tthat were first developed in\n\tthe XXI century on Earth:";
	String sciFiBeginningChoices = "1. A Flawless Weapon of Mass Destruction\t2. The Contents of a Very Sturdy Briefcase";

	String sciFiDevelopment1 = "\tThis weapon was extremely\n\teffective both in space and on\n\tplanetary surfaces. A single use\n\twas enough to make enemy armies\n\tuseless. And this weapon was...";
	String sciFiDevelopment1Choices = "1. Terrifying\t2. Peaceful";

	String sciFiConclusion1 = "\tThroughout the entire area, the\n\tquestion was visible, audible,\n\tand palpable:\n\t\tEnglish or Spanish?";
	String sciFiConclusion2 = "\tThis weapon was so hard\n\t\tto resist\n\t\t🥺👉👈";

	String sciFiDevelopment2 = "\tFirst appearing with an unnamed\n\tman in a business suit, similar\n\tsuitcases gradually began to\n\tappear more and more frequently.\n\tNowadays, no space cruiser is\n\tcomplete without at least one.\n\tHowever, only a very limited number\n\tof people know what’s inside...";
	String sciFiDevelopment2Choices = "1. Ask the person with the suitcase what's inside it\t2. Forcefully open the suitcase.";

	String sciFiConclusion3 = "\tHe paused for a long time,\n\tthen replied with an extraordinarily\n\temotionless expression:\n\t\t\"There are bipkis.\"";
	String sciFiConclusion4 = "     )\n    (\n   .-.\n  (   )\n .-`-`-.\n(_______)";

	String restartQuestion = "Enter 1 to restart the game, any other input will end the game.";
	
	String thankYou = "Thank you for playing!";
	
	do {//I want the Player to play at least once
	    IO.print("\033[H\033[2J");//clear the CLI
	    
	    IO.println(intro);
	    IO.readln("Press Enter to continue.");
	    
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

		    IO.println(restartQuestion);
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
		
			finish = false;
		    }
		    default -> {
			IO.println(thankYou);
			finish = true;
		    }
		    }
		}
		case "2" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(sciFiConclusion2);

		    IO.println(restartQuestion);
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			finish = false;
		    }
		    default -> {
			IO.println(thankYou);
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
		
		IO.println(sciFiDevelopment2);
		IO.println(sciFiDevelopment2Choices);
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(sciFiConclusion3);

		    IO.println(restartQuestion);
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			finish = false;
		    }
		    default -> {
			IO.println(thankYou);
			finish = true;
		    }
		    }
		}
		case "2" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(sciFiConclusion4);

		    IO.println(restartQuestion);
		    switch (IO.readln("Your choice: ")) {
		    case "1" -> {
			finish = false;
		    }
		    default -> {
			IO.println(thankYou);
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
