// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/csvparser/CSV.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, TEXT=4, STRING=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'\n'", "'\r'", "','", "TEXT", "STRING"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "TEXT", "STRING"
	};


	public CSVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSV.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\7#\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\25\n\5"+
		"\r\5\16\5\26\3\6\3\6\3\6\3\6\7\6\35\n\6\f\6\16\6 \13\6\3\6\3\6\2\7\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\3\2\4\6\2\f\f\17\17$$..\3\2$$%\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\17\3\2"+
		"\2\2\7\21\3\2\2\2\t\24\3\2\2\2\13\30\3\2\2\2\r\16\7\f\2\2\16\4\3\2\2\2"+
		"\17\20\7\17\2\2\20\6\3\2\2\2\21\22\7.\2\2\22\b\3\2\2\2\23\25\n\2\2\2\24"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\n\3\2\2\2\30"+
		"\36\7$\2\2\31\32\7$\2\2\32\35\7$\2\2\33\35\n\3\2\2\34\31\3\2\2\2\34\33"+
		"\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2"+
		"\2!\"\7$\2\2\"\f\3\2\2\2\6\2\26\34\36";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}