package uddl.antlr.utils;

// Generated from SimpleUql.g by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleUqlParser}.
 */
public interface SimpleUqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleUqlParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(@NotNull SimpleUqlParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUqlParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(@NotNull SimpleUqlParser.Start_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleUqlParser#o_all}.
	 * @param ctx the parse tree
	 */
	void enterO_all(@NotNull SimpleUqlParser.O_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUqlParser#o_all}.
	 * @param ctx the parse tree
	 */
	void exitO_all(@NotNull SimpleUqlParser.O_allContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleUqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleUqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull SimpleUqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleUqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull SimpleUqlParser.Table_nameContext ctx);
}