package com.swarch.aufgabe.idiome;

import java.util.Comparator;

/**
 * RectangleWHComparator sortiert Rechtecke zuerst nach der Breite (schmale Rechecke nach vorne, breite nach hinten), 
 * bei gleicher Breite nach der Hoehe.
 * */
public class RectangleWHComparator implements Comparator<Rectangle> {

	/**
	 * obj1 and obj2 are the objects to be compared.
	 *
	 * @param a - Objekt1
	 * @param b - Objekt2
	 * @return 	" 0" - returns zero if the objects are equal <br>
	 *  	   		" 1" - It returns a positive value if obj1 is greater than obj2<br>
	 *         	"-1" - Otherwise, a negative value is returned.<br>   
	 */
	@Override
	public int compare(Rectangle a, Rectangle b) {
		return (a.getWidth() > b.getWidth()) ? 1 : (a.getWidth() == b.getWidth()) ? (a.getHeight()>b.getHeight()) ? 1 : (a.getHeight()==b.getHeight())? 0 : -1 : -1;  
	}

}
