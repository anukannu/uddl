package uddl.qryparser.util;

import org.antlr.v4.runtime.misc.NotNull;

import uddl.antlr.utils.SimpleUqlBaseVisitor;
import uddl.antlr.utils.SimpleUqlParser;

public class MongoVisitor extends SimpleUqlBaseVisitor<Void> 
{
	StringBuilder mongoQuery = new StringBuilder();
	
	@Override public Void visitSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx) {
		mongoQuery.append("db.collection.find");
		printCurrentMethodName();
		return visitChildren(ctx); 
		}
	
	@Override public Void visitO_all(@NotNull SimpleUqlParser.O_allContext ctx) {
		mongoQuery.append("()");
		printCurrentMethodName();
		return visitChildren(ctx); 
		}

	private void printCurrentMethodName(){
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		System.out.println("$$ " + stackTraceElements[1].toString() );
		System.out.println("qry : " + mongoQuery.toString());
		
	}
	
}
