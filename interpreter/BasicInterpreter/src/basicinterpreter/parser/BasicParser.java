// Generated from Basic.g4 by ANTLR 4.7.2

package basicInterpreter.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, READ=4, WRITE=5, IF=6, ELSE=7, STR=8, NUM=9, 
		VAR=10, GR=11, LS=12, EQ=13, GRT=14, LST=15, NEQ=16, ATR=17, OEX=18, CEX=19, 
		OBL=20, CBL=21, NOT=22, ADD=23, SUB=24, MUL=25, DIV=26, MOD=27, EOL=28, 
		COMMENT=29, LINE_COMMENT=30, WS=31;
	public static final int
		RULE_progr = 0, RULE_line = 1, RULE_read = 2, RULE_write = 3, RULE_atr = 4, 
		RULE_ifstm = 5, RULE_expr = 6, RULE_term = 7, RULE_fact = 8, RULE_boolExpr = 9, 
		RULE_relop = 10, RULE_block = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"progr", "line", "read", "write", "atr", "ifstm", "expr", "term", "fact", 
			"boolExpr", "relop", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'true'", "'false'", "'read'", "'write'", "'if'", "'else'", 
			null, null, null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", 
			"'('", "')'", "'{'", "'}'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "STR", "NUM", 
			"VAR", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "ATR", "OEX", "CEX", "OBL", 
			"CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "EOL", "COMMENT", "LINE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(BasicParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(BasicParser.EOL, i);
		}
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterProgr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitProgr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				line();
				setState(25);
				match(EOL);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << VAR))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineAtrContext extends LineContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public LineAtrContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLineAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLineAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLineAtr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineReadContext extends LineContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public LineReadContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLineRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLineRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLineRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineWriteContext extends LineContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public LineWriteContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLineWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLineWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLineWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineIfStmContext extends LineContext {
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public LineIfStmContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterLineIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitLineIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLineIfStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				_localctx = new LineReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				read();
				}
				break;
			case WRITE:
				_localctx = new LineWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				write();
				}
				break;
			case VAR:
				_localctx = new LineAtrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				atr();
				}
				break;
			case IF:
				_localctx = new LineIfStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				ifstm();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(READ);
			setState(38);
			match(VAR);
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
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStrContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public WriteStrContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterWriteStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitWriteStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitWriteStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteExprContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteExprContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterWriteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitWriteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_write);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(WRITE);
				setState(41);
				match(STR);
				}
				break;
			case 2:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(WRITE);
				setState(43);
				expr();
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public TerminalNode ATR() { return getToken(BasicParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VAR);
			setState(47);
			match(ATR);
			setState(48);
			expr();
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

	public static class IfstmContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public TerminalNode OEX() { return getToken(BasicParser.OEX, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(BasicParser.CEX, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterIfstm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitIfstm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIfstm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstm);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(IF);
				setState(51);
				match(OEX);
				setState(52);
				boolExpr();
				setState(53);
				match(CEX);
				setState(54);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(IF);
				setState(57);
				match(OEX);
				setState(58);
				boolExpr();
				setState(59);
				match(CEX);
				setState(60);
				block();
				setState(61);
				match(ELSE);
				setState(62);
				block();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(BasicParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				term();
				setState(67);
				match(ADD);
				setState(68);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				term();
				setState(71);
				match(SUB);
				setState(72);
				expr();
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

	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(BasicParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(BasicParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BasicParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				fact();
				setState(77);
				match(MUL);
				setState(78);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				fact();
				setState(81);
				match(DIV);
				setState(82);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				fact();
				setState(85);
				match(MOD);
				setState(86);
				term();
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(BasicParser.NUM, 0); }
		public TerminalNode OEX() { return getToken(BasicParser.OEX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(BasicParser.CEX, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fact);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUM);
				}
				break;
			case OEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(OEX);
				setState(93);
				expr();
				setState(94);
				match(CEX);
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

	public static class BoolExprContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(BasicParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BasicParser.FALSE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolExpr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__0);
				setState(100);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				fact();
				setState(102);
				relop();
				setState(103);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(FALSE);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GR() { return getToken(BasicParser.GR, 0); }
		public TerminalNode LS() { return getToken(BasicParser.LS, 0); }
		public TerminalNode EQ() { return getToken(BasicParser.EQ, 0); }
		public TerminalNode GRT() { return getToken(BasicParser.GRT, 0); }
		public TerminalNode LST() { return getToken(BasicParser.LST, 0); }
		public TerminalNode NEQ() { return getToken(BasicParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LS) | (1L << EQ) | (1L << GRT) | (1L << LST) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode OBL() { return getToken(BasicParser.OBL, 0); }
		public ProgrContext progr() {
			return getRuleContext(ProgrContext.class,0);
		}
		public TerminalNode CBL() { return getToken(BasicParser.CBL, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicListener ) ((BasicListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				line();
				}
				break;
			case OBL:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(OBL);
				setState(113);
				progr();
				setState(114);
				match(CBL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3\3\5\3&\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rw\n\r\3"+
		"\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\r\22\2|\2\35\3\2\2\2\4"+
		"%\3\2\2\2\6\'\3\2\2\2\b.\3\2\2\2\n\60\3\2\2\2\fB\3\2\2\2\16L\3\2\2\2\20"+
		"Z\3\2\2\2\22b\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30v\3\2\2\2\32\33\5\4\3"+
		"\2\33\34\7\36\2\2\34\36\3\2\2\2\35\32\3\2\2\2\36\37\3\2\2\2\37\35\3\2"+
		"\2\2\37 \3\2\2\2 \3\3\2\2\2!&\5\6\4\2\"&\5\b\5\2#&\5\n\6\2$&\5\f\7\2%"+
		"!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\7\6\2\2()\7\f\2"+
		"\2)\7\3\2\2\2*+\7\7\2\2+/\7\n\2\2,-\7\7\2\2-/\5\16\b\2.*\3\2\2\2.,\3\2"+
		"\2\2/\t\3\2\2\2\60\61\7\f\2\2\61\62\7\23\2\2\62\63\5\16\b\2\63\13\3\2"+
		"\2\2\64\65\7\b\2\2\65\66\7\24\2\2\66\67\5\24\13\2\678\7\25\2\289\5\30"+
		"\r\29C\3\2\2\2:;\7\b\2\2;<\7\24\2\2<=\5\24\13\2=>\7\25\2\2>?\5\30\r\2"+
		"?@\7\t\2\2@A\5\30\r\2AC\3\2\2\2B\64\3\2\2\2B:\3\2\2\2C\r\3\2\2\2DE\5\20"+
		"\t\2EF\7\31\2\2FG\5\16\b\2GM\3\2\2\2HI\5\20\t\2IJ\7\32\2\2JK\5\16\b\2"+
		"KM\3\2\2\2LD\3\2\2\2LH\3\2\2\2M\17\3\2\2\2NO\5\22\n\2OP\7\33\2\2PQ\5\20"+
		"\t\2Q[\3\2\2\2RS\5\22\n\2ST\7\34\2\2TU\5\20\t\2U[\3\2\2\2VW\5\22\n\2W"+
		"X\7\35\2\2XY\5\20\t\2Y[\3\2\2\2ZN\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2[\21\3\2"+
		"\2\2\\c\7\f\2\2]c\7\13\2\2^_\7\24\2\2_`\5\16\b\2`a\7\25\2\2ac\3\2\2\2"+
		"b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2c\23\3\2\2\2dn\5\22\n\2ef\7\3\2\2fn\5\24"+
		"\13\2gh\5\22\n\2hi\5\26\f\2ij\5\22\n\2jn\3\2\2\2kn\7\4\2\2ln\7\5\2\2m"+
		"d\3\2\2\2me\3\2\2\2mg\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\25\3\2\2\2op\t\2\2"+
		"\2p\27\3\2\2\2qw\5\4\3\2rs\7\26\2\2st\5\2\2\2tu\7\27\2\2uw\3\2\2\2vq\3"+
		"\2\2\2vr\3\2\2\2w\31\3\2\2\2\13\37%.BLZbmv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}