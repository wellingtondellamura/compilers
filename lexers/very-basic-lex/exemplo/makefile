lexer: lexer.c tokens.h lexer_base.c
	cc lexer.c lexer_base.c -ll -o lexer 

lexer_base.c: lexer.l
	lex -o lexer_base.c lexer.l

clean:
	rm -f lexer
	rm -f lexer_base.c