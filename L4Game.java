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
	
	String selectOneOfThree[] = {"Sci-Fi", "Romantic", "Dark Fantasy"};
	
	do {//I want the Player to play at least once
	    IO.println(intro);
	    IO.println("1. " + selectOneOfThree[0] +
		       "\n2. " + selectOneOfThree[1] +
		       "\n3. " + selectOneOfThree[2]);

	    switch (IO.readln("Your choice: ")) {
	    case "1" -> choices+=1;
	    case "2" -> choices+=2;
	    case "3" -> choices+=3;
	    default -> {
		IO.println(rageQuit);
		finish = true;
	    }
	    }
	    //area for the game
	    if (!finish) {
		if (choices == 1) {
		    //sci-fy
		} else if (choices == 2) {
		    //romantic
		} else {
		    // dark fantasy
		}
	    }
	} while (!finish);
    }
}
