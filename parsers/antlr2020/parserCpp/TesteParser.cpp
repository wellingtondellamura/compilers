
// Generated from Teste.g4 by ANTLR 4.8


#include "TesteListener.h"

#include "TesteParser.h"


using namespace antlrcpp;
using namespace antlr4;

TesteParser::TesteParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

TesteParser::~TesteParser() {
  delete _interpreter;
}

std::string TesteParser::getGrammarFileName() const {
  return "Teste.g4";
}

const std::vector<std::string>& TesteParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& TesteParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- LangContext ------------------------------------------------------------------

TesteParser::LangContext::LangContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TesteParser::ExprContext* TesteParser::LangContext::expr() {
  return getRuleContext<TesteParser::ExprContext>(0);
}

tree::TerminalNode* TesteParser::LangContext::EOL() {
  return getToken(TesteParser::EOL, 0);
}


size_t TesteParser::LangContext::getRuleIndex() const {
  return TesteParser::RuleLang;
}

void TesteParser::LangContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLang(this);
}

void TesteParser::LangContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLang(this);
}

TesteParser::LangContext* TesteParser::lang() {
  LangContext *_localctx = _tracker.createInstance<LangContext>(_ctx, getState());
  enterRule(_localctx, 0, TesteParser::RuleLang);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(8);
    expr(0);
    setState(9);
    match(TesteParser::EOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

TesteParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TesteParser::TermContext* TesteParser::ExprContext::term() {
  return getRuleContext<TesteParser::TermContext>(0);
}

TesteParser::ExprContext* TesteParser::ExprContext::expr() {
  return getRuleContext<TesteParser::ExprContext>(0);
}

tree::TerminalNode* TesteParser::ExprContext::ADD() {
  return getToken(TesteParser::ADD, 0);
}


size_t TesteParser::ExprContext::getRuleIndex() const {
  return TesteParser::RuleExpr;
}

void TesteParser::ExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpr(this);
}

void TesteParser::ExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpr(this);
}


TesteParser::ExprContext* TesteParser::expr() {
   return expr(0);
}

TesteParser::ExprContext* TesteParser::expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TesteParser::ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, parentState);
  TesteParser::ExprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 2;
  enterRecursionRule(_localctx, 2, TesteParser::RuleExpr, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(12);
    term(0);
    _ctx->stop = _input->LT(-1);
    setState(19);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ExprContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleExpr);
        setState(14);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(15);
        match(TesteParser::ADD);
        setState(16);
        term(0); 
      }
      setState(21);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- TermContext ------------------------------------------------------------------

TesteParser::TermContext::TermContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TesteParser::FactorContext* TesteParser::TermContext::factor() {
  return getRuleContext<TesteParser::FactorContext>(0);
}

TesteParser::TermContext* TesteParser::TermContext::term() {
  return getRuleContext<TesteParser::TermContext>(0);
}

tree::TerminalNode* TesteParser::TermContext::MULT() {
  return getToken(TesteParser::MULT, 0);
}


size_t TesteParser::TermContext::getRuleIndex() const {
  return TesteParser::RuleTerm;
}

void TesteParser::TermContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTerm(this);
}

void TesteParser::TermContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTerm(this);
}


TesteParser::TermContext* TesteParser::term() {
   return term(0);
}

TesteParser::TermContext* TesteParser::term(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TesteParser::TermContext *_localctx = _tracker.createInstance<TermContext>(_ctx, parentState);
  TesteParser::TermContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 4;
  enterRecursionRule(_localctx, 4, TesteParser::RuleTerm, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(23);
    factor();
    _ctx->stop = _input->LT(-1);
    setState(30);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<TermContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleTerm);
        setState(25);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(26);
        match(TesteParser::MULT);
        setState(27);
        factor(); 
      }
      setState(32);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- FactorContext ------------------------------------------------------------------

TesteParser::FactorContext::FactorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TesteParser::FactorContext::OPEN() {
  return getToken(TesteParser::OPEN, 0);
}

TesteParser::ExprContext* TesteParser::FactorContext::expr() {
  return getRuleContext<TesteParser::ExprContext>(0);
}

tree::TerminalNode* TesteParser::FactorContext::CLOSE() {
  return getToken(TesteParser::CLOSE, 0);
}

tree::TerminalNode* TesteParser::FactorContext::DIGIT() {
  return getToken(TesteParser::DIGIT, 0);
}


size_t TesteParser::FactorContext::getRuleIndex() const {
  return TesteParser::RuleFactor;
}

void TesteParser::FactorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFactor(this);
}

void TesteParser::FactorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TesteListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFactor(this);
}

TesteParser::FactorContext* TesteParser::factor() {
  FactorContext *_localctx = _tracker.createInstance<FactorContext>(_ctx, getState());
  enterRule(_localctx, 6, TesteParser::RuleFactor);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(38);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TesteParser::OPEN: {
        enterOuterAlt(_localctx, 1);
        setState(33);
        match(TesteParser::OPEN);
        setState(34);
        expr(0);
        setState(35);
        match(TesteParser::CLOSE);
        break;
      }

      case TesteParser::DIGIT: {
        enterOuterAlt(_localctx, 2);
        setState(37);
        match(TesteParser::DIGIT);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool TesteParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 1: return exprSempred(dynamic_cast<ExprContext *>(context), predicateIndex);
    case 2: return termSempred(dynamic_cast<TermContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool TesteParser::exprSempred(ExprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool TesteParser::termSempred(TermContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> TesteParser::_decisionToDFA;
atn::PredictionContextCache TesteParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TesteParser::_atn;
std::vector<uint16_t> TesteParser::_serializedATN;

std::vector<std::string> TesteParser::_ruleNames = {
  "lang", "expr", "term", "factor"
};

std::vector<std::string> TesteParser::_literalNames = {
  "", "", "'\n'", "'+'", "'*'", "'('", "')'"
};

std::vector<std::string> TesteParser::_symbolicNames = {
  "", "DIGIT", "EOL", "ADD", "MULT", "OPEN", "CLOSE"
};

dfa::Vocabulary TesteParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> TesteParser::_tokenNames;

TesteParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x8, 0x2b, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x14, 0xa, 0x3, 
    0xc, 0x3, 0xe, 0x3, 0x17, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x7, 0x4, 0x1f, 0xa, 0x4, 0xc, 0x4, 0xe, 0x4, 
    0x22, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 
    0x5, 0x29, 0xa, 0x5, 0x3, 0x5, 0x2, 0x4, 0x4, 0x6, 0x6, 0x2, 0x4, 0x6, 
    0x8, 0x2, 0x2, 0x2, 0x29, 0x2, 0xa, 0x3, 0x2, 0x2, 0x2, 0x4, 0xd, 0x3, 
    0x2, 0x2, 0x2, 0x6, 0x18, 0x3, 0x2, 0x2, 0x2, 0x8, 0x28, 0x3, 0x2, 0x2, 
    0x2, 0xa, 0xb, 0x5, 0x4, 0x3, 0x2, 0xb, 0xc, 0x7, 0x4, 0x2, 0x2, 0xc, 
    0x3, 0x3, 0x2, 0x2, 0x2, 0xd, 0xe, 0x8, 0x3, 0x1, 0x2, 0xe, 0xf, 0x5, 
    0x6, 0x4, 0x2, 0xf, 0x15, 0x3, 0x2, 0x2, 0x2, 0x10, 0x11, 0xc, 0x4, 
    0x2, 0x2, 0x11, 0x12, 0x7, 0x5, 0x2, 0x2, 0x12, 0x14, 0x5, 0x6, 0x4, 
    0x2, 0x13, 0x10, 0x3, 0x2, 0x2, 0x2, 0x14, 0x17, 0x3, 0x2, 0x2, 0x2, 
    0x15, 0x13, 0x3, 0x2, 0x2, 0x2, 0x15, 0x16, 0x3, 0x2, 0x2, 0x2, 0x16, 
    0x5, 0x3, 0x2, 0x2, 0x2, 0x17, 0x15, 0x3, 0x2, 0x2, 0x2, 0x18, 0x19, 
    0x8, 0x4, 0x1, 0x2, 0x19, 0x1a, 0x5, 0x8, 0x5, 0x2, 0x1a, 0x20, 0x3, 
    0x2, 0x2, 0x2, 0x1b, 0x1c, 0xc, 0x4, 0x2, 0x2, 0x1c, 0x1d, 0x7, 0x6, 
    0x2, 0x2, 0x1d, 0x1f, 0x5, 0x8, 0x5, 0x2, 0x1e, 0x1b, 0x3, 0x2, 0x2, 
    0x2, 0x1f, 0x22, 0x3, 0x2, 0x2, 0x2, 0x20, 0x1e, 0x3, 0x2, 0x2, 0x2, 
    0x20, 0x21, 0x3, 0x2, 0x2, 0x2, 0x21, 0x7, 0x3, 0x2, 0x2, 0x2, 0x22, 
    0x20, 0x3, 0x2, 0x2, 0x2, 0x23, 0x24, 0x7, 0x7, 0x2, 0x2, 0x24, 0x25, 
    0x5, 0x4, 0x3, 0x2, 0x25, 0x26, 0x7, 0x8, 0x2, 0x2, 0x26, 0x29, 0x3, 
    0x2, 0x2, 0x2, 0x27, 0x29, 0x7, 0x3, 0x2, 0x2, 0x28, 0x23, 0x3, 0x2, 
    0x2, 0x2, 0x28, 0x27, 0x3, 0x2, 0x2, 0x2, 0x29, 0x9, 0x3, 0x2, 0x2, 
    0x2, 0x5, 0x15, 0x20, 0x28, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

TesteParser::Initializer TesteParser::_init;
