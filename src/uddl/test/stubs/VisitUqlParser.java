package uddl.test.stubs;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import uddl.antlr.utils.SimpleUqlLexer;
import uddl.antlr.utils.SimpleUqlParser;
import uddl.qryparser.util.MongoVisitor;

public class VisitUqlParser {
	
	private String input=null;
	
	public static void main(String[] args) {
		String statement = "Select * from usermaster ;";
		VisitUqlParser uqlParser = new VisitUqlParser(statement);
		uqlParser.parse();
		
		System.out.println("Completed");
		
	}
	
	public VisitUqlParser(String inStmt){
		this.input = inStmt;
	}
	
	private void parse(){

		//getLexer 
		final CharStream stream = new ANTLRInputStream(input);
		SimpleUqlLexer lexer = new SimpleUqlLexer(stream);
		
		//Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		//pass tokens to the parser
		SimpleUqlParser parser = new SimpleUqlParser(tokens);
		
		ParseTree tree = parser.start_rule();
		MongoVisitor visitor = new MongoVisitor();
		visitor.visit(tree);
		
	
	}

}
