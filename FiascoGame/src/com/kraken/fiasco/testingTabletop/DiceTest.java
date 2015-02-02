package com.kraken.fiasco.testingTabletop;

import java.util.ArrayList;
import java.util.List;

import com.kraken.fiasco.constants.FiascoSettings;
import com.kraken.fiasco.playset.Dice;

public class DiceTest {

	public static void main(String[] args) {
		// create and roll one dice
		// rollADie();

		// create a dice
		rollSomeDice(6);
	}

	private static void rollSomeDice(int diceCount) {
		List<Dice> dicePool = new ArrayList<Dice>();
		// create a dice
		for (int i = 0; i < diceCount; i++) {
			Dice die = new Dice(FiascoSettings.DICE_COLOR_BLACK);
			die.roll();
			dicePool.add(die);
		}

		for (int j = 0; j < dicePool.size(); j++) {
			Dice die = dicePool.get(j);
			System.out.println("\nDisplaying value of Die " + (j+1));
			System.out.println("\nDie Color: " + die.getDiceColor());
			System.out.println("\nDie Value: " + die.getValue());
		}
	}

	public static void rollADie() {
		// create a dice
		Dice die = new Dice();
		System.out.println("Created a die");
		System.out.println("\nDie Color: " + die.getDiceColor());
		System.out.println("\nDie Value: " + die.getValue());
		System.out.println("\n\nRolling...\n");
		die.roll();
		die.setDiceColor(FiascoSettings.DICE_COLOR_BLACK);
		System.out.println("\nDie Color: " + die.getDiceColor());
		System.out.println("\nDie Value: " + die.getValue());
		System.out.println("\n\nRolling...\n");
		die.roll();
		die.setDiceColor(FiascoSettings.DICE_COLOR_RED);
		System.out.println("\nDie Color: " + die.getDiceColor());
		System.out.println("\nDie Value: " + die.getValue());
		System.out.println("\n\nRolling...\n");

	}
}
