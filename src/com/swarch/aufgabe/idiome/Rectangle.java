package com.swarch.aufgabe.idiome;

/* (C) 2013, R. Schiedermeier, rs@cs.hm.edu
 * Oracle Corporation Java 1.7.0, Linux i386 2.6.32.58
 * emma (Intel Core i7 CPU 920/2668 MHz, 8 Cores, 24320 MB RAM)
 */
/** Unveraenderliches Rechteck.
 * @author Reinhard Schiedermeier, rs@cs.hm.edu
 * @version 2010-11-20
 */
public class Rectangle {
    @Override
	public boolean equals(Object o) {
    	if (this == o) {return true;}
    	if (o == null){return false;}    	 
    	if (o instanceof Rectangle){
    		if (getClass() != o.getClass()){return false;}             
    		final Rectangle that = (Rectangle) o;             
    		if (getHeight() != that.getHeight()){return false;}             
    		if (getWidth() != that.getWidth()){return false;}
    		return true;
    	} else {
    		return false;
    	}    	 
    }

	@Override
	public int hashCode() {
		return (((getWidth()*10)+getHeight())*10);
	}

	/** Breite. Echt positiv. */
    private final int width;

    /** Hoehe. Echt positiv. */
    private final int height;

    /** Erzeugt ein neues Rechteck mit der gegebenen Groesse.
     * @param width Breite. Echt positiv.
     * @param height Hoehe. Echt positiv.
     */
    public Rectangle(final int width, final int height) {
        if(width < 1)
            throw new IllegalArgumentException("width not strictly positive: " + width);
        if(height < 1)
            throw new IllegalArgumentException("height not strictly positive: " + height);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    /**
     *  eine Methode flip, die das Rechteck um 90⁰ dreht. 
     *  Im gedrehten Rechteck sind Breite und Höhe vertauscht. 
     *  Nach einer geraden Anzahl von Drehungen ist ein Rechteck gleich zum Original.
     * @return Rectangle
     */
    public Rectangle flip(){
    	return new Rectangle(getHeight(), getWidth());
    }
    
    
}