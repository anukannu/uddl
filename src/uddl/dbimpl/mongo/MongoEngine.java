package uddl.dbimpl.mongo;

public class MongoEngine {
	
	private String statement = null;
	
	ConnectionManager conn = null;

	public MongoEngine(String stmt){
		this.statement = stmt;
		conn = ConnectionManager.getInstance();
		
	}
	
	public execute(){
		conn.connect();
		
		conn.close();
	}
}
