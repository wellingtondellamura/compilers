// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\antlr2018\AntlrTest\antlr-grammars\ProgActions.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RELOP=2, IF=3, THEN=4, ELSE=5, END=6, BEGIN=7, STR=8, READ=9, 
		WRITE=10, VAR=11, MULT=12, SUM=13, MIN=14, DIV=15, OPEN=16, CLOSE=17, 
		EOL=18, NUM=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_cmd = 1, RULE_atrib = 2, RULE_write = 3, RULE_read = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_fact = 7, RULE_if = 8, RULE_cond = 9, 
		RULE_block = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "cmd", "atrib", "write", "read", "expr", "term", "fact", "if", 
			"cond", "block"
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

	@Override
	public String getGrammarFileName() { return "ProgActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    

	public ProgActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(ProgActionsParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(ProgActionsParser.EOL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				cmd();
				setState(23);
				match(EOL);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << WRITE) | (1L << VAR) | (1L << OPEN) | (1L << NUM))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				atrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				write();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				read();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				if();
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

	public static class AtribContext extends ParserRuleContext {
		public Token VAR;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(ProgActionsParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((AtribContext)_localctx).VAR = match(VAR);
			setState(37);
			match(T__0);
			setState(38);
			((AtribContext)_localctx).expr = expr(0);
			Util.atrib((((AtribContext)_localctx).VAR!=null?((AtribContext)_localctx).VAR.getText():null), ((AtribContext)_localctx).expr.value);
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

	public static class WriteContext extends ParserRuleContext {
		public ExprContext expr;
		public Token STR;
		public TerminalNode WRITE() { return getToken(ProgActionsParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(ProgActionsParser.STR, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_write);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(WRITE);
				setState(42);
				((WriteContext)_localctx).expr = expr(0);
				Util.print(((WriteContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(WRITE);
				setState(46);
				((WriteContext)_localctx).STR = match(STR);
				Util.print((((WriteContext)_localctx).STR!=null?((WriteContext)_localctx).STR.getText():null));
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

	public static class ReadContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode READ() { return getToken(ProgActionsParser.READ, 0); }
		public TerminalNode VAR() { return getToken(ProgActionsParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(READ);
			setState(51);
			((ReadContext)_localctx).VAR = match(VAR);
			Util.readSymbol((((ReadContext)_localctx).VAR!=null?((ReadContext)_localctx).VAR.getText():null));
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
		public Double value;
		public ExprContext e1;
		public TermContext term;
		public ExprContext e2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUM() { return getToken(ProgActionsParser.SUM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(ProgActionsParser.MIN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(55);
			((ExprContext)_localctx).term = term(0);
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).term.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(SUM);
						setState(60);
						((ExprContext)_localctx).e2 = expr(4);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).e1.value + ((ExprContext)_localctx).e2.value;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						match(MIN);
						setState(65);
						((ExprContext)_localctx).e2 = expr(3);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).e1.value - ((ExprContext)_localctx).e2.value;
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Double value;
		public TermContext t1;
		public FactContext fact;
		public TermContext t2;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MULT() { return getToken(ProgActionsParser.MULT, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ProgActionsParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			((TermContext)_localctx).fact = fact();
			((TermContext)_localctx).value =  ((TermContext)_localctx).fact.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						match(MULT);
						setState(79);
						((TermContext)_localctx).t2 = term(4);
						((TermContext)_localctx).value =  ((TermContext)_localctx).t1.value * ((TermContext)_localctx).t2.value;
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83);
						match(DIV);
						setState(84);
						((TermContext)_localctx).t2 = term(3);
						((TermContext)_localctx).value =  ((TermContext)_localctx).t1.value / ((TermContext)_localctx).t2.value;
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public Double value;
		public Token NUM;
		public Token VAR;
		public ExprContext expr;
		public TerminalNode NUM() { return getToken(ProgActionsParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(ProgActionsParser.VAR, 0); }
		public TerminalNode OPEN() { return getToken(ProgActionsParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ProgActionsParser.CLOSE, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((FactContext)_localctx).NUM = match(NUM);
				((FactContext)_localctx).value =  Double.parseDouble((((FactContext)_localctx).NUM!=null?((FactContext)_localctx).NUM.getText():null));
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((FactContext)_localctx).VAR = match(VAR);
				((FactContext)_localctx).value =  Util.getValue((((FactContext)_localctx).VAR!=null?((FactContext)_localctx).VAR.getText():null));
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(OPEN);
				setState(97);
				((FactContext)_localctx).expr = expr(0);
				setState(98);
				match(CLOSE);
				((FactContext)_localctx).value =  ((FactContext)_localctx).expr.value;
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

	public static class IfContext extends ParserRuleContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(ProgActionsParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ProgActionsParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProgActionsParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(IF);
				setState(104);
				cond();
				setState(105);
				match(THEN);
				setState(106);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IF);
				setState(109);
				cond();
				setState(110);
				match(THEN);
				setState(111);
				((IfContext)_localctx).b1 = block();
				setState(112);
				match(ELSE);
				setState(113);
				((IfContext)_localctx).b2 = block();
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

	public static class CondContext extends ParserRuleContext {
		public Boolean value;
		public ExprContext expr;
		public Token VAR;
		public Token RELOP;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ProgActionsParser.VAR, 0); }
		public TerminalNode RELOP() { return getToken(ProgActionsParser.RELOP, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((CondContext)_localctx).expr = expr(0);
				((CondContext)_localctx).value =  Util.getBoolean(((CondContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((CondContext)_localctx).VAR = match(VAR);
				setState(121);
				((CondContext)_localctx).RELOP = match(RELOP);
				setState(122);
				((CondContext)_localctx).expr = expr(0);
				((CondContext)_localctx).value =  Util.getBoolean((((CondContext)_localctx).VAR!=null?((CondContext)_localctx).VAR.getText():null), (((CondContext)_localctx).RELOP!=null?((CondContext)_localctx).RELOP.getText():null), ((CondContext)_localctx).expr.value);
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

	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(ProgActionsParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(ProgActionsParser.EOL, i);
		}
		public TerminalNode BEGIN() { return getToken(ProgActionsParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ProgActionsParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgActionsListener ) ((ProgActionsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgActionsVisitor ) return ((ProgActionsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case READ:
			case WRITE:
			case VAR:
			case OPEN:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				cmd();
				setState(128);
				match(EOL);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(BEGIN);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					cmd();
					setState(132);
					match(EOL);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << WRITE) | (1L << VAR) | (1L << OPEN) | (1L << NUM))) != 0) );
				setState(138);
				match(END);
				setState(139);
				match(EOL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\5"+
		"\3%\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7G\n\7\f\7\16\7J\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\6\f\u0089\n\f\r\f\16\f\u008a\3\f\3\f\3\f\5\f\u0090\n\f\3\f"+
		"\2\4\f\16\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0096\2\33\3\2\2\2\4$\3\2"+
		"\2\2\6&\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f8\3\2\2\2\16K\3\2\2\2\20g\3"+
		"\2\2\2\22u\3\2\2\2\24\177\3\2\2\2\26\u008f\3\2\2\2\30\31\5\4\3\2\31\32"+
		"\7\24\2\2\32\34\3\2\2\2\33\30\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\3\3\2\2\2\37%\5\6\4\2 %\5\b\5\2!%\5\n\6\2\"%\5\f\7\2#%\5\22"+
		"\n\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&"+
		"\'\7\r\2\2\'(\7\3\2\2()\5\f\7\2)*\b\4\1\2*\7\3\2\2\2+,\7\f\2\2,-\5\f\7"+
		"\2-.\b\5\1\2.\63\3\2\2\2/\60\7\f\2\2\60\61\7\n\2\2\61\63\b\5\1\2\62+\3"+
		"\2\2\2\62/\3\2\2\2\63\t\3\2\2\2\64\65\7\13\2\2\65\66\7\r\2\2\66\67\b\6"+
		"\1\2\67\13\3\2\2\289\b\7\1\29:\5\16\b\2:;\b\7\1\2;H\3\2\2\2<=\f\5\2\2"+
		"=>\7\17\2\2>?\5\f\7\6?@\b\7\1\2@G\3\2\2\2AB\f\4\2\2BC\7\20\2\2CD\5\f\7"+
		"\5DE\b\7\1\2EG\3\2\2\2F<\3\2\2\2FA\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2I\r\3\2\2\2JH\3\2\2\2KL\b\b\1\2LM\5\20\t\2MN\b\b\1\2N[\3\2\2\2OP\f\5"+
		"\2\2PQ\7\16\2\2QR\5\16\b\6RS\b\b\1\2SZ\3\2\2\2TU\f\4\2\2UV\7\21\2\2VW"+
		"\5\16\b\5WX\b\b\1\2XZ\3\2\2\2YO\3\2\2\2YT\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\\17\3\2\2\2][\3\2\2\2^_\7\25\2\2_h\b\t\1\2`a\7\r\2\2ah\b"+
		"\t\1\2bc\7\22\2\2cd\5\f\7\2de\7\23\2\2ef\b\t\1\2fh\3\2\2\2g^\3\2\2\2g"+
		"`\3\2\2\2gb\3\2\2\2h\21\3\2\2\2ij\7\5\2\2jk\5\24\13\2kl\7\6\2\2lm\5\26"+
		"\f\2mv\3\2\2\2no\7\5\2\2op\5\24\13\2pq\7\6\2\2qr\5\26\f\2rs\7\7\2\2st"+
		"\5\26\f\2tv\3\2\2\2ui\3\2\2\2un\3\2\2\2v\23\3\2\2\2wx\5\f\7\2xy\b\13\1"+
		"\2y\u0080\3\2\2\2z{\7\r\2\2{|\7\4\2\2|}\5\f\7\2}~\b\13\1\2~\u0080\3\2"+
		"\2\2\177w\3\2\2\2\177z\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082\5\4\3\2\u0082"+
		"\u0083\7\24\2\2\u0083\u0090\3\2\2\2\u0084\u0088\7\t\2\2\u0085\u0086\5"+
		"\4\3\2\u0086\u0087\7\24\2\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\7\b\2\2\u008d\u008e\7\24\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0081\3\2\2\2\u008f\u0084\3\2\2\2\u0090\27\3\2\2\2\16\35$\62FHY[gu\177"+
		"\u008a\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}