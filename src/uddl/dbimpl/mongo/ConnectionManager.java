package uddl.dbimpl.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class ConnectionManager {
	MongoClient mongoClient = null;
	MongoDatabase database = null;
	
	private static ConnectionManager conn = null;
	
	private ConnectionManager(){
		
	}
	
	public static ConnectionManager getInstance() {
		if (conn==null) {
			conn = new ConnectionManager();
			conn.setDBParameters();
		}
		return conn;
	}
	
	private void setDBParameters(){
		mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
	}
	
	public void connect(){
		database = mongoClient.getDatabase("projdb");
	}
	
	public void close(){
		mongoClient.close();
	}
	
	


}
