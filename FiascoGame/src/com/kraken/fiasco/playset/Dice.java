package com.kraken.fiasco.playset;

import java.util.Random;

import com.kraken.fiasco.constants.FiascoSettings;

public class Dice {
	
	private int dicevalue;
	private String diceColor;
	
	public Dice()
	{
		dicevalue = 1;
		diceColor = FiascoSettings.DICE_COLOR_WHITE;
	}
	
	public Dice(String setColor)
	{
		diceColor = setColor;
	}
	
	public Dice(String setColor, int setValue)
	{
		dicevalue = setValue;
		diceColor = setColor;
		
	}
	private static final Random RANDOM = new Random();
	
	public void roll(){
	//randomly select a value between 1 - 6
		int rollValue = RANDOM.nextInt(6) + 1;
		this.setValue(rollValue);
	}
	
	public void setValue(int value)
	{
		if(value > 0 && value <= 6)
			{this.dicevalue = value;}
		else
		{
			//log an error
			//don't change value
		}
			
	}
	
	public int getValue()
	{return dicevalue;}
	
	public void setDiceColor(String color)
	{
		this.diceColor = color;
	}
	
	public String getDiceColor()
	{
		return diceColor;
	}
	
	public void dieStats()
	{
		System.out.print("\n{" +diceColor +","  +dicevalue +"}");
	}
}
