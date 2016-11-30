// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammar_v2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammar_v2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, PLUS=2, MINUS=3;
	public static final String[] tokenNames = {
		"<INVALID>", "NUM", "'+'", "'-'"
	};
	public static final int
		RULE_init = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"init", "expr"
	};

	@Override
	public String getGrammarFileName() { return "MiniGrammar_v2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGrammar_v2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ((InitContext)_localctx).expr = expr();
			System.out.println(((InitContext)_localctx).expr.value);
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

	public static class ExprContext extends ParserRuleContext {
		public Integer value;
		public Token NUM;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NUM() { return getTokens(MiniGrammar_v2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiniGrammar_v2Parser.NUM, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(7); ((ExprContext)_localctx).NUM = match(NUM);
				((ExprContext)_localctx).value =  Integer.valueOf((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9); ((ExprContext)_localctx).n1 = match(NUM);
				((ExprContext)_localctx).value =  Integer.valueOf((((ExprContext)_localctx).n1!=null?((ExprContext)_localctx).n1.getText():null));
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					setState(17);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(11); match(PLUS);
						setState(12); ((ExprContext)_localctx).n2 = match(NUM);
						_localctx.value += Integer.valueOf((((ExprContext)_localctx).n2!=null?((ExprContext)_localctx).n2.getText():null));
						}
						break;
					case MINUS:
						{
						setState(14); match(MINUS);
						setState(15); ((ExprContext)_localctx).n2 = match(NUM);
						_localctx.value -= Integer.valueOf((((ExprContext)_localctx).n2!=null?((ExprContext)_localctx).n2.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\5\33\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f"+
		"\3\16\3\27\13\3\5\3\31\n\3\3\3\2\4\2\4\2\2\33\2\6\3\2\2\2\4\30\3\2\2\2"+
		"\6\7\5\4\3\2\7\b\b\2\1\2\b\3\3\2\2\2\t\n\7\3\2\2\n\31\b\3\1\2\13\f\7\3"+
		"\2\2\f\25\b\3\1\2\r\16\7\4\2\2\16\17\7\3\2\2\17\24\b\3\1\2\20\21\7\5\2"+
		"\2\21\22\7\3\2\2\22\24\b\3\1\2\23\r\3\2\2\2\23\20\3\2\2\2\24\27\3\2\2"+
		"\2\25\23\3\2\2\2\25\26\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\30\t\3\2\2"+
		"\2\30\13\3\2\2\2\31\5\3\2\2\2\5\23\25\30";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}