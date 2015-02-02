package com.kraken.fiasco.playset;

public class Element {

	private int categoryValue = 0;
	private int elementValue = 0;
	private String categoryString = "";
	private String elementString = "";

	public Element(int purchasedCategoryValue, String purchasedCategoryString) {
		// construct element with initial values
		categoryValue = purchasedCategoryValue;
		categoryString = purchasedCategoryString;
	}

	public void addElement(int purchasedElementValue,
			String purchasedElementString) {
		elementValue = purchasedElementValue;
		elementString = purchasedElementString;
	}

	public boolean isComplete() {
		if (!categoryString.equals("") && categoryValue != 0
				&& !elementString.equals("") && elementValue != 0) {
			return true;
		} else
			return false;
	}

}
