
// Generated from Teste.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "TesteListener.h"


/**
 * This class provides an empty implementation of TesteListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  TesteBaseListener : public TesteListener {
public:

  virtual void enterLang(TesteParser::LangContext * /*ctx*/) override { }
  virtual void exitLang(TesteParser::LangContext * /*ctx*/) override { }

  virtual void enterExpr(TesteParser::ExprContext * /*ctx*/) override { }
  virtual void exitExpr(TesteParser::ExprContext * /*ctx*/) override { }

  virtual void enterTerm(TesteParser::TermContext * /*ctx*/) override { }
  virtual void exitTerm(TesteParser::TermContext * /*ctx*/) override { }

  virtual void enterFactor(TesteParser::FactorContext * /*ctx*/) override { }
  virtual void exitFactor(TesteParser::FactorContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

