package com.swarch.aufgabe.idiome.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

import com.swarch.aufgabe.idiome.Block;
import com.swarch.aufgabe.idiome.BlockWHDComparator;
import com.swarch.aufgabe.idiome.Rectangle;
import com.swarch.aufgabe.idiome.RectangleWHComparator;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("\t**** Startet Test ****\n");
		//Test des hashCode()
		System.out.println("Test hasCode():");
		final Rectangle rect1 = new Rectangle(300,400);
		final Rectangle rectIdenticalRect1 = new Rectangle(300,400);
		final Rectangle rectIdenticalRect12 = new Rectangle(300,400);
		final Rectangle otherRect = new Rectangle(100, 200);
		System.out.println("Identische Objects hasCode: " + rect1.hashCode() + ", anderes indentisches Objcet: " + rectIdenticalRect1.hashCode());
		System.out.println("Other object hasCode: " + otherRect.hashCode());
		System.out.println("\nEquals-Methode des Basisklasses Objects:");
		System.out.println("ist null? - rect1.equals(null): " + rect1.equals(null));
		System.out.println("Reflexivität true: " +  rect1.equals(rect1));
		System.out.println("Symmetric true true: " + rect1.equals(rectIdenticalRect1)+ ", " + rectIdenticalRect1.equals(rect1));
		System.out.println("Symmetric false false: " + rect1.equals(otherRect) + ", " + otherRect.equals(rect1));
		System.out.println("Transitivität true true true: "+rect1.equals(rectIdenticalRect1)+", "+rectIdenticalRect1.equals(rectIdenticalRect12)+", "+rect1.equals(rectIdenticalRect12));
		System.out.println("Mit einem anderen Objcect false: " + rect1.equals(new Object()));
		System.out.println("\nUnterklass Vergleich: ");
		System.out.println("Einfache Vergleich mit anderem Object false: " + rect1.equals(otherRect));
		final Block block1 = new Block(300,400,500);
		final Block blockIdenticalBlock1 = new Block(300,400,500);
		final Block blockIdenticalBlock12 = new Block(300,400,500);
		final Block block2 = new Block(100,200,300);
		System.out.println("Identische Objects hasCode: " + block1.hashCode() + ", anderes indentisches Objcet: " + blockIdenticalBlock1.hashCode());
		System.out.println("Other object hasCode: " + block2.hashCode());
		System.out.println("\nEquals-Methode des Unterclasses Objects:");
		System.out.println("ist null? - rect1.equals(null): " + block1.equals(null));
		System.out.println("Reflexivität true: " +  block1.equals(block1));
		System.out.println("Symmetric true true: " + block1.equals(blockIdenticalBlock1)+ ", " + blockIdenticalBlock1.equals(block1));
		System.out.println("Symmetric false false: " + block1.equals(block2) + ", " + block2.equals(block1));
		System.out.println("Transitivität true true true: "+block1.equals(blockIdenticalBlock1)+", "+blockIdenticalBlock1.equals(blockIdenticalBlock12)+", "+block1.equals(blockIdenticalBlock12));
		System.out.println("Mit einem anderen Objcect false: " + rect1.equals(block1));
		System.out.println("Mit einem anderen Objcect false: " + block1.equals(rect1));
		System.out.println("Einfache Vergleich mit anderem Object false: " + block1.equals(block2));
		System.out.println("\nflip() Methode echtes Rectangle width: " + rect1.getWidth() + ", hight: " + rect1.getHeight());
		final Rectangle flippedRect1 = rect1.flip();
		System.out.println("Flipped rectangle 1 width: " + flippedRect1.getWidth() + ", hight: " + flippedRect1.getHeight());
		System.out.println("\nflip() Methode echtes Bloock width: " + block1.getWidth() + ", hight: " + block1.getHeight() + ", depth: " + block1.getDepth());
		final Block flippedBlock1 = block1.flip();
		System.out.println("Flipped block1 width: " + flippedBlock1.getWidth() + ", hight: " + flippedBlock1.getHeight() + ", depth: " + flippedBlock1.getDepth());
		System.out.println("\nKomparator - Rectangle Test:");
		final Comparator<Rectangle> rectComp = new RectangleWHComparator();
		System.out.println("Test selbst: " + rectComp.compare(rect1, new Rectangle(300,500)));
		System.out.println("Haupt comparator test: ");
		final BlockWHDComparator blockComparator = new BlockWHDComparator();
		final Block kleinstesBlock = new Block(100,100,100);
		final Block kleinstesBlockWidhtGrosse = new Block(150,50,100);
		final Block kleinstesBlockHightGrosse = new Block(100,150,100);
		final Block kleinstesBlockDepthGrosse = new Block(100,100,150);
		final Block kleinesBlock = new Block(200,200,200);
		final Block groestesBlock = new Block(300,300,300);
		final TreeSet<Block> treeSetBlocks = new TreeSet<Block>(blockComparator);
//		treeSetBlocks.add(kleinstesBlockWidhtGrosse);
//		treeSetBlocks.add(kleinstesBlockHightGrosse);
		
		treeSetBlocks.add(kleinstesBlockDepthGrosse);
		treeSetBlocks.add(kleinstesBlock);
//		treeSetBlocks.add(kleinesBlock);
//		treeSetBlocks.add(groestesBlock);
//		treeSetBlocks.add(new Block(100, 100, 250));
//		treeSetBlocks.add(new Block(100, 100, 200));
		System.out.println("size of TreeSet: " + treeSetBlocks.size());
		System.out.println(("Test kleinstesBlockDepthGrosse und kleinstesBlock: " + blockComparator.compare(kleinstesBlock, kleinstesBlockDepthGrosse)));
		
		
		for(Block b: treeSetBlocks){
			System.out.println("width: " + b.getWidth() + ", hight: " + b.getHeight() + ", depth: " + b.getDepth());
		}
		System.out.println("\nUnsortierte Ausgabe des Blocks: ");
		Block[] blocke = {groestesBlock,kleinstesBlockHightGrosse,kleinstesBlock,kleinstesBlockWidhtGrosse,kleinstesBlockDepthGrosse,kleinesBlock};
		for(Block b: blocke){
			System.out.println("width: " + b.getWidth() + ", hight: " + b.getHeight() + ", depth: " + b.getDepth());
		}
		Arrays.sort(blocke, blockComparator);
		System.out.println("Sortierte Arrays Blocke: ");
		for(Block b: blocke){
			System.out.println("width: " + b.getWidth() + ", hight: " + b.getHeight() + ", depth: " + b.getDepth());
		}
		System.out.println(blockComparator.compare(kleinstesBlock, kleinstesBlockDepthGrosse));
		System.out.println();
		System.out.println("\t**** Random test ****");
		final Random random = new Random();
		treeSetBlocks.clear();
		for(int i = 0; i<10; i++){
			treeSetBlocks.add(new Block(random.nextInt(6)+1, random.nextInt(6)+1, random.nextInt(45)+1));
		}
		for(Block b: treeSetBlocks){
			System.out.println("w: " + b.getWidth() + ", h: " + b.getHeight() + ", d: " + b.getDepth());
		}
		System.out.println("\t**** end Test ****");
	}
		
	

}
