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

import java.lang.classfile.TypeAnnotation.EmptyTarget;

public class L4Game {
    public static void main(String[] Args) {

	//TODO add info for -h and --help keys

	//TODO add localization to another languages

	//TODO endings counter

	IO.print("\033[?1049h");//proceed to alternate screen
	
	boolean finish = false;

	final String headUIRow = "╔═══════════════════════════════════════════════╗\n",
	    endUIRow = "╚═══════════════════════════════════════════════╝\n",
	    emptyUIRow = "║                                               ║\n",
	    dividedUIRow = "╠═══════════════════════════════════════════════╣";

	final String intro = "║\tWelcome to the L4Game! It is a\t\t║\n║\tshort interactive story, where\t\t║\n║\tyour choices might change the plot.\t║\n║\tAll endings are independent.\t\t║\n";
	final String rageQuit = "Do ya really think u betta than me!?";
	
	String sciFiBeginning = "║\tThe far future. Humanity has\t\t║\n║\tconquered millions of planets\t\t║\n║\tacross hundreds of galaxies.\t\t║\n║\tAll of this became possible\t\t║\n║\tthanks to technology concepts\t\t║\n║\tthat were first developed in\t\t║\n║\tthe XXI century on Earth:\t\t║\n";
	String sciFiBeginningChoices = "║ 1. A Flawless Weapon of Mass Destruction\t║\n║ 2. The Contents of a Very Sturdy Briefcase\t║\n";

	String sciFiDevelopment1 = "║\tThis weapon was extremely\t\t║\n║\teffective both in space and on\t\t║\n║\tplanetary surfaces. A single use\t║\n║\twas enough to make enemy armies\t\t║\n║\tuseless. And this weapon was...\t\t║\n";
	String sciFiDevelopment1Choices = "║ 1. Terrifying\t\t\t\t\t║\n║ 2. Peaceful\t\t\t\t\t║\n";

	String sciFiConclusion1 = "║\tThroughout the entire area, the\t\t║\n║\tquestion was visible, audible,\t\t║\n║\tand palpable:\t\t\t\t║\n" + emptyUIRow + "║\t\tEnglish or Spanish?\t\t║\n";
	String sciFiConclusion2 = "║\tThis weapon was so hard\t\t\t║\n║\t\t\t\tto resist\t║\n" + emptyUIRow + "║\t\t🥺👉👈\t\t\t\t║\n";

	String sciFiDevelopment2 = "║\tFirst appearing with an unnamed\t\t║\n║\tman in a business suit, similar\t\t║\n║\tsuitcases gradually began to\t\t║\n║\tappear more and more frequently.\t║\n║\tNowadays, no space cruiser is\t\t║\n║\tcomplete without at least one.\t\t║\n║\tHowever, only a very limited number\t║\n║\tof people know what’s inside...\t\t║\n";
	String sciFiDevelopment2Choices = "║ 1. Ask the person with the suitcase.\t\t║\n║ 2. Forcefully open the suitcase.\t\t║\n";

	String sciFiConclusion3 = "║\tHe paused for a long time,\t\t║\n║\tthen replied with an extraordinarily\t║\n║\temotionless expression:\t\t\t║\n" + emptyUIRow + "║\t\t\"There are bipkis.\"\t\t║\n";
	String sciFiConclusion4 = "║\tYou saw:\t\t\t\t║\n║\t\t\t      )\t\t\t║\n║\t\t\t     (\t\t\t║\n║\t\t\t   .-/\\.\t\t║\n║\t\t\t  (     )\t\t║\n║\t\t\t .-`---`-.\t\t║\n║\t\t\t(_________)\t\t║\n";

	String restartQuestion = "║  Enter 1 to restart the game,\t\t\t║\n║  any other input will end the game.\t\t║\n" + endUIRow;
	
	String thankYou = "Thank you for playing!";
	
	do {//I want the Player to play at least once
	    IO.print("\033[H\033[2J");//clear the CLI
	    
	    IO.println(headUIRow + emptyUIRow + emptyUIRow + intro + emptyUIRow + emptyUIRow + dividedUIRow);
	    IO.readln("║  Press Enter to continue.\t\t\t║\n" + emptyUIRow + endUIRow);
	    
	    IO.print("\033[H\033[2J");//clear the CLI
				
	    IO.println(headUIRow + sciFiBeginning + emptyUIRow + dividedUIRow);
	    IO.print(sciFiBeginningChoices + endUIRow);
		
	    switch (IO.readln("Your choice: ")) {
	    case "1" -> {
		IO.print("\033[H\033[2J");//clear the CLI
		
		IO.println(headUIRow + emptyUIRow + sciFiDevelopment1 + emptyUIRow + emptyUIRow + dividedUIRow);
		IO.print(sciFiDevelopment1Choices + endUIRow);
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(headUIRow + emptyUIRow + sciFiConclusion1 + emptyUIRow + emptyUIRow + dividedUIRow);

		    IO.print(restartQuestion);
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
		
		    IO.println(headUIRow + emptyUIRow + emptyUIRow + sciFiConclusion2 + emptyUIRow + emptyUIRow + dividedUIRow);

		    IO.print(restartQuestion);
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
		
		IO.println(headUIRow + sciFiDevelopment2 + dividedUIRow);
		IO.print(sciFiDevelopment2Choices + endUIRow);
		switch (IO.readln("Your choice: ")) {
		case "1" -> {
		    IO.print("\033[H\033[2J");//clear the CLI
		
		    IO.println(headUIRow + emptyUIRow + sciFiConclusion3 + emptyUIRow + emptyUIRow + dividedUIRow);

		    IO.print(restartQuestion);
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
		
		    IO.println(headUIRow +  sciFiConclusion4 + emptyUIRow + dividedUIRow);

		    IO.print(restartQuestion);
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
