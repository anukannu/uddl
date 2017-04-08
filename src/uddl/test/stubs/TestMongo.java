package uddl.test.stubs;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class TestMongo {
	
	public static void main(String[] args){
		
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = client.getDatabase("projdb");
		MongoCollection<Document> collection = database.getCollection("usermaster");
		
		
	}

}
