// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammar_v3.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammar_v3Parser extends Parser {
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
	public String getGrammarFileName() { return "MiniGrammar_v3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGrammar_v3Parser(TokenStream input) {
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
			setState(6); ((InitContext)_localctx).expr = expr();
			System.out.println("Resultado: " + (((InitContext)_localctx).expr!=null?_input.getText(((InitContext)_localctx).expr.start,((InitContext)_localctx).expr.stop):null)+"="+((InitContext)_localctx).expr.value);
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
		public MultContext m1;
		public MultContext m2;
		public MultContext m3;
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
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9); ((ExprContext)_localctx).m1 = mult();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).m1.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); ((ExprContext)_localctx).m1 = mult();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).m1.value;
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					setState(22);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(14); match(PLUS);
						setState(15); ((ExprContext)_localctx).m2 = mult();
						_localctx.value += ((ExprContext)_localctx).m2.value;
						}
						break;
					case MINUS:
						{
						setState(18); match(MINUS);
						setState(19); ((ExprContext)_localctx).m3 = mult();
						_localctx.value -= ((ExprContext)_localctx).m3.value;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println(_input.getText(_localctx.start, _input.LT(-1))+"="+_localctx.value);
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
		public Integer value;
		public Token n1;
		public Token n2;
		public Token n3;
		public List<TerminalNode> NUM() { return getTokens(MiniGrammar_v3Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiniGrammar_v3Parser.NUM, i);
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
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); ((MultContext)_localctx).n1 = match(NUM);
				((MultContext)_localctx).value =  Integer.parseInt((((MultContext)_localctx).n1!=null?((MultContext)_localctx).n1.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); ((MultContext)_localctx).n1 = match(NUM);
				((MultContext)_localctx).value =  Integer.parseInt((((MultContext)_localctx).n1!=null?((MultContext)_localctx).n1.getText():null));
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIV) {
					{
					setState(41);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(35); match(MULT);
						setState(36); ((MultContext)_localctx).n2 = match(NUM);
						_localctx.value *= Integer.parseInt((((MultContext)_localctx).n2!=null?((MultContext)_localctx).n2.getText():null));
						}
						break;
					case DIV:
						{
						setState(38); match(DIV);
						setState(39); ((MultContext)_localctx).n3 = match(NUM);
						_localctx.value /= Integer.parseInt((((MultContext)_localctx).n3!=null?((MultContext)_localctx).n3.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println(_input.getText(_localctx.start, _input.LT(-1))+"="+_localctx.value);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\b\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\5\4\62\n\4\3\4\2\5"+
		"\2\4\6\2\2\66\2\b\3\2\2\2\4\37\3\2\2\2\6\61\3\2\2\2\b\t\5\4\3\2\t\n\b"+
		"\2\1\2\n\3\3\2\2\2\13\f\5\6\4\2\f\r\b\3\1\2\r \3\2\2\2\16\17\5\6\4\2\17"+
		"\32\b\3\1\2\20\21\7\4\2\2\21\22\5\6\4\2\22\23\b\3\1\2\23\31\3\2\2\2\24"+
		"\25\7\5\2\2\25\26\5\6\4\2\26\27\b\3\1\2\27\31\3\2\2\2\30\20\3\2\2\2\30"+
		"\24\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34"+
		"\32\3\2\2\2\35\36\b\3\1\2\36 \3\2\2\2\37\13\3\2\2\2\37\16\3\2\2\2 \5\3"+
		"\2\2\2!\"\7\3\2\2\"\62\b\4\1\2#$\7\3\2\2$-\b\4\1\2%&\7\6\2\2&\'\7\3\2"+
		"\2\',\b\4\1\2()\7\7\2\2)*\7\3\2\2*,\b\4\1\2+%\3\2\2\2+(\3\2\2\2,/\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\62\b\4\1\2\61!\3\2\2"+
		"\2\61#\3\2\2\2\62\7\3\2\2\2\b\30\32\37+-\61";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}