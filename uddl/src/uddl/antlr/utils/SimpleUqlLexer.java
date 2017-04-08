package uddl.antlr.utils;

// Generated from SimpleUql.g by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleUqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		R_Select=1, O_all=2, R_From=3, EOS=4, Identifier=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"R_Select", "'*'", "R_From", "EOS", "Identifier", "WS"
	};
	public static final String[] ruleNames = {
		"R_Select", "O_all", "R_From", "EOS", "Identifier", "WS"
	};


	public SimpleUqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleUql.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\b,\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5\37\n\5\3\6\6\6\"\n\6\r\6\16\6#\3\7\6"+
		"\7\'\n\7\r\7\16\7(\3\7\3\7\2\b\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\2\3"+
		"\2\16\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2HHhh\4\2TTtt\4\2QQqq"+
		"\4\2OOoo\3\3==\4\2C\\c|\5\2\13\f\17\17\"\"-\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\26\3\2"+
		"\2\2\7\30\3\2\2\2\t\36\3\2\2\2\13!\3\2\2\2\r&\3\2\2\2\17\20\t\2\2\2\20"+
		"\21\t\3\2\2\21\22\t\4\2\2\22\23\t\3\2\2\23\24\t\5\2\2\24\25\t\6\2\2\25"+
		"\4\3\2\2\2\26\27\7,\2\2\27\6\3\2\2\2\30\31\t\7\2\2\31\32\t\b\2\2\32\33"+
		"\t\t\2\2\33\34\t\n\2\2\34\b\3\2\2\2\35\37\t\13\2\2\36\35\3\2\2\2\37\n"+
		"\3\2\2\2 \"\t\f\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\f\3\2\2"+
		"\2%\'\t\r\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\b\7"+
		"\2\2+\16\3\2\2\2\6\2\36#(";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}