package uddl.antlr.utils;

// Generated from SimpleUql.g by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleUqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		R_Select=1, O_ALL=2, R_From=3, EOS=4, ID=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "R_Select", "'*'", "R_From", "EOS", "ID", "WS"
	};
	public static final int
		RULE_start_rule = 0, RULE_select_statement = 1, RULE_o_all = 2, RULE_table_name = 3;
	public static final String[] ruleNames = {
		"start_rule", "select_statement", "o_all", "table_name"
	};

	@Override
	public String getGrammarFileName() { return "SimpleUql.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleUqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Start_ruleContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).exitStart_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUqlVisitor ) return ((SimpleUqlVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode R_From() { return getToken(SimpleUqlParser.R_From, 0); }
		public TerminalNode EOS() { return getToken(SimpleUqlParser.EOS, 0); }
		public O_allContext o_all() {
			return getRuleContext(O_allContext.class,0);
		}
		public TerminalNode R_Select() { return getToken(SimpleUqlParser.R_Select, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUqlVisitor ) return ((SimpleUqlVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(R_Select);
			setState(11); o_all();
			setState(12); match(R_From);
			setState(13); table_name();
			setState(14); match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class O_allContext extends ParserRuleContext {
		public TerminalNode O_ALL() { return getToken(SimpleUqlParser.O_ALL, 0); }
		public O_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).enterO_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).exitO_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUqlVisitor ) return ((SimpleUqlVisitor<? extends T>)visitor).visitO_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final O_allContext o_all() throws RecognitionException {
		O_allContext _localctx = new O_allContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_o_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(O_ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleUqlParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleUqlListener ) ((SimpleUqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleUqlVisitor ) return ((SimpleUqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\b\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\2\6\2\4\6\b\2\2\22\2\n\3\2\2\2\4\f\3\2\2\2\6\22\3\2\2\2\b\24\3\2\2"+
		"\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\7\3\2\2\r\16\5\6\4\2\16\17\7\5\2\2\17"+
		"\20\5\b\5\2\20\21\7\6\2\2\21\5\3\2\2\2\22\23\7\4\2\2\23\7\3\2\2\2\24\25"+
		"\7\7\2\2\25\t\3\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}