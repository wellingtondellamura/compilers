//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\BasicIntAST\grammar\basicintast\parser\Basic.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace Grammar {

package basicintast.parser;
import basicintast.util.*;

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class BasicLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		IF=1, ELSE=2, GT=3, LT=4, EQ=5, GE=6, LE=7, NE=8, PLUS=9, MINUS=10, MULT=11, 
		DIV=12, OPEN=13, CLOSE=14, OPEN_BL=15, CLOSE_BL=16, IS=17, EOL=18, PRINT=19, 
		READ=20, NUM=21, VAR=22, STR=23, WS=24;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"IF", "ELSE", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", "MINUS", "MULT", 
		"DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", "EOL", "PRINT", "READ", 
		"NUM", "VAR", "STR", "WS"
	};


	public BasicLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public BasicLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'if'", "'else'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", 
		"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'='", "';'", 
		"'print'", "'read'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "IF", "ELSE", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", "MINUS", 
		"MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", "EOL", "PRINT", 
		"READ", "NUM", "VAR", "STR", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Basic.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static BasicLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\x1A', '\x88', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\a', 
		'\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\f', 
		'\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', 
		'\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', 
		'\x11', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', 
		'\x15', '\x3', '\x16', '\x6', '\x16', 'l', '\n', '\x16', '\r', '\x16', 
		'\xE', '\x16', 'm', '\x3', '\x17', '\x3', '\x17', '\a', '\x17', 'r', '\n', 
		'\x17', '\f', '\x17', '\xE', '\x17', 'u', '\v', '\x17', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\a', '\x18', '{', '\n', 
		'\x18', '\f', '\x18', '\xE', '\x18', '~', '\v', '\x18', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x19', '\x6', '\x19', '\x83', '\n', '\x19', '\r', 
		'\x19', '\xE', '\x19', '\x84', '\x3', '\x19', '\x3', '\x19', '\x2', '\x2', 
		'\x1A', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', 
		'\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', 
		'\r', '\x19', '\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', 
		'\x12', '#', '\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', 
		'-', '\x18', '/', '\x19', '\x31', '\x1A', '\x3', '\x2', '\b', '\x3', '\x2', 
		'\x32', ';', '\x4', '\x2', '\x43', '\\', '\x63', '|', '\x6', '\x2', '\x32', 
		';', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x4', '\x2', '$', '$', 
		'^', '^', '\x6', '\x2', '\f', '\f', '\xF', '\xF', '$', '$', '^', '^', 
		'\x5', '\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x2', '\x8C', '\x2', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x3', '\x33', '\x3', '\x2', 
		'\x2', '\x2', '\x5', '\x36', '\x3', '\x2', '\x2', '\x2', '\a', ';', '\x3', 
		'\x2', '\x2', '\x2', '\t', '=', '\x3', '\x2', '\x2', '\x2', '\v', '?', 
		'\x3', '\x2', '\x2', '\x2', '\r', '\x42', '\x3', '\x2', '\x2', '\x2', 
		'\xF', '\x45', '\x3', '\x2', '\x2', '\x2', '\x11', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\x13', 'K', '\x3', '\x2', '\x2', '\x2', '\x15', 'M', '\x3', 
		'\x2', '\x2', '\x2', '\x17', 'O', '\x3', '\x2', '\x2', '\x2', '\x19', 
		'Q', '\x3', '\x2', '\x2', '\x2', '\x1B', 'S', '\x3', '\x2', '\x2', '\x2', 
		'\x1D', 'U', '\x3', '\x2', '\x2', '\x2', '\x1F', 'W', '\x3', '\x2', '\x2', 
		'\x2', '!', 'Y', '\x3', '\x2', '\x2', '\x2', '#', '[', '\x3', '\x2', '\x2', 
		'\x2', '%', ']', '\x3', '\x2', '\x2', '\x2', '\'', '_', '\x3', '\x2', 
		'\x2', '\x2', ')', '\x65', '\x3', '\x2', '\x2', '\x2', '+', 'k', '\x3', 
		'\x2', '\x2', '\x2', '-', 'o', '\x3', '\x2', '\x2', '\x2', '/', 'v', '\x3', 
		'\x2', '\x2', '\x2', '\x31', '\x82', '\x3', '\x2', '\x2', '\x2', '\x33', 
		'\x34', '\a', 'k', '\x2', '\x2', '\x34', '\x35', '\a', 'h', '\x2', '\x2', 
		'\x35', '\x4', '\x3', '\x2', '\x2', '\x2', '\x36', '\x37', '\a', 'g', 
		'\x2', '\x2', '\x37', '\x38', '\a', 'n', '\x2', '\x2', '\x38', '\x39', 
		'\a', 'u', '\x2', '\x2', '\x39', ':', '\a', 'g', '\x2', '\x2', ':', '\x6', 
		'\x3', '\x2', '\x2', '\x2', ';', '<', '\a', '@', '\x2', '\x2', '<', '\b', 
		'\x3', '\x2', '\x2', '\x2', '=', '>', '\a', '>', '\x2', '\x2', '>', '\n', 
		'\x3', '\x2', '\x2', '\x2', '?', '@', '\a', '?', '\x2', '\x2', '@', '\x41', 
		'\a', '?', '\x2', '\x2', '\x41', '\f', '\x3', '\x2', '\x2', '\x2', '\x42', 
		'\x43', '\a', '@', '\x2', '\x2', '\x43', '\x44', '\a', '?', '\x2', '\x2', 
		'\x44', '\xE', '\x3', '\x2', '\x2', '\x2', '\x45', '\x46', '\a', '>', 
		'\x2', '\x2', '\x46', 'G', '\a', '?', '\x2', '\x2', 'G', '\x10', '\x3', 
		'\x2', '\x2', '\x2', 'H', 'I', '\a', '#', '\x2', '\x2', 'I', 'J', '\a', 
		'?', '\x2', '\x2', 'J', '\x12', '\x3', '\x2', '\x2', '\x2', 'K', 'L', 
		'\a', '-', '\x2', '\x2', 'L', '\x14', '\x3', '\x2', '\x2', '\x2', 'M', 
		'N', '\a', '/', '\x2', '\x2', 'N', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'O', 'P', '\a', ',', '\x2', '\x2', 'P', '\x18', '\x3', '\x2', '\x2', '\x2', 
		'Q', 'R', '\a', '\x31', '\x2', '\x2', 'R', '\x1A', '\x3', '\x2', '\x2', 
		'\x2', 'S', 'T', '\a', '*', '\x2', '\x2', 'T', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', 'U', 'V', '\a', '+', '\x2', '\x2', 'V', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', 'W', 'X', '\a', '}', '\x2', '\x2', 'X', ' ', '\x3', '\x2', '\x2', 
		'\x2', 'Y', 'Z', '\a', '\x7F', '\x2', '\x2', 'Z', '\"', '\x3', '\x2', 
		'\x2', '\x2', '[', '\\', '\a', '?', '\x2', '\x2', '\\', '$', '\x3', '\x2', 
		'\x2', '\x2', ']', '^', '\a', '=', '\x2', '\x2', '^', '&', '\x3', '\x2', 
		'\x2', '\x2', '_', '`', '\a', 'r', '\x2', '\x2', '`', '\x61', '\a', 't', 
		'\x2', '\x2', '\x61', '\x62', '\a', 'k', '\x2', '\x2', '\x62', '\x63', 
		'\a', 'p', '\x2', '\x2', '\x63', '\x64', '\a', 'v', '\x2', '\x2', '\x64', 
		'(', '\x3', '\x2', '\x2', '\x2', '\x65', '\x66', '\a', 't', '\x2', '\x2', 
		'\x66', 'g', '\a', 'g', '\x2', '\x2', 'g', 'h', '\a', '\x63', '\x2', '\x2', 
		'h', 'i', '\a', '\x66', '\x2', '\x2', 'i', '*', '\x3', '\x2', '\x2', '\x2', 
		'j', 'l', '\t', '\x2', '\x2', '\x2', 'k', 'j', '\x3', '\x2', '\x2', '\x2', 
		'l', 'm', '\x3', '\x2', '\x2', '\x2', 'm', 'k', '\x3', '\x2', '\x2', '\x2', 
		'm', 'n', '\x3', '\x2', '\x2', '\x2', 'n', ',', '\x3', '\x2', '\x2', '\x2', 
		'o', 's', '\t', '\x3', '\x2', '\x2', 'p', 'r', '\t', '\x4', '\x2', '\x2', 
		'q', 'p', '\x3', '\x2', '\x2', '\x2', 'r', 'u', '\x3', '\x2', '\x2', '\x2', 
		's', 'q', '\x3', '\x2', '\x2', '\x2', 's', 't', '\x3', '\x2', '\x2', '\x2', 
		't', '.', '\x3', '\x2', '\x2', '\x2', 'u', 's', '\x3', '\x2', '\x2', '\x2', 
		'v', '|', '\a', '$', '\x2', '\x2', 'w', 'x', '\a', '^', '\x2', '\x2', 
		'x', '{', '\t', '\x5', '\x2', '\x2', 'y', '{', '\n', '\x6', '\x2', '\x2', 
		'z', 'w', '\x3', '\x2', '\x2', '\x2', 'z', 'y', '\x3', '\x2', '\x2', '\x2', 
		'{', '~', '\x3', '\x2', '\x2', '\x2', '|', 'z', '\x3', '\x2', '\x2', '\x2', 
		'|', '}', '\x3', '\x2', '\x2', '\x2', '}', '\x7F', '\x3', '\x2', '\x2', 
		'\x2', '~', '|', '\x3', '\x2', '\x2', '\x2', '\x7F', '\x80', '\a', '$', 
		'\x2', '\x2', '\x80', '\x30', '\x3', '\x2', '\x2', '\x2', '\x81', '\x83', 
		'\t', '\a', '\x2', '\x2', '\x82', '\x81', '\x3', '\x2', '\x2', '\x2', 
		'\x83', '\x84', '\x3', '\x2', '\x2', '\x2', '\x84', '\x82', '\x3', '\x2', 
		'\x2', '\x2', '\x84', '\x85', '\x3', '\x2', '\x2', '\x2', '\x85', '\x86', 
		'\x3', '\x2', '\x2', '\x2', '\x86', '\x87', '\b', '\x19', '\x2', '\x2', 
		'\x87', '\x32', '\x3', '\x2', '\x2', '\x2', '\b', '\x2', 'm', 's', 'z', 
		'|', '\x84', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
} // namespace Grammar