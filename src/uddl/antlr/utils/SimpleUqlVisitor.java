package uddl.antlr.utils;

// Generated from SimpleUql.g by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleUqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleUqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleUqlParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(@NotNull SimpleUqlParser.Start_ruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleUqlParser#o_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO_all(@NotNull SimpleUqlParser.O_allContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleUqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(@NotNull SimpleUqlParser.Select_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleUqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull SimpleUqlParser.Table_nameContext ctx);
}