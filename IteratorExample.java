package iterator;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorExample {
	public static void main(String[]args) {
		
		ArrayList<String> alph= new ArrayList <String>();
		
		alph.add("A");
		alph.add("B");
		alph.add("C");
		alph.add("D");
		alph.add("E");
		alph.add("F");
		alph.add("G");
		alph.add("H");
		alph.add("I");
		alph.add("J");
		alph.add("K");
		alph.add("L");
		alph.add("M");
		alph.add("N");
		alph.add("O");
		alph.add("P");
		alph.add("Q");
		alph.add("R");
		alph.add("S");
		alph.add("T");
		alph.add("U");
		alph.add("V");
		alph.add("W");
		alph.add("X");
		alph.add("Y");
		alph.add("Z");
		
		Iterator<String> it= alph.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		
		}
		
		
	}

}
