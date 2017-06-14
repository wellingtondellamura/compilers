// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammarPlus.g4 by ANTLR 4.1

import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammarPlusLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, ID=2, INT=3, EQ=4, PLUS=5, MINUS=6, MULT=7, BRACL=8, BRACR=9, 
		NEWLINE=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print'", "ID", "INT", "'='", "'+'", "'-'", "'*'", "'('", "')'", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"PRINT", "ID", "INT", "EQ", "PLUS", "MINUS", "MULT", "BRACL", "BRACR", 
		"NEWLINE", "WS"
	};


	HashMap<String,Integer> memory = new HashMap<String,Integer>();

	void print(Object o){
	   System.out.println(o);
	}



	public MiniGrammarPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGrammarPlus.g4"; }

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
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rA\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\4\6\4&\n"+
		"\4\r\4\16\4\'\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13"+
		"\67\n\13\3\13\3\13\3\f\6\f<\n\f\r\f\16\f=\3\f\3\f\2\r\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\2\3\2\5\4\2C\\"+
		"c|\3\2\62;\4\2\13\13\"\"D\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5 \3\2\2\2\7%\3\2\2\2\t)\3\2\2\2"+
		"\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\66"+
		"\3\2\2\2\27;\3\2\2\2\31\32\7r\2\2\32\33\7t\2\2\33\34\7k\2\2\34\35\7p\2"+
		"\2\35\36\7v\2\2\36\4\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#\6\3\2\2\2$&\t\3\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(\b\3\2\2\2)*\7?\2\2*\n\3\2\2\2+,\7-\2\2,\f\3\2\2\2-.\7/\2\2"+
		".\16\3\2\2\2/\60\7,\2\2\60\20\3\2\2\2\61\62\7*\2\2\62\22\3\2\2\2\63\64"+
		"\7+\2\2\64\24\3\2\2\2\65\67\7\17\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3"+
		"\2\2\289\7\f\2\29\26\3\2\2\2:<\t\4\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>?\3\2\2\2?@\b\f\2\2@\30\3\2\2\2\7\2\"\'\66=";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}