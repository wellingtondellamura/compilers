// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammar_v2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammar_v2Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, PLUS=2, MINUS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUM", "'+'", "'-'"
	};
	public static final String[] ruleNames = {
		"NUM", "PLUS", "MINUS"
	};


	public MiniGrammar_v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGrammar_v2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\5\22\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\4\3\4\2\5\3\3\1\5"+
		"\4\1\7\5\1\3\2\3\3\2\62;\22\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3"+
		"\2\2\2\5\16\3\2\2\2\7\20\3\2\2\2\t\13\t\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2"+
		"\f\n\3\2\2\2\f\r\3\2\2\2\r\4\3\2\2\2\16\17\7-\2\2\17\6\3\2\2\2\20\21\7"+
		"/\2\2\21\b\3\2\2\2\4\2\f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}