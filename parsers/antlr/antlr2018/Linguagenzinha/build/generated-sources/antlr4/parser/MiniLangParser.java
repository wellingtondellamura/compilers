// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2018\Linguagenzinha\grammar\parser\MiniLang.g4 by ANTLR 4.6

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
public class MiniLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, IF=2, ELSE=3, PRINT=4, READ=5, STRING=6, VAR=7, SUM=8, EQUALS=9, 
		B_EXPR=10, E_EXPR=11, B_BLOCK=12, E_BLOCK=13, EOL=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_print = 2, RULE_read = 3, RULE_atr = 4, 
		RULE_expr = 5, RULE_ifstmt = 6, RULE_cond = 7, RULE_block = 8;
	public static final String[] ruleNames = {
		"prog", "stmt", "print", "read", "atr", "expr", "ifstmt", "cond", "block"
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

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitProg(this);
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stmt();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VAR))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(MiniLangParser.EOL, 0); }
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case READ:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(23);
					atr();
					}
					break;
				case PRINT:
					{
					setState(24);
					print();
					}
					break;
				case READ:
					{
					setState(25);
					read();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(28);
				match(EOL);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				ifstmt();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MiniLangParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MiniLangParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(PRINT);
				setState(34);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(PRINT);
				setState(36);
				match(STRING);
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
		public TerminalNode READ() { return getToken(MiniLangParser.READ, 0); }
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(READ);
			setState(40);
			match(B_EXPR);
			setState(41);
			match(VAR);
			setState(42);
			match(E_EXPR);
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
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(VAR);
			setState(45);
			match(EQUALS);
			setState(46);
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

	public static class ExprContext extends ParserRuleContext {
		public double result;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.result = ctx.result;
		}
	}
	public static class ExprVarPlusContext extends ExprContext {
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprVarPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExprVarPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExprVarPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitExprVarPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumPlusContext extends ExprContext {
		public TerminalNode NUM() { return getToken(MiniLangParser.NUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNumPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExprNumPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExprNumPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitExprNumPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(MiniLangParser.NUM, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExprVarPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(VAR);
				setState(49);
				match(SUM);
				setState(50);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprNumPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(NUM);
				setState(52);
				match(SUM);
				setState(53);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(NUM);
				}
				break;
			case 4:
				_localctx = new ExprVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(VAR);
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

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfstmtContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends IfstmtContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniLangParser.ELSE, 0); }
		public IfElseStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(IF);
				setState(59);
				match(B_EXPR);
				setState(60);
				cond();
				setState(61);
				match(E_EXPR);
				setState(62);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(IF);
				setState(65);
				match(B_EXPR);
				setState(66);
				cond();
				setState(67);
				match(E_EXPR);
				setState(68);
				block();
				setState(69);
				match(ELSE);
				setState(70);
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

	public static class CondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLangVisitor ) return ((MiniLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case PRINT:
			case READ:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				stmt();
				}
				break;
			case B_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(B_BLOCK);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					stmt();
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << READ) | (1L << VAR))) != 0) );
				setState(83);
				match(E_BLOCK);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\3\n\3\n\6\nR\n\n\r\n\16\nS\3\n\3\n\5"+
		"\nX\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2[\2\25\3\2\2\2\4!\3\2\2\2\6"+
		"\'\3\2\2\2\b)\3\2\2\2\n.\3\2\2\2\f:\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22"+
		"W\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\3\3\2\2\2\31\35\5\n\6\2\32\35\5\6\4\2\33\35\5\b\5\2\34\31"+
		"\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\37\7\20\2\2\37\""+
		"\3\2\2\2 \"\5\16\b\2!\34\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\6\2\2$(\5\f"+
		"\7\2%&\7\6\2\2&(\7\b\2\2\'#\3\2\2\2\'%\3\2\2\2(\7\3\2\2\2)*\7\7\2\2*+"+
		"\7\f\2\2+,\7\t\2\2,-\7\r\2\2-\t\3\2\2\2./\7\t\2\2/\60\7\13\2\2\60\61\5"+
		"\f\7\2\61\13\3\2\2\2\62\63\7\t\2\2\63\64\7\n\2\2\64;\5\f\7\2\65\66\7\3"+
		"\2\2\66\67\7\n\2\2\67;\5\f\7\28;\7\3\2\29;\7\t\2\2:\62\3\2\2\2:\65\3\2"+
		"\2\2:8\3\2\2\2:9\3\2\2\2;\r\3\2\2\2<=\7\4\2\2=>\7\f\2\2>?\5\20\t\2?@\7"+
		"\r\2\2@A\5\22\n\2AK\3\2\2\2BC\7\4\2\2CD\7\f\2\2DE\5\20\t\2EF\7\r\2\2F"+
		"G\5\22\n\2GH\7\5\2\2HI\5\22\n\2IK\3\2\2\2J<\3\2\2\2JB\3\2\2\2K\17\3\2"+
		"\2\2LM\5\f\7\2M\21\3\2\2\2NX\5\4\3\2OQ\7\16\2\2PR\5\4\3\2QP\3\2\2\2RS"+
		"\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\17\2\2VX\3\2\2\2WN\3\2\2\2"+
		"WO\3\2\2\2X\23\3\2\2\2\n\27\34!\':JSW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}