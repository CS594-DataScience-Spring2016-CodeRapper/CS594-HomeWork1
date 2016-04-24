package Database;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class DbClient extends DbConnect{
	
//	final static Logger logger = LogManager.getLogger(Crawler.class.getName());
	
	public String collection;

	public DbClient(String collection) {

		super("localhost", "27017", "mydata", collection);
		
		

	}

}
