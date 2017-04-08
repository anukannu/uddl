package uddl.test.stubs;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import uddl.antlr.utils.SimpleUqlLexer;
import uddl.antlr.utils.SimpleUqlParser;
import uddl.antlr.utils.SimpleUqlParser.Start_ruleContext;
import uddl.qryparser.util.SqlListener;

public class ExecuteUqlParser {
	
	String input = null;
	
	public ExecuteUqlParser(String parmInput){
		this.input = parmInput;
	}
	
	public void parse() {
	
		//getLexer 
		final CharStream stream = new ANTLRInputStream(input);
		SimpleUqlLexer lexer = new SimpleUqlLexer(stream);
		
		//Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		//pass tokens to the parser
		SimpleUqlParser parser = new SimpleUqlParser(tokens);
		
		//specify Entrypoint
		Start_ruleContext startRuleContext = parser.start_rule();
		
		
		//walk it and attach the listener
		ParseTreeWalker walker = new ParseTreeWalker();
		SqlListener listener = new SqlListener();
		walker.walk(listener, startRuleContext);
	}
	
	public static void main(String[] args) {
		
		String statement = "Select * from usermaster ;";
		ExecuteUqlParser uqlParser = new ExecuteUqlParser(statement);
		uqlParser.parse();
		
		System.out.println("Completed");
	}
	
	

}
