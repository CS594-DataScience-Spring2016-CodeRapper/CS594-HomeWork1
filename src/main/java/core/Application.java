package core;

import java.io.IOException;

import DataReader.CsvReader;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi");
		
		CsvReader r1 = new CsvReader();
		
		try {
			
			r1.parseData("C:/Users/genus_000/Desktop/Spring 2016/CS594-Big Data/Production_Crops_E_All_Data_(Norm)/Production_Crops_E_All_Data_(Norm).csv");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
