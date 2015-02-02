package com.kraken.fiasco.playset;

import java.util.ArrayList;
import java.util.List;

import com.kraken.fiasco.constants.FiascoSettings;

public class DicePool {

	private List<Dice> diceCollection = new ArrayList<Dice>();

	public DicePool(int poolSize) {
		int halfPool = poolSize / 2;
		addColoredDice(halfPool, FiascoSettings.DICE_COLOR_WHITE);
		addColoredDice(halfPool, FiascoSettings.DICE_COLOR_BLACK);
	}

	private void addColoredDice(int poolSize, String diceColor) {
		for (int i = 0; i < poolSize; i++) {
			// create a new dice
			Dice die = new Dice(diceColor);
			// add to diceCollection
			diceCollection.add(die);
		}
	}

	public void rollAllDice() {
		for (Dice die : diceCollection) {
			die.roll();
		}
	}

	public void removeDice(int value)
	{
		boolean dieRemoved = false;
		
		while(dieRemoved==false)
		{
			for(Dice die : diceCollection)
			{
				if(die.getValue()==value)
				{
					diceCollection.remove(die);
					System.out.println("\nRemoved " +value +".");
					dieRemoved = true;
					return;
				}
			}	
			System.out.println("\nDice of value " +value +" Not Found!");
			return;
		}
	}

	public void diceStats() {
		System.out.print("Total Dice: " + diceCollection.size());
		for (Dice die : diceCollection) {
			die.dieStats();
		}
	}

}
