
// Generated from Teste.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "TesteParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by TesteParser.
 */
class  TesteListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterLang(TesteParser::LangContext *ctx) = 0;
  virtual void exitLang(TesteParser::LangContext *ctx) = 0;

  virtual void enterExpr(TesteParser::ExprContext *ctx) = 0;
  virtual void exitExpr(TesteParser::ExprContext *ctx) = 0;

  virtual void enterTerm(TesteParser::TermContext *ctx) = 0;
  virtual void exitTerm(TesteParser::TermContext *ctx) = 0;

  virtual void enterFactor(TesteParser::FactorContext *ctx) = 0;
  virtual void exitFactor(TesteParser::FactorContext *ctx) = 0;


};

