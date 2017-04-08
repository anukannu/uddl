package uddl.qryparser.util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import uddl.antlr.utils.SimpleUqlBaseListener;
import uddl.antlr.utils.SimpleUqlParser;

public class SqlListener extends SimpleUqlBaseListener
{
	@Override public void enterStart_rule(@NotNull SimpleUqlParser.Start_ruleContext ctx) { 
		printCurrentMethodName();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStart_rule(@NotNull SimpleUqlParser.Start_ruleContext ctx) {
		printCurrentMethodName();
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx) { 
		printCurrentMethodName();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx) { 
		printCurrentMethodName();
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { 
		printCurrentMethodName();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { 
		printCurrentMethodName();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { 
		printCurrentMethodName();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { 
		printCurrentMethodName();
	}
	
	
	private void printCurrentMethodName(){
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		System.out.println("I am @ " + stackTraceElements[1].toString() );
		
		
	}

}
