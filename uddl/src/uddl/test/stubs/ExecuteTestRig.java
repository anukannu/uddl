package uddl.test.stubs;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import uddl.antlr.utils.SimpleUqlLexer;
import uddl.antlr.utils.SimpleUqlParser;
import uddl.antlr.utils.SimpleUqlParser.Start_ruleContext;

public class ExecuteTestRig {
	
	public static void main(String[] args){
		String stmtString = "Select * from usermaster;";
		showGuiTreeView(stmtString);
	}
	
	private static void showGuiTreeView(final String input){
		final CharStream stream = new ANTLRInputStream(input);
		SimpleUqlLexer lexer = new SimpleUqlLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SimpleUqlParser parser = new SimpleUqlParser(tokens);
		
		//Create a parser tree starting from the first rule
		Start_ruleContext tree = parser.start_rule();
		tree.inspect(parser);
		
		
	}

}
