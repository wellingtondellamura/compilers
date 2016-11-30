// Generated from /home/wellington/projects/aulas/compilers-codes-samples/antlr/translation/MiniGrammarPlus.g4 by ANTLR 4.1

import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGrammarPlusParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, ID=2, INT=3, EQ=4, PLUS=5, MINUS=6, MULT=7, BRACL=8, BRACR=9, 
		NEWLINE=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'print'", "ID", "INT", "'='", "'+'", "'-'", "'*'", "'('", 
		"')'", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_atom = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "multExpr", "atom"
	};

	@Override
	public String getGrammarFileName() { return "MiniGrammarPlus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	HashMap<String,Integer> memory = new HashMap<String,Integer>();

	void print(Object o){
	   System.out.println(o);
	}


	public MiniGrammarPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << ID) | (1L << INT) | (1L << BRACL) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public int value;
		public ExprContext expr;
		public Token ID;
		public TerminalNode ID() { return getToken(MiniGrammarPlusParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(MiniGrammarPlusParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniGrammarPlusParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); ((StatContext)_localctx).expr = expr();
				setState(16); match(NEWLINE);
				_localctx.value = ((StatContext)_localctx).expr.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); ((StatContext)_localctx).ID = match(ID);
				setState(20); match(EQ);
				setState(21); ((StatContext)_localctx).expr = expr();
				setState(22); match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), new Integer(((StatContext)_localctx).expr.value));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); match(PRINT);
				setState(26); match(BRACL);
				setState(27); ((StatContext)_localctx).ID = match(ID);
				setState(28); match(BRACR);
				print(memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30); match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); ((ExprContext)_localctx).e = multExpr();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(35); match(PLUS);
					setState(36); ((ExprContext)_localctx).e = multExpr();
					_localctx.value += ((ExprContext)_localctx).e.value;
					}
					break;
				case MINUS:
					{
					setState(39); match(MINUS);
					setState(40); ((ExprContext)_localctx).e = multExpr();
					_localctx.value -= ((ExprContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MultExprContext extends ParserRuleContext {
		public int value;
		public AtomContext e;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); ((MultExprContext)_localctx).e = atom();
			((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).e.value;
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(50); match(MULT);
				setState(51); ((MultExprContext)_localctx).e = atom();
				_localctx.value *= ((MultExprContext)_localctx).e.value;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(MiniGrammarPlusParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniGrammarPlusParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); ((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); ((AtomContext)_localctx).ID = match(ID);

				            Integer v = memory.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				            if ( v!=null ) 
				                ((AtomContext)_localctx).value =  v;
				            else 
				                System.err.println("undefined variable "+(((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        
				}
				break;
			case BRACL:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); match(BRACL);
				setState(64); ((AtomContext)_localctx).expr = expr();
				setState(65); match(BRACR);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).expr.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\rI\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6G\n\6\3\6\2\7\2\4\6\b\n\2\2L\2\r\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b\62"+
		"\3\2\2\2\nF\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2"+
		"\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\f\2\2\23\24\b\3\1"+
		"\2\24\"\3\2\2\2\25\26\7\4\2\2\26\27\7\6\2\2\27\30\5\6\4\2\30\31\7\f\2"+
		"\2\31\32\b\3\1\2\32\"\3\2\2\2\33\34\7\3\2\2\34\35\7\n\2\2\35\36\7\4\2"+
		"\2\36\37\7\13\2\2\37\"\b\3\1\2 \"\7\f\2\2!\21\3\2\2\2!\25\3\2\2\2!\33"+
		"\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\5\b\5\2$/\b\4\1\2%&\7\7\2\2&\'\5\b\5"+
		"\2\'(\b\4\1\2(.\3\2\2\2)*\7\b\2\2*+\5\b\5\2+,\b\4\1\2,.\3\2\2\2-%\3\2"+
		"\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2"+
		"\2\2\62\63\5\n\6\2\63:\b\5\1\2\64\65\7\t\2\2\65\66\5\n\6\2\66\67\b\5\1"+
		"\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<:"+
		"\3\2\2\2=>\7\5\2\2>G\b\6\1\2?@\7\4\2\2@G\b\6\1\2AB\7\n\2\2BC\5\6\4\2C"+
		"D\7\13\2\2DE\b\6\1\2EG\3\2\2\2F=\3\2\2\2F?\3\2\2\2FA\3\2\2\2G\13\3\2\2"+
		"\2\b\17!-/:F";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}