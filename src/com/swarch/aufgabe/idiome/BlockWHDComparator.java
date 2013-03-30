/**
 * 
 */
package com.swarch.aufgabe.idiome;

import java.util.Comparator;

/**
 * @author cyberkatze
 * BlockWHDComparator
 * sortiert Quader zuerst nach Breite, dann nach Höhe und zuletzt nach Tiefe.
 */
public class BlockWHDComparator implements Comparator<Block> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Block a, Block b) {
		return (a.getWidth()>b.getWidth()) ? 1 : (a.getWidth() == b.getWidth()) ? (a.getHeight()>b.getHeight()) ? 1 : (a.getHeight()==b.getHeight()) ? (a.getDepth() > b.getDepth()) ? 1: (a.getDepth() == b.getDepth()) ? 0 : -1 : -1 : -1;		
	}

}
