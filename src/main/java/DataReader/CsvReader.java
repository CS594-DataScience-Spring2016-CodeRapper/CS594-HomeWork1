package DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvReader {
	
	
	public void parseData(String CsvFile) throws IOException
	
	{
//		private static final String [] FILE_HEADER_MAPPING = {"id","firstName","lastName","gender","age"};
		
		CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader();
		FileReader fileReader = new FileReader(CsvFile);

//		CSVParser parser = CSVParser.parse(csvData, CSVFormat.EXCEL.withHeader());  //CSVFormat.RFC4180
		
		CSVParser parser = new CSVParser(fileReader, csvFileFormat);
		for (CSVRecord csvRecord : parser) {
		     
			System.out.println(csvRecord);
		}
		
		
		/*
		 * 
		final URL url = descriptionCsvFile.toURL();
		final Reader reader = new InputStreamReader(new BOMInputStream(url.openStream()));
		final CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL.withHeader());
		try {
			for (final CSVRecord record : parser) {

				String id = record.get("product_uid");
				String des = record.get("product_description");
				// System.out.println(pidStr + " *** " + desStr);
				Product p = new Product(Long.parseLong(id), des, Maps.newHashMap());
				data.put(Long.parseLong(id), p);
			}
		} finally {
			parser.close();
			reader.close();
		}

		 */
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CsvReader r1 = new CsvReader();
		
		r1.parseData("C:/Users/genus_000/Desktop/Spring 2016/CS594-Big Data/Production_Crops_E_All_Data_(Norm)/Production_Crops_E_All_Data_(Norm).csv");
			
	}

}
