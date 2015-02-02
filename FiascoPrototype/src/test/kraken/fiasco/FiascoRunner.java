package test.kraken.fiasco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FiascoRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sides = FiascoConstants.DICE_SIDES;
		//initializer
	
		System.out.println("INITIALIZING.....");
		System.out.println("\nAmount of Dice: " +sides);

//		Dice.randomnessChecker();
		// select a genre

		//parse with a file reader
		
		List<Integer> diceList = Dice.rollAllDiceList(20, sides);
		System.out.println(diceList);
		
		// D6 -- 2 dice per element
		
		int[] dicePool = Dice.rollAllDice(20, sides);
		int[] distribution = Dice.dicePoolCounter(dicePool);
//		System.out.println("\n New Dice \n");
//		distribution = Dice.diceRemover(distribution, 3);
//		System.out.println("\n New Dice \n");
//		distribution = Dice.diceRemover(distribution, 1);
		
		// show possible selections from list
		String playSet = Playset.parsePlayset();
		System.out.println(playSet);
		String[][] parsedPlayset = Playset.parseString(playSet);
		// Modify Selections or select randomly
		
		List<String> relationships = Playset.showRelationships(parsedPlayset, 1);
		System.out.println(relationships.toString());
		System.out.println("Narrowing it down...");
		List<String> narrowedRelationships = Playset.narrowDownRelationships(relationships, distribution);
		System.out.println(narrowedRelationships);
	}

	// Input - Playlist to be read

	// Design the object (GameWorld)
	// gameWorld(relationship[], needs[], locations[], objects[])



	
	
	
	}

