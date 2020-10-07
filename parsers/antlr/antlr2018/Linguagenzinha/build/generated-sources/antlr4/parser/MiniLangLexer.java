// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2018\Linguagenzinha\grammar\parser\MiniLang.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, IF=2, ELSE=3, PRINT=4, READ=5, STRING=6, VAR=7, SUM=8, EQUALS=9, 
		B_EXPR=10, E_EXPR=11, B_BLOCK=12, E_BLOCK=13, EOL=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUM", "IF", "ELSE", "PRINT", "READ", "STRING", "VAR", "SUM", "EQUALS", 
		"B_EXPR", "E_EXPR", "B_BLOCK", "E_BLOCK", "EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'print'", "'read'", null, null, "'+'", 
		"'='", "'('", "')'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "IF", "ELSE", "PRINT", "READ", "STRING", "VAR", "SUM", "EQUALS", 
		"B_EXPR", "E_EXPR", "B_BLOCK", "E_BLOCK", "EOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\7\3\7\3\b\6\bD\n\b\r\b\16"+
		"\bE\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21\3\2\6\3\2\62;\6\2\f\f\17\17$$^^\4\2C\\c|\4"+
		"\2\13\f\"\"[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3"+
		"\2\2\2\5&\3\2\2\2\7)\3\2\2\2\t.\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17C\3"+
		"\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33"+
		"Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%\4\3\2\2\2&\'\7k\2\2\'(\7h\2\2(\6\3\2\2\2)*\7g\2\2*+"+
		"\7n\2\2+,\7u\2\2,-\7g\2\2-\b\3\2\2\2./\7r\2\2/\60\7t\2\2\60\61\7k\2\2"+
		"\61\62\7p\2\2\62\63\7v\2\2\63\n\3\2\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67"+
		"\7c\2\2\678\7f\2\28\f\3\2\2\29=\7$\2\2:<\n\3\2\2;:\3\2\2\2<?\3\2\2\2="+
		";\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7$\2\2A\16\3\2\2\2BD\t\4\2\2"+
		"CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\20\3\2\2\2GH\7-\2\2H\22\3\2"+
		"\2\2IJ\7?\2\2J\24\3\2\2\2KL\7*\2\2L\26\3\2\2\2MN\7+\2\2N\30\3\2\2\2OP"+
		"\7}\2\2P\32\3\2\2\2QR\7\177\2\2R\34\3\2\2\2ST\7=\2\2T\36\3\2\2\2UV\t\5"+
		"\2\2VW\3\2\2\2WX\b\20\2\2X \3\2\2\2\6\2$=E\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}