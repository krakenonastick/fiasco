package test.kraken.fiasco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {

	/**
	 * @param dicePool 
	 * 
	 */
	static int[] dicePoolCounter(int[] dicePool) {
		// TODO: currently only outputs dice numbers to console

		int[] diceDistribution = new int[6];
		for (int i = 0; i <= dicePool.length - 1; i++) {

			int die = dicePool[i];

			// for each value in the the array, give distribution
			switch (die) {
			case 1:
				diceDistribution[1]++;
				break;
			case 2:
				diceDistribution[2]++;
				break;
			case 3:
				diceDistribution[3]++;
				break;
			case 4:
				diceDistribution[4]++;
				break;
			case 5:
				diceDistribution[5]++;
				break;
			case 6:
				diceDistribution[0]++;
				break;
			}
		}

		System.out.print("\n1: " +diceDistribution[1]);
		System.out.print("\n2: " +diceDistribution[2]);
		System.out.print("\n3: " +diceDistribution[3]);
		System.out.print("\n4: " +diceDistribution[4]);
		System.out.print("\n5: " +diceDistribution[5]);
		System.out.print("\n6: " +diceDistribution[0]);
	
		return diceDistribution;	
	}
	
	static int[] rollAllDice(int amtDice, int sides) {
		int[] dice = new int[amtDice];

		for (int dicePointer = 0; dicePointer <= amtDice-1; dicePointer++) {
			dice[dicePointer] = doRoll(sides);
			// add roll to array
		}

		return dice;
	}

	static List<Integer> rollAllDiceList(int amtDice, int sides) {
		
		List<Integer> dice = new ArrayList<Integer>();
		for (int dicePointer = 0; dicePointer <= amtDice-1; dicePointer++) {
			int num = doRoll(sides);
			dice.add(num);
			// add roll to array
		}
		
		return dice;
	}

	
	
	static  int doRoll(int sides) {
		int die;
		// randomDice from 6
		// FiascoConstants.DICE_SIDES
		Random chaos = new Random();
		die = chaos.nextInt(sides);
		// System.out.println("Dice Rolls a " + die + ".");
		if(die == 0)
		{die = sides;}
		return die;
	}

	static  void randomnessChecker() {
		// roll 100 dice
//		int trials = FiascoConstants.RANDOM_TEST_TRIALS;
		int trials = FiascoConstants.RANDOM_TEST_TRIALS;
		int[] trialDice = new int[trials];
		int sides = FiascoConstants.DICE_SIDES;
		
		System.out.println("Confirming Randomness...");


		for (int i = 0; i <= trials - 1; i++) {

			int die = doRoll(sides);

			trialDice[i] = die;
		}
			Dice.dicePoolCounter(trialDice);
		}
	
	/**
	 * Removes 2 dice from 
	 * @param dicePool array of dice
	 * @param remove the dice with this number
	 * @return
	 */
	static int[] diceRemover(int[] dicePool, int remove)
	{
		
		//remove RemoveA from dicePool
		if (remove == dicePool.length) {remove = 0;}
		if (dicePool[remove] > 0){
		dicePool[remove] = dicePool[remove]-1 ;
		}
		else{
			System.out.println("There isn't a " +remove +" in the pool!");
		}

		displayDice(dicePool);
		
		
		return dicePool;
		
	}
	
	static void displayDice(int[] dicePool){
		System.out.print("\n1: " +dicePool[1]);
		System.out.print("\n2: " +dicePool[2]);
		System.out.print("\n3: " +dicePool[3]);
		System.out.print("\n4: " +dicePool[4]);
		System.out.print("\n5: " +dicePool[5]);
		System.out.print("\n6: " +dicePool[0]);
	}
	
	}
