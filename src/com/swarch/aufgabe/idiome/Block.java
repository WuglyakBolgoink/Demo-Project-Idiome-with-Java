package com.swarch.aufgabe.idiome;

/* (C) 2013, R. Schiedermeier, rs@cs.hm.edu
 * Oracle Corporation Java 1.7.0, Linux i386 2.6.32.58
 * emma (Intel Core i7 CPU 920/2668 MHz, 8 Cores, 24320 MB RAM)
 */
/** Unveraenderlicher Quader.
 * @author Reinhard Schiedermeier, rs@cs.hm.edu
 * @version 2010-11-04
 */
public class Block extends Rectangle {
    /** Tiefe. Echt positiv. */
    private final int depth;

    @Override
	public boolean equals(Object o) {
    	if (this == o) {return true;}
    	if(o == null){return false;}
    	if (o instanceof Rectangle){
	        if (getClass() != o.getClass()) {return false;}                 
	        final Block that = (Block) o;         
	        return ((getDepth() != that.getDepth()) || (getHeight() != that.getHeight()) || (getWidth() != that.getWidth())) ? false : true;
    	} else {
    	 return false;
    	}
    }

	@Override
	public int hashCode() {		
		return (((getWidth()*10)+getHeight())*10)-getDepth();
	}

	/** Erzeugt einen neuen Quader mit der gegebenen Groesse.
     * @param width Breite. Echt positiv.
     * @param height Hoehe. Echt positiv.
     * @param depth Tiefe. Echt positiv.
     */
    public Block(final int width, final int height, final int depth) {
        super(width, height);
        if(depth < 1)
            throw new IllegalArgumentException("depth not strictly positive: " + depth);
        this.depth = depth;
    }

    public int getDepth() {    	
        return depth;
    }

	@Override
	public Block flip() {		
		return new Block(getHeight(), getWidth(), depth);
	}

}