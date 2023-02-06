// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\antlr2018\AntlrTest\antlr-grammars\ProgActions.g4 by ANTLR 4.9.2

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
public class ProgActionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RELOP=2, IF=3, THEN=4, ELSE=5, END=6, BEGIN=7, STR=8, READ=9, 
		WRITE=10, VAR=11, MULT=12, SUM=13, MIN=14, DIV=15, OPEN=16, CLOSE=17, 
		EOL=18, NUM=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "RELOP", "IF", "THEN", "ELSE", "END", "BEGIN", "STR", "READ", 
			"WRITE", "VAR", "MULT", "SUM", "MIN", "DIV", "OPEN", "CLOSE", "EOL", 
			"NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, null, null, null, null, null, null, null, null, null, 
			"'*'", "'+'", "'-'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "RELOP", "IF", "THEN", "ELSE", "END", "BEGIN", "STR", "READ", 
			"WRITE", "VAR", "MULT", "SUM", "MIN", "DIV", "OPEN", "CLOSE", "EOL", 
			"NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	    


	public ProgActionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProgActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tR\n\t\f\t\16\t"+
		"U\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\ff\n\f\f\f\16\fi\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\6\23x\n\23\r\23\16\23y\3\24\6\24}\n\24\r\24\16\24"+
		"~\3\24\3\24\6\24\u0083\n\24\r\24\16\24\u0084\5\24\u0087\n\24\3\25\6\25"+
		"\u008a\n\25\r\25\16\25\u008b\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\27\4\2>>@@\4\2KKkk\4\2HHhh\4\2VVvv\4\2JJjj\4\2GGgg\4\2PPpp\4\2NN"+
		"nn\4\2UUuu\4\2FFff\4\2DDdd\4\2IIii\7\2\13\13\"\"\62;C\\c|\4\2TTtt\4\2"+
		"CCcc\4\2YYyy\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\3\2\62;\4\2\13\13"+
		"\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\66\3\2"+
		"\2\2\78\3\2\2\2\t;\3\2\2\2\13@\3\2\2\2\rE\3\2\2\2\17I\3\2\2\2\21O\3\2"+
		"\2\2\23X\3\2\2\2\25]\3\2\2\2\27c\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3"+
		"\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'|\3\2\2\2)\u0089\3\2"+
		"\2\2+,\7?\2\2,\4\3\2\2\2-\67\t\2\2\2./\7@\2\2/\67\7?\2\2\60\61\7>\2\2"+
		"\61\67\7?\2\2\62\63\7?\2\2\63\67\7?\2\2\64\65\7#\2\2\65\67\7?\2\2\66-"+
		"\3\2\2\2\66.\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\67\6\3"+
		"\2\2\289\t\3\2\29:\t\4\2\2:\b\3\2\2\2;<\t\5\2\2<=\t\6\2\2=>\t\7\2\2>?"+
		"\t\b\2\2?\n\3\2\2\2@A\t\7\2\2AB\t\t\2\2BC\t\n\2\2CD\t\7\2\2D\f\3\2\2\2"+
		"EF\t\7\2\2FG\t\b\2\2GH\t\13\2\2H\16\3\2\2\2IJ\t\f\2\2JK\t\7\2\2KL\t\r"+
		"\2\2LM\t\3\2\2MN\t\b\2\2N\20\3\2\2\2OS\7$\2\2PR\t\16\2\2QP\3\2\2\2RU\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7$\2\2W\22\3\2\2\2XY"+
		"\t\17\2\2YZ\t\7\2\2Z[\t\20\2\2[\\\t\13\2\2\\\24\3\2\2\2]^\t\21\2\2^_\t"+
		"\17\2\2_`\t\3\2\2`a\t\5\2\2ab\t\7\2\2b\26\3\2\2\2cg\t\22\2\2df\t\23\2"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\30\3\2\2\2ig\3\2\2\2jk\7,"+
		"\2\2k\32\3\2\2\2lm\7-\2\2m\34\3\2\2\2no\7/\2\2o\36\3\2\2\2pq\7\61\2\2"+
		"q \3\2\2\2rs\7*\2\2s\"\3\2\2\2tu\7+\2\2u$\3\2\2\2vx\t\24\2\2wv\3\2\2\2"+
		"xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z&\3\2\2\2{}\t\25\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0086\3\2\2\2\u0080\u0082\7\60\2\2\u0081"+
		"\u0083\t\25\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087(\3\2\2\2\u0088\u008a\t\26\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\b\25\2\2\u008e*\3\2\2\2\13\2\66Sgy~\u0084\u0086\u008b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}