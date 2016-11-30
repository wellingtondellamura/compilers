// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammar_v1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammar_v1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, PLUS=2, MINUS=3, MULT=4, DIV=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "NUM", "'+'", "'-'", "'*'", "'/'", "WS"
	};
	public static final int
		RULE_init = 0, RULE_expr = 1, RULE_mult = 2;
	public static final String[] ruleNames = {
		"init", "expr", "mult"
	};

	@Override
	public String getGrammarFileName() { return "MiniGrammar_v1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGrammar_v1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
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
			setState(6); expr();
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
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
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
			setState(19);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8); mult();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9); mult();
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					setState(14);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(10); match(PLUS);
						setState(11); mult();
						}
						break;
					case MINUS:
						{
						setState(12); match(MINUS);
						setState(13); mult();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(18);
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

	public static class MultContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(MiniGrammar_v1Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiniGrammar_v1Parser.NUM, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mult);
		int _la;
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(NUM);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); match(NUM);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIV) {
					{
					setState(27);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(23); match(MULT);
						setState(24); match(NUM);
						}
						break;
					case DIV:
						{
						setState(25); match(DIV);
						setState(26); match(NUM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(31);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\b%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\5\3\26\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\5\4#\n\4"+
		"\3\4\2\5\2\4\6\2\2\'\2\b\3\2\2\2\4\25\3\2\2\2\6\"\3\2\2\2\b\t\5\4\3\2"+
		"\t\3\3\2\2\2\n\26\5\6\4\2\13\22\5\6\4\2\f\r\7\4\2\2\r\21\5\6\4\2\16\17"+
		"\7\5\2\2\17\21\5\6\4\2\20\f\3\2\2\2\20\16\3\2\2\2\21\24\3\2\2\2\22\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\25\n\3\2\2\2\25\13"+
		"\3\2\2\2\26\5\3\2\2\2\27#\7\3\2\2\30\37\7\3\2\2\31\32\7\6\2\2\32\36\7"+
		"\3\2\2\33\34\7\7\2\2\34\36\7\3\2\2\35\31\3\2\2\2\35\33\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!\37\3\2\2\2\"\27\3\2\2\2\"\30"+
		"\3\2\2\2#\7\3\2\2\2\b\20\22\25\35\37\"";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}