package com.project;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BufferReadPro {

	
		
		public static void main(String args[]) {
			try {
				FileInputStream fin = new FileInputStream("D.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);
				
				ArrayList<Integer> arr = new ArrayList<>();
				
				while(bin.available() > 0)
					arr.add(Character.getNumericValue((char) bin.read()));
				
				for (int i = 0; i < arr.size(); i++) {
					System.out.println("Value " + (i + 1) + ": " + arr.get(i));
				}
				
				for (int i = 0; i < arr.size(); i++) {
					System.out.println("Value " + (i + 1) + ": " + (arr.get(i) + 2));
				}
				HashMap<Integer, String> br = new HashMap<Integer, String>();
				br.put((arr.get(0)) + 2,"three");
				br.put((arr.get(1)) + 2,"four");
				br.put((arr.get(2)) + 2,"five");
				
				System.out.println(br);
				
				
				
				bin.close();
				fin.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
		// TODO Auto-generated method stub
		
		 /*  FileReader fr=new FileReader("A.txt");   
	          
	          BufferedReader br=new BufferedReader(fr);
	          
	          ArrayList<String> listOfLines = new ArrayList<>();

	          String line = br.readLine();
	          while (line != null) {
	            listOfLines.add(line);
	            line = br.readLine();
	          }

	          br.close();
	          
	          
	         

	}

}
*/