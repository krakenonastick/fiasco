package com.kraken.fiasco.testingTabletop;

import com.kraken.fiasco.playset.DicePool;

public class DicePoolTest {

	public static void main(String[] args) {
		
		//createDicePool
		DicePool poolOfDice = createDicePool(6);
		//rollDice
		poolOfDice.rollAllDice();
		//output results
		poolOfDice.diceStats();
		//remove dice
		poolOfDice.removeDice(5);
		//output results
		poolOfDice.diceStats();
	}
	
	public static DicePool createDicePool(int poolSize)
	{
		DicePool dPool = new DicePool(poolSize);
		return dPool;
	}
	
}
