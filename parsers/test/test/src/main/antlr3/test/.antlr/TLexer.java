// Generated from c:\Users\wellington\Documents\projects\lectures\compilers\parsers\test\test\src\main\antlr3\test\TLexer.g by ANTLR 4.7.1


    package test;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLexer extends AbstractTLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYSER=1, SOZE=2, ADD=3, SEMI=4, ID=5, INT=6, COMMENT=7, WS=8, STRING=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KEYSER", "SOZE", "ADD", "SEMI", "ID", "INT", "COMMENT", "WS", "STRING", 
		"HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Keyser'", "'Soze'", "'+'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYSER", "SOZE", "ADD", "SEMI", "ID", "INT", "COMMENT", "WS", "STRING"
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


	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLexer.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		case 1:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7\6"+
		"\7\66\n\7\r\7\16\7\67\3\b\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3\b\5\b"+
		"D\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\b\3\b\3\b\3\b"+
		"\5\bU\n\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\fj\n\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\3\2\n\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2$$^^\5\2\62;C"+
		"Hch\7\2ddhhppttvv\4\2))^^\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\3\35\3\2\2\2\5$\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r\65"+
		"\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25c\3\2\2\2\27m\3\2\2\2\31"+
		"x\3\2\2\2\33z\3\2\2\2\35\36\7M\2\2\36\37\7g\2\2\37 \7{\2\2 !\7u\2\2!\""+
		"\7g\2\2\"#\7t\2\2#\4\3\2\2\2$%\7U\2\2%&\7q\2\2&\'\7|\2\2\'(\7g\2\2(\6"+
		"\3\2\2\2)*\7-\2\2*\b\3\2\2\2+,\7=\2\2,\n\3\2\2\2-\61\t\2\2\2.\60\t\3\2"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\f\3\2\2\2\63\61"+
		"\3\2\2\2\64\66\4\62;\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3"+
		"\2\2\28\16\3\2\2\29:\7\61\2\2:;\7\61\2\2;?\3\2\2\2<>\n\4\2\2=<\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\7\17\2\2CB\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\7\f\2\2FU\b\b\2\2GH\7\61\2\2HI\7,\2\2IM\3\2\2"+
		"\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2"+
		"\2\2PQ\7,\2\2QR\7\61\2\2RS\3\2\2\2SU\b\b\3\2T9\3\2\2\2TG\3\2\2\2U\20\3"+
		"\2\2\2VW\t\5\2\2WX\b\t\4\2X\22\3\2\2\2Y^\7$\2\2Z]\5\27\f\2[]\n\6\2\2\\"+
		"Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2"+
		"\2ab\7$\2\2b\24\3\2\2\2cd\t\7\2\2d\26\3\2\2\2ei\7^\2\2fj\t\b\2\2gj\3\2"+
		"\2\2hj\t\t\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jn\3\2\2\2kn\5\33\16\2ln\5"+
		"\31\r\2me\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\30\3\2\2\2op\7^\2\2pq\4\62\65\2"+
		"qr\4\629\2ry\4\629\2st\7^\2\2tu\4\629\2uy\4\629\2vw\7^\2\2wy\4\629\2x"+
		"o\3\2\2\2xs\3\2\2\2xv\3\2\2\2y\32\3\2\2\2z{\7^\2\2{|\7w\2\2|}\5\25\13"+
		"\2}~\5\25\13\2~\177\5\25\13\2\177\u0080\5\25\13\2\u0080\34\3\2\2\2\16"+
		"\2\61\67?CMT\\^imx\5\3\b\2\3\b\3\3\t\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}