// Generated from /Users/kulics/Documents/kulics-works/k-kotlin/src/main/java/com/kulics/k/antlr/KParser.g4 by ANTLR 4.8
package com.kulics.k.antlr.generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Add_Equal=1, Sub_Equal=2, Mul_Equal=3, Div_Equal=4, Mod_Equal=5, Pow_Equal=6, 
		Colon_Equal=7, Equal_Equal=8, Less_Equal=9, Greater_Equal=10, Not_Equal=11, 
		Combine_Equal=12, Forward_Back_Slash=13, Back_Forward_Slash=14, Dot_Dot_Dot=15, 
		Dot_Dot_Less=16, Dot_Dot_Greater=17, Dot_Dot=18, Dot=19, Comma_Comma_Comma=20, 
		Comma_Comma=21, Comma=22, Right_Flow=23, Left_Flow=24, Right_Arrow=25, 
		Left_Arrow=26, Right_Wave=27, Left_Wave=28, Equal=29, Less_Less=30, Greater_Greater=31, 
		And_And=32, Or_Or=33, Caret_Caret=34, Tilde_Tilde=35, Less=36, Greater=37, 
		Semi=38, Left_Paren=39, Right_Paren=40, Left_Brace=41, Right_Brace=42, 
		Left_Brack=43, Right_Brack=44, Colon=45, Question=46, At=47, Bang=48, 
		Coin=49, Tilde=50, Add=51, Sub=52, Mul=53, Div=54, Mod=55, And=56, Or=57, 
		Caret=58, Grave=59, Sharp=60, TypeI8=61, TypeU8=62, TypeI16=63, TypeU16=64, 
		TypeI32=65, TypeU32=66, TypeI64=67, TypeU64=68, TypeF32=69, TypeF64=70, 
		TypeChr=71, TypeStr=72, TypeBool=73, TypeInt=74, TypeNum=75, TypeByte=76, 
		TypeAny=77, NilLiteral=78, TrueLiteral=79, FalseLiteral=80, UndefinedLiteral=81, 
		FloatLiteral=82, DecimalLiteral=83, BinaryLiteral=84, OctalLiteral=85, 
		HexLiteral=86, Quote_Quote_Quote_Open=87, Quote_Open=88, CharLiteral=89, 
		IDPrivate=90, IDPublic=91, Discard=92, Comment_Tag=93, Comment_Block=94, 
		Comment_Line=95, New_Line=96, WS=97, Quote_Close=98, String_Template_Open=99, 
		TextLiteral=100, Quote_Quote_Quote_Close=101, Raw_Quote=102, Raw_String_Template_Open=103, 
		RawTextLiteral=104;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_exportStatement = 2, RULE_namespaceSupportStatement = 3, 
		RULE_importStatement = 4, RULE_importSubStatement = 5, RULE_typeAliasStatement = 6, 
		RULE_typeRedefineStatement = 7, RULE_typeTagStatement = 8, RULE_enumStatement = 9, 
		RULE_enumSupportStatement = 10, RULE_namespaceVariableStatement = 11, 
		RULE_namespaceConstantStatement = 12, RULE_namespaceFunctionStatement = 13, 
		RULE_packageStatement = 14, RULE_packageStaticStatement = 15, RULE_packageStaticSupportStatement = 16, 
		RULE_packageStaticVariableStatement = 17, RULE_packageStaticConstantStatement = 18, 
		RULE_packageStaticFunctionStatement = 19, RULE_packageFieldStatement = 20, 
		RULE_packageSupportStatement = 21, RULE_includeStatement = 22, RULE_packageNewStatement = 23, 
		RULE_packageVariableStatement = 24, RULE_packageConstantStatement = 25, 
		RULE_packageFunctionStatement = 26, RULE_packageControlSubStatement = 27, 
		RULE_packageEventStatement = 28, RULE_implementStatement = 29, RULE_overrideVariableStatement = 30, 
		RULE_overrideConstantStatement = 31, RULE_overrideFunctionStatement = 32, 
		RULE_protocolStatement = 33, RULE_protocolSubStatement = 34, RULE_protocolSupportStatement = 35, 
		RULE_protocolVariableStatement = 36, RULE_protocolFunctionStatement = 37, 
		RULE_functionStatement = 38, RULE_returnStatement = 39, RULE_returnAsyncStatement = 40, 
		RULE_yieldReturnStatement = 41, RULE_yieldBreakStatement = 42, RULE_parameterClauseIn = 43, 
		RULE_parameterClauseOut = 44, RULE_parameter = 45, RULE_functionSupportStatement = 46, 
		RULE_judgeCaseStatement = 47, RULE_caseStatement = 48, RULE_caseExprStatement = 49, 
		RULE_judgeStatement = 50, RULE_judgeElseStatement = 51, RULE_judgeIfStatement = 52, 
		RULE_judgeElseIfStatement = 53, RULE_loopStatement = 54, RULE_loopEachStatement = 55, 
		RULE_loopCaseStatement = 56, RULE_loopElseStatement = 57, RULE_loopJumpStatement = 58, 
		RULE_loopContinueStatement = 59, RULE_checkStatement = 60, RULE_usingStatement = 61, 
		RULE_checkErrorStatement = 62, RULE_checkFinallyStatment = 63, RULE_checkReportStatement = 64, 
		RULE_iteratorStatement = 65, RULE_variableDeclaredStatement = 66, RULE_constantDeclaredStatement = 67, 
		RULE_varStatement = 68, RULE_bindStatement = 69, RULE_assignStatement = 70, 
		RULE_expressionStatement = 71, RULE_annotationStatement = 72, RULE_varId = 73, 
		RULE_constId = 74, RULE_tupleExpression = 75, RULE_primaryExpression = 76, 
		RULE_expression = 77, RULE_callExpression = 78, RULE_tuple = 79, RULE_expressionList = 80, 
		RULE_annotationSupport = 81, RULE_annotation = 82, RULE_annotationList = 83, 
		RULE_annotationItem = 84, RULE_annotationString = 85, RULE_callFunc = 86, 
		RULE_callAsync = 87, RULE_callAwait = 88, RULE_callChannel = 89, RULE_transfer = 90, 
		RULE_callElement = 91, RULE_callPkg = 92, RULE_callNew = 93, RULE_orElse = 94, 
		RULE_typeConversion = 95, RULE_typeCheck = 96, RULE_pkgAssign = 97, RULE_pkgAssignElement = 98, 
		RULE_listAssign = 99, RULE_dictionaryAssign = 100, RULE_list = 101, RULE_dictionary = 102, 
		RULE_dictionaryElement = 103, RULE_slice = 104, RULE_sliceFull = 105, 
		RULE_sliceStart = 106, RULE_sliceEnd = 107, RULE_nameSpaceItem = 108, 
		RULE_name = 109, RULE_templateDefine = 110, RULE_templateDefineItem = 111, 
		RULE_templateCall = 112, RULE_lambda = 113, RULE_lambdaIn = 114, RULE_pkgAnonymous = 115, 
		RULE_pkgAnonymousAssign = 116, RULE_pkgAnonymousAssignElement = 117, RULE_functionExpression = 118, 
		RULE_plusMinus = 119, RULE_negate = 120, RULE_bitwiseNotExpression = 121, 
		RULE_linq = 122, RULE_linqHeadItem = 123, RULE_linqItem = 124, RULE_judgeExpression = 125, 
		RULE_judgeExpressionElseStatement = 126, RULE_judgeExpressionIfStatement = 127, 
		RULE_judgeExpressionElseIfStatement = 128, RULE_judgeCaseExpression = 129, 
		RULE_caseExpressionStatement = 130, RULE_loopExpression = 131, RULE_loopEachExpression = 132, 
		RULE_loopElseExpression = 133, RULE_checkExpression = 134, RULE_checkErrorExpression = 135, 
		RULE_dataStatement = 136, RULE_stringExpr = 137, RULE_stringContent = 138, 
		RULE_stringTemplate = 139, RULE_rawStringExpr = 140, RULE_rawStringContent = 141, 
		RULE_rawStringTemplate = 142, RULE_floatExpr = 143, RULE_integerExpr = 144, 
		RULE_typeNotNull = 145, RULE_typeType = 146, RULE_typeNullable = 147, 
		RULE_typeArray = 148, RULE_typeList = 149, RULE_typeSet = 150, RULE_typeDictionary = 151, 
		RULE_typeStack = 152, RULE_typeQueue = 153, RULE_typeChannel = 154, RULE_typePackage = 155, 
		RULE_typeFunction = 156, RULE_typeAny = 157, RULE_typeFunctionParameterClause = 158, 
		RULE_typeBasic = 159, RULE_nilExpr = 160, RULE_boolExpr = 161, RULE_bitwise = 162, 
		RULE_bitwiseAnd = 163, RULE_bitwiseOr = 164, RULE_bitwiseNot = 165, RULE_bitwiseXor = 166, 
		RULE_bitwiseLeftShift = 167, RULE_bitwiseRightShift = 168, RULE_compareCombine = 169, 
		RULE_compare = 170, RULE_logic = 171, RULE_assign = 172, RULE_add = 173, 
		RULE_mul = 174, RULE_pow = 175, RULE_call = 176, RULE_wave = 177, RULE_id = 178, 
		RULE_idItem = 179, RULE_end = 180, RULE_more = 181, RULE_left_brace = 182, 
		RULE_right_brace = 183, RULE_left_paren = 184, RULE_right_paren = 185, 
		RULE_left_brack = 186, RULE_right_brack = 187;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "exportStatement", "namespaceSupportStatement", 
			"importStatement", "importSubStatement", "typeAliasStatement", "typeRedefineStatement", 
			"typeTagStatement", "enumStatement", "enumSupportStatement", "namespaceVariableStatement", 
			"namespaceConstantStatement", "namespaceFunctionStatement", "packageStatement", 
			"packageStaticStatement", "packageStaticSupportStatement", "packageStaticVariableStatement", 
			"packageStaticConstantStatement", "packageStaticFunctionStatement", "packageFieldStatement", 
			"packageSupportStatement", "includeStatement", "packageNewStatement", 
			"packageVariableStatement", "packageConstantStatement", "packageFunctionStatement", 
			"packageControlSubStatement", "packageEventStatement", "implementStatement", 
			"overrideVariableStatement", "overrideConstantStatement", "overrideFunctionStatement", 
			"protocolStatement", "protocolSubStatement", "protocolSupportStatement", 
			"protocolVariableStatement", "protocolFunctionStatement", "functionStatement", 
			"returnStatement", "returnAsyncStatement", "yieldReturnStatement", "yieldBreakStatement", 
			"parameterClauseIn", "parameterClauseOut", "parameter", "functionSupportStatement", 
			"judgeCaseStatement", "caseStatement", "caseExprStatement", "judgeStatement", 
			"judgeElseStatement", "judgeIfStatement", "judgeElseIfStatement", "loopStatement", 
			"loopEachStatement", "loopCaseStatement", "loopElseStatement", "loopJumpStatement", 
			"loopContinueStatement", "checkStatement", "usingStatement", "checkErrorStatement", 
			"checkFinallyStatment", "checkReportStatement", "iteratorStatement", 
			"variableDeclaredStatement", "constantDeclaredStatement", "varStatement", 
			"bindStatement", "assignStatement", "expressionStatement", "annotationStatement", 
			"varId", "constId", "tupleExpression", "primaryExpression", "expression", 
			"callExpression", "tuple", "expressionList", "annotationSupport", "annotation", 
			"annotationList", "annotationItem", "annotationString", "callFunc", "callAsync", 
			"callAwait", "callChannel", "transfer", "callElement", "callPkg", "callNew", 
			"orElse", "typeConversion", "typeCheck", "pkgAssign", "pkgAssignElement", 
			"listAssign", "dictionaryAssign", "list", "dictionary", "dictionaryElement", 
			"slice", "sliceFull", "sliceStart", "sliceEnd", "nameSpaceItem", "name", 
			"templateDefine", "templateDefineItem", "templateCall", "lambda", "lambdaIn", 
			"pkgAnonymous", "pkgAnonymousAssign", "pkgAnonymousAssignElement", "functionExpression", 
			"plusMinus", "negate", "bitwiseNotExpression", "linq", "linqHeadItem", 
			"linqItem", "judgeExpression", "judgeExpressionElseStatement", "judgeExpressionIfStatement", 
			"judgeExpressionElseIfStatement", "judgeCaseExpression", "caseExpressionStatement", 
			"loopExpression", "loopEachExpression", "loopElseExpression", "checkExpression", 
			"checkErrorExpression", "dataStatement", "stringExpr", "stringContent", 
			"stringTemplate", "rawStringExpr", "rawStringContent", "rawStringTemplate", 
			"floatExpr", "integerExpr", "typeNotNull", "typeType", "typeNullable", 
			"typeArray", "typeList", "typeSet", "typeDictionary", "typeStack", "typeQueue", 
			"typeChannel", "typePackage", "typeFunction", "typeAny", "typeFunctionParameterClause", 
			"typeBasic", "nilExpr", "boolExpr", "bitwise", "bitwiseAnd", "bitwiseOr", 
			"bitwiseNot", "bitwiseXor", "bitwiseLeftShift", "bitwiseRightShift", 
			"compareCombine", "compare", "logic", "assign", "add", "mul", "pow", 
			"call", "wave", "id", "idItem", "end", "more", "left_brace", "right_brace", 
			"left_paren", "right_paren", "left_brack", "right_brack"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "':='", "'=='", 
			"'<='", "'>='", "'><'", "'<>'", "'/\\'", "'\\/'", "'...'", "'..<'", "'..>'", 
			"'..'", "'.'", "',,,'", "',,'", "','", "'->>'", "'<<-'", "'->'", "'<-'", 
			"'~>'", "'<~'", "'='", "'<<'", "'>>'", "'&&'", "'||'", "'^^'", "'~~'", 
			"'<'", "'>'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
			"'?'", "'@'", "'!'", "'$'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&'", "'|'", "'^'", "'`'", "'#'", "'i8'", "'u8'", "'i16'", "'u16'", 
			"'i32'", "'u32'", "'i64'", "'u64'", "'f32'", "'f64'", "'chr'", "'str'", 
			"'bool'", "'int'", "'num'", "'byte'", "'any'", "'nil'", "'true'", "'false'", 
			"'undef'", null, null, null, null, null, null, null, null, null, null, 
			"'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Add_Equal", "Sub_Equal", "Mul_Equal", "Div_Equal", "Mod_Equal", 
			"Pow_Equal", "Colon_Equal", "Equal_Equal", "Less_Equal", "Greater_Equal", 
			"Not_Equal", "Combine_Equal", "Forward_Back_Slash", "Back_Forward_Slash", 
			"Dot_Dot_Dot", "Dot_Dot_Less", "Dot_Dot_Greater", "Dot_Dot", "Dot", "Comma_Comma_Comma", 
			"Comma_Comma", "Comma", "Right_Flow", "Left_Flow", "Right_Arrow", "Left_Arrow", 
			"Right_Wave", "Left_Wave", "Equal", "Less_Less", "Greater_Greater", "And_And", 
			"Or_Or", "Caret_Caret", "Tilde_Tilde", "Less", "Greater", "Semi", "Left_Paren", 
			"Right_Paren", "Left_Brace", "Right_Brace", "Left_Brack", "Right_Brack", 
			"Colon", "Question", "At", "Bang", "Coin", "Tilde", "Add", "Sub", "Mul", 
			"Div", "Mod", "And", "Or", "Caret", "Grave", "Sharp", "TypeI8", "TypeU8", 
			"TypeI16", "TypeU16", "TypeI32", "TypeU32", "TypeI64", "TypeU64", "TypeF32", 
			"TypeF64", "TypeChr", "TypeStr", "TypeBool", "TypeInt", "TypeNum", "TypeByte", 
			"TypeAny", "NilLiteral", "TrueLiteral", "FalseLiteral", "UndefinedLiteral", 
			"FloatLiteral", "DecimalLiteral", "BinaryLiteral", "OctalLiteral", "HexLiteral", 
			"Quote_Quote_Quote_Open", "Quote_Open", "CharLiteral", "IDPrivate", "IDPublic", 
			"Discard", "Comment_Tag", "Comment_Block", "Comment_Line", "New_Line", 
			"WS", "Quote_Close", "String_Template_Open", "TextLiteral", "Quote_Quote_Quote_Close", 
			"Raw_Quote", "Raw_String_Template_Open", "RawTextLiteral"
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
	public String getGrammarFileName() { return "KParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(376);
				statement();
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Left_Arrow || _la==Sharp || _la==New_Line );
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

	public static class StatementContext extends ParserRuleContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<NamespaceSupportStatementContext> namespaceSupportStatement() {
			return getRuleContexts(NamespaceSupportStatementContext.class);
		}
		public NamespaceSupportStatementContext namespaceSupportStatement(int i) {
			return getRuleContext(NamespaceSupportStatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(381);
				match(New_Line);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(387);
				annotationSupport();
				}
			}

			setState(390);
			exportStatement();
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(New_Line);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					namespaceSupportStatement();
					}
					} 
				}
				setState(402);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Left_Arrow() { return getToken(KParser.Left_Arrow, 0); }
		public NameSpaceItemContext nameSpaceItem() {
			return getRuleContext(NameSpaceItemContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Left_Arrow);
			setState(404);
			nameSpaceItem();
			setState(405);
			end();
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

	public static class NamespaceSupportStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public NamespaceFunctionStatementContext namespaceFunctionStatement() {
			return getRuleContext(NamespaceFunctionStatementContext.class,0);
		}
		public NamespaceVariableStatementContext namespaceVariableStatement() {
			return getRuleContext(NamespaceVariableStatementContext.class,0);
		}
		public NamespaceConstantStatementContext namespaceConstantStatement() {
			return getRuleContext(NamespaceConstantStatementContext.class,0);
		}
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public ProtocolStatementContext protocolStatement() {
			return getRuleContext(ProtocolStatementContext.class,0);
		}
		public ImplementStatementContext implementStatement() {
			return getRuleContext(ImplementStatementContext.class,0);
		}
		public EnumStatementContext enumStatement() {
			return getRuleContext(EnumStatementContext.class,0);
		}
		public TypeRedefineStatementContext typeRedefineStatement() {
			return getRuleContext(TypeRedefineStatementContext.class,0);
		}
		public TypeTagStatementContext typeTagStatement() {
			return getRuleContext(TypeTagStatementContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public NamespaceSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNamespaceSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNamespaceSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNamespaceSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceSupportStatementContext namespaceSupportStatement() throws RecognitionException {
		NamespaceSupportStatementContext _localctx = new NamespaceSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespaceSupportStatement);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				namespaceFunctionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				namespaceVariableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				namespaceConstantStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				packageStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				protocolStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				implementStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(414);
				enumStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(415);
				typeRedefineStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				typeTagStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(417);
				match(New_Line);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ImportSubStatementContext> importSubStatement() {
			return getRuleContexts(ImportSubStatementContext.class);
		}
		public ImportSubStatementContext importSubStatement(int i) {
			return getRuleContext(ImportSubStatementContext.class,i);
		}
		public List<TypeAliasStatementContext> typeAliasStatement() {
			return getRuleContexts(TypeAliasStatementContext.class);
		}
		public TypeAliasStatementContext typeAliasStatement(int i) {
			return getRuleContext(TypeAliasStatementContext.class,i);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Right_Arrow);
			setState(421);
			left_brace();
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(422);
						importSubStatement();
						}
						break;
					case 2:
						{
						setState(423);
						typeAliasStatement();
						}
						break;
					case 3:
						{
						setState(424);
						match(New_Line);
						}
						break;
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(430);
			right_brace();
			setState(431);
			end();
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

	public static class ImportSubStatementContext extends ParserRuleContext {
		public NameSpaceItemContext nameSpaceItem() {
			return getRuleContext(NameSpaceItemContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public ImportSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterImportSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitImportSubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitImportSubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSubStatementContext importSubStatement() throws RecognitionException {
		ImportSubStatementContext _localctx = new ImportSubStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importSubStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(433);
				annotationSupport();
				}
			}

			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TypeI8:
				case TypeU8:
				case TypeI16:
				case TypeU16:
				case TypeI32:
				case TypeU32:
				case TypeI64:
				case TypeU64:
				case TypeF32:
				case TypeF64:
				case TypeChr:
				case TypeStr:
				case TypeBool:
				case TypeInt:
				case TypeNum:
				case TypeByte:
				case TypeAny:
				case IDPrivate:
				case IDPublic:
					{
					setState(436);
					id();
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Bang) {
						{
						setState(437);
						match(Bang);
						}
					}

					}
					break;
				case Discard:
					{
					setState(440);
					match(Discard);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
				match(Colon);
				}
				break;
			}
			setState(446);
			nameSpaceItem();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quote_Open) {
				{
				setState(447);
				stringExpr();
				}
			}

			setState(450);
			end();
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

	public static class TypeAliasStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TypeAliasStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeAliasStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeAliasStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeAliasStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasStatementContext typeAliasStatement() throws RecognitionException {
		TypeAliasStatementContext _localctx = new TypeAliasStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeAliasStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			id();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(453);
				match(Bang);
				}
			}

			setState(456);
			match(Colon);
			setState(457);
			typeType();
			setState(458);
			end();
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

	public static class TypeRedefineStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public TypeRedefineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRedefineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeRedefineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeRedefineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeRedefineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRedefineStatementContext typeRedefineStatement() throws RecognitionException {
		TypeRedefineStatementContext _localctx = new TypeRedefineStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeRedefineStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			id();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(461);
				match(Bang);
				}
			}

			setState(464);
			match(Colon);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(465);
				match(New_Line);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			typeType();
			setState(472);
			end();
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

	public static class TypeTagStatementContext extends ParserRuleContext {
		public TerminalNode Comment_Tag() { return getToken(KParser.Comment_Tag, 0); }
		public TypeTagStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTagStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeTagStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeTagStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeTagStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTagStatementContext typeTagStatement() throws RecognitionException {
		TypeTagStatementContext _localctx = new TypeTagStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeTagStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(Comment_Tag);
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

	public static class EnumStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(KParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(KParser.Colon, i);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<EnumSupportStatementContext> enumSupportStatement() {
			return getRuleContexts(EnumSupportStatementContext.class);
		}
		public EnumSupportStatementContext enumSupportStatement(int i) {
			return getRuleContext(EnumSupportStatementContext.class,i);
		}
		public EnumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitEnumStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumStatementContext enumStatement() throws RecognitionException {
		EnumStatementContext _localctx = new EnumStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(476);
				annotationSupport();
				}
			}

			setState(479);
			id();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(480);
				match(Bang);
				}
			}

			setState(483);
			match(Colon);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(484);
				match(New_Line);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			left_brack();
			setState(491);
			match(Colon);
			setState(492);
			right_brack();
			setState(493);
			left_brace();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
				{
				{
				setState(494);
				enumSupportStatement();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			right_brace();
			setState(501);
			end();
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

	public static class EnumSupportStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public IntegerExprContext integerExpr() {
			return getRuleContext(IntegerExprContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public EnumSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterEnumSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitEnumSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitEnumSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSupportStatementContext enumSupportStatement() throws RecognitionException {
		EnumSupportStatementContext _localctx = new EnumSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumSupportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			id();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(504);
				match(Colon);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Add || _la==Sub) {
					{
					setState(505);
					add();
					}
				}

				setState(508);
				integerExpr();
				}
			}

			setState(511);
			end();
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

	public static class NamespaceVariableStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public NamespaceVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNamespaceVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNamespaceVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNamespaceVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceVariableStatementContext namespaceVariableStatement() throws RecognitionException {
		NamespaceVariableStatementContext _localctx = new NamespaceVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespaceVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(513);
				annotationSupport();
				}
			}

			setState(516);
			id();
			setState(517);
			match(Bang);
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(518);
				match(Colon);
				setState(519);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(520);
				typeType();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(521);
					match(Colon);
					setState(522);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(527);
			end();
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

	public static class NamespaceConstantStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public NamespaceConstantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceConstantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNamespaceConstantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNamespaceConstantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNamespaceConstantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceConstantStatementContext namespaceConstantStatement() throws RecognitionException {
		NamespaceConstantStatementContext _localctx = new NamespaceConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespaceConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(529);
				annotationSupport();
				}
			}

			setState(532);
			id();
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(533);
				match(Colon);
				setState(534);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(535);
				typeType();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(536);
					match(Colon);
					setState(537);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542);
			end();
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

	public static class NamespaceFunctionStatementContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public NamespaceFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNamespaceFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNamespaceFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNamespaceFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceFunctionStatementContext namespaceFunctionStatement() throws RecognitionException {
		NamespaceFunctionStatementContext _localctx = new NamespaceFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_namespaceFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(544);
				annotationSupport();
				}
			}

			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(547);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(548);
				left_brack();
				setState(549);
				id();
				setState(550);
				templateDefine();
				setState(551);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(555);
			match(Colon);
			setState(556);
			left_paren();
			setState(557);
			parameterClauseIn();
			setState(558);
			((NamespaceFunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((NamespaceFunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(559);
				((NamespaceFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(562);
				((NamespaceFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(565);
				match(New_Line);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			parameterClauseOut();
			setState(572);
			right_paren();
			setState(573);
			left_brace();
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					functionSupportStatement();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(580);
			right_brace();
			setState(581);
			end();
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public List<PackageNewStatementContext> packageNewStatement() {
			return getRuleContexts(PackageNewStatementContext.class);
		}
		public PackageNewStatementContext packageNewStatement(int i) {
			return getRuleContext(PackageNewStatementContext.class,i);
		}
		public List<PackageFieldStatementContext> packageFieldStatement() {
			return getRuleContexts(PackageFieldStatementContext.class);
		}
		public PackageFieldStatementContext packageFieldStatement(int i) {
			return getRuleContext(PackageFieldStatementContext.class,i);
		}
		public List<IncludeStatementContext> includeStatement() {
			return getRuleContexts(IncludeStatementContext.class);
		}
		public IncludeStatementContext includeStatement(int i) {
			return getRuleContext(IncludeStatementContext.class,i);
		}
		public List<PackageStaticStatementContext> packageStaticStatement() {
			return getRuleContexts(PackageStaticStatementContext.class);
		}
		public PackageStaticStatementContext packageStaticStatement(int i) {
			return getRuleContext(PackageStaticStatementContext.class,i);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<TerminalNode> Back_Forward_Slash() { return getTokens(KParser.Back_Forward_Slash); }
		public TerminalNode Back_Forward_Slash(int i) {
			return getToken(KParser.Back_Forward_Slash, i);
		}
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_packageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(583);
				annotationSupport();
				}
			}

			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(586);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(587);
				left_brack();
				setState(588);
				id();
				setState(589);
				templateDefine();
				setState(590);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(594);
				match(Bang);
				}
			}

			setState(597);
			match(Colon);
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(598);
				packageNewStatement();
				}
				break;
			case 2:
				{
				setState(599);
				packageFieldStatement();
				}
				break;
			case 3:
				{
				setState(600);
				includeStatement();
				}
				break;
			case 4:
				{
				setState(601);
				packageStaticStatement();
				}
				break;
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Back_Forward_Slash) {
				{
				{
				setState(604);
				match(Back_Forward_Slash);
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(605);
					packageNewStatement();
					}
					break;
				case 2:
					{
					setState(606);
					packageFieldStatement();
					}
					break;
				case 3:
					{
					setState(607);
					includeStatement();
					}
					break;
				case 4:
					{
					setState(608);
					packageStaticStatement();
					}
					break;
				}
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			end();
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

	public static class PackageStaticStatementContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<PackageStaticSupportStatementContext> packageStaticSupportStatement() {
			return getRuleContexts(PackageStaticSupportStatementContext.class);
		}
		public PackageStaticSupportStatementContext packageStaticSupportStatement(int i) {
			return getRuleContext(PackageStaticSupportStatementContext.class,i);
		}
		public PackageStaticStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStaticStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStaticStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStaticStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStaticStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStaticStatementContext packageStaticStatement() throws RecognitionException {
		PackageStaticStatementContext _localctx = new PackageStaticStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_packageStaticStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			left_brace();
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					packageStaticSupportStatement();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(625);
			right_brace();
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

	public static class PackageStaticSupportStatementContext extends ParserRuleContext {
		public PackageStaticFunctionStatementContext packageStaticFunctionStatement() {
			return getRuleContext(PackageStaticFunctionStatementContext.class,0);
		}
		public PackageStaticVariableStatementContext packageStaticVariableStatement() {
			return getRuleContext(PackageStaticVariableStatementContext.class,0);
		}
		public PackageStaticConstantStatementContext packageStaticConstantStatement() {
			return getRuleContext(PackageStaticConstantStatementContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public PackageStaticSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStaticSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStaticSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStaticSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStaticSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStaticSupportStatementContext packageStaticSupportStatement() throws RecognitionException {
		PackageStaticSupportStatementContext _localctx = new PackageStaticSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_packageStaticSupportStatement);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				packageStaticFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				packageStaticVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				packageStaticConstantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				match(New_Line);
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

	public static class PackageStaticVariableStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public PackageStaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStaticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStaticVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStaticVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStaticVariableStatementContext packageStaticVariableStatement() throws RecognitionException {
		PackageStaticVariableStatementContext _localctx = new PackageStaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_packageStaticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(633);
				annotationSupport();
				}
			}

			setState(636);
			id();
			setState(637);
			match(Bang);
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(638);
				match(Colon);
				setState(639);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(640);
				typeType();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(641);
					match(Colon);
					setState(642);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(647);
			end();
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

	public static class PackageStaticConstantStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public PackageStaticConstantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStaticConstantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStaticConstantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStaticConstantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStaticConstantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStaticConstantStatementContext packageStaticConstantStatement() throws RecognitionException {
		PackageStaticConstantStatementContext _localctx = new PackageStaticConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_packageStaticConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(649);
				annotationSupport();
				}
			}

			setState(652);
			id();
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(653);
				match(Colon);
				setState(654);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(655);
				typeType();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(656);
					match(Colon);
					setState(657);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(662);
			end();
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

	public static class PackageStaticFunctionStatementContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public PackageStaticFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStaticFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageStaticFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageStaticFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageStaticFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStaticFunctionStatementContext packageStaticFunctionStatement() throws RecognitionException {
		PackageStaticFunctionStatementContext _localctx = new PackageStaticFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_packageStaticFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(664);
				annotationSupport();
				}
			}

			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(667);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(668);
				left_brack();
				setState(669);
				id();
				setState(670);
				templateDefine();
				setState(671);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(675);
			match(Colon);
			setState(676);
			left_paren();
			setState(677);
			parameterClauseIn();
			setState(678);
			((PackageStaticFunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((PackageStaticFunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(679);
				((PackageStaticFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(682);
				((PackageStaticFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(685);
				match(New_Line);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			parameterClauseOut();
			setState(692);
			right_paren();
			setState(693);
			left_brace();
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					functionSupportStatement();
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(700);
			right_brace();
			setState(701);
			end();
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

	public static class PackageFieldStatementContext extends ParserRuleContext {
		public Token p;
		public TerminalNode Coin() { return getToken(KParser.Coin, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<PackageSupportStatementContext> packageSupportStatement() {
			return getRuleContexts(PackageSupportStatementContext.class);
		}
		public PackageSupportStatementContext packageSupportStatement(int i) {
			return getRuleContext(PackageSupportStatementContext.class,i);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public PackageFieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageFieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageFieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageFieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageFieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageFieldStatementContext packageFieldStatement() throws RecognitionException {
		PackageFieldStatementContext _localctx = new PackageFieldStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_packageFieldStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(Coin);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (Question - 46)) | (1L << (TypeI8 - 46)) | (1L << (TypeU8 - 46)) | (1L << (TypeI16 - 46)) | (1L << (TypeU16 - 46)) | (1L << (TypeI32 - 46)) | (1L << (TypeU32 - 46)) | (1L << (TypeI64 - 46)) | (1L << (TypeU64 - 46)) | (1L << (TypeF32 - 46)) | (1L << (TypeF64 - 46)) | (1L << (TypeChr - 46)) | (1L << (TypeStr - 46)) | (1L << (TypeBool - 46)) | (1L << (TypeInt - 46)) | (1L << (TypeNum - 46)) | (1L << (TypeByte - 46)) | (1L << (TypeAny - 46)) | (1L << (IDPrivate - 46)) | (1L << (IDPublic - 46)))) != 0)) {
				{
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Question) {
					{
					setState(704);
					((PackageFieldStatementContext)_localctx).p = match(Question);
					}
				}

				setState(707);
				id();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(708);
					more();
					setState(709);
					id();
					}
				}

				}
			}

			setState(715);
			left_brace();
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					packageSupportStatement();
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(722);
			right_brace();
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

	public static class PackageSupportStatementContext extends ParserRuleContext {
		public PackageFunctionStatementContext packageFunctionStatement() {
			return getRuleContext(PackageFunctionStatementContext.class,0);
		}
		public PackageVariableStatementContext packageVariableStatement() {
			return getRuleContext(PackageVariableStatementContext.class,0);
		}
		public PackageConstantStatementContext packageConstantStatement() {
			return getRuleContext(PackageConstantStatementContext.class,0);
		}
		public PackageEventStatementContext packageEventStatement() {
			return getRuleContext(PackageEventStatementContext.class,0);
		}
		public OverrideFunctionStatementContext overrideFunctionStatement() {
			return getRuleContext(OverrideFunctionStatementContext.class,0);
		}
		public OverrideVariableStatementContext overrideVariableStatement() {
			return getRuleContext(OverrideVariableStatementContext.class,0);
		}
		public OverrideConstantStatementContext overrideConstantStatement() {
			return getRuleContext(OverrideConstantStatementContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public PackageSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageSupportStatementContext packageSupportStatement() throws RecognitionException {
		PackageSupportStatementContext _localctx = new PackageSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_packageSupportStatement);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				packageFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				packageVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				packageConstantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				packageEventStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				overrideFunctionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				overrideVariableStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
				overrideConstantStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(731);
				match(New_Line);
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

	public static class IncludeStatementContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			typeType();
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

	public static class PackageNewStatementContext extends ParserRuleContext {
		public Token p;
		public List<Left_parenContext> left_paren() {
			return getRuleContexts(Left_parenContext.class);
		}
		public Left_parenContext left_paren(int i) {
			return getRuleContext(Left_parenContext.class,i);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Coin() { return getToken(KParser.Coin, 0); }
		public List<Right_parenContext> right_paren() {
			return getRuleContexts(Right_parenContext.class);
		}
		public Right_parenContext right_paren(int i) {
			return getRuleContext(Right_parenContext.class,i);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PackageNewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageNewStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageNewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageNewStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageNewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNewStatementContext packageNewStatement() throws RecognitionException {
		PackageNewStatementContext _localctx = new PackageNewStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_packageNewStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(736);
				annotationSupport();
				}
			}

			setState(739);
			left_paren();
			setState(740);
			parameterClauseIn();
			setState(741);
			match(Right_Arrow);
			setState(742);
			match(Coin);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(743);
				((PackageNewStatementContext)_localctx).p = match(Question);
				}
			}

			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
				{
				setState(746);
				id();
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(747);
					more();
					setState(748);
					id();
					}
				}

				}
			}

			setState(754);
			right_paren();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Paren) {
				{
				setState(755);
				left_paren();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					setState(756);
					expressionList();
					}
				}

				setState(759);
				right_paren();
				}
			}

			setState(763);
			left_brace();
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(764);
					functionSupportStatement();
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(770);
			right_brace();
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

	public static class PackageVariableStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public PackageVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageVariableStatementContext packageVariableStatement() throws RecognitionException {
		PackageVariableStatementContext _localctx = new PackageVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_packageVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(772);
				annotationSupport();
				}
			}

			setState(775);
			id();
			setState(776);
			match(Bang);
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(777);
				match(Colon);
				setState(778);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(779);
				typeType();
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(780);
					match(Colon);
					setState(781);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(786);
			end();
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

	public static class PackageConstantStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public PackageConstantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageConstantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageConstantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageConstantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageConstantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageConstantStatementContext packageConstantStatement() throws RecognitionException {
		PackageConstantStatementContext _localctx = new PackageConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_packageConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(788);
				annotationSupport();
				}
			}

			setState(791);
			id();
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(792);
				match(Colon);
				setState(793);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(794);
				typeType();
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(795);
					match(Colon);
					setState(796);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(801);
			end();
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

	public static class PackageFunctionStatementContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public PackageFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageFunctionStatementContext packageFunctionStatement() throws RecognitionException {
		PackageFunctionStatementContext _localctx = new PackageFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_packageFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(803);
				annotationSupport();
				}
			}

			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(806);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(807);
				left_brack();
				setState(808);
				id();
				setState(809);
				templateDefine();
				setState(810);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(814);
			match(Colon);
			setState(815);
			left_paren();
			setState(816);
			parameterClauseIn();
			setState(817);
			((PackageFunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((PackageFunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(818);
				((PackageFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(821);
				((PackageFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(824);
				match(New_Line);
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			parameterClauseOut();
			setState(831);
			right_paren();
			setState(832);
			left_brace();
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(833);
					functionSupportStatement();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(839);
			right_brace();
			setState(840);
			end();
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

	public static class PackageControlSubStatementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public PackageControlSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageControlSubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageControlSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageControlSubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageControlSubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageControlSubStatementContext packageControlSubStatement() throws RecognitionException {
		PackageControlSubStatementContext _localctx = new PackageControlSubStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_packageControlSubStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			id();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Paren) {
				{
				setState(843);
				left_paren();
				setState(844);
				id();
				setState(845);
				right_paren();
				}
			}

			setState(849);
			left_brace();
			setState(851); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(850);
					functionSupportStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(853); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(855);
			right_brace();
			setState(856);
			end();
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

	public static class PackageEventStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public NameSpaceItemContext nameSpaceItem() {
			return getRuleContext(NameSpaceItemContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public PackageEventStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageEventStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPackageEventStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPackageEventStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPackageEventStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageEventStatementContext packageEventStatement() throws RecognitionException {
		PackageEventStatementContext _localctx = new PackageEventStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_packageEventStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			id();
			setState(859);
			match(Bang);
			setState(860);
			left_brack();
			setState(861);
			match(Right_Arrow);
			setState(862);
			right_brack();
			setState(863);
			nameSpaceItem();
			setState(864);
			end();
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

	public static class ImplementStatementContext extends ParserRuleContext {
		public TerminalNode Colon_Equal() { return getToken(KParser.Colon_Equal, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public List<PackageNewStatementContext> packageNewStatement() {
			return getRuleContexts(PackageNewStatementContext.class);
		}
		public PackageNewStatementContext packageNewStatement(int i) {
			return getRuleContext(PackageNewStatementContext.class,i);
		}
		public List<PackageFieldStatementContext> packageFieldStatement() {
			return getRuleContexts(PackageFieldStatementContext.class);
		}
		public PackageFieldStatementContext packageFieldStatement(int i) {
			return getRuleContext(PackageFieldStatementContext.class,i);
		}
		public List<IncludeStatementContext> includeStatement() {
			return getRuleContexts(IncludeStatementContext.class);
		}
		public IncludeStatementContext includeStatement(int i) {
			return getRuleContext(IncludeStatementContext.class,i);
		}
		public List<TerminalNode> Back_Forward_Slash() { return getTokens(KParser.Back_Forward_Slash); }
		public TerminalNode Back_Forward_Slash(int i) {
			return getToken(KParser.Back_Forward_Slash, i);
		}
		public ImplementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterImplementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitImplementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitImplementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementStatementContext implementStatement() throws RecognitionException {
		ImplementStatementContext _localctx = new ImplementStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_implementStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(866);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(867);
				left_brack();
				setState(868);
				id();
				setState(869);
				templateDefine();
				setState(870);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(874);
			match(Colon_Equal);
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(875);
				packageNewStatement();
				}
				break;
			case 2:
				{
				setState(876);
				packageFieldStatement();
				}
				break;
			case 3:
				{
				setState(877);
				includeStatement();
				}
				break;
			}
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Back_Forward_Slash) {
				{
				{
				setState(880);
				match(Back_Forward_Slash);
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(881);
					packageNewStatement();
					}
					break;
				case 2:
					{
					setState(882);
					packageFieldStatement();
					}
					break;
				case 3:
					{
					setState(883);
					includeStatement();
					}
					break;
				}
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(891);
			end();
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

	public static class OverrideVariableStatementContext extends ParserRuleContext {
		public Token n;
		public TerminalNode Dot() { return getToken(KParser.Dot, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public OverrideVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterOverrideVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitOverrideVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitOverrideVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideVariableStatementContext overrideVariableStatement() throws RecognitionException {
		OverrideVariableStatementContext _localctx = new OverrideVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_overrideVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(893);
				annotationSupport();
				}
			}

			setState(896);
			match(Dot);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(897);
				((OverrideVariableStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(900);
			id();
			setState(901);
			match(Bang);
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(902);
				match(Colon);
				setState(903);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(904);
				typeType();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(905);
					match(Colon);
					setState(906);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(911);
			end();
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

	public static class OverrideConstantStatementContext extends ParserRuleContext {
		public Token n;
		public TerminalNode Dot() { return getToken(KParser.Dot, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public OverrideConstantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideConstantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterOverrideConstantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitOverrideConstantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitOverrideConstantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideConstantStatementContext overrideConstantStatement() throws RecognitionException {
		OverrideConstantStatementContext _localctx = new OverrideConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_overrideConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(913);
				annotationSupport();
				}
			}

			setState(916);
			match(Dot);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(917);
				((OverrideConstantStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(920);
			id();
			setState(928);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(921);
				match(Colon);
				setState(922);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(923);
				typeType();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(924);
					match(Colon);
					setState(925);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(930);
			end();
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

	public static class OverrideFunctionStatementContext extends ParserRuleContext {
		public Token n;
		public Token t;
		public Token b;
		public Token y;
		public TerminalNode Dot() { return getToken(KParser.Dot, 0); }
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public OverrideFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterOverrideFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitOverrideFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitOverrideFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideFunctionStatementContext overrideFunctionStatement() throws RecognitionException {
		OverrideFunctionStatementContext _localctx = new OverrideFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_overrideFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(932);
				annotationSupport();
				}
			}

			setState(935);
			match(Dot);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(936);
				((OverrideFunctionStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(939);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(940);
				left_brack();
				setState(941);
				id();
				setState(942);
				templateDefine();
				setState(943);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(947);
			match(Colon);
			setState(948);
			left_paren();
			setState(949);
			parameterClauseIn();
			setState(950);
			((OverrideFunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((OverrideFunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(951);
				((OverrideFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(954);
				((OverrideFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(957);
				match(New_Line);
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			parameterClauseOut();
			setState(964);
			right_paren();
			setState(965);
			left_brace();
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(966);
					functionSupportStatement();
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(972);
			right_brace();
			setState(973);
			end();
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

	public static class ProtocolStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public List<ProtocolSubStatementContext> protocolSubStatement() {
			return getRuleContexts(ProtocolSubStatementContext.class);
		}
		public ProtocolSubStatementContext protocolSubStatement(int i) {
			return getRuleContext(ProtocolSubStatementContext.class,i);
		}
		public List<IncludeStatementContext> includeStatement() {
			return getRuleContexts(IncludeStatementContext.class);
		}
		public IncludeStatementContext includeStatement(int i) {
			return getRuleContext(IncludeStatementContext.class,i);
		}
		public List<TerminalNode> Back_Forward_Slash() { return getTokens(KParser.Back_Forward_Slash); }
		public TerminalNode Back_Forward_Slash(int i) {
			return getToken(KParser.Back_Forward_Slash, i);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public ProtocolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProtocolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProtocolStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProtocolStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolStatementContext protocolStatement() throws RecognitionException {
		ProtocolStatementContext _localctx = new ProtocolStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_protocolStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(975);
				annotationSupport();
				}
			}

			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(978);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(979);
				left_brack();
				setState(980);
				id();
				setState(981);
				templateDefine();
				setState(982);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(986);
				match(Bang);
				}
			}

			setState(989);
			match(Colon);
			setState(1024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Coin:
				{
				setState(990);
				protocolSubStatement();
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Back_Forward_Slash) {
					{
					{
					setState(991);
					match(Back_Forward_Slash);
					setState(994);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Coin:
						{
						setState(992);
						protocolSubStatement();
						}
						break;
					case Left_Paren:
					case Left_Brack:
					case Question:
					case TypeI8:
					case TypeU8:
					case TypeI16:
					case TypeU16:
					case TypeI32:
					case TypeU32:
					case TypeI64:
					case TypeU64:
					case TypeF32:
					case TypeF64:
					case TypeChr:
					case TypeStr:
					case TypeBool:
					case TypeInt:
					case TypeNum:
					case TypeByte:
					case TypeAny:
					case IDPrivate:
					case IDPublic:
						{
						setState(993);
						includeStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1000);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(1001);
				includeStatement();
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1002);
						match(Back_Forward_Slash);
						setState(1005);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Coin:
							{
							setState(1003);
							protocolSubStatement();
							}
							break;
						case Left_Paren:
						case Left_Brack:
						case Question:
						case TypeI8:
						case TypeU8:
						case TypeI16:
						case TypeU16:
						case TypeI32:
						case TypeU32:
						case TypeI64:
						case TypeU64:
						case TypeF32:
						case TypeF64:
						case TypeChr:
						case TypeStr:
						case TypeBool:
						case TypeInt:
						case TypeNum:
						case TypeByte:
						case TypeAny:
						case IDPrivate:
						case IDPublic:
							{
							setState(1004);
							includeStatement();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1011);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(1012);
				match(Back_Forward_Slash);
				setState(1013);
				protocolSubStatement();
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Back_Forward_Slash) {
					{
					{
					setState(1014);
					match(Back_Forward_Slash);
					setState(1017);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Coin:
						{
						setState(1015);
						protocolSubStatement();
						}
						break;
					case Left_Paren:
					case Left_Brack:
					case Question:
					case TypeI8:
					case TypeU8:
					case TypeI16:
					case TypeU16:
					case TypeI32:
					case TypeU32:
					case TypeI64:
					case TypeU64:
					case TypeF32:
					case TypeF64:
					case TypeChr:
					case TypeStr:
					case TypeBool:
					case TypeInt:
					case TypeNum:
					case TypeByte:
					case TypeAny:
					case IDPrivate:
					case IDPublic:
						{
						setState(1016);
						includeStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1026);
			end();
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

	public static class ProtocolSubStatementContext extends ParserRuleContext {
		public Token p;
		public List<TerminalNode> Coin() { return getTokens(KParser.Coin); }
		public TerminalNode Coin(int i) {
			return getToken(KParser.Coin, i);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ProtocolSupportStatementContext> protocolSupportStatement() {
			return getRuleContexts(ProtocolSupportStatementContext.class);
		}
		public ProtocolSupportStatementContext protocolSupportStatement(int i) {
			return getRuleContext(ProtocolSupportStatementContext.class,i);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public ProtocolSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolSubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProtocolSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProtocolSubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProtocolSubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolSubStatementContext protocolSubStatement() throws RecognitionException {
		ProtocolSubStatementContext _localctx = new ProtocolSubStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_protocolSubStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(Coin);
			setState(1029);
			match(Coin);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (Question - 46)) | (1L << (TypeI8 - 46)) | (1L << (TypeU8 - 46)) | (1L << (TypeI16 - 46)) | (1L << (TypeU16 - 46)) | (1L << (TypeI32 - 46)) | (1L << (TypeU32 - 46)) | (1L << (TypeI64 - 46)) | (1L << (TypeU64 - 46)) | (1L << (TypeF32 - 46)) | (1L << (TypeF64 - 46)) | (1L << (TypeChr - 46)) | (1L << (TypeStr - 46)) | (1L << (TypeBool - 46)) | (1L << (TypeInt - 46)) | (1L << (TypeNum - 46)) | (1L << (TypeByte - 46)) | (1L << (TypeAny - 46)) | (1L << (IDPrivate - 46)) | (1L << (IDPublic - 46)))) != 0)) {
				{
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Question) {
					{
					setState(1030);
					((ProtocolSubStatementContext)_localctx).p = match(Question);
					}
				}

				setState(1033);
				id();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1034);
					more();
					setState(1035);
					id();
					}
				}

				}
			}

			setState(1041);
			left_brace();
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1042);
					protocolSupportStatement();
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1048);
			right_brace();
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

	public static class ProtocolSupportStatementContext extends ParserRuleContext {
		public ProtocolFunctionStatementContext protocolFunctionStatement() {
			return getRuleContext(ProtocolFunctionStatementContext.class,0);
		}
		public ProtocolVariableStatementContext protocolVariableStatement() {
			return getRuleContext(ProtocolVariableStatementContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public ProtocolSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProtocolSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProtocolSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProtocolSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolSupportStatementContext protocolSupportStatement() throws RecognitionException {
		ProtocolSupportStatementContext _localctx = new ProtocolSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_protocolSupportStatement);
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				protocolFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				protocolVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052);
				match(New_Line);
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

	public static class ProtocolVariableStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public ProtocolVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProtocolVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProtocolVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProtocolVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolVariableStatementContext protocolVariableStatement() throws RecognitionException {
		ProtocolVariableStatementContext _localctx = new ProtocolVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_protocolVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(1055);
				annotationSupport();
				}
			}

			setState(1058);
			id();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1059);
				match(Bang);
				}
			}

			setState(1069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(1062);
				match(Colon);
				setState(1063);
				expression(0);
				}
				break;
			case Left_Paren:
			case Left_Brack:
			case Question:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(1064);
				typeType();
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1065);
					match(Colon);
					setState(1066);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1071);
			end();
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

	public static class ProtocolFunctionStatementContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public ProtocolFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterProtocolFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitProtocolFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitProtocolFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolFunctionStatementContext protocolFunctionStatement() throws RecognitionException {
		ProtocolFunctionStatementContext _localctx = new ProtocolFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_protocolFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(1073);
				annotationSupport();
				}
			}

			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(1076);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1077);
				left_brack();
				setState(1078);
				id();
				setState(1079);
				templateDefine();
				setState(1080);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1084);
			left_paren();
			setState(1085);
			parameterClauseIn();
			setState(1086);
			((ProtocolFunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((ProtocolFunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1087);
				((ProtocolFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1090);
				((ProtocolFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1093);
				match(New_Line);
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1099);
			parameterClauseOut();
			setState(1100);
			right_paren();
			setState(1101);
			end();
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateDefineContext templateDefine() {
			return getRuleContext(TemplateDefineContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(1103);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1104);
				left_brack();
				setState(1105);
				id();
				setState(1106);
				templateDefine();
				setState(1107);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1111);
			match(Colon);
			setState(1112);
			left_paren();
			setState(1113);
			parameterClauseIn();
			setState(1114);
			((FunctionStatementContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((FunctionStatementContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1115);
				((FunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1118);
				((FunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1121);
				match(New_Line);
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
			parameterClauseOut();
			setState(1128);
			right_paren();
			setState(1129);
			left_brace();
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1130);
					functionSupportStatement();
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1136);
			right_brace();
			setState(1137);
			end();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Left_Arrow() { return getToken(KParser.Left_Arrow, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(Left_Arrow);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1140);
				tupleExpression();
				}
			}

			setState(1143);
			end();
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

	public static class ReturnAsyncStatementContext extends ParserRuleContext {
		public TerminalNode Left_Flow() { return getToken(KParser.Left_Flow, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public ReturnAsyncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAsyncStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterReturnAsyncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitReturnAsyncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitReturnAsyncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnAsyncStatementContext returnAsyncStatement() throws RecognitionException {
		ReturnAsyncStatementContext _localctx = new ReturnAsyncStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_returnAsyncStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(Left_Flow);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1146);
				tupleExpression();
				}
			}

			setState(1149);
			end();
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

	public static class YieldReturnStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public TerminalNode Left_Arrow() { return getToken(KParser.Left_Arrow, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public YieldReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterYieldReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitYieldReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitYieldReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldReturnStatementContext yieldReturnStatement() throws RecognitionException {
		YieldReturnStatementContext _localctx = new YieldReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_yieldReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(At);
			setState(1152);
			match(Left_Arrow);
			setState(1153);
			tupleExpression();
			setState(1154);
			end();
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

	public static class YieldBreakStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public TerminalNode Left_Arrow() { return getToken(KParser.Left_Arrow, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public YieldBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterYieldBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitYieldBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitYieldBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldBreakStatementContext yieldBreakStatement() throws RecognitionException {
		YieldBreakStatementContext _localctx = new YieldBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_yieldBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(At);
			setState(1157);
			match(Left_Arrow);
			setState(1158);
			end();
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

	public static class ParameterClauseInContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public ParameterClauseInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClauseIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterParameterClauseIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitParameterClauseIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitParameterClauseIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterClauseInContext parameterClauseIn() throws RecognitionException {
		ParameterClauseInContext _localctx = new ParameterClauseInContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameterClauseIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (Sharp - 60)) | (1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
				{
				setState(1160);
				parameter();
				}
			}

			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1163);
				more();
				setState(1164);
				parameter();
				}
				}
				setState(1170);
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

	public static class ParameterClauseOutContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public ParameterClauseOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClauseOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterParameterClauseOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitParameterClauseOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitParameterClauseOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterClauseOutContext parameterClauseOut() throws RecognitionException {
		ParameterClauseOutContext _localctx = new ParameterClauseOutContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parameterClauseOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (Sharp - 60)) | (1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
				{
				setState(1171);
				parameter();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1174);
				more();
				setState(1175);
				parameter();
				}
				}
				setState(1181);
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

	public static class ParameterContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationSupportContext annotationSupport() {
			return getRuleContext(AnnotationSupportContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma_Comma() { return getToken(KParser.Comma_Comma, 0); }
		public TerminalNode Comma_Comma_Comma() { return getToken(KParser.Comma_Comma_Comma, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sharp) {
				{
				setState(1182);
				annotationSupport();
				}
			}

			setState(1185);
			id();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1186);
				match(Bang);
				}
			}

			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma_Comma_Comma || _la==Comma_Comma) {
				{
				setState(1189);
				_la = _input.LA(1);
				if ( !(_la==Comma_Comma_Comma || _la==Comma_Comma) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1192);
			typeType();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1193);
				match(Colon);
				setState(1194);
				expression(0);
				}
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

	public static class FunctionSupportStatementContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnAsyncStatementContext returnAsyncStatement() {
			return getRuleContext(ReturnAsyncStatementContext.class,0);
		}
		public YieldReturnStatementContext yieldReturnStatement() {
			return getRuleContext(YieldReturnStatementContext.class,0);
		}
		public YieldBreakStatementContext yieldBreakStatement() {
			return getRuleContext(YieldBreakStatementContext.class,0);
		}
		public JudgeCaseStatementContext judgeCaseStatement() {
			return getRuleContext(JudgeCaseStatementContext.class,0);
		}
		public JudgeStatementContext judgeStatement() {
			return getRuleContext(JudgeStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopEachStatementContext loopEachStatement() {
			return getRuleContext(LoopEachStatementContext.class,0);
		}
		public LoopCaseStatementContext loopCaseStatement() {
			return getRuleContext(LoopCaseStatementContext.class,0);
		}
		public LoopJumpStatementContext loopJumpStatement() {
			return getRuleContext(LoopJumpStatementContext.class,0);
		}
		public LoopContinueStatementContext loopContinueStatement() {
			return getRuleContext(LoopContinueStatementContext.class,0);
		}
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public CheckStatementContext checkStatement() {
			return getRuleContext(CheckStatementContext.class,0);
		}
		public CheckReportStatementContext checkReportStatement() {
			return getRuleContext(CheckReportStatementContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public VariableDeclaredStatementContext variableDeclaredStatement() {
			return getRuleContext(VariableDeclaredStatementContext.class,0);
		}
		public ConstantDeclaredStatementContext constantDeclaredStatement() {
			return getRuleContext(ConstantDeclaredStatementContext.class,0);
		}
		public VarStatementContext varStatement() {
			return getRuleContext(VarStatementContext.class,0);
		}
		public BindStatementContext bindStatement() {
			return getRuleContext(BindStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AnnotationStatementContext annotationStatement() {
			return getRuleContext(AnnotationStatementContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public FunctionSupportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSupportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterFunctionSupportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitFunctionSupportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitFunctionSupportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSupportStatementContext functionSupportStatement() throws RecognitionException {
		FunctionSupportStatementContext _localctx = new FunctionSupportStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionSupportStatement);
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				returnAsyncStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1199);
				yieldReturnStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1200);
				yieldBreakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1201);
				judgeCaseStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1202);
				judgeStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1203);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1204);
				loopEachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1205);
				loopCaseStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1206);
				loopJumpStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1207);
				loopContinueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1208);
				usingStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1209);
				checkStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1210);
				checkReportStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1211);
				functionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1212);
				variableDeclaredStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1213);
				constantDeclaredStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1214);
				varStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1215);
				bindStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1216);
				assignStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1217);
				expressionStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1218);
				annotationStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1219);
				match(New_Line);
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

	public static class JudgeCaseStatementContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public JudgeCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeCaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeCaseStatementContext judgeCaseStatement() throws RecognitionException {
		JudgeCaseStatementContext _localctx = new JudgeCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_judgeCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(Question);
			setState(1223);
			expression(0);
			setState(1224);
			match(Colon);
			setState(1226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1225);
				caseStatement();
				}
				}
				setState(1228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0) );
			setState(1230);
			end();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public List<CaseExprStatementContext> caseExprStatement() {
			return getRuleContexts(CaseExprStatementContext.class);
		}
		public CaseExprStatementContext caseExprStatement(int i) {
			return getRuleContext(CaseExprStatementContext.class,i);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			caseExprStatement();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1233);
				more();
				setState(1234);
				caseExprStatement();
				}
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1241);
			left_brace();
			setState(1245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1242);
					functionSupportStatement();
					}
					} 
				}
				setState(1247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1248);
			right_brace();
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

	public static class CaseExprStatementContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CaseExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCaseExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCaseExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCaseExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprStatementContext caseExprStatement() throws RecognitionException {
		CaseExprStatementContext _localctx = new CaseExprStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_caseExprStatement);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				match(Discard);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TypeI8:
				case TypeU8:
				case TypeI16:
				case TypeU16:
				case TypeI32:
				case TypeU32:
				case TypeI64:
				case TypeU64:
				case TypeF32:
				case TypeF64:
				case TypeChr:
				case TypeStr:
				case TypeBool:
				case TypeInt:
				case TypeNum:
				case TypeByte:
				case TypeAny:
				case IDPrivate:
				case IDPublic:
					{
					setState(1252);
					id();
					}
					break;
				case Discard:
					{
					setState(1253);
					match(Discard);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1256);
				typeType();
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

	public static class JudgeStatementContext extends ParserRuleContext {
		public JudgeIfStatementContext judgeIfStatement() {
			return getRuleContext(JudgeIfStatementContext.class,0);
		}
		public JudgeElseStatementContext judgeElseStatement() {
			return getRuleContext(JudgeElseStatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<JudgeElseIfStatementContext> judgeElseIfStatement() {
			return getRuleContexts(JudgeElseIfStatementContext.class);
		}
		public JudgeElseIfStatementContext judgeElseIfStatement(int i) {
			return getRuleContext(JudgeElseIfStatementContext.class,i);
		}
		public JudgeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeStatementContext judgeStatement() throws RecognitionException {
		JudgeStatementContext _localctx = new JudgeStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_judgeStatement);
		int _la;
		try {
			int _alt;
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				judgeIfStatement();
				setState(1263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1260);
						judgeElseIfStatement();
						}
						} 
					}
					setState(1265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1266);
				judgeElseStatement();
				setState(1267);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				judgeIfStatement();
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					{
					setState(1270);
					judgeElseIfStatement();
					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1276);
				end();
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

	public static class JudgeElseStatementContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeElseStatementContext judgeElseStatement() throws RecognitionException {
		JudgeElseStatementContext _localctx = new JudgeElseStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_judgeElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(Discard);
			setState(1281);
			left_brace();
			setState(1285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1282);
					functionSupportStatement();
					}
					} 
				}
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1288);
			right_brace();
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

	public static class JudgeIfStatementContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeIfStatementContext judgeIfStatement() throws RecognitionException {
		JudgeIfStatementContext _localctx = new JudgeIfStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_judgeIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(Question);
			setState(1291);
			expression(0);
			setState(1292);
			left_brace();
			setState(1296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1293);
					functionSupportStatement();
					}
					} 
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1299);
			right_brace();
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

	public static class JudgeElseIfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeElseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeElseIfStatementContext judgeElseIfStatement() throws RecognitionException {
		JudgeElseIfStatementContext _localctx = new JudgeElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_judgeElseIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			expression(0);
			setState(1302);
			left_brace();
			setState(1306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1303);
					functionSupportStatement();
					}
					} 
				}
				setState(1308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1309);
			right_brace();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public IteratorStatementContext iteratorStatement() {
			return getRuleContext(IteratorStatementContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseStatementContext loopElseStatement() {
			return getRuleContext(LoopElseStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_loopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(At);
			setState(1312);
			id();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1313);
				match(Bang);
				}
			}

			setState(1316);
			match(Colon);
			setState(1317);
			iteratorStatement();
			setState(1318);
			left_brace();
			setState(1322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1319);
					functionSupportStatement();
					}
					} 
				}
				setState(1324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1325);
			right_brace();
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1326);
				loopElseStatement();
				}
			}

			setState(1329);
			end();
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

	public static class LoopEachStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseStatementContext loopElseStatement() {
			return getRuleContext(LoopElseStatementContext.class,0);
		}
		public LoopEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopEachStatementContext loopEachStatement() throws RecognitionException {
		LoopEachStatementContext _localctx = new LoopEachStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_loopEachStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(At);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Brack) {
				{
				setState(1332);
				left_brack();
				setState(1333);
				id();
				setState(1334);
				right_brack();
				}
			}

			setState(1338);
			id();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1339);
				match(Bang);
				}
			}

			setState(1342);
			match(Colon);
			setState(1343);
			expression(0);
			setState(1344);
			left_brace();
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1345);
					functionSupportStatement();
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1351);
			right_brace();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1352);
				loopElseStatement();
				}
			}

			setState(1355);
			end();
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

	public static class LoopCaseStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseStatementContext loopElseStatement() {
			return getRuleContext(LoopElseStatementContext.class,0);
		}
		public LoopCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCaseStatementContext loopCaseStatement() throws RecognitionException {
		LoopCaseStatementContext _localctx = new LoopCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_loopCaseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(At);
			setState(1358);
			expression(0);
			setState(1359);
			left_brace();
			setState(1363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1360);
					functionSupportStatement();
					}
					} 
				}
				setState(1365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1366);
			right_brace();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1367);
				loopElseStatement();
				}
			}

			setState(1370);
			end();
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

	public static class LoopElseStatementContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopElseStatementContext loopElseStatement() throws RecognitionException {
		LoopElseStatementContext _localctx = new LoopElseStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_loopElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(Discard);
			setState(1373);
			left_brace();
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1374);
					functionSupportStatement();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1380);
			right_brace();
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

	public static class LoopJumpStatementContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(KParser.Tilde, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public LoopJumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopJumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopJumpStatementContext loopJumpStatement() throws RecognitionException {
		LoopJumpStatementContext _localctx = new LoopJumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_loopJumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(Tilde);
			setState(1383);
			match(At);
			setState(1384);
			end();
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

	public static class LoopContinueStatementContext extends ParserRuleContext {
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public LoopContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopContinueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContinueStatementContext loopContinueStatement() throws RecognitionException {
		LoopContinueStatementContext _localctx = new LoopContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_loopContinueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(Right_Arrow);
			setState(1387);
			match(At);
			setState(1388);
			end();
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

	public static class CheckStatementContext extends ParserRuleContext {
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public CheckFinallyStatmentContext checkFinallyStatment() {
			return getRuleContext(CheckFinallyStatmentContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public List<CheckErrorStatementContext> checkErrorStatement() {
			return getRuleContexts(CheckErrorStatementContext.class);
		}
		public CheckErrorStatementContext checkErrorStatement(int i) {
			return getRuleContext(CheckErrorStatementContext.class,i);
		}
		public CheckStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStatementContext checkStatement() throws RecognitionException {
		CheckStatementContext _localctx = new CheckStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_checkStatement);
		int _la;
		try {
			int _alt;
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				match(Bang);
				setState(1391);
				left_brace();
				setState(1395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1392);
						functionSupportStatement();
						}
						} 
					}
					setState(1397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1398);
				right_brace();
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
					{
					{
					setState(1399);
					checkErrorStatement();
					}
					}
					setState(1404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1405);
				checkFinallyStatment();
				setState(1406);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				match(Bang);
				setState(1409);
				left_brace();
				setState(1413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1410);
						functionSupportStatement();
						}
						} 
					}
					setState(1415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1416);
				right_brace();
				setState(1418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1417);
					checkErrorStatement();
					}
					}
					setState(1420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0) );
				setState(1422);
				end();
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

	public static class UsingStatementContext extends ParserRuleContext {
		public List<TerminalNode> Bang() { return getTokens(KParser.Bang); }
		public TerminalNode Bang(int i) {
			return getToken(KParser.Bang, i);
		}
		public List<ConstIdContext> constId() {
			return getRuleContexts(ConstIdContext.class);
		}
		public ConstIdContext constId(int i) {
			return getRuleContext(ConstIdContext.class,i);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public UsingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitUsingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingStatementContext usingStatement() throws RecognitionException {
		UsingStatementContext _localctx = new UsingStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_usingStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(Bang);
			setState(1427);
			constId();
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1428);
				more();
				setState(1429);
				constId();
				}
				}
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1436);
				match(Bang);
				}
			}

			setState(1439);
			match(Colon);
			setState(1440);
			tupleExpression();
			setState(1441);
			left_brace();
			setState(1445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1442);
					functionSupportStatement();
					}
					} 
				}
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1448);
			right_brace();
			setState(1449);
			end();
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

	public static class CheckErrorStatementContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public CheckErrorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkErrorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckErrorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckErrorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckErrorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckErrorStatementContext checkErrorStatement() throws RecognitionException {
		CheckErrorStatementContext _localctx = new CheckErrorStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_checkErrorStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1451);
				id();
				}
				break;
			case 2:
				{
				setState(1452);
				id();
				setState(1453);
				typeType();
				}
				break;
			}
			setState(1457);
			left_brace();
			setState(1461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1458);
					functionSupportStatement();
					}
					} 
				}
				setState(1463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1464);
			right_brace();
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

	public static class CheckFinallyStatmentContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public CheckFinallyStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkFinallyStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckFinallyStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckFinallyStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckFinallyStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckFinallyStatmentContext checkFinallyStatment() throws RecognitionException {
		CheckFinallyStatmentContext _localctx = new CheckFinallyStatmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_checkFinallyStatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(Discard);
			setState(1467);
			left_brace();
			setState(1471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1468);
					functionSupportStatement();
					}
					} 
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1474);
			right_brace();
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

	public static class CheckReportStatementContext extends ParserRuleContext {
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode Left_Arrow() { return getToken(KParser.Left_Arrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public CheckReportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkReportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckReportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckReportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckReportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckReportStatementContext checkReportStatement() throws RecognitionException {
		CheckReportStatementContext _localctx = new CheckReportStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_checkReportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(Bang);
			setState(1477);
			match(Left_Arrow);
			setState(1478);
			expression(0);
			setState(1479);
			end();
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

	public static class IteratorStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot_Dot() { return getToken(KParser.Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Dot() { return getToken(KParser.Dot_Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Less() { return getToken(KParser.Dot_Dot_Less, 0); }
		public TerminalNode Dot_Dot_Greater() { return getToken(KParser.Dot_Dot_Greater, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public IteratorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterIteratorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitIteratorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitIteratorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorStatementContext iteratorStatement() throws RecognitionException {
		IteratorStatementContext _localctx = new IteratorStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_iteratorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			expression(0);
			setState(1482);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1483);
				left_paren();
				setState(1484);
				expression(0);
				setState(1485);
				right_paren();
				}
				break;
			}
			setState(1489);
			expression(0);
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

	public static class VariableDeclaredStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public VariableDeclaredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterVariableDeclaredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitVariableDeclaredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitVariableDeclaredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaredStatementContext variableDeclaredStatement() throws RecognitionException {
		VariableDeclaredStatementContext _localctx = new VariableDeclaredStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_variableDeclaredStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			id();
			setState(1492);
			match(Bang);
			setState(1493);
			typeType();
			setState(1494);
			end();
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

	public static class ConstantDeclaredStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ConstantDeclaredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterConstantDeclaredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitConstantDeclaredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitConstantDeclaredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaredStatementContext constantDeclaredStatement() throws RecognitionException {
		ConstantDeclaredStatementContext _localctx = new ConstantDeclaredStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_constantDeclaredStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			id();
			setState(1497);
			typeType();
			setState(1498);
			end();
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

	public static class VarStatementContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public VarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarStatementContext varStatement() throws RecognitionException {
		VarStatementContext _localctx = new VarStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_varStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			varId();
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1501);
				more();
				setState(1502);
				varId();
				}
				}
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1509);
			match(Colon);
			setState(1510);
			tupleExpression();
			setState(1511);
			end();
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

	public static class BindStatementContext extends ParserRuleContext {
		public List<ConstIdContext> constId() {
			return getRuleContexts(ConstIdContext.class);
		}
		public ConstIdContext constId(int i) {
			return getRuleContext(ConstIdContext.class,i);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public BindStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBindStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBindStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBindStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindStatementContext bindStatement() throws RecognitionException {
		BindStatementContext _localctx = new BindStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_bindStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			constId();
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1514);
				more();
				setState(1515);
				constId();
				}
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1522);
			match(Colon);
			setState(1523);
			tupleExpression();
			setState(1524);
			end();
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

	public static class AssignStatementContext extends ParserRuleContext {
		public List<TupleExpressionContext> tupleExpression() {
			return getRuleContexts(TupleExpressionContext.class);
		}
		public TupleExpressionContext tupleExpression(int i) {
			return getRuleContext(TupleExpressionContext.class,i);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			tupleExpression();
			setState(1527);
			assign();
			setState(1528);
			tupleExpression();
			setState(1529);
			end();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			expression(0);
			setState(1532);
			end();
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

	public static class AnnotationStatementContext extends ParserRuleContext {
		public AnnotationStringContext annotationString() {
			return getRuleContext(AnnotationStringContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public AnnotationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationStatementContext annotationStatement() throws RecognitionException {
		AnnotationStatementContext _localctx = new AnnotationStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			annotationString();
			setState(1535);
			end();
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

	public static class VarIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_varId);
		int _la;
		try {
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				id();
				setState(1538);
				match(Bang);
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
					{
					setState(1539);
					typeType();
					}
				}

				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(Discard);
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

	public static class ConstIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public ConstIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterConstId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitConstId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitConstId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstIdContext constId() throws RecognitionException {
		ConstIdContext _localctx = new ConstIdContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_constId);
		int _la;
		try {
			setState(1550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				id();
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
					{
					setState(1546);
					typeType();
					}
				}

				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(Discard);
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			expression(0);
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1553);
				more();
				setState(1554);
				expression(0);
				}
				}
				setState(1560);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Token t;
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TemplateCallContext templateCall() {
			return getRuleContext(TemplateCallContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_primaryExpression);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Brack:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				left_brack();
				setState(1562);
				id();
				setState(1563);
				templateCall();
				setState(1564);
				right_brack();
				}
				break;
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				id();
				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
				((PrimaryExpressionContext)_localctx).t = match(Discard);
				}
				break;
			case Left_Paren:
				enterOuterAlt(_localctx, 4);
				{
				setState(1568);
				left_paren();
				setState(1569);
				expression(0);
				setState(1570);
				right_paren();
				}
				break;
			case NilLiteral:
			case TrueLiteral:
			case FalseLiteral:
			case UndefinedLiteral:
			case FloatLiteral:
			case DecimalLiteral:
			case BinaryLiteral:
			case OctalLiteral:
			case HexLiteral:
			case Quote_Quote_Quote_Open:
			case Quote_Open:
			case CharLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1572);
				dataStatement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public LinqContext linq() {
			return getRuleContext(LinqContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public CallPkgContext callPkg() {
			return getRuleContext(CallPkgContext.class,0);
		}
		public CallChannelContext callChannel() {
			return getRuleContext(CallChannelContext.class,0);
		}
		public CallAsyncContext callAsync() {
			return getRuleContext(CallAsyncContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public PkgAnonymousContext pkgAnonymous() {
			return getRuleContext(PkgAnonymousContext.class,0);
		}
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public BitwiseNotExpressionContext bitwiseNotExpression() {
			return getRuleContext(BitwiseNotExpressionContext.class,0);
		}
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public JudgeExpressionContext judgeExpression() {
			return getRuleContext(JudgeExpressionContext.class,0);
		}
		public JudgeCaseExpressionContext judgeCaseExpression() {
			return getRuleContext(JudgeCaseExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public LoopEachExpressionContext loopEachExpression() {
			return getRuleContext(LoopEachExpressionContext.class,0);
		}
		public CheckExpressionContext checkExpression() {
			return getRuleContext(CheckExpressionContext.class,0);
		}
		public CallNewContext callNew() {
			return getRuleContext(CallNewContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TransferContext transfer() {
			return getRuleContext(TransferContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareCombineContext compareCombine() {
			return getRuleContext(CompareCombineContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public OrElseContext orElse() {
			return getRuleContext(OrElseContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public CallElementContext callElement() {
			return getRuleContext(CallElementContext.class,0);
		}
		public CallAwaitContext callAwait() {
			return getRuleContext(CallAwaitContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public TypeConversionContext typeConversion() {
			return getRuleContext(TypeConversionContext.class,0);
		}
		public TypeCheckContext typeCheck() {
			return getRuleContext(TypeCheckContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1576);
				linq();
				}
				break;
			case 2:
				{
				setState(1577);
				primaryExpression();
				}
				break;
			case 3:
				{
				setState(1578);
				callPkg();
				}
				break;
			case 4:
				{
				setState(1579);
				callChannel();
				}
				break;
			case 5:
				{
				setState(1580);
				callAsync();
				}
				break;
			case 6:
				{
				setState(1581);
				list();
				}
				break;
			case 7:
				{
				setState(1582);
				dictionary();
				}
				break;
			case 8:
				{
				setState(1583);
				lambda();
				}
				break;
			case 9:
				{
				setState(1584);
				functionExpression();
				}
				break;
			case 10:
				{
				setState(1585);
				pkgAnonymous();
				}
				break;
			case 11:
				{
				setState(1586);
				plusMinus();
				}
				break;
			case 12:
				{
				setState(1587);
				bitwiseNotExpression();
				}
				break;
			case 13:
				{
				setState(1588);
				negate();
				}
				break;
			case 14:
				{
				setState(1589);
				judgeExpression();
				}
				break;
			case 15:
				{
				setState(1590);
				judgeCaseExpression();
				}
				break;
			case 16:
				{
				setState(1591);
				loopExpression();
				}
				break;
			case 17:
				{
				setState(1592);
				loopEachExpression();
				}
				break;
			case 18:
				{
				setState(1593);
				checkExpression();
				}
				break;
			case 19:
				{
				setState(1594);
				callNew();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1597);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1598);
						transfer();
						setState(1599);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1601);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1602);
						pow();
						setState(1603);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1605);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1606);
						mul();
						setState(1607);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1609);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1610);
						add();
						setState(1611);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1613);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1614);
						bitwise();
						setState(1615);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1617);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1618);
						compareCombine();
						setState(1619);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1621);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1622);
						compare();
						setState(1623);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1625);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1626);
						logic();
						setState(1627);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1629);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1630);
						((ExpressionContext)_localctx).op = match(Bang);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1631);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1632);
						((ExpressionContext)_localctx).op = match(Question);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1633);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1634);
						orElse();
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1635);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1636);
						callFunc();
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1637);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1638);
						callChannel();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1639);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1640);
						callElement();
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1641);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1642);
						callAwait();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1643);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1644);
						callExpression();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1645);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1646);
						typeConversion();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1647);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1648);
						typeCheck();
						}
						break;
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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

	public static class CallExpressionContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateCallContext templateCall() {
			return getRuleContext(TemplateCallContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public CallElementContext callElement() {
			return getRuleContext(CallElementContext.class,0);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_callExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			call();
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1655);
				match(New_Line);
				}
			}

			setState(1664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(1658);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1659);
				left_brack();
				setState(1660);
				id();
				setState(1661);
				templateCall();
				setState(1662);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1666);
				callFunc();
				}
				break;
			case 2:
				{
				setState(1667);
				callElement();
				}
				break;
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

	public static class TupleContext extends ParserRuleContext {
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			left_paren();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1671);
				expression(0);
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1672);
					more();
					setState(1673);
					expression(0);
					}
					}
					setState(1679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1682);
			right_paren();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			expression(0);
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1685);
				more();
				setState(1686);
				expression(0);
				}
				}
				setState(1692);
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

	public static class AnnotationSupportContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationSupportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationSupport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotationSupport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotationSupport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotationSupport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationSupportContext annotationSupport() throws RecognitionException {
		AnnotationSupportContext _localctx = new AnnotationSupportContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_annotationSupport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			annotation();
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			annotationList();
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

	public static class AnnotationListContext extends ParserRuleContext {
		public List<AnnotationItemContext> annotationItem() {
			return getRuleContexts(AnnotationItemContext.class);
		}
		public AnnotationItemContext annotationItem(int i) {
			return getRuleContext(AnnotationItemContext.class,i);
		}
		public List<AnnotationStringContext> annotationString() {
			return getRuleContexts(AnnotationStringContext.class);
		}
		public AnnotationStringContext annotationString(int i) {
			return getRuleContext(AnnotationStringContext.class,i);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_annotationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1697);
					annotationItem();
					}
					break;
				case 2:
					{
					setState(1698);
					annotationString();
					}
					break;
				}
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New_Line) {
					{
					setState(1701);
					match(New_Line);
					}
				}

				}
				}
				setState(1706); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Sharp );
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

	public static class AnnotationItemContext extends ParserRuleContext {
		public TerminalNode Sharp() { return getToken(KParser.Sharp, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public AnnotationItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotationItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotationItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotationItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationItemContext annotationItem() throws RecognitionException {
		AnnotationItemContext _localctx = new AnnotationItemContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_annotationItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			match(Sharp);
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1709);
				id();
				setState(1710);
				match(Right_Arrow);
				}
				break;
			}
			setState(1714);
			id();
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1715);
				tuple();
				}
				break;
			case 2:
				{
				setState(1716);
				lambda();
				}
				break;
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

	public static class AnnotationStringContext extends ParserRuleContext {
		public TerminalNode Sharp() { return getToken(KParser.Sharp, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public RawStringExprContext rawStringExpr() {
			return getRuleContext(RawStringExprContext.class,0);
		}
		public AnnotationStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAnnotationString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAnnotationString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAnnotationString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationStringContext annotationString() throws RecognitionException {
		AnnotationStringContext _localctx = new AnnotationStringContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_annotationString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(Sharp);
			setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quote_Open:
				{
				setState(1720);
				stringExpr();
				}
				break;
			case Quote_Quote_Quote_Open:
				{
				setState(1721);
				rawStringExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CallFuncContext extends ParserRuleContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
				{
				setState(1724);
				tuple();
				}
				break;
			case Left_Brace:
				{
				setState(1725);
				lambda();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CallAsyncContext extends ParserRuleContext {
		public TerminalNode Right_Wave() { return getToken(KParser.Right_Wave, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallAsyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAsync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallAsync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallAsync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAsyncContext callAsync() throws RecognitionException {
		CallAsyncContext _localctx = new CallAsyncContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_callAsync);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(Right_Wave);
			setState(1729);
			expression(0);
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

	public static class CallAwaitContext extends ParserRuleContext {
		public TerminalNode Right_Wave() { return getToken(KParser.Right_Wave, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public CallAwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAwait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallAwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallAwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallAwait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAwaitContext callAwait() throws RecognitionException {
		CallAwaitContext _localctx = new CallAwaitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_callAwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(Right_Wave);
			setState(1734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
				{
				setState(1732);
				tuple();
				}
				break;
			case Left_Brace:
				{
				setState(1733);
				lambda();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CallChannelContext extends ParserRuleContext {
		public TerminalNode Left_Wave() { return getToken(KParser.Left_Wave, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callChannel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallChannel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallChannel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallChannel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallChannelContext callChannel() throws RecognitionException {
		CallChannelContext _localctx = new CallChannelContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_callChannel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			match(Left_Wave);
			setState(1737);
			expression(0);
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

	public static class TransferContext extends ParserRuleContext {
		public TerminalNode Left_Wave() { return getToken(KParser.Left_Wave, 0); }
		public TransferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transfer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTransfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTransfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTransfer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransferContext transfer() throws RecognitionException {
		TransferContext _localctx = new TransferContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_transfer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(Left_Wave);
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

	public static class CallElementContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallElementContext callElement() throws RecognitionException {
		CallElementContext _localctx = new CallElementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_callElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			left_brack();
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1742);
				slice();
				}
				break;
			case 2:
				{
				setState(1743);
				expression(0);
				}
				break;
			}
			setState(1746);
			right_brack();
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

	public static class CallPkgContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public PkgAssignContext pkgAssign() {
			return getRuleContext(PkgAssignContext.class,0);
		}
		public ListAssignContext listAssign() {
			return getRuleContext(ListAssignContext.class,0);
		}
		public DictionaryAssignContext dictionaryAssign() {
			return getRuleContext(DictionaryAssignContext.class,0);
		}
		public CallPkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callPkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallPkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallPkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallPkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallPkgContext callPkg() throws RecognitionException {
		CallPkgContext _localctx = new CallPkgContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_callPkg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			typeType();
			setState(1749);
			left_brace();
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1750);
				pkgAssign();
				}
				break;
			case 2:
				{
				setState(1751);
				listAssign();
				}
				break;
			case 3:
				{
				setState(1752);
				dictionaryAssign();
				}
				break;
			}
			setState(1755);
			right_brace();
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

	public static class CallNewContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCallNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCallNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCallNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallNewContext callNew() throws RecognitionException {
		CallNewContext _localctx = new CallNewContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_callNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			typeType();
			setState(1758);
			left_paren();
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1759);
				match(New_Line);
				}
				break;
			}
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1762);
				expressionList();
				}
			}

			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1765);
				match(New_Line);
				}
			}

			setState(1768);
			right_paren();
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

	public static class OrElseContext extends ParserRuleContext {
		public List<TerminalNode> Question() { return getTokens(KParser.Question); }
		public TerminalNode Question(int i) {
			return getToken(KParser.Question, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterOrElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitOrElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitOrElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrElseContext orElse() throws RecognitionException {
		OrElseContext _localctx = new OrElseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_orElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(Question);
			setState(1771);
			match(Question);
			setState(1772);
			expression(0);
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

	public static class TypeConversionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TypeConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConversionContext typeConversion() throws RecognitionException {
		TypeConversionContext _localctx = new TypeConversionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeConversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			typeType();
			setState(1775);
			match(Bang);
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

	public static class TypeCheckContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public TypeCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCheckContext typeCheck() throws RecognitionException {
		TypeCheckContext _localctx = new TypeCheckContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			typeType();
			setState(1778);
			match(Question);
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

	public static class PkgAssignContext extends ParserRuleContext {
		public List<PkgAssignElementContext> pkgAssignElement() {
			return getRuleContexts(PkgAssignElementContext.class);
		}
		public PkgAssignElementContext pkgAssignElement(int i) {
			return getRuleContext(PkgAssignElementContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public PkgAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPkgAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPkgAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPkgAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgAssignContext pkgAssign() throws RecognitionException {
		PkgAssignContext _localctx = new PkgAssignContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_pkgAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1780);
					pkgAssignElement();
					setState(1781);
					end();
					}
					} 
				}
				setState(1787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			setState(1788);
			pkgAssignElement();
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

	public static class PkgAssignElementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode Equal() { return getToken(KParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PkgAssignElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgAssignElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPkgAssignElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPkgAssignElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPkgAssignElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgAssignElementContext pkgAssignElement() throws RecognitionException {
		PkgAssignElementContext _localctx = new PkgAssignElementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pkgAssignElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			name();
			setState(1791);
			match(Equal);
			setState(1792);
			expression(0);
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

	public static class ListAssignContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public ListAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterListAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitListAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitListAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAssignContext listAssign() throws RecognitionException {
		ListAssignContext _localctx = new ListAssignContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_listAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1794);
					expression(0);
					setState(1795);
					end();
					}
					} 
				}
				setState(1801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1802);
			expression(0);
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

	public static class DictionaryAssignContext extends ParserRuleContext {
		public List<DictionaryElementContext> dictionaryElement() {
			return getRuleContexts(DictionaryElementContext.class);
		}
		public DictionaryElementContext dictionaryElement(int i) {
			return getRuleContext(DictionaryElementContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public DictionaryAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterDictionaryAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitDictionaryAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitDictionaryAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAssignContext dictionaryAssign() throws RecognitionException {
		DictionaryAssignContext _localctx = new DictionaryAssignContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_dictionaryAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1804);
					dictionaryElement();
					setState(1805);
					end();
					}
					} 
				}
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1812);
			dictionaryElement();
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

	public static class ListContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			left_brace();
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1815);
					expression(0);
					setState(1816);
					end();
					}
					} 
				}
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			setState(1823);
			expression(0);
			setState(1824);
			right_brace();
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

	public static class DictionaryContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public List<DictionaryElementContext> dictionaryElement() {
			return getRuleContexts(DictionaryElementContext.class);
		}
		public DictionaryElementContext dictionaryElement(int i) {
			return getRuleContext(DictionaryElementContext.class,i);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_dictionary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			left_brace();
			setState(1832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1827);
					dictionaryElement();
					setState(1828);
					end();
					}
					} 
				}
				setState(1834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			setState(1835);
			dictionaryElement();
			setState(1836);
			right_brace();
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

	public static class DictionaryElementContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Equal() { return getToken(KParser.Equal, 0); }
		public DictionaryElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterDictionaryElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitDictionaryElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitDictionaryElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryElementContext dictionaryElement() throws RecognitionException {
		DictionaryElementContext _localctx = new DictionaryElementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dictionaryElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			left_brack();
			setState(1839);
			expression(0);
			setState(1840);
			right_brack();
			setState(1841);
			match(Equal);
			setState(1842);
			expression(0);
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

	public static class SliceContext extends ParserRuleContext {
		public SliceStartContext sliceStart() {
			return getRuleContext(SliceStartContext.class,0);
		}
		public SliceEndContext sliceEnd() {
			return getRuleContext(SliceEndContext.class,0);
		}
		public SliceFullContext sliceFull() {
			return getRuleContext(SliceFullContext.class,0);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_slice);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				sliceStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1845);
				sliceEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846);
				sliceFull();
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

	public static class SliceFullContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot_Dot() { return getToken(KParser.Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Dot() { return getToken(KParser.Dot_Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Less() { return getToken(KParser.Dot_Dot_Less, 0); }
		public TerminalNode Dot_Dot_Greater() { return getToken(KParser.Dot_Dot_Greater, 0); }
		public SliceFullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceFull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterSliceFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitSliceFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitSliceFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceFullContext sliceFull() throws RecognitionException {
		SliceFullContext _localctx = new SliceFullContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_sliceFull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			expression(0);
			setState(1850);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1851);
			expression(0);
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

	public static class SliceStartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot_Dot() { return getToken(KParser.Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Dot() { return getToken(KParser.Dot_Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Less() { return getToken(KParser.Dot_Dot_Less, 0); }
		public TerminalNode Dot_Dot_Greater() { return getToken(KParser.Dot_Dot_Greater, 0); }
		public SliceStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterSliceStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitSliceStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitSliceStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceStartContext sliceStart() throws RecognitionException {
		SliceStartContext _localctx = new SliceStartContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_sliceStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			expression(0);
			setState(1854);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
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

	public static class SliceEndContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot_Dot() { return getToken(KParser.Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Dot() { return getToken(KParser.Dot_Dot_Dot, 0); }
		public TerminalNode Dot_Dot_Less() { return getToken(KParser.Dot_Dot_Less, 0); }
		public TerminalNode Dot_Dot_Greater() { return getToken(KParser.Dot_Dot_Greater, 0); }
		public SliceEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterSliceEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitSliceEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitSliceEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceEndContext sliceEnd() throws RecognitionException {
		SliceEndContext _localctx = new SliceEndContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_sliceEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1857);
			expression(0);
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

	public static class NameSpaceItemContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public NameSpaceItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNameSpaceItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNameSpaceItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNameSpaceItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceItemContext nameSpaceItem() throws RecognitionException {
		NameSpaceItemContext _localctx = new NameSpaceItemContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_nameSpaceItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1859);
					id();
					setState(1860);
					call();
					setState(1862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==New_Line) {
						{
						setState(1861);
						match(New_Line);
						}
					}

					}
					} 
				}
				setState(1868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			setState(1869);
			id();
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

	public static class NameContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			id();
			setState(1880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(1872);
				call();
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New_Line) {
					{
					setState(1873);
					match(New_Line);
					}
				}

				setState(1876);
				id();
				}
				}
				setState(1882);
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

	public static class TemplateDefineContext extends ParserRuleContext {
		public List<TemplateDefineItemContext> templateDefineItem() {
			return getRuleContexts(TemplateDefineItemContext.class);
		}
		public TemplateDefineItemContext templateDefineItem(int i) {
			return getRuleContext(TemplateDefineItemContext.class,i);
		}
		public TemplateDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTemplateDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTemplateDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTemplateDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDefineContext templateDefine() throws RecognitionException {
		TemplateDefineContext _localctx = new TemplateDefineContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_templateDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				{
				setState(1883);
				templateDefineItem();
				}
				}
				setState(1888);
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

	public static class TemplateDefineItemContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public TemplateDefineItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDefineItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTemplateDefineItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTemplateDefineItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTemplateDefineItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDefineItemContext templateDefineItem() throws RecognitionException {
		TemplateDefineItemContext _localctx = new TemplateDefineItemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_templateDefineItem);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				id();
				}
				break;
			case Left_Paren:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				left_paren();
				setState(1891);
				id();
				setState(1892);
				id();
				setState(1893);
				right_paren();
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

	public static class TemplateCallContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TemplateCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTemplateCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTemplateCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTemplateCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateCallContext templateCall() throws RecognitionException {
		TemplateCallContext _localctx = new TemplateCallContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_templateCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				{
				setState(1897);
				typeType();
				}
				}
				setState(1902);
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

	public static class LambdaContext extends ParserRuleContext {
		public Token t;
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public LambdaInContext lambdaIn() {
			return getRuleContext(LambdaInContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_lambda);
		int _la;
		try {
			int _alt;
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				left_brace();
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
					{
					setState(1904);
					lambdaIn();
					}
				}

				setState(1907);
				((LambdaContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
					((LambdaContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==New_Line) {
					{
					{
					setState(1908);
					match(New_Line);
					}
					}
					setState(1913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1914);
				tupleExpression();
				setState(1915);
				right_brace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1917);
				left_brace();
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
					{
					setState(1918);
					lambdaIn();
					}
				}

				setState(1921);
				((LambdaContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
					((LambdaContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1922);
						match(New_Line);
						}
						} 
					}
					setState(1927);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				setState(1931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1928);
						functionSupportStatement();
						}
						} 
					}
					setState(1933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				}
				setState(1934);
				right_brace();
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

	public static class LambdaInContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public LambdaInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLambdaIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLambdaIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLambdaIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaInContext lambdaIn() throws RecognitionException {
		LambdaInContext _localctx = new LambdaInContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lambdaIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			id();
			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1939);
				more();
				setState(1940);
				id();
				}
				}
				setState(1946);
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

	public static class PkgAnonymousContext extends ParserRuleContext {
		public PkgAnonymousAssignContext pkgAnonymousAssign() {
			return getRuleContext(PkgAnonymousAssignContext.class,0);
		}
		public PkgAnonymousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgAnonymous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPkgAnonymous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPkgAnonymous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPkgAnonymous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgAnonymousContext pkgAnonymous() throws RecognitionException {
		PkgAnonymousContext _localctx = new PkgAnonymousContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_pkgAnonymous);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			pkgAnonymousAssign();
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

	public static class PkgAnonymousAssignContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public List<PkgAnonymousAssignElementContext> pkgAnonymousAssignElement() {
			return getRuleContexts(PkgAnonymousAssignElementContext.class);
		}
		public PkgAnonymousAssignElementContext pkgAnonymousAssignElement(int i) {
			return getRuleContext(PkgAnonymousAssignElementContext.class,i);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public PkgAnonymousAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgAnonymousAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPkgAnonymousAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPkgAnonymousAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPkgAnonymousAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgAnonymousAssignContext pkgAnonymousAssign() throws RecognitionException {
		PkgAnonymousAssignContext _localctx = new PkgAnonymousAssignContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_pkgAnonymousAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			left_brace();
			setState(1955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1950);
					pkgAnonymousAssignElement();
					setState(1951);
					end();
					}
					} 
				}
				setState(1957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1958);
			pkgAnonymousAssignElement();
			setState(1959);
			right_brace();
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

	public static class PkgAnonymousAssignElementContext extends ParserRuleContext {
		public Token t;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public PkgAnonymousAssignElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgAnonymousAssignElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPkgAnonymousAssignElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPkgAnonymousAssignElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPkgAnonymousAssignElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgAnonymousAssignElementContext pkgAnonymousAssignElement() throws RecognitionException {
		PkgAnonymousAssignElementContext _localctx = new PkgAnonymousAssignElementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_pkgAnonymousAssignElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			name();
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1962);
				match(Bang);
				}
			}

			setState(1965);
			((PkgAnonymousAssignElementContext)_localctx).t = match(Colon);
			setState(1966);
			expression(0);
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

	public static class FunctionExpressionContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public ParameterClauseInContext parameterClauseIn() {
			return getRuleContext(ParameterClauseInContext.class,0);
		}
		public ParameterClauseOutContext parameterClauseOut() {
			return getRuleContext(ParameterClauseOutContext.class,0);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_functionExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			left_paren();
			setState(1969);
			parameterClauseIn();
			setState(1970);
			((FunctionExpressionContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((FunctionExpressionContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1971);
				((FunctionExpressionContext)_localctx).b = match(Bang);
				}
			}

			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1974);
				((FunctionExpressionContext)_localctx).y = match(At);
				}
			}

			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1977);
				match(New_Line);
				}
				}
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1983);
			parameterClauseOut();
			setState(1984);
			right_paren();
			setState(1985);
			left_brace();
			setState(1989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1986);
					functionSupportStatement();
					}
					} 
				}
				setState(1991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1992);
			right_brace();
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

	public static class PlusMinusContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusContext plusMinus() throws RecognitionException {
		PlusMinusContext _localctx = new PlusMinusContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_plusMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			add();
			setState(1995);
			expression(0);
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

	public static class NegateContext extends ParserRuleContext {
		public WaveContext wave() {
			return getRuleContext(WaveContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegateContext negate() throws RecognitionException {
		NegateContext _localctx = new NegateContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			wave();
			setState(1998);
			expression(0);
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

	public static class BitwiseNotExpressionContext extends ParserRuleContext {
		public BitwiseNotContext bitwiseNot() {
			return getRuleContext(BitwiseNotContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitwiseNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseNotExpressionContext bitwiseNotExpression() throws RecognitionException {
		BitwiseNotExpressionContext _localctx = new BitwiseNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_bitwiseNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			bitwiseNot();
			setState(2001);
			expression(0);
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

	public static class LinqContext extends ParserRuleContext {
		public LinqHeadItemContext linqHeadItem() {
			return getRuleContext(LinqHeadItemContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<LinqItemContext> linqItem() {
			return getRuleContexts(LinqItemContext.class);
		}
		public LinqItemContext linqItem(int i) {
			return getRuleContext(LinqItemContext.class,i);
		}
		public LinqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLinq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLinq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLinq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinqContext linq() throws RecognitionException {
		LinqContext _localctx = new LinqContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_linq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			linqHeadItem();
			setState(2004);
			match(Right_Arrow);
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2005);
				match(New_Line);
				}
			}

			setState(2011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2008);
					linqItem();
					}
					} 
				}
				setState(2013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			setState(2014);
			id();
			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2015);
				match(New_Line);
				}
			}

			setState(2018);
			expression(0);
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

	public static class LinqHeadItemContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public LinqHeadItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linqHeadItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLinqHeadItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLinqHeadItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLinqHeadItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinqHeadItemContext linqHeadItem() throws RecognitionException {
		LinqHeadItemContext _localctx = new LinqHeadItemContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_linqHeadItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			match(At);
			setState(2021);
			id();
			setState(2023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2022);
				match(Bang);
				}
			}

			setState(2025);
			match(Colon);
			setState(2026);
			expression(0);
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

	public static class LinqItemContext extends ParserRuleContext {
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public LinqHeadItemContext linqHeadItem() {
			return getRuleContext(LinqHeadItemContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LinqItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linqItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLinqItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLinqItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLinqItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinqItemContext linqItem() throws RecognitionException {
		LinqItemContext _localctx = new LinqItemContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_linqItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case At:
				{
				setState(2028);
				linqHeadItem();
				}
				break;
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				{
				setState(2029);
				id();
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeU16 - 64)) | (1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					setState(2030);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2035);
			match(Right_Arrow);
			setState(2037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2036);
				match(New_Line);
				}
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

	public static class JudgeExpressionContext extends ParserRuleContext {
		public JudgeExpressionIfStatementContext judgeExpressionIfStatement() {
			return getRuleContext(JudgeExpressionIfStatementContext.class,0);
		}
		public JudgeExpressionElseStatementContext judgeExpressionElseStatement() {
			return getRuleContext(JudgeExpressionElseStatementContext.class,0);
		}
		public List<JudgeExpressionElseIfStatementContext> judgeExpressionElseIfStatement() {
			return getRuleContexts(JudgeExpressionElseIfStatementContext.class);
		}
		public JudgeExpressionElseIfStatementContext judgeExpressionElseIfStatement(int i) {
			return getRuleContext(JudgeExpressionElseIfStatementContext.class,i);
		}
		public JudgeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionContext judgeExpression() throws RecognitionException {
		JudgeExpressionContext _localctx = new JudgeExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_judgeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			judgeExpressionIfStatement();
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2040);
					judgeExpressionElseIfStatement();
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(2046);
			judgeExpressionElseStatement();
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

	public static class JudgeExpressionElseStatementContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeExpressionElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpressionElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeExpressionElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeExpressionElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeExpressionElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionElseStatementContext judgeExpressionElseStatement() throws RecognitionException {
		JudgeExpressionElseStatementContext _localctx = new JudgeExpressionElseStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_judgeExpressionElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(Discard);
			setState(2049);
			left_brace();
			setState(2053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2050);
					functionSupportStatement();
					}
					} 
				}
				setState(2055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(2056);
			tupleExpression();
			setState(2057);
			right_brace();
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

	public static class JudgeExpressionIfStatementContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeExpressionIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpressionIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeExpressionIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeExpressionIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeExpressionIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionIfStatementContext judgeExpressionIfStatement() throws RecognitionException {
		JudgeExpressionIfStatementContext _localctx = new JudgeExpressionIfStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_judgeExpressionIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(Question);
			setState(2060);
			match(Right_Arrow);
			setState(2061);
			expression(0);
			setState(2062);
			left_brace();
			setState(2066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2063);
					functionSupportStatement();
					}
					} 
				}
				setState(2068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(2069);
			tupleExpression();
			setState(2070);
			right_brace();
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

	public static class JudgeExpressionElseIfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public JudgeExpressionElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeExpressionElseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeExpressionElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeExpressionElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeExpressionElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeExpressionElseIfStatementContext judgeExpressionElseIfStatement() throws RecognitionException {
		JudgeExpressionElseIfStatementContext _localctx = new JudgeExpressionElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_judgeExpressionElseIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			expression(0);
			setState(2073);
			left_brace();
			setState(2077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2074);
					functionSupportStatement();
					}
					} 
				}
				setState(2079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(2080);
			tupleExpression();
			setState(2081);
			right_brace();
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

	public static class JudgeCaseExpressionContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public List<CaseExpressionStatementContext> caseExpressionStatement() {
			return getRuleContexts(CaseExpressionStatementContext.class);
		}
		public CaseExpressionStatementContext caseExpressionStatement(int i) {
			return getRuleContext(CaseExpressionStatementContext.class,i);
		}
		public JudgeCaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgeCaseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterJudgeCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitJudgeCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitJudgeCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgeCaseExpressionContext judgeCaseExpression() throws RecognitionException {
		JudgeCaseExpressionContext _localctx = new JudgeCaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_judgeCaseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			match(Question);
			setState(2084);
			expression(0);
			setState(2085);
			match(Colon);
			setState(2086);
			match(Right_Arrow);
			setState(2088); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2087);
					caseExpressionStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2090); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CaseExpressionStatementContext extends ParserRuleContext {
		public List<CaseExprStatementContext> caseExprStatement() {
			return getRuleContexts(CaseExprStatementContext.class);
		}
		public CaseExprStatementContext caseExprStatement(int i) {
			return getRuleContext(CaseExprStatementContext.class,i);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public CaseExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCaseExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCaseExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCaseExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionStatementContext caseExpressionStatement() throws RecognitionException {
		CaseExpressionStatementContext _localctx = new CaseExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_caseExpressionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			caseExprStatement();
			setState(2098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2093);
				more();
				setState(2094);
				caseExprStatement();
				}
				}
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2101);
			left_brace();
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2102);
					functionSupportStatement();
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			setState(2108);
			tupleExpression();
			setState(2109);
			right_brace();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public IteratorStatementContext iteratorStatement() {
			return getRuleContext(IteratorStatementContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseExpressionContext loopElseExpression() {
			return getRuleContext(LoopElseExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_loopExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			match(At);
			setState(2112);
			id();
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2113);
				match(Bang);
				}
			}

			setState(2116);
			match(Colon);
			setState(2117);
			iteratorStatement();
			setState(2118);
			match(Right_Arrow);
			setState(2119);
			left_brace();
			setState(2123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2120);
					functionSupportStatement();
					}
					} 
				}
				setState(2125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			}
			setState(2126);
			tupleExpression();
			setState(2127);
			right_brace();
			setState(2129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2128);
				loopElseExpression();
				}
				break;
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

	public static class LoopEachExpressionContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(KParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(KParser.Colon, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseExpressionContext loopElseExpression() {
			return getRuleContext(LoopElseExpressionContext.class,0);
		}
		public LoopEachExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEachExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopEachExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopEachExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopEachExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopEachExpressionContext loopEachExpression() throws RecognitionException {
		LoopEachExpressionContext _localctx = new LoopEachExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_loopEachExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			match(At);
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2132);
				id();
				setState(2133);
				match(Colon);
				}
				break;
			}
			setState(2137);
			id();
			setState(2139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2138);
				match(Bang);
				}
			}

			setState(2141);
			match(Colon);
			setState(2142);
			expression(0);
			setState(2143);
			match(Right_Arrow);
			setState(2144);
			left_brace();
			setState(2148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2145);
					functionSupportStatement();
					}
					} 
				}
				setState(2150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			setState(2151);
			tupleExpression();
			setState(2152);
			right_brace();
			setState(2154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2153);
				loopElseExpression();
				}
				break;
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

	public static class LoopElseExpressionContext extends ParserRuleContext {
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public LoopElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopElseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLoopElseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLoopElseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLoopElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopElseExpressionContext loopElseExpression() throws RecognitionException {
		LoopElseExpressionContext _localctx = new LoopElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_loopElseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(Discard);
			setState(2157);
			left_brace();
			setState(2161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2158);
					functionSupportStatement();
					}
					} 
				}
				setState(2163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			setState(2164);
			tupleExpression();
			setState(2165);
			right_brace();
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

	public static class CheckExpressionContext extends ParserRuleContext {
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public CheckFinallyStatmentContext checkFinallyStatment() {
			return getRuleContext(CheckFinallyStatmentContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public List<CheckErrorExpressionContext> checkErrorExpression() {
			return getRuleContexts(CheckErrorExpressionContext.class);
		}
		public CheckErrorExpressionContext checkErrorExpression(int i) {
			return getRuleContext(CheckErrorExpressionContext.class,i);
		}
		public CheckExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckExpressionContext checkExpression() throws RecognitionException {
		CheckExpressionContext _localctx = new CheckExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_checkExpression);
		int _la;
		try {
			int _alt;
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				match(Bang);
				setState(2168);
				match(Right_Arrow);
				setState(2169);
				left_brace();
				setState(2173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2170);
						functionSupportStatement();
						}
						} 
					}
					setState(2175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
				setState(2176);
				tupleExpression();
				setState(2177);
				right_brace();
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (TypeI8 - 61)) | (1L << (TypeU8 - 61)) | (1L << (TypeI16 - 61)) | (1L << (TypeU16 - 61)) | (1L << (TypeI32 - 61)) | (1L << (TypeU32 - 61)) | (1L << (TypeI64 - 61)) | (1L << (TypeU64 - 61)) | (1L << (TypeF32 - 61)) | (1L << (TypeF64 - 61)) | (1L << (TypeChr - 61)) | (1L << (TypeStr - 61)) | (1L << (TypeBool - 61)) | (1L << (TypeInt - 61)) | (1L << (TypeNum - 61)) | (1L << (TypeByte - 61)) | (1L << (TypeAny - 61)) | (1L << (IDPrivate - 61)) | (1L << (IDPublic - 61)))) != 0)) {
					{
					{
					setState(2178);
					checkErrorExpression();
					}
					}
					setState(2183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2184);
				checkFinallyStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(Bang);
				setState(2187);
				match(Right_Arrow);
				setState(2188);
				left_brace();
				setState(2192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2189);
						functionSupportStatement();
						}
						} 
					}
					setState(2194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				}
				setState(2195);
				tupleExpression();
				setState(2196);
				right_brace();
				setState(2198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2197);
						checkErrorExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CheckErrorExpressionContext extends ParserRuleContext {
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<FunctionSupportStatementContext> functionSupportStatement() {
			return getRuleContexts(FunctionSupportStatementContext.class);
		}
		public FunctionSupportStatementContext functionSupportStatement(int i) {
			return getRuleContext(FunctionSupportStatementContext.class,i);
		}
		public CheckErrorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkErrorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCheckErrorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCheckErrorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCheckErrorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckErrorExpressionContext checkErrorExpression() throws RecognitionException {
		CheckErrorExpressionContext _localctx = new CheckErrorExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_checkErrorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2204);
				id();
				}
				break;
			case 2:
				{
				setState(2205);
				id();
				setState(2206);
				typeType();
				}
				break;
			}
			setState(2210);
			left_brace();
			setState(2214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2211);
					functionSupportStatement();
					}
					} 
				}
				setState(2216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			setState(2217);
			tupleExpression();
			setState(2218);
			right_brace();
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

	public static class DataStatementContext extends ParserRuleContext {
		public Token t;
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public IntegerExprContext integerExpr() {
			return getRuleContext(IntegerExprContext.class,0);
		}
		public RawStringExprContext rawStringExpr() {
			return getRuleContext(RawStringExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode CharLiteral() { return getToken(KParser.CharLiteral, 0); }
		public TerminalNode TrueLiteral() { return getToken(KParser.TrueLiteral, 0); }
		public TerminalNode FalseLiteral() { return getToken(KParser.FalseLiteral, 0); }
		public NilExprContext nilExpr() {
			return getRuleContext(NilExprContext.class,0);
		}
		public TerminalNode UndefinedLiteral() { return getToken(KParser.UndefinedLiteral, 0); }
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dataStatement);
		try {
			setState(2229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FloatLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				floatExpr();
				}
				break;
			case DecimalLiteral:
			case BinaryLiteral:
			case OctalLiteral:
			case HexLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221);
				integerExpr();
				}
				break;
			case Quote_Quote_Quote_Open:
				enterOuterAlt(_localctx, 3);
				{
				setState(2222);
				rawStringExpr();
				}
				break;
			case Quote_Open:
				enterOuterAlt(_localctx, 4);
				{
				setState(2223);
				stringExpr();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2224);
				((DataStatementContext)_localctx).t = match(CharLiteral);
				}
				break;
			case TrueLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(2225);
				((DataStatementContext)_localctx).t = match(TrueLiteral);
				}
				break;
			case FalseLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2226);
				((DataStatementContext)_localctx).t = match(FalseLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(2227);
				nilExpr();
				}
				break;
			case UndefinedLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(2228);
				((DataStatementContext)_localctx).t = match(UndefinedLiteral);
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

	public static class StringExprContext extends ParserRuleContext {
		public TerminalNode Quote_Open() { return getToken(KParser.Quote_Open, 0); }
		public TerminalNode Quote_Close() { return getToken(KParser.Quote_Close, 0); }
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public List<StringTemplateContext> stringTemplate() {
			return getRuleContexts(StringTemplateContext.class);
		}
		public StringTemplateContext stringTemplate(int i) {
			return getRuleContext(StringTemplateContext.class,i);
		}
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_stringExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			match(Quote_Open);
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String_Template_Open || _la==TextLiteral) {
				{
				setState(2234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TextLiteral:
					{
					setState(2232);
					stringContent();
					}
					break;
				case String_Template_Open:
					{
					setState(2233);
					stringTemplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2239);
			match(Quote_Close);
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

	public static class StringContentContext extends ParserRuleContext {
		public TerminalNode TextLiteral() { return getToken(KParser.TextLiteral, 0); }
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_stringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(TextLiteral);
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

	public static class StringTemplateContext extends ParserRuleContext {
		public TerminalNode String_Template_Open() { return getToken(KParser.String_Template_Open, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Right_Brace() { return getToken(KParser.Right_Brace, 0); }
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public StringTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterStringTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitStringTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitStringTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTemplateContext stringTemplate() throws RecognitionException {
		StringTemplateContext _localctx = new StringTemplateContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_stringTemplate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(String_Template_Open);
			setState(2249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2244);
					expression(0);
					setState(2245);
					end();
					}
					} 
				}
				setState(2251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			setState(2252);
			expression(0);
			setState(2253);
			match(Right_Brace);
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

	public static class RawStringExprContext extends ParserRuleContext {
		public TerminalNode Quote_Quote_Quote_Open() { return getToken(KParser.Quote_Quote_Quote_Open, 0); }
		public TerminalNode Quote_Quote_Quote_Close() { return getToken(KParser.Quote_Quote_Quote_Close, 0); }
		public List<RawStringContentContext> rawStringContent() {
			return getRuleContexts(RawStringContentContext.class);
		}
		public RawStringContentContext rawStringContent(int i) {
			return getRuleContext(RawStringContentContext.class,i);
		}
		public List<RawStringTemplateContext> rawStringTemplate() {
			return getRuleContexts(RawStringTemplateContext.class);
		}
		public RawStringTemplateContext rawStringTemplate(int i) {
			return getRuleContext(RawStringTemplateContext.class,i);
		}
		public List<TerminalNode> Raw_Quote() { return getTokens(KParser.Raw_Quote); }
		public TerminalNode Raw_Quote(int i) {
			return getToken(KParser.Raw_Quote, i);
		}
		public RawStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawStringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRawStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRawStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRawStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawStringExprContext rawStringExpr() throws RecognitionException {
		RawStringExprContext _localctx = new RawStringExprContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_rawStringExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(Quote_Quote_Quote_Open);
			setState(2261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Raw_Quote - 102)) | (1L << (Raw_String_Template_Open - 102)) | (1L << (RawTextLiteral - 102)))) != 0)) {
				{
				setState(2259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RawTextLiteral:
					{
					setState(2256);
					rawStringContent();
					}
					break;
				case Raw_String_Template_Open:
					{
					setState(2257);
					rawStringTemplate();
					}
					break;
				case Raw_Quote:
					{
					setState(2258);
					match(Raw_Quote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2264);
			match(Quote_Quote_Quote_Close);
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

	public static class RawStringContentContext extends ParserRuleContext {
		public TerminalNode RawTextLiteral() { return getToken(KParser.RawTextLiteral, 0); }
		public RawStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRawStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRawStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRawStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawStringContentContext rawStringContent() throws RecognitionException {
		RawStringContentContext _localctx = new RawStringContentContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_rawStringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			match(RawTextLiteral);
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

	public static class RawStringTemplateContext extends ParserRuleContext {
		public TerminalNode Raw_String_Template_Open() { return getToken(KParser.Raw_String_Template_Open, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Right_Brace() { return getToken(KParser.Right_Brace, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public RawStringTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawStringTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRawStringTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRawStringTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRawStringTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawStringTemplateContext rawStringTemplate() throws RecognitionException {
		RawStringTemplateContext _localctx = new RawStringTemplateContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_rawStringTemplate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			match(Raw_String_Template_Open);
			setState(2272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2269);
				match(New_Line);
				}
				}
				setState(2274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2275);
					expression(0);
					setState(2276);
					end();
					}
					} 
				}
				setState(2282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(2283);
			expression(0);
			setState(2287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2284);
				match(New_Line);
				}
				}
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2290);
			match(Right_Brace);
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

	public static class FloatExprContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(KParser.FloatLiteral, 0); }
		public FloatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatExprContext floatExpr() throws RecognitionException {
		FloatExprContext _localctx = new FloatExprContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_floatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			match(FloatLiteral);
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

	public static class IntegerExprContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(KParser.DecimalLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(KParser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(KParser.OctalLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(KParser.HexLiteral, 0); }
		public IntegerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitIntegerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitIntegerExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerExprContext integerExpr() throws RecognitionException {
		IntegerExprContext _localctx = new IntegerExprContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_integerExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (DecimalLiteral - 83)) | (1L << (BinaryLiteral - 83)) | (1L << (OctalLiteral - 83)) | (1L << (HexLiteral - 83)))) != 0)) ) {
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

	public static class TypeNotNullContext extends ParserRuleContext {
		public TypeAnyContext typeAny() {
			return getRuleContext(TypeAnyContext.class,0);
		}
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeSetContext typeSet() {
			return getRuleContext(TypeSetContext.class,0);
		}
		public TypeDictionaryContext typeDictionary() {
			return getRuleContext(TypeDictionaryContext.class,0);
		}
		public TypeStackContext typeStack() {
			return getRuleContext(TypeStackContext.class,0);
		}
		public TypeQueueContext typeQueue() {
			return getRuleContext(TypeQueueContext.class,0);
		}
		public TypeChannelContext typeChannel() {
			return getRuleContext(TypeChannelContext.class,0);
		}
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypePackageContext typePackage() {
			return getRuleContext(TypePackageContext.class,0);
		}
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
		}
		public TypeNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNotNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeNotNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNotNullContext typeNotNull() throws RecognitionException {
		TypeNotNullContext _localctx = new TypeNotNullContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_typeNotNull);
		try {
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				typeAny();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				typeArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2298);
				typeList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2299);
				typeSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2300);
				typeDictionary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2301);
				typeStack();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2302);
				typeQueue();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2303);
				typeChannel();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2304);
				typeBasic();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2305);
				typePackage();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2306);
				typeFunction();
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

	public static class TypeTypeContext extends ParserRuleContext {
		public TypeNotNullContext typeNotNull() {
			return getRuleContext(TypeNotNullContext.class,0);
		}
		public TypeNullableContext typeNullable() {
			return getRuleContext(TypeNullableContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_typeType);
		try {
			setState(2311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
			case Left_Brack:
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				typeNotNull();
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				typeNullable();
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

	public static class TypeNullableContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(KParser.Question, 0); }
		public TypeNotNullContext typeNotNull() {
			return getRuleContext(TypeNotNullContext.class,0);
		}
		public TypeNullableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNullable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeNullable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeNullable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeNullable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNullableContext typeNullable() throws RecognitionException {
		TypeNullableContext _localctx = new TypeNullableContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_typeNullable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(Question);
			setState(2314);
			typeNotNull();
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

	public static class TypeArrayContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TerminalNode Comma() { return getToken(KParser.Comma, 0); }
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			left_brack();
			setState(2317);
			match(Comma);
			setState(2318);
			right_brack();
			setState(2319);
			typeType();
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

	public static class TypeListContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_typeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			left_brack();
			setState(2322);
			right_brack();
			setState(2323);
			typeType();
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

	public static class TypeSetContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TerminalNode Discard() { return getToken(KParser.Discard, 0); }
		public TypeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSetContext typeSet() throws RecognitionException {
		TypeSetContext _localctx = new TypeSetContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_typeSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			left_brack();
			setState(2326);
			typeType();
			setState(2327);
			right_brack();
			setState(2328);
			match(Discard);
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

	public static class TypeDictionaryContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeDictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDictionaryContext typeDictionary() throws RecognitionException {
		TypeDictionaryContext _localctx = new TypeDictionaryContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_typeDictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			left_brack();
			setState(2331);
			typeType();
			setState(2332);
			right_brack();
			setState(2333);
			typeType();
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

	public static class TypeStackContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TerminalNode Greater() { return getToken(KParser.Greater, 0); }
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeStackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStackContext typeStack() throws RecognitionException {
		TypeStackContext _localctx = new TypeStackContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_typeStack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			left_brack();
			setState(2336);
			match(Greater);
			setState(2337);
			right_brack();
			setState(2338);
			typeType();
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

	public static class TypeQueueContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TerminalNode Less() { return getToken(KParser.Less, 0); }
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeQueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQueue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeQueue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeQueue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeQueue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQueueContext typeQueue() throws RecognitionException {
		TypeQueueContext _localctx = new TypeQueueContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_typeQueue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			left_brack();
			setState(2341);
			match(Less);
			setState(2342);
			right_brack();
			setState(2343);
			typeType();
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

	public static class TypeChannelContext extends ParserRuleContext {
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(KParser.Tilde, 0); }
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChannel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeChannel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeChannel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeChannel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeChannelContext typeChannel() throws RecognitionException {
		TypeChannelContext _localctx = new TypeChannelContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_typeChannel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			left_brack();
			setState(2346);
			match(Tilde);
			setState(2347);
			right_brack();
			setState(2348);
			typeType();
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

	public static class TypePackageContext extends ParserRuleContext {
		public NameSpaceItemContext nameSpaceItem() {
			return getRuleContext(NameSpaceItemContext.class,0);
		}
		public Left_brackContext left_brack() {
			return getRuleContext(Left_brackContext.class,0);
		}
		public TemplateCallContext templateCall() {
			return getRuleContext(TemplateCallContext.class,0);
		}
		public Right_brackContext right_brack() {
			return getRuleContext(Right_brackContext.class,0);
		}
		public TypePackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypePackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypePackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePackageContext typePackage() throws RecognitionException {
		TypePackageContext _localctx = new TypePackageContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_typePackage);
		try {
			setState(2356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
			case TypeAny:
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(2350);
				nameSpaceItem();
				}
				break;
			case Left_Brack:
				enterOuterAlt(_localctx, 2);
				{
				setState(2351);
				left_brack();
				setState(2352);
				nameSpaceItem();
				setState(2353);
				templateCall();
				setState(2354);
				right_brack();
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

	public static class TypeFunctionContext extends ParserRuleContext {
		public Token t;
		public Token b;
		public Token y;
		public Left_parenContext left_paren() {
			return getRuleContext(Left_parenContext.class,0);
		}
		public List<TypeFunctionParameterClauseContext> typeFunctionParameterClause() {
			return getRuleContexts(TypeFunctionParameterClauseContext.class);
		}
		public TypeFunctionParameterClauseContext typeFunctionParameterClause(int i) {
			return getRuleContext(TypeFunctionParameterClauseContext.class,i);
		}
		public Right_parenContext right_paren() {
			return getRuleContext(Right_parenContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
		public TerminalNode Right_Flow() { return getToken(KParser.Right_Flow, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public TerminalNode Bang() { return getToken(KParser.Bang, 0); }
		public TerminalNode At() { return getToken(KParser.At, 0); }
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_typeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			left_paren();
			setState(2359);
			typeFunctionParameterClause();
			setState(2360);
			((TypeFunctionContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Right_Flow || _la==Right_Arrow) ) {
				((TypeFunctionContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2361);
				((TypeFunctionContext)_localctx).b = match(Bang);
				}
			}

			setState(2365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(2364);
				((TypeFunctionContext)_localctx).y = match(At);
				}
			}

			setState(2370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2367);
				match(New_Line);
				}
				}
				setState(2372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2373);
			typeFunctionParameterClause();
			setState(2374);
			right_paren();
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

	public static class TypeAnyContext extends ParserRuleContext {
		public TerminalNode TypeAny() { return getToken(KParser.TypeAny, 0); }
		public TypeAnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnyContext typeAny() throws RecognitionException {
		TypeAnyContext _localctx = new TypeAnyContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_typeAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(TypeAny);
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

	public static class TypeFunctionParameterClauseContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public TypeFunctionParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunctionParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeFunctionParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeFunctionParameterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeFunctionParameterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionParameterClauseContext typeFunctionParameterClause() throws RecognitionException {
		TypeFunctionParameterClauseContext _localctx = new TypeFunctionParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_typeFunctionParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				setState(2378);
				typeType();
				}
			}

			setState(2386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2381);
				more();
				setState(2382);
				typeType();
				}
				}
				setState(2388);
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

	public static class TypeBasicContext extends ParserRuleContext {
		public Token t;
		public TerminalNode TypeI8() { return getToken(KParser.TypeI8, 0); }
		public TerminalNode TypeU8() { return getToken(KParser.TypeU8, 0); }
		public TerminalNode TypeI16() { return getToken(KParser.TypeI16, 0); }
		public TerminalNode TypeU16() { return getToken(KParser.TypeU16, 0); }
		public TerminalNode TypeI32() { return getToken(KParser.TypeI32, 0); }
		public TerminalNode TypeU32() { return getToken(KParser.TypeU32, 0); }
		public TerminalNode TypeI64() { return getToken(KParser.TypeI64, 0); }
		public TerminalNode TypeU64() { return getToken(KParser.TypeU64, 0); }
		public TerminalNode TypeF32() { return getToken(KParser.TypeF32, 0); }
		public TerminalNode TypeF64() { return getToken(KParser.TypeF64, 0); }
		public TerminalNode TypeChr() { return getToken(KParser.TypeChr, 0); }
		public TerminalNode TypeStr() { return getToken(KParser.TypeStr, 0); }
		public TerminalNode TypeBool() { return getToken(KParser.TypeBool, 0); }
		public TerminalNode TypeInt() { return getToken(KParser.TypeInt, 0); }
		public TerminalNode TypeNum() { return getToken(KParser.TypeNum, 0); }
		public TerminalNode TypeByte() { return getToken(KParser.TypeByte, 0); }
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_typeBasic);
		try {
			setState(2405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
				enterOuterAlt(_localctx, 1);
				{
				setState(2389);
				((TypeBasicContext)_localctx).t = match(TypeI8);
				}
				break;
			case TypeU8:
				enterOuterAlt(_localctx, 2);
				{
				setState(2390);
				((TypeBasicContext)_localctx).t = match(TypeU8);
				}
				break;
			case TypeI16:
				enterOuterAlt(_localctx, 3);
				{
				setState(2391);
				((TypeBasicContext)_localctx).t = match(TypeI16);
				}
				break;
			case TypeU16:
				enterOuterAlt(_localctx, 4);
				{
				setState(2392);
				((TypeBasicContext)_localctx).t = match(TypeU16);
				}
				break;
			case TypeI32:
				enterOuterAlt(_localctx, 5);
				{
				setState(2393);
				((TypeBasicContext)_localctx).t = match(TypeI32);
				}
				break;
			case TypeU32:
				enterOuterAlt(_localctx, 6);
				{
				setState(2394);
				((TypeBasicContext)_localctx).t = match(TypeU32);
				}
				break;
			case TypeI64:
				enterOuterAlt(_localctx, 7);
				{
				setState(2395);
				((TypeBasicContext)_localctx).t = match(TypeI64);
				}
				break;
			case TypeU64:
				enterOuterAlt(_localctx, 8);
				{
				setState(2396);
				((TypeBasicContext)_localctx).t = match(TypeU64);
				}
				break;
			case TypeF32:
				enterOuterAlt(_localctx, 9);
				{
				setState(2397);
				((TypeBasicContext)_localctx).t = match(TypeF32);
				}
				break;
			case TypeF64:
				enterOuterAlt(_localctx, 10);
				{
				setState(2398);
				((TypeBasicContext)_localctx).t = match(TypeF64);
				}
				break;
			case TypeChr:
				enterOuterAlt(_localctx, 11);
				{
				setState(2399);
				((TypeBasicContext)_localctx).t = match(TypeChr);
				}
				break;
			case TypeStr:
				enterOuterAlt(_localctx, 12);
				{
				setState(2400);
				((TypeBasicContext)_localctx).t = match(TypeStr);
				}
				break;
			case TypeBool:
				enterOuterAlt(_localctx, 13);
				{
				setState(2401);
				((TypeBasicContext)_localctx).t = match(TypeBool);
				}
				break;
			case TypeInt:
				enterOuterAlt(_localctx, 14);
				{
				setState(2402);
				((TypeBasicContext)_localctx).t = match(TypeInt);
				}
				break;
			case TypeNum:
				enterOuterAlt(_localctx, 15);
				{
				setState(2403);
				((TypeBasicContext)_localctx).t = match(TypeNum);
				}
				break;
			case TypeByte:
				enterOuterAlt(_localctx, 16);
				{
				setState(2404);
				((TypeBasicContext)_localctx).t = match(TypeByte);
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

	public static class NilExprContext extends ParserRuleContext {
		public TerminalNode NilLiteral() { return getToken(KParser.NilLiteral, 0); }
		public NilExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nilExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterNilExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitNilExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitNilExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilExprContext nilExpr() throws RecognitionException {
		NilExprContext _localctx = new NilExprContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_nilExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(NilLiteral);
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
		public Token t;
		public TerminalNode TrueLiteral() { return getToken(KParser.TrueLiteral, 0); }
		public TerminalNode FalseLiteral() { return getToken(KParser.FalseLiteral, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_boolExpr);
		try {
			setState(2411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrueLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2409);
				((BoolExprContext)_localctx).t = match(TrueLiteral);
				}
				break;
			case FalseLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2410);
				((BoolExprContext)_localctx).t = match(FalseLiteral);
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

	public static class BitwiseContext extends ParserRuleContext {
		public BitwiseAndContext bitwiseAnd() {
			return getRuleContext(BitwiseAndContext.class,0);
		}
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public BitwiseXorContext bitwiseXor() {
			return getRuleContext(BitwiseXorContext.class,0);
		}
		public BitwiseLeftShiftContext bitwiseLeftShift() {
			return getRuleContext(BitwiseLeftShiftContext.class,0);
		}
		public BitwiseRightShiftContext bitwiseRightShift() {
			return getRuleContext(BitwiseRightShiftContext.class,0);
		}
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And_And:
				{
				setState(2413);
				bitwiseAnd();
				}
				break;
			case Or_Or:
				{
				setState(2414);
				bitwiseOr();
				}
				break;
			case Caret_Caret:
				{
				setState(2415);
				bitwiseXor();
				}
				break;
			case Less_Less:
				{
				setState(2416);
				bitwiseLeftShift();
				}
				break;
			case Greater_Greater:
				{
				setState(2417);
				bitwiseRightShift();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2420);
				match(New_Line);
				}
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

	public static class BitwiseAndContext extends ParserRuleContext {
		public TerminalNode And_And() { return getToken(KParser.And_And, 0); }
		public BitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseAndContext bitwiseAnd() throws RecognitionException {
		BitwiseAndContext _localctx = new BitwiseAndContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_bitwiseAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			match(And_And);
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

	public static class BitwiseOrContext extends ParserRuleContext {
		public TerminalNode Or_Or() { return getToken(KParser.Or_Or, 0); }
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_bitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			match(Or_Or);
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

	public static class BitwiseNotContext extends ParserRuleContext {
		public TerminalNode Tilde_Tilde() { return getToken(KParser.Tilde_Tilde, 0); }
		public BitwiseNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseNotContext bitwiseNot() throws RecognitionException {
		BitwiseNotContext _localctx = new BitwiseNotContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_bitwiseNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(Tilde_Tilde);
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

	public static class BitwiseXorContext extends ParserRuleContext {
		public TerminalNode Caret_Caret() { return getToken(KParser.Caret_Caret, 0); }
		public BitwiseXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseXorContext bitwiseXor() throws RecognitionException {
		BitwiseXorContext _localctx = new BitwiseXorContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_bitwiseXor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(Caret_Caret);
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

	public static class BitwiseLeftShiftContext extends ParserRuleContext {
		public TerminalNode Less_Less() { return getToken(KParser.Less_Less, 0); }
		public BitwiseLeftShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseLeftShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseLeftShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseLeftShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseLeftShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseLeftShiftContext bitwiseLeftShift() throws RecognitionException {
		BitwiseLeftShiftContext _localctx = new BitwiseLeftShiftContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_bitwiseLeftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			match(Less_Less);
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

	public static class BitwiseRightShiftContext extends ParserRuleContext {
		public TerminalNode Greater_Greater() { return getToken(KParser.Greater_Greater, 0); }
		public BitwiseRightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseRightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterBitwiseRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitBitwiseRightShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitBitwiseRightShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseRightShiftContext bitwiseRightShift() throws RecognitionException {
		BitwiseRightShiftContext _localctx = new BitwiseRightShiftContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_bitwiseRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(Greater_Greater);
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

	public static class CompareCombineContext extends ParserRuleContext {
		public TerminalNode Combine_Equal() { return getToken(KParser.Combine_Equal, 0); }
		public CompareCombineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareCombine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCompareCombine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCompareCombine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCompareCombine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareCombineContext compareCombine() throws RecognitionException {
		CompareCombineContext _localctx = new CompareCombineContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_compareCombine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			match(Combine_Equal);
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

	public static class CompareContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Equal_Equal() { return getToken(KParser.Equal_Equal, 0); }
		public TerminalNode Not_Equal() { return getToken(KParser.Not_Equal, 0); }
		public TerminalNode Less_Equal() { return getToken(KParser.Less_Equal, 0); }
		public TerminalNode Greater_Equal() { return getToken(KParser.Greater_Equal, 0); }
		public TerminalNode Less() { return getToken(KParser.Less, 0); }
		public TerminalNode Greater() { return getToken(KParser.Greater, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			((CompareContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal_Equal) | (1L << Less_Equal) | (1L << Greater_Equal) | (1L << Not_Equal) | (1L << Less) | (1L << Greater))) != 0)) ) {
				((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2438);
				match(New_Line);
				}
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

	public static class LogicContext extends ParserRuleContext {
		public Token op;
		public TerminalNode And() { return getToken(KParser.And, 0); }
		public TerminalNode Or() { return getToken(KParser.Or, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			((LogicContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Or) ) {
				((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2442);
				match(New_Line);
				}
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

	public static class AssignContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Equal() { return getToken(KParser.Equal, 0); }
		public TerminalNode Add_Equal() { return getToken(KParser.Add_Equal, 0); }
		public TerminalNode Sub_Equal() { return getToken(KParser.Sub_Equal, 0); }
		public TerminalNode Mul_Equal() { return getToken(KParser.Mul_Equal, 0); }
		public TerminalNode Div_Equal() { return getToken(KParser.Div_Equal, 0); }
		public TerminalNode Mod_Equal() { return getToken(KParser.Mod_Equal, 0); }
		public TerminalNode Pow_Equal() { return getToken(KParser.Pow_Equal, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			((AssignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add_Equal) | (1L << Sub_Equal) | (1L << Mul_Equal) | (1L << Div_Equal) | (1L << Mod_Equal) | (1L << Pow_Equal) | (1L << Equal))) != 0)) ) {
				((AssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2446);
				match(New_Line);
				}
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

	public static class AddContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Add() { return getToken(KParser.Add, 0); }
		public TerminalNode Sub() { return getToken(KParser.Sub, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449);
			((AddContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Add || _la==Sub) ) {
				((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2450);
				match(New_Line);
				}
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

	public static class MulContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Mul() { return getToken(KParser.Mul, 0); }
		public TerminalNode Div() { return getToken(KParser.Div, 0); }
		public TerminalNode Mod() { return getToken(KParser.Mod, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			((MulContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
				((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2454);
				match(New_Line);
				}
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

	public static class PowContext extends ParserRuleContext {
		public TerminalNode Caret() { return getToken(KParser.Caret, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(Caret);
			setState(2459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2458);
				match(New_Line);
				}
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

	public static class CallContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Dot() { return getToken(KParser.Dot, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			((CallContext)_localctx).op = match(Dot);
			setState(2463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2462);
				match(New_Line);
				}
				break;
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

	public static class WaveContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Tilde() { return getToken(KParser.Tilde, 0); }
		public WaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterWave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitWave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitWave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaveContext wave() throws RecognitionException {
		WaveContext _localctx = new WaveContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_wave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465);
			((WaveContext)_localctx).op = match(Tilde);
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

	public static class IdContext extends ParserRuleContext {
		public IdItemContext idItem() {
			return getRuleContext(IdItemContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2467);
			idItem();
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

	public static class IdItemContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IDPublic() { return getToken(KParser.IDPublic, 0); }
		public TerminalNode IDPrivate() { return getToken(KParser.IDPrivate, 0); }
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeAnyContext typeAny() {
			return getRuleContext(TypeAnyContext.class,0);
		}
		public IdItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterIdItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitIdItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitIdItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdItemContext idItem() throws RecognitionException {
		IdItemContext _localctx = new IdItemContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_idItem);
		int _la;
		try {
			setState(2472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				((IdItemContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IDPrivate || _la==IDPublic) ) {
					((IdItemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TypeI8:
			case TypeU8:
			case TypeI16:
			case TypeU16:
			case TypeI32:
			case TypeU32:
			case TypeI64:
			case TypeU64:
			case TypeF32:
			case TypeF64:
			case TypeChr:
			case TypeStr:
			case TypeBool:
			case TypeInt:
			case TypeNum:
			case TypeByte:
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				typeBasic();
				}
				break;
			case TypeAny:
				enterOuterAlt(_localctx, 3);
				{
				setState(2471);
				typeAny();
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(KParser.Semi, 0); }
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			_la = _input.LA(1);
			if ( !(_la==Semi || _la==New_Line) ) {
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

	public static class MoreContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(KParser.Comma, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_more);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(Comma);
			setState(2480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2477);
				match(New_Line);
				}
				}
				setState(2482);
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

	public static class Left_braceContext extends ParserRuleContext {
		public TerminalNode Left_Brace() { return getToken(KParser.Left_Brace, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public Left_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLeft_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLeft_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLeft_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_braceContext left_brace() throws RecognitionException {
		Left_braceContext _localctx = new Left_braceContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_left_brace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(Left_Brace);
			setState(2487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2484);
					match(New_Line);
					}
					} 
				}
				setState(2489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
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

	public static class Right_braceContext extends ParserRuleContext {
		public TerminalNode Right_Brace() { return getToken(KParser.Right_Brace, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public Right_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRight_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRight_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRight_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_braceContext right_brace() throws RecognitionException {
		Right_braceContext _localctx = new Right_braceContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_right_brace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2490);
				match(New_Line);
				}
				}
				setState(2495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2496);
			match(Right_Brace);
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

	public static class Left_parenContext extends ParserRuleContext {
		public TerminalNode Left_Paren() { return getToken(KParser.Left_Paren, 0); }
		public Left_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLeft_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLeft_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLeft_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_parenContext left_paren() throws RecognitionException {
		Left_parenContext _localctx = new Left_parenContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_left_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
			match(Left_Paren);
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

	public static class Right_parenContext extends ParserRuleContext {
		public TerminalNode Right_Paren() { return getToken(KParser.Right_Paren, 0); }
		public Right_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRight_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRight_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRight_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_parenContext right_paren() throws RecognitionException {
		Right_parenContext _localctx = new Right_parenContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_right_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			match(Right_Paren);
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

	public static class Left_brackContext extends ParserRuleContext {
		public TerminalNode Left_Brack() { return getToken(KParser.Left_Brack, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public Left_brackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_brack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterLeft_brack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitLeft_brack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitLeft_brack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_brackContext left_brack() throws RecognitionException {
		Left_brackContext _localctx = new Left_brackContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_left_brack);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			match(Left_Brack);
			setState(2506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2503);
					match(New_Line);
					}
					} 
				}
				setState(2508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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

	public static class Right_brackContext extends ParserRuleContext {
		public TerminalNode Right_Brack() { return getToken(KParser.Right_Brack, 0); }
		public List<TerminalNode> New_Line() { return getTokens(KParser.New_Line); }
		public TerminalNode New_Line(int i) {
			return getToken(KParser.New_Line, i);
		}
		public Right_brackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_brack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).enterRight_brack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KParserListener ) ((KParserListener)listener).exitRight_brack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KParserVisitor ) return ((KParserVisitor<? extends T>)visitor).visitRight_brack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_brackContext right_brack() throws RecognitionException {
		Right_brackContext _localctx = new Right_brackContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_right_brack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2509);
				match(New_Line);
				}
				}
				setState(2514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2515);
			match(Right_Brack);
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
		case 77:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 18);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3j\u09d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\3\2\6\2\u017c\n\2\r\2\16\2\u017d"+
		"\3\3\7\3\u0181\n\3\f\3\16\3\u0184\13\3\3\3\5\3\u0187\n\3\3\3\3\3\7\3\u018b"+
		"\n\3\f\3\16\3\u018e\13\3\3\3\7\3\u0191\n\3\f\3\16\3\u0194\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01a5\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u01ac\n\6\f\6\16\6\u01af\13\6\3\6\3\6\3\6\3\7\5\7"+
		"\u01b5\n\7\3\7\3\7\5\7\u01b9\n\7\3\7\5\7\u01bc\n\7\3\7\5\7\u01bf\n\7\3"+
		"\7\3\7\5\7\u01c3\n\7\3\7\3\7\3\b\3\b\5\b\u01c9\n\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\5\t\u01d1\n\t\3\t\3\t\7\t\u01d5\n\t\f\t\16\t\u01d8\13\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\5\13\u01e0\n\13\3\13\3\13\5\13\u01e4\n\13\3\13\3\13\7"+
		"\13\u01e8\n\13\f\13\16\13\u01eb\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u01f2"+
		"\n\13\f\13\16\13\u01f5\13\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u01fd\n\f"+
		"\3\f\5\f\u0200\n\f\3\f\3\f\3\r\5\r\u0205\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u020e\n\r\5\r\u0210\n\r\3\r\3\r\3\16\5\16\u0215\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u021d\n\16\5\16\u021f\n\16\3\16\3\16\3\17\5"+
		"\17\u0224\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u022c\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0233\n\17\3\17\5\17\u0236\n\17\3\17\7\17\u0239\n"+
		"\17\f\17\16\17\u023c\13\17\3\17\3\17\3\17\3\17\7\17\u0242\n\17\f\17\16"+
		"\17\u0245\13\17\3\17\3\17\3\17\3\20\5\20\u024b\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0253\n\20\3\20\5\20\u0256\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u025d\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u0264\n\20\7\20\u0266"+
		"\n\20\f\20\16\20\u0269\13\20\3\20\3\20\3\21\3\21\7\21\u026f\n\21\f\21"+
		"\16\21\u0272\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u027a\n\22\3\23"+
		"\5\23\u027d\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0286\n\23\5"+
		"\23\u0288\n\23\3\23\3\23\3\24\5\24\u028d\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0295\n\24\5\24\u0297\n\24\3\24\3\24\3\25\5\25\u029c\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a4\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02ab\n\25\3\25\5\25\u02ae\n\25\3\25\7\25\u02b1\n\25\f\25\16\25"+
		"\u02b4\13\25\3\25\3\25\3\25\3\25\7\25\u02ba\n\25\f\25\16\25\u02bd\13\25"+
		"\3\25\3\25\3\25\3\26\3\26\5\26\u02c4\n\26\3\26\3\26\3\26\3\26\5\26\u02ca"+
		"\n\26\5\26\u02cc\n\26\3\26\3\26\7\26\u02d0\n\26\f\26\16\26\u02d3\13\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02df\n\27\3\30"+
		"\3\30\3\31\5\31\u02e4\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u02eb\n\31\3"+
		"\31\3\31\3\31\3\31\5\31\u02f1\n\31\5\31\u02f3\n\31\3\31\3\31\3\31\5\31"+
		"\u02f8\n\31\3\31\3\31\5\31\u02fc\n\31\3\31\3\31\7\31\u0300\n\31\f\31\16"+
		"\31\u0303\13\31\3\31\3\31\3\32\5\32\u0308\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0311\n\32\5\32\u0313\n\32\3\32\3\32\3\33\5\33\u0318\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0320\n\33\5\33\u0322\n\33\3\33"+
		"\3\33\3\34\5\34\u0327\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u032f\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u0336\n\34\3\34\5\34\u0339\n\34\3\34"+
		"\7\34\u033c\n\34\f\34\16\34\u033f\13\34\3\34\3\34\3\34\3\34\7\34\u0345"+
		"\n\34\f\34\16\34\u0348\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0352\n\35\3\35\3\35\6\35\u0356\n\35\r\35\16\35\u0357\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u036b\n\37\3\37\3\37\3\37\3\37\5\37\u0371\n\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0377\n\37\7\37\u0379\n\37\f\37\16\37\u037c\13\37\3\37\3\37"+
		"\3 \5 \u0381\n \3 \3 \5 \u0385\n \3 \3 \3 \3 \3 \3 \3 \5 \u038e\n \5 "+
		"\u0390\n \3 \3 \3!\5!\u0395\n!\3!\3!\5!\u0399\n!\3!\3!\3!\3!\3!\3!\5!"+
		"\u03a1\n!\5!\u03a3\n!\3!\3!\3\"\5\"\u03a8\n\"\3\"\3\"\5\"\u03ac\n\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u03b4\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u03bb\n\""+
		"\3\"\5\"\u03be\n\"\3\"\7\"\u03c1\n\"\f\"\16\"\u03c4\13\"\3\"\3\"\3\"\3"+
		"\"\7\"\u03ca\n\"\f\"\16\"\u03cd\13\"\3\"\3\"\3\"\3#\5#\u03d3\n#\3#\3#"+
		"\3#\3#\3#\3#\5#\u03db\n#\3#\5#\u03de\n#\3#\3#\3#\3#\3#\5#\u03e5\n#\7#"+
		"\u03e7\n#\f#\16#\u03ea\13#\3#\3#\3#\3#\5#\u03f0\n#\7#\u03f2\n#\f#\16#"+
		"\u03f5\13#\3#\3#\3#\3#\3#\5#\u03fc\n#\7#\u03fe\n#\f#\16#\u0401\13#\5#"+
		"\u0403\n#\3#\3#\3$\3$\3$\5$\u040a\n$\3$\3$\3$\3$\5$\u0410\n$\5$\u0412"+
		"\n$\3$\3$\7$\u0416\n$\f$\16$\u0419\13$\3$\3$\3%\3%\3%\5%\u0420\n%\3&\5"+
		"&\u0423\n&\3&\3&\5&\u0427\n&\3&\3&\3&\3&\3&\5&\u042e\n&\5&\u0430\n&\3"+
		"&\3&\3\'\5\'\u0435\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u043d\n\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0443\n\'\3\'\5\'\u0446\n\'\3\'\7\'\u0449\n\'\f\'\16\'\u044c"+
		"\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u0458\n(\3(\3(\3(\3(\3(\5("+
		"\u045f\n(\3(\5(\u0462\n(\3(\7(\u0465\n(\f(\16(\u0468\13(\3(\3(\3(\3(\7"+
		"(\u046e\n(\f(\16(\u0471\13(\3(\3(\3(\3)\3)\5)\u0478\n)\3)\3)\3*\3*\5*"+
		"\u047e\n*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\5-\u048c\n-\3-\3-\3-\7-"+
		"\u0491\n-\f-\16-\u0494\13-\3.\5.\u0497\n.\3.\3.\3.\7.\u049c\n.\f.\16."+
		"\u049f\13.\3/\5/\u04a2\n/\3/\3/\5/\u04a6\n/\3/\5/\u04a9\n/\3/\3/\3/\5"+
		"/\u04ae\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04c7\n\60"+
		"\3\61\3\61\3\61\3\61\6\61\u04cd\n\61\r\61\16\61\u04ce\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\7\62\u04d7\n\62\f\62\16\62\u04da\13\62\3\62\3\62\7\62\u04de"+
		"\n\62\f\62\16\62\u04e1\13\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u04e9"+
		"\n\63\3\63\5\63\u04ec\n\63\3\64\3\64\7\64\u04f0\n\64\f\64\16\64\u04f3"+
		"\13\64\3\64\3\64\3\64\3\64\3\64\7\64\u04fa\n\64\f\64\16\64\u04fd\13\64"+
		"\3\64\3\64\5\64\u0501\n\64\3\65\3\65\3\65\7\65\u0506\n\65\f\65\16\65\u0509"+
		"\13\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0511\n\66\f\66\16\66\u0514"+
		"\13\66\3\66\3\66\3\67\3\67\3\67\7\67\u051b\n\67\f\67\16\67\u051e\13\67"+
		"\3\67\3\67\38\38\38\58\u0525\n8\38\38\38\38\78\u052b\n8\f8\168\u052e\13"+
		"8\38\38\58\u0532\n8\38\38\39\39\39\39\39\59\u053b\n9\39\39\59\u053f\n"+
		"9\39\39\39\39\79\u0545\n9\f9\169\u0548\139\39\39\59\u054c\n9\39\39\3:"+
		"\3:\3:\3:\7:\u0554\n:\f:\16:\u0557\13:\3:\3:\5:\u055b\n:\3:\3:\3;\3;\3"+
		";\7;\u0562\n;\f;\16;\u0565\13;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>"+
		"\7>\u0574\n>\f>\16>\u0577\13>\3>\3>\7>\u057b\n>\f>\16>\u057e\13>\3>\3"+
		">\3>\3>\3>\3>\7>\u0586\n>\f>\16>\u0589\13>\3>\3>\6>\u058d\n>\r>\16>\u058e"+
		"\3>\3>\5>\u0593\n>\3?\3?\3?\3?\3?\7?\u059a\n?\f?\16?\u059d\13?\3?\5?\u05a0"+
		"\n?\3?\3?\3?\3?\7?\u05a6\n?\f?\16?\u05a9\13?\3?\3?\3?\3@\3@\3@\3@\5@\u05b2"+
		"\n@\3@\3@\7@\u05b6\n@\f@\16@\u05b9\13@\3@\3@\3A\3A\3A\7A\u05c0\nA\fA\16"+
		"A\u05c3\13A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\5C\u05d2\nC\3C\3C\3"+
		"D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\7F\u05e3\nF\fF\16F\u05e6\13F\3F"+
		"\3F\3F\3F\3G\3G\3G\3G\7G\u05f0\nG\fG\16G\u05f3\13G\3G\3G\3G\3G\3H\3H\3"+
		"H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\5K\u0607\nK\3K\5K\u060a\nK\3L\3L\5"+
		"L\u060e\nL\3L\5L\u0611\nL\3M\3M\3M\3M\7M\u0617\nM\fM\16M\u061a\13M\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0628\nN\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u063e\nO\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O"+
		"\u0674\nO\fO\16O\u0677\13O\3P\3P\5P\u067b\nP\3P\3P\3P\3P\3P\3P\5P\u0683"+
		"\nP\3P\3P\5P\u0687\nP\3Q\3Q\3Q\3Q\3Q\7Q\u068e\nQ\fQ\16Q\u0691\13Q\5Q\u0693"+
		"\nQ\3Q\3Q\3R\3R\3R\3R\7R\u069b\nR\fR\16R\u069e\13R\3S\3S\3T\3T\3U\3U\5"+
		"U\u06a6\nU\3U\5U\u06a9\nU\6U\u06ab\nU\rU\16U\u06ac\3V\3V\3V\3V\5V\u06b3"+
		"\nV\3V\3V\3V\5V\u06b8\nV\3W\3W\3W\5W\u06bd\nW\3X\3X\5X\u06c1\nX\3Y\3Y"+
		"\3Y\3Z\3Z\3Z\5Z\u06c9\nZ\3[\3[\3[\3\\\3\\\3]\3]\3]\5]\u06d3\n]\3]\3]\3"+
		"^\3^\3^\3^\3^\5^\u06dc\n^\3^\3^\3_\3_\3_\5_\u06e3\n_\3_\5_\u06e6\n_\3"+
		"_\5_\u06e9\n_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3c\7c\u06fa\n"+
		"c\fc\16c\u06fd\13c\3c\3c\3d\3d\3d\3d\3e\3e\3e\7e\u0708\ne\fe\16e\u070b"+
		"\13e\3e\3e\3f\3f\3f\7f\u0712\nf\ff\16f\u0715\13f\3f\3f\3g\3g\3g\3g\7g"+
		"\u071d\ng\fg\16g\u0720\13g\3g\3g\3g\3h\3h\3h\3h\7h\u0729\nh\fh\16h\u072c"+
		"\13h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\5j\u073a\nj\3k\3k\3k\3k\3l\3"+
		"l\3l\3m\3m\3m\3n\3n\3n\5n\u0749\nn\7n\u074b\nn\fn\16n\u074e\13n\3n\3n"+
		"\3o\3o\3o\5o\u0755\no\3o\3o\7o\u0759\no\fo\16o\u075c\13o\3p\7p\u075f\n"+
		"p\fp\16p\u0762\13p\3q\3q\3q\3q\3q\3q\5q\u076a\nq\3r\7r\u076d\nr\fr\16"+
		"r\u0770\13r\3s\3s\5s\u0774\ns\3s\3s\7s\u0778\ns\fs\16s\u077b\13s\3s\3"+
		"s\3s\3s\3s\5s\u0782\ns\3s\3s\7s\u0786\ns\fs\16s\u0789\13s\3s\7s\u078c"+
		"\ns\fs\16s\u078f\13s\3s\3s\5s\u0793\ns\3t\3t\3t\3t\7t\u0799\nt\ft\16t"+
		"\u079c\13t\3u\3u\3v\3v\3v\3v\7v\u07a4\nv\fv\16v\u07a7\13v\3v\3v\3v\3w"+
		"\3w\5w\u07ae\nw\3w\3w\3w\3x\3x\3x\3x\5x\u07b7\nx\3x\5x\u07ba\nx\3x\7x"+
		"\u07bd\nx\fx\16x\u07c0\13x\3x\3x\3x\3x\7x\u07c6\nx\fx\16x\u07c9\13x\3"+
		"x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3|\3|\5|\u07d9\n|\3|\7|\u07dc\n|\f"+
		"|\16|\u07df\13|\3|\3|\5|\u07e3\n|\3|\3|\3}\3}\3}\5}\u07ea\n}\3}\3}\3}"+
		"\3~\3~\3~\5~\u07f2\n~\5~\u07f4\n~\3~\3~\5~\u07f8\n~\3\177\3\177\7\177"+
		"\u07fc\n\177\f\177\16\177\u07ff\13\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u0806\n\u0080\f\u0080\16\u0080\u0809\13\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0813\n\u0081"+
		"\f\u0081\16\u0081\u0816\13\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\7\u0082\u081e\n\u0082\f\u0082\16\u0082\u0821\13\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\6\u0083\u082b"+
		"\n\u0083\r\u0083\16\u0083\u082c\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u0833\n\u0084\f\u0084\16\u0084\u0836\13\u0084\3\u0084\3\u0084\7\u0084"+
		"\u083a\n\u0084\f\u0084\16\u0084\u083d\13\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0845\n\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\7\u0085\u084c\n\u0085\f\u0085\16\u0085\u084f\13\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0854\n\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u085a\n\u0086\3\u0086\3\u0086\5\u0086\u085e\n\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086\u0865\n\u0086\f\u0086\16"+
		"\u0086\u0868\13\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u086d\n\u0086\3"+
		"\u0087\3\u0087\3\u0087\7\u0087\u0872\n\u0087\f\u0087\16\u0087\u0875\13"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088"+
		"\u087e\n\u0088\f\u0088\16\u0088\u0881\13\u0088\3\u0088\3\u0088\3\u0088"+
		"\7\u0088\u0886\n\u0088\f\u0088\16\u0088\u0889\13\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0891\n\u0088\f\u0088\16\u0088"+
		"\u0894\13\u0088\3\u0088\3\u0088\3\u0088\6\u0088\u0899\n\u0088\r\u0088"+
		"\16\u0088\u089a\5\u0088\u089d\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u08a3\n\u0089\3\u0089\3\u0089\7\u0089\u08a7\n\u0089\f\u0089\16"+
		"\u0089\u08aa\13\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u08b8\n\u008a"+
		"\3\u008b\3\u008b\3\u008b\7\u008b\u08bd\n\u008b\f\u008b\16\u008b\u08c0"+
		"\13\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u08ca\n\u008d\f\u008d\16\u008d\u08cd\13\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u08d6\n\u008e\f\u008e"+
		"\16\u008e\u08d9\13\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\7\u0090\u08e1\n\u0090\f\u0090\16\u0090\u08e4\13\u0090\3\u0090\3\u0090"+
		"\3\u0090\7\u0090\u08e9\n\u0090\f\u0090\16\u0090\u08ec\13\u0090\3\u0090"+
		"\3\u0090\7\u0090\u08f0\n\u0090\f\u0090\16\u0090\u08f3\13\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0906"+
		"\n\u0093\3\u0094\3\u0094\5\u0094\u090a\n\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0937\n\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u093d\n\u009e\3\u009e\5\u009e\u0940\n\u009e\3"+
		"\u009e\7\u009e\u0943\n\u009e\f\u009e\16\u009e\u0946\13\u009e\3\u009e\3"+
		"\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\5\u00a0\u094e\n\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\7\u00a0\u0953\n\u00a0\f\u00a0\16\u00a0\u0956\13\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0968"+
		"\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u096e\n\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0975\n\u00a4\3\u00a4\5\u00a4"+
		"\u0978\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\5\u00ac\u098a\n\u00ac\3\u00ad\3\u00ad\5\u00ad\u098e\n\u00ad\3\u00ae\3"+
		"\u00ae\5\u00ae\u0992\n\u00ae\3\u00af\3\u00af\5\u00af\u0996\n\u00af\3\u00b0"+
		"\3\u00b0\5\u00b0\u099a\n\u00b0\3\u00b1\3\u00b1\5\u00b1\u099e\n\u00b1\3"+
		"\u00b2\3\u00b2\5\u00b2\u09a2\n\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3"+
		"\u00b5\3\u00b5\3\u00b5\5\u00b5\u09ab\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3"+
		"\u00b7\7\u00b7\u09b1\n\u00b7\f\u00b7\16\u00b7\u09b4\13\u00b7\3\u00b8\3"+
		"\u00b8\7\u00b8\u09b8\n\u00b8\f\u00b8\16\u00b8\u09bb\13\u00b8\3\u00b9\7"+
		"\u00b9\u09be\n\u00b9\f\u00b9\16\u00b9\u09c1\13\u00b9\3\u00b9\3\u00b9\3"+
		"\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\7\u00bc\u09cb\n\u00bc\f"+
		"\u00bc\16\u00bc\u09ce\13\u00bc\3\u00bd\7\u00bd\u09d1\n\u00bd\f\u00bd\16"+
		"\u00bd\u09d4\13\u00bd\3\u00bd\3\u00bd\3\u00bd\2\3\u009c\u00be\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\2\r\4\2\31\31\33\33\3"+
		"\2\26\27\3\2\21\24\3\2UX\4\2\n\r&\'\3\2:;\4\2\3\b\37\37\3\2\65\66\3\2"+
		"\679\3\2\\]\4\2((bb\2\u0ab9\2\u017b\3\2\2\2\4\u0182\3\2\2\2\6\u0195\3"+
		"\2\2\2\b\u01a4\3\2\2\2\n\u01a6\3\2\2\2\f\u01b4\3\2\2\2\16\u01c6\3\2\2"+
		"\2\20\u01ce\3\2\2\2\22\u01dc\3\2\2\2\24\u01df\3\2\2\2\26\u01f9\3\2\2\2"+
		"\30\u0204\3\2\2\2\32\u0214\3\2\2\2\34\u0223\3\2\2\2\36\u024a\3\2\2\2 "+
		"\u026c\3\2\2\2\"\u0279\3\2\2\2$\u027c\3\2\2\2&\u028c\3\2\2\2(\u029b\3"+
		"\2\2\2*\u02c1\3\2\2\2,\u02de\3\2\2\2.\u02e0\3\2\2\2\60\u02e3\3\2\2\2\62"+
		"\u0307\3\2\2\2\64\u0317\3\2\2\2\66\u0326\3\2\2\28\u034c\3\2\2\2:\u035c"+
		"\3\2\2\2<\u036a\3\2\2\2>\u0380\3\2\2\2@\u0394\3\2\2\2B\u03a7\3\2\2\2D"+
		"\u03d2\3\2\2\2F\u0406\3\2\2\2H\u041f\3\2\2\2J\u0422\3\2\2\2L\u0434\3\2"+
		"\2\2N\u0457\3\2\2\2P\u0475\3\2\2\2R\u047b\3\2\2\2T\u0481\3\2\2\2V\u0486"+
		"\3\2\2\2X\u048b\3\2\2\2Z\u0496\3\2\2\2\\\u04a1\3\2\2\2^\u04c6\3\2\2\2"+
		"`\u04c8\3\2\2\2b\u04d2\3\2\2\2d\u04eb\3\2\2\2f\u0500\3\2\2\2h\u0502\3"+
		"\2\2\2j\u050c\3\2\2\2l\u0517\3\2\2\2n\u0521\3\2\2\2p\u0535\3\2\2\2r\u054f"+
		"\3\2\2\2t\u055e\3\2\2\2v\u0568\3\2\2\2x\u056c\3\2\2\2z\u0592\3\2\2\2|"+
		"\u0594\3\2\2\2~\u05b1\3\2\2\2\u0080\u05bc\3\2\2\2\u0082\u05c6\3\2\2\2"+
		"\u0084\u05cb\3\2\2\2\u0086\u05d5\3\2\2\2\u0088\u05da\3\2\2\2\u008a\u05de"+
		"\3\2\2\2\u008c\u05eb\3\2\2\2\u008e\u05f8\3\2\2\2\u0090\u05fd\3\2\2\2\u0092"+
		"\u0600\3\2\2\2\u0094\u0609\3\2\2\2\u0096\u0610\3\2\2\2\u0098\u0612\3\2"+
		"\2\2\u009a\u0627\3\2\2\2\u009c\u063d\3\2\2\2\u009e\u0678\3\2\2\2\u00a0"+
		"\u0688\3\2\2\2\u00a2\u0696\3\2\2\2\u00a4\u069f\3\2\2\2\u00a6\u06a1\3\2"+
		"\2\2\u00a8\u06aa\3\2\2\2\u00aa\u06ae\3\2\2\2\u00ac\u06b9\3\2\2\2\u00ae"+
		"\u06c0\3\2\2\2\u00b0\u06c2\3\2\2\2\u00b2\u06c5\3\2\2\2\u00b4\u06ca\3\2"+
		"\2\2\u00b6\u06cd\3\2\2\2\u00b8\u06cf\3\2\2\2\u00ba\u06d6\3\2\2\2\u00bc"+
		"\u06df\3\2\2\2\u00be\u06ec\3\2\2\2\u00c0\u06f0\3\2\2\2\u00c2\u06f3\3\2"+
		"\2\2\u00c4\u06fb\3\2\2\2\u00c6\u0700\3\2\2\2\u00c8\u0709\3\2\2\2\u00ca"+
		"\u0713\3\2\2\2\u00cc\u0718\3\2\2\2\u00ce\u0724\3\2\2\2\u00d0\u0730\3\2"+
		"\2\2\u00d2\u0739\3\2\2\2\u00d4\u073b\3\2\2\2\u00d6\u073f\3\2\2\2\u00d8"+
		"\u0742\3\2\2\2\u00da\u074c\3\2\2\2\u00dc\u0751\3\2\2\2\u00de\u0760\3\2"+
		"\2\2\u00e0\u0769\3\2\2\2\u00e2\u076e\3\2\2\2\u00e4\u0792\3\2\2\2\u00e6"+
		"\u0794\3\2\2\2\u00e8\u079d\3\2\2\2\u00ea\u079f\3\2\2\2\u00ec\u07ab\3\2"+
		"\2\2\u00ee\u07b2\3\2\2\2\u00f0\u07cc\3\2\2\2\u00f2\u07cf\3\2\2\2\u00f4"+
		"\u07d2\3\2\2\2\u00f6\u07d5\3\2\2\2\u00f8\u07e6\3\2\2\2\u00fa\u07f3\3\2"+
		"\2\2\u00fc\u07f9\3\2\2\2\u00fe\u0802\3\2\2\2\u0100\u080d\3\2\2\2\u0102"+
		"\u081a\3\2\2\2\u0104\u0825\3\2\2\2\u0106\u082e\3\2\2\2\u0108\u0841\3\2"+
		"\2\2\u010a\u0855\3\2\2\2\u010c\u086e\3\2\2\2\u010e\u089c\3\2\2\2\u0110"+
		"\u08a2\3\2\2\2\u0112\u08b7\3\2\2\2\u0114\u08b9\3\2\2\2\u0116\u08c3\3\2"+
		"\2\2\u0118\u08c5\3\2\2\2\u011a\u08d1\3\2\2\2\u011c\u08dc\3\2\2\2\u011e"+
		"\u08de\3\2\2\2\u0120\u08f6\3\2\2\2\u0122\u08f8\3\2\2\2\u0124\u0905\3\2"+
		"\2\2\u0126\u0909\3\2\2\2\u0128\u090b\3\2\2\2\u012a\u090e\3\2\2\2\u012c"+
		"\u0913\3\2\2\2\u012e\u0917\3\2\2\2\u0130\u091c\3\2\2\2\u0132\u0921\3\2"+
		"\2\2\u0134\u0926\3\2\2\2\u0136\u092b\3\2\2\2\u0138\u0936\3\2\2\2\u013a"+
		"\u0938\3\2\2\2\u013c\u094a\3\2\2\2\u013e\u094d\3\2\2\2\u0140\u0967\3\2"+
		"\2\2\u0142\u0969\3\2\2\2\u0144\u096d\3\2\2\2\u0146\u0974\3\2\2\2\u0148"+
		"\u0979\3\2\2\2\u014a\u097b\3\2\2\2\u014c\u097d\3\2\2\2\u014e\u097f\3\2"+
		"\2\2\u0150\u0981\3\2\2\2\u0152\u0983\3\2\2\2\u0154\u0985\3\2\2\2\u0156"+
		"\u0987\3\2\2\2\u0158\u098b\3\2\2\2\u015a\u098f\3\2\2\2\u015c\u0993\3\2"+
		"\2\2\u015e\u0997\3\2\2\2\u0160\u099b\3\2\2\2\u0162\u099f\3\2\2\2\u0164"+
		"\u09a3\3\2\2\2\u0166\u09a5\3\2\2\2\u0168\u09aa\3\2\2\2\u016a\u09ac\3\2"+
		"\2\2\u016c\u09ae\3\2\2\2\u016e\u09b5\3\2\2\2\u0170\u09bf\3\2\2\2\u0172"+
		"\u09c4\3\2\2\2\u0174\u09c6\3\2\2\2\u0176\u09c8\3\2\2\2\u0178\u09d2\3\2"+
		"\2\2\u017a\u017c\5\4\3\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\3\3\2\2\2\u017f\u0181\7b\2\2"+
		"\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5\u00a4S"+
		"\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018c"+
		"\5\6\4\2\u0189\u018b\7b\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0192\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0191\5\b\5\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\5\3\2\2\2\u0194\u0192\3\2\2\2"+
		"\u0195\u0196\7\34\2\2\u0196\u0197\5\u00dan\2\u0197\u0198\5\u016a\u00b6"+
		"\2\u0198\7\3\2\2\2\u0199\u01a5\5\n\6\2\u019a\u01a5\5\34\17\2\u019b\u01a5"+
		"\5\30\r\2\u019c\u01a5\5\32\16\2\u019d\u01a5\5\36\20\2\u019e\u01a5\5D#"+
		"\2\u019f\u01a5\5<\37\2\u01a0\u01a5\5\24\13\2\u01a1\u01a5\5\20\t\2\u01a2"+
		"\u01a5\5\22\n\2\u01a3\u01a5\7b\2\2\u01a4\u0199\3\2\2\2\u01a4\u019a\3\2"+
		"\2\2\u01a4\u019b\3\2\2\2\u01a4\u019c\3\2\2\2\u01a4\u019d\3\2\2\2\u01a4"+
		"\u019e\3\2\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a1\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\t\3\2\2\2\u01a6\u01a7"+
		"\7\33\2\2\u01a7\u01ad\5\u016e\u00b8\2\u01a8\u01ac\5\f\7\2\u01a9\u01ac"+
		"\5\16\b\2\u01aa\u01ac\7b\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5\u0170\u00b9"+
		"\2\u01b1\u01b2\5\u016a\u00b6\2\u01b2\13\3\2\2\2\u01b3\u01b5\5\u00a4S\2"+
		"\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01be\3\2\2\2\u01b6\u01b8"+
		"\5\u0166\u00b4\2\u01b7\u01b9\7\62\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc\7^\2\2\u01bb\u01b6\3\2\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7/\2\2\u01be\u01bb\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\5\u00dan\2\u01c1"+
		"\u01c3\5\u0114\u008b\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\5\u016a\u00b6\2\u01c5\r\3\2\2\2\u01c6\u01c8\5\u0166"+
		"\u00b4\2\u01c7\u01c9\7\62\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2"+
		"\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7/\2\2\u01cb\u01cc\5\u0126\u0094\2\u01cc"+
		"\u01cd\5\u016a\u00b6\2\u01cd\17\3\2\2\2\u01ce\u01d0\5\u0166\u00b4\2\u01cf"+
		"\u01d1\7\62\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01d6\7/\2\2\u01d3\u01d5\7b\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\5\u0126\u0094\2\u01da\u01db\5\u016a"+
		"\u00b6\2\u01db\21\3\2\2\2\u01dc\u01dd\7_\2\2\u01dd\23\3\2\2\2\u01de\u01e0"+
		"\5\u00a4S\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2"+
		"\2\u01e1\u01e3\5\u0166\u00b4\2\u01e2\u01e4\7\62\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\7/\2\2\u01e6\u01e8"+
		"\7b\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\5\u0176"+
		"\u00bc\2\u01ed\u01ee\7/\2\2\u01ee\u01ef\5\u0178\u00bd\2\u01ef\u01f3\5"+
		"\u016e\u00b8\2\u01f0\u01f2\5\26\f\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3"+
		"\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f7\5\u0170\u00b9\2\u01f7\u01f8\5\u016a\u00b6\2"+
		"\u01f8\25\3\2\2\2\u01f9\u01ff\5\u0166\u00b4\2\u01fa\u01fc\7/\2\2\u01fb"+
		"\u01fd\5\u015c\u00af\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u0200\5\u0122\u0092\2\u01ff\u01fa\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5\u016a\u00b6\2\u0202\27\3\2\2"+
		"\2\u0203\u0205\5\u00a4S\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\5\u0166\u00b4\2\u0207\u020f\7\62\2\2\u0208"+
		"\u0209\7/\2\2\u0209\u0210\5\u009cO\2\u020a\u020d\5\u0126\u0094\2\u020b"+
		"\u020c\7/\2\2\u020c\u020e\5\u009cO\2\u020d\u020b\3\2\2\2\u020d\u020e\3"+
		"\2\2\2\u020e\u0210\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u020a\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\5\u016a\u00b6\2\u0212\31\3\2\2\2\u0213\u0215"+
		"\5\u00a4S\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u021e\5\u0166\u00b4\2\u0217\u0218\7/\2\2\u0218\u021f\5\u009c"+
		"O\2\u0219\u021c\5\u0126\u0094\2\u021a\u021b\7/\2\2\u021b\u021d\5\u009c"+
		"O\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u0217\3\2\2\2\u021e\u0219\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5\u016a"+
		"\u00b6\2\u0221\33\3\2\2\2\u0222\u0224\5\u00a4S\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u022b\3\2\2\2\u0225\u022c\5\u0166\u00b4\2\u0226\u0227"+
		"\5\u0176\u00bc\2\u0227\u0228\5\u0166\u00b4\2\u0228\u0229\5\u00dep\2\u0229"+
		"\u022a\5\u0178\u00bd\2\u022a\u022c\3\2\2\2\u022b\u0225\3\2\2\2\u022b\u0226"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7/\2\2\u022e\u022f\5\u0172\u00ba"+
		"\2\u022f\u0230\5X-\2\u0230\u0232\t\2\2\2\u0231\u0233\7\62\2\2\u0232\u0231"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\7\61\2\2"+
		"\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023a\3\2\2\2\u0237\u0239"+
		"\7b\2\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\5Z"+
		".\2\u023e\u023f\5\u0174\u00bb\2\u023f\u0243\5\u016e\u00b8\2\u0240\u0242"+
		"\5^\60\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\5\u0170"+
		"\u00b9\2\u0247\u0248\5\u016a\u00b6\2\u0248\35\3\2\2\2\u0249\u024b\5\u00a4"+
		"S\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0252\3\2\2\2\u024c"+
		"\u0253\5\u0166\u00b4\2\u024d\u024e\5\u0176\u00bc\2\u024e\u024f\5\u0166"+
		"\u00b4\2\u024f\u0250\5\u00dep\2\u0250\u0251\5\u0178\u00bd\2\u0251\u0253"+
		"\3\2\2\2\u0252\u024c\3\2\2\2\u0252\u024d\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0256\7\62\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3"+
		"\2\2\2\u0257\u025c\7/\2\2\u0258\u025d\5\60\31\2\u0259\u025d\5*\26\2\u025a"+
		"\u025d\5.\30\2\u025b\u025d\5 \21\2\u025c\u0258\3\2\2\2\u025c\u0259\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u0267\3\2\2\2\u025e"+
		"\u0263\7\20\2\2\u025f\u0264\5\60\31\2\u0260\u0264\5*\26\2\u0261\u0264"+
		"\5.\30\2\u0262\u0264\5 \21\2\u0263\u025f\3\2\2\2\u0263\u0260\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u025e\3\2"+
		"\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\5\u016a\u00b6\2\u026b\37"+
		"\3\2\2\2\u026c\u0270\5\u016e\u00b8\2\u026d\u026f\5\"\22\2\u026e\u026d"+
		"\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\5\u0170\u00b9\2\u0274!"+
		"\3\2\2\2\u0275\u027a\5(\25\2\u0276\u027a\5$\23\2\u0277\u027a\5&\24\2\u0278"+
		"\u027a\7b\2\2\u0279\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u0278\3\2\2\2\u027a#\3\2\2\2\u027b\u027d\5\u00a4S\2\u027c\u027b"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\5\u0166\u00b4"+
		"\2\u027f\u0287\7\62\2\2\u0280\u0281\7/\2\2\u0281\u0288\5\u009cO\2\u0282"+
		"\u0285\5\u0126\u0094\2\u0283\u0284\7/\2\2\u0284\u0286\5\u009cO\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0280\3\2"+
		"\2\2\u0287\u0282\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\5\u016a\u00b6"+
		"\2\u028a%\3\2\2\2\u028b\u028d\5\u00a4S\2\u028c\u028b\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0296\5\u0166\u00b4\2\u028f\u0290\7"+
		"/\2\2\u0290\u0297\5\u009cO\2\u0291\u0294\5\u0126\u0094\2\u0292\u0293\7"+
		"/\2\2\u0293\u0295\5\u009cO\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u028f\3\2\2\2\u0296\u0291\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\5\u016a\u00b6\2\u0299\'\3\2\2\2\u029a\u029c\5\u00a4S"+
		"\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a3\3\2\2\2\u029d\u02a4"+
		"\5\u0166\u00b4\2\u029e\u029f\5\u0176\u00bc\2\u029f\u02a0\5\u0166\u00b4"+
		"\2\u02a0\u02a1\5\u00dep\2\u02a1\u02a2\5\u0178\u00bd\2\u02a2\u02a4\3\2"+
		"\2\2\u02a3\u029d\3\2\2\2\u02a3\u029e\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\7/\2\2\u02a6\u02a7\5\u0172\u00ba\2\u02a7\u02a8\5X-\2\u02a8\u02aa"+
		"\t\2\2\2\u02a9\u02ab\7\62\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02ad\3\2\2\2\u02ac\u02ae\7\61\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02b2\3\2\2\2\u02af\u02b1\7b\2\2\u02b0\u02af\3\2\2\2\u02b1"+
		"\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2"+
		"\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5Z.\2\u02b6\u02b7\5\u0174\u00bb\2"+
		"\u02b7\u02bb\5\u016e\u00b8\2\u02b8\u02ba\5^\60\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\5\u0170\u00b9\2\u02bf\u02c0\5\u016a"+
		"\u00b6\2\u02c0)\3\2\2\2\u02c1\u02cb\7\63\2\2\u02c2\u02c4\7\60\2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c9\5\u0166"+
		"\u00b4\2\u02c6\u02c7\5\u016c\u00b7\2\u02c7\u02c8\5\u0166\u00b4\2\u02c8"+
		"\u02ca\3\2\2\2\u02c9\u02c6\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02c3\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02d1\5\u016e\u00b8\2\u02ce\u02d0\5,\27\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3"+
		"\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d4\u02d5\5\u0170\u00b9\2\u02d5+\3\2\2\2\u02d6\u02df"+
		"\5\66\34\2\u02d7\u02df\5\62\32\2\u02d8\u02df\5\64\33\2\u02d9\u02df\5:"+
		"\36\2\u02da\u02df\5B\"\2\u02db\u02df\5> \2\u02dc\u02df\5@!\2\u02dd\u02df"+
		"\7b\2\2\u02de\u02d6\3\2\2\2\u02de\u02d7\3\2\2\2\u02de\u02d8\3\2\2\2\u02de"+
		"\u02d9\3\2\2\2\u02de\u02da\3\2\2\2\u02de\u02db\3\2\2\2\u02de\u02dc\3\2"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df-\3\2\2\2\u02e0\u02e1\5\u0126\u0094\2\u02e1"+
		"/\3\2\2\2\u02e2\u02e4\5\u00a4S\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\5\u0172\u00ba\2\u02e6\u02e7\5X-\2\u02e7"+
		"\u02e8\7\33\2\2\u02e8\u02ea\7\63\2\2\u02e9\u02eb\7\60\2\2\u02ea\u02e9"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f2\3\2\2\2\u02ec\u02f0\5\u0166\u00b4"+
		"\2\u02ed\u02ee\5\u016c\u00b7\2\u02ee\u02ef\5\u0166\u00b4\2\u02ef\u02f1"+
		"\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2"+
		"\u02ec\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fb\5\u0174"+
		"\u00bb\2\u02f5\u02f7\5\u0172\u00ba\2\u02f6\u02f8\5\u00a2R\2\u02f7\u02f6"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\5\u0174\u00bb"+
		"\2\u02fa\u02fc\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u0301\5\u016e\u00b8\2\u02fe\u0300\5^\60\2\u02ff\u02fe\3"+
		"\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\5\u0170\u00b9\2\u0305\61"+
		"\3\2\2\2\u0306\u0308\5\u00a4S\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2"+
		"\2\u0308\u0309\3\2\2\2\u0309\u030a\5\u0166\u00b4\2\u030a\u0312\7\62\2"+
		"\2\u030b\u030c\7/\2\2\u030c\u0313\5\u009cO\2\u030d\u0310\5\u0126\u0094"+
		"\2\u030e\u030f\7/\2\2\u030f\u0311\5\u009cO\2\u0310\u030e\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u030b\3\2\2\2\u0312\u030d\3\2"+
		"\2\2\u0313\u0314\3\2\2\2\u0314\u0315\5\u016a\u00b6\2\u0315\63\3\2\2\2"+
		"\u0316\u0318\5\u00a4S\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u0321\5\u0166\u00b4\2\u031a\u031b\7/\2\2\u031b\u0322"+
		"\5\u009cO\2\u031c\u031f\5\u0126\u0094\2\u031d\u031e\7/\2\2\u031e\u0320"+
		"\5\u009cO\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2"+
		"\2\u0321\u031a\3\2\2\2\u0321\u031c\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324"+
		"\5\u016a\u00b6\2\u0324\65\3\2\2\2\u0325\u0327\5\u00a4S\2\u0326\u0325\3"+
		"\2\2\2\u0326\u0327\3\2\2\2\u0327\u032e\3\2\2\2\u0328\u032f\5\u0166\u00b4"+
		"\2\u0329\u032a\5\u0176\u00bc\2\u032a\u032b\5\u0166\u00b4\2\u032b\u032c"+
		"\5\u00dep\2\u032c\u032d\5\u0178\u00bd\2\u032d\u032f\3\2\2\2\u032e\u0328"+
		"\3\2\2\2\u032e\u0329\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\7/\2\2\u0331"+
		"\u0332\5\u0172\u00ba\2\u0332\u0333\5X-\2\u0333\u0335\t\2\2\2\u0334\u0336"+
		"\7\62\2\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2"+
		"\u0337\u0339\7\61\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033d"+
		"\3\2\2\2\u033a\u033c\7b\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0341\5Z.\2\u0341\u0342\5\u0174\u00bb\2\u0342\u0346\5\u016e"+
		"\u00b8\2\u0343\u0345\5^\60\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u0346\3\2"+
		"\2\2\u0349\u034a\5\u0170\u00b9\2\u034a\u034b\5\u016a\u00b6\2\u034b\67"+
		"\3\2\2\2\u034c\u0351\5\u0166\u00b4\2\u034d\u034e\5\u0172\u00ba\2\u034e"+
		"\u034f\5\u0166\u00b4\2\u034f\u0350\5\u0174\u00bb\2\u0350\u0352\3\2\2\2"+
		"\u0351\u034d\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355"+
		"\5\u016e\u00b8\2\u0354\u0356\5^\60\2\u0355\u0354\3\2\2\2\u0356\u0357\3"+
		"\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\5\u0170\u00b9\2\u035a\u035b\5\u016a\u00b6\2\u035b9\3\2\2\2\u035c"+
		"\u035d\5\u0166\u00b4\2\u035d\u035e\7\62\2\2\u035e\u035f\5\u0176\u00bc"+
		"\2\u035f\u0360\7\33\2\2\u0360\u0361\5\u0178\u00bd\2\u0361\u0362\5\u00da"+
		"n\2\u0362\u0363\5\u016a\u00b6\2\u0363;\3\2\2\2\u0364\u036b\5\u0166\u00b4"+
		"\2\u0365\u0366\5\u0176\u00bc\2\u0366\u0367\5\u0166\u00b4\2\u0367\u0368"+
		"\5\u00dep\2\u0368\u0369\5\u0178\u00bd\2\u0369\u036b\3\2\2\2\u036a\u0364"+
		"\3\2\2\2\u036a\u0365\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0370\7\t\2\2\u036d"+
		"\u0371\5\60\31\2\u036e\u0371\5*\26\2\u036f\u0371\5.\30\2\u0370\u036d\3"+
		"\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371\u037a\3\2\2\2\u0372"+
		"\u0376\7\20\2\2\u0373\u0377\5\60\31\2\u0374\u0377\5*\26\2\u0375\u0377"+
		"\5.\30\2\u0376\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377"+
		"\u0379\3\2\2\2\u0378\u0372\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037a\3\2\2\2\u037d"+
		"\u037e\5\u016a\u00b6\2\u037e=\3\2\2\2\u037f\u0381\5\u00a4S\2\u0380\u037f"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\7\25\2\2"+
		"\u0383\u0385\7^\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0387\5\u0166\u00b4\2\u0387\u038f\7\62\2\2\u0388\u0389"+
		"\7/\2\2\u0389\u0390\5\u009cO\2\u038a\u038d\5\u0126\u0094\2\u038b\u038c"+
		"\7/\2\2\u038c\u038e\5\u009cO\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2"+
		"\u038e\u0390\3\2\2\2\u038f\u0388\3\2\2\2\u038f\u038a\3\2\2\2\u0390\u0391"+
		"\3\2\2\2\u0391\u0392\5\u016a\u00b6\2\u0392?\3\2\2\2\u0393\u0395\5\u00a4"+
		"S\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0398\7\25\2\2\u0397\u0399\7^\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2"+
		"\2\2\u0399\u039a\3\2\2\2\u039a\u03a2\5\u0166\u00b4\2\u039b\u039c\7/\2"+
		"\2\u039c\u03a3\5\u009cO\2\u039d\u03a0\5\u0126\u0094\2\u039e\u039f\7/\2"+
		"\2\u039f\u03a1\5\u009cO\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a3\3\2\2\2\u03a2\u039b\3\2\2\2\u03a2\u039d\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a5\5\u016a\u00b6\2\u03a5A\3\2\2\2\u03a6\u03a8\5\u00a4S\2"+
		"\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab"+
		"\7\25\2\2\u03aa\u03ac\7^\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03b3\3\2\2\2\u03ad\u03b4\5\u0166\u00b4\2\u03ae\u03af\5\u0176\u00bc\2"+
		"\u03af\u03b0\5\u0166\u00b4\2\u03b0\u03b1\5\u00dep\2\u03b1\u03b2\5\u0178"+
		"\u00bd\2\u03b2\u03b4\3\2\2\2\u03b3\u03ad\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\7/\2\2\u03b6\u03b7\5\u0172\u00ba\2\u03b7\u03b8"+
		"\5X-\2\u03b8\u03ba\t\2\2\2\u03b9\u03bb\7\62\2\2\u03ba\u03b9\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03be\7\61\2\2\u03bd\u03bc\3"+
		"\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c2\3\2\2\2\u03bf\u03c1\7b\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2"+
		"\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\5Z.\2\u03c6\u03c7"+
		"\5\u0174\u00bb\2\u03c7\u03cb\5\u016e\u00b8\2\u03c8\u03ca\5^\60\2\u03c9"+
		"\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2"+
		"\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf\5\u0170\u00b9"+
		"\2\u03cf\u03d0\5\u016a\u00b6\2\u03d0C\3\2\2\2\u03d1\u03d3\5\u00a4S\2\u03d2"+
		"\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03da\3\2\2\2\u03d4\u03db\5\u0166"+
		"\u00b4\2\u03d5\u03d6\5\u0176\u00bc\2\u03d6\u03d7\5\u0166\u00b4\2\u03d7"+
		"\u03d8\5\u00dep\2\u03d8\u03d9\5\u0178\u00bd\2\u03d9\u03db\3\2\2\2\u03da"+
		"\u03d4\3\2\2\2\u03da\u03d5\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\7\62"+
		"\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u0402\7/\2\2\u03e0\u03e8\5F$\2\u03e1\u03e4\7\20\2\2\u03e2\u03e5\5F$\2"+
		"\u03e3\u03e5\5.\30\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u03e7"+
		"\3\2\2\2\u03e6\u03e1\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u0403\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03f3\5."+
		"\30\2\u03ec\u03ef\7\20\2\2\u03ed\u03f0\5F$\2\u03ee\u03f0\5.\30\2\u03ef"+
		"\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ec\3\2"+
		"\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\7\20\2\2\u03f7\u03ff\5"+
		"F$\2\u03f8\u03fb\7\20\2\2\u03f9\u03fc\5F$\2\u03fa\u03fc\5.\30\2\u03fb"+
		"\u03f9\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03f8\3\2"+
		"\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u03e0\3\2\2\2\u0402\u03eb\3\2"+
		"\2\2\u0403\u0404\3\2\2\2\u0404\u0405\5\u016a\u00b6\2\u0405E\3\2\2\2\u0406"+
		"\u0407\7\63\2\2\u0407\u0411\7\63\2\2\u0408\u040a\7\60\2\2\u0409\u0408"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040f\5\u0166\u00b4"+
		"\2\u040c\u040d\5\u016c\u00b7\2\u040d\u040e\5\u0166\u00b4\2\u040e\u0410"+
		"\3\2\2\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\3\2\2\2\u0411"+
		"\u0409\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0417\5\u016e"+
		"\u00b8\2\u0414\u0416\5H%\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u041a\u041b\5\u0170\u00b9\2\u041bG\3\2\2\2\u041c\u0420\5L\'\2\u041d"+
		"\u0420\5J&\2\u041e\u0420\7b\2\2\u041f\u041c\3\2\2\2\u041f\u041d\3\2\2"+
		"\2\u041f\u041e\3\2\2\2\u0420I\3\2\2\2\u0421\u0423\5\u00a4S\2\u0422\u0421"+
		"\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\5\u0166\u00b4"+
		"\2\u0425\u0427\7\62\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u042f\3\2\2\2\u0428\u0429\7/\2\2\u0429\u0430\5\u009cO\2\u042a\u042d\5"+
		"\u0126\u0094\2\u042b\u042c\7/\2\2\u042c\u042e\5\u009cO\2\u042d\u042b\3"+
		"\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u0428\3\2\2\2\u042f"+
		"\u042a\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\5\u016a\u00b6\2\u0432K"+
		"\3\2\2\2\u0433\u0435\5\u00a4S\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2"+
		"\2\u0435\u043c\3\2\2\2\u0436\u043d\5\u0166\u00b4\2\u0437\u0438\5\u0176"+
		"\u00bc\2\u0438\u0439\5\u0166\u00b4\2\u0439\u043a\5\u00dep\2\u043a\u043b"+
		"\5\u0178\u00bd\2\u043b\u043d\3\2\2\2\u043c\u0436\3\2\2\2\u043c\u0437\3"+
		"\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\5\u0172\u00ba\2\u043f\u0440\5X"+
		"-\2\u0440\u0442\t\2\2\2\u0441\u0443\7\62\2\2\u0442\u0441\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0446\7\61\2\2\u0445\u0444\3"+
		"\2\2\2\u0445\u0446\3\2\2\2\u0446\u044a\3\2\2\2\u0447\u0449\7b\2\2\u0448"+
		"\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u044e\5Z.\2\u044e\u044f"+
		"\5\u0174\u00bb\2\u044f\u0450\5\u016a\u00b6\2\u0450M\3\2\2\2\u0451\u0458"+
		"\5\u0166\u00b4\2\u0452\u0453\5\u0176\u00bc\2\u0453\u0454\5\u0166\u00b4"+
		"\2\u0454\u0455\5\u00dep\2\u0455\u0456\5\u0178\u00bd\2\u0456\u0458\3\2"+
		"\2\2\u0457\u0451\3\2\2\2\u0457\u0452\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045a\7/\2\2\u045a\u045b\5\u0172\u00ba\2\u045b\u045c\5X-\2\u045c\u045e"+
		"\t\2\2\2\u045d\u045f\7\62\2\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2"+
		"\u045f\u0461\3\2\2\2\u0460\u0462\7\61\2\2\u0461\u0460\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0466\3\2\2\2\u0463\u0465\7b\2\2\u0464\u0463\3\2\2\2\u0465"+
		"\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2"+
		"\2\2\u0468\u0466\3\2\2\2\u0469\u046a\5Z.\2\u046a\u046b\5\u0174\u00bb\2"+
		"\u046b\u046f\5\u016e\u00b8\2\u046c\u046e\5^\60\2\u046d\u046c\3\2\2\2\u046e"+
		"\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2"+
		"\2\2\u0471\u046f\3\2\2\2\u0472\u0473\5\u0170\u00b9\2\u0473\u0474\5\u016a"+
		"\u00b6\2\u0474O\3\2\2\2\u0475\u0477\7\34\2\2\u0476\u0478\5\u0098M\2\u0477"+
		"\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\5\u016a"+
		"\u00b6\2\u047aQ\3\2\2\2\u047b\u047d\7\32\2\2\u047c\u047e\5\u0098M\2\u047d"+
		"\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\5\u016a"+
		"\u00b6\2\u0480S\3\2\2\2\u0481\u0482\7\61\2\2\u0482\u0483\7\34\2\2\u0483"+
		"\u0484\5\u0098M\2\u0484\u0485\5\u016a\u00b6\2\u0485U\3\2\2\2\u0486\u0487"+
		"\7\61\2\2\u0487\u0488\7\34\2\2\u0488\u0489\5\u016a\u00b6\2\u0489W\3\2"+
		"\2\2\u048a\u048c\5\\/\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u0492\3\2\2\2\u048d\u048e\5\u016c\u00b7\2\u048e\u048f\5\\/\2\u048f\u0491"+
		"\3\2\2\2\u0490\u048d\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492"+
		"\u0493\3\2\2\2\u0493Y\3\2\2\2\u0494\u0492\3\2\2\2\u0495\u0497\5\\/\2\u0496"+
		"\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u049d\3\2\2\2\u0498\u0499\5\u016c"+
		"\u00b7\2\u0499\u049a\5\\/\2\u049a\u049c\3\2\2\2\u049b\u0498\3\2\2\2\u049c"+
		"\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e[\3\2\2\2"+
		"\u049f\u049d\3\2\2\2\u04a0\u04a2\5\u00a4S\2\u04a1\u04a0\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\5\u0166\u00b4\2\u04a4\u04a6"+
		"\7\62\2\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2"+
		"\u04a7\u04a9\t\3\2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa"+
		"\3\2\2\2\u04aa\u04ad\5\u0126\u0094\2\u04ab\u04ac\7/\2\2\u04ac\u04ae\5"+
		"\u009cO\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae]\3\2\2\2\u04af"+
		"\u04c7\5P)\2\u04b0\u04c7\5R*\2\u04b1\u04c7\5T+\2\u04b2\u04c7\5V,\2\u04b3"+
		"\u04c7\5`\61\2\u04b4\u04c7\5f\64\2\u04b5\u04c7\5n8\2\u04b6\u04c7\5p9\2"+
		"\u04b7\u04c7\5r:\2\u04b8\u04c7\5v<\2\u04b9\u04c7\5x=\2\u04ba\u04c7\5|"+
		"?\2\u04bb\u04c7\5z>\2\u04bc\u04c7\5\u0082B\2\u04bd\u04c7\5N(\2\u04be\u04c7"+
		"\5\u0086D\2\u04bf\u04c7\5\u0088E\2\u04c0\u04c7\5\u008aF\2\u04c1\u04c7"+
		"\5\u008cG\2\u04c2\u04c7\5\u008eH\2\u04c3\u04c7\5\u0090I\2\u04c4\u04c7"+
		"\5\u0092J\2\u04c5\u04c7\7b\2\2\u04c6\u04af\3\2\2\2\u04c6\u04b0\3\2\2\2"+
		"\u04c6\u04b1\3\2\2\2\u04c6\u04b2\3\2\2\2\u04c6\u04b3\3\2\2\2\u04c6\u04b4"+
		"\3\2\2\2\u04c6\u04b5\3\2\2\2\u04c6\u04b6\3\2\2\2\u04c6\u04b7\3\2\2\2\u04c6"+
		"\u04b8\3\2\2\2\u04c6\u04b9\3\2\2\2\u04c6\u04ba\3\2\2\2\u04c6\u04bb\3\2"+
		"\2\2\u04c6\u04bc\3\2\2\2\u04c6\u04bd\3\2\2\2\u04c6\u04be\3\2\2\2\u04c6"+
		"\u04bf\3\2\2\2\u04c6\u04c0\3\2\2\2\u04c6\u04c1\3\2\2\2\u04c6\u04c2\3\2"+
		"\2\2\u04c6\u04c3\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c5\3\2\2\2\u04c7"+
		"_\3\2\2\2\u04c8\u04c9\7\60\2\2\u04c9\u04ca\5\u009cO\2\u04ca\u04cc\7/\2"+
		"\2\u04cb\u04cd\5b\62\2\u04cc\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cc"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\5\u016a\u00b6"+
		"\2\u04d1a\3\2\2\2\u04d2\u04d8\5d\63\2\u04d3\u04d4\5\u016c\u00b7\2\u04d4"+
		"\u04d5\5d\63\2\u04d5\u04d7\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d7\u04da\3\2"+
		"\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04db\u04df\5\u016e\u00b8\2\u04dc\u04de\5^\60\2\u04dd\u04dc"+
		"\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e2\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e3\5\u0170\u00b9\2\u04e3c"+
		"\3\2\2\2\u04e4\u04ec\7^\2\2\u04e5\u04ec\5\u009cO\2\u04e6\u04e9\5\u0166"+
		"\u00b4\2\u04e7\u04e9\7^\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04ec\5\u0126\u0094\2\u04eb\u04e4\3\2\2\2\u04eb\u04e5"+
		"\3\2\2\2\u04eb\u04e8\3\2\2\2\u04ece\3\2\2\2\u04ed\u04f1\5j\66\2\u04ee"+
		"\u04f0\5l\67\2\u04ef\u04ee\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2"+
		"\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4"+
		"\u04f5\5h\65\2\u04f5\u04f6\5\u016a\u00b6\2\u04f6\u0501\3\2\2\2\u04f7\u04fb"+
		"\5j\66\2\u04f8\u04fa\5l\67\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fe\u04ff\5\u016a\u00b6\2\u04ff\u0501\3\2\2\2\u0500\u04ed\3\2\2"+
		"\2\u0500\u04f7\3\2\2\2\u0501g\3\2\2\2\u0502\u0503\7^\2\2\u0503\u0507\5"+
		"\u016e\u00b8\2\u0504\u0506\5^\60\2\u0505\u0504\3\2\2\2\u0506\u0509\3\2"+
		"\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u0507\3\2\2\2\u050a\u050b\5\u0170\u00b9\2\u050bi\3\2\2\2\u050c\u050d"+
		"\7\60\2\2\u050d\u050e\5\u009cO\2\u050e\u0512\5\u016e\u00b8\2\u050f\u0511"+
		"\5^\60\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0516\5\u0170"+
		"\u00b9\2\u0516k\3\2\2\2\u0517\u0518\5\u009cO\2\u0518\u051c\5\u016e\u00b8"+
		"\2\u0519\u051b\5^\60\2\u051a\u0519\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e\u051c\3\2\2\2\u051f"+
		"\u0520\5\u0170\u00b9\2\u0520m\3\2\2\2\u0521\u0522\7\61\2\2\u0522\u0524"+
		"\5\u0166\u00b4\2\u0523\u0525\7\62\2\2\u0524\u0523\3\2\2\2\u0524\u0525"+
		"\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\7/\2\2\u0527\u0528\5\u0084C\2"+
		"\u0528\u052c\5\u016e\u00b8\2\u0529\u052b\5^\60\2\u052a\u0529\3\2\2\2\u052b"+
		"\u052e\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2"+
		"\2\2\u052e\u052c\3\2\2\2\u052f\u0531\5\u0170\u00b9\2\u0530\u0532\5t;\2"+
		"\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\5\u016a\u00b6\2\u0534o\3\2\2\2\u0535\u053a\7\61\2\2\u0536\u0537\5\u0176"+
		"\u00bc\2\u0537\u0538\5\u0166\u00b4\2\u0538\u0539\5\u0178\u00bd\2\u0539"+
		"\u053b\3\2\2\2\u053a\u0536\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2"+
		"\2\2\u053c\u053e\5\u0166\u00b4\2\u053d\u053f\7\62\2\2\u053e\u053d\3\2"+
		"\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\7/\2\2\u0541"+
		"\u0542\5\u009cO\2\u0542\u0546\5\u016e\u00b8\2\u0543\u0545\5^\60\2\u0544"+
		"\u0543\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2"+
		"\2\2\u0547\u0549\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054b\5\u0170\u00b9"+
		"\2\u054a\u054c\5t;\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d"+
		"\3\2\2\2\u054d\u054e\5\u016a\u00b6\2\u054eq\3\2\2\2\u054f\u0550\7\61\2"+
		"\2\u0550\u0551\5\u009cO\2\u0551\u0555\5\u016e\u00b8\2\u0552\u0554\5^\60"+
		"\2\u0553\u0552\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556"+
		"\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u055a\5\u0170\u00b9"+
		"\2\u0559\u055b\5t;\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055d\5\u016a\u00b6\2\u055ds\3\2\2\2\u055e\u055f\7^\2\2"+
		"\u055f\u0563\5\u016e\u00b8\2\u0560\u0562\5^\60\2\u0561\u0560\3\2\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2"+
		"\2\2\u0565\u0563\3\2\2\2\u0566\u0567\5\u0170\u00b9\2\u0567u\3\2\2\2\u0568"+
		"\u0569\7\64\2\2\u0569\u056a\7\61\2\2\u056a\u056b\5\u016a\u00b6\2\u056b"+
		"w\3\2\2\2\u056c\u056d\7\33\2\2\u056d\u056e\7\61\2\2\u056e\u056f\5\u016a"+
		"\u00b6\2\u056fy\3\2\2\2\u0570\u0571\7\62\2\2\u0571\u0575\5\u016e\u00b8"+
		"\2\u0572\u0574\5^\60\2\u0573\u0572\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573"+
		"\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0575\3\2\2\2\u0578"+
		"\u057c\5\u0170\u00b9\2\u0579\u057b\5~@\2\u057a\u0579\3\2\2\2\u057b\u057e"+
		"\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e"+
		"\u057c\3\2\2\2\u057f\u0580\5\u0080A\2\u0580\u0581\5\u016a\u00b6\2\u0581"+
		"\u0593\3\2\2\2\u0582\u0583\7\62\2\2\u0583\u0587\5\u016e\u00b8\2\u0584"+
		"\u0586\5^\60\2\u0585\u0584\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2"+
		"\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u0587\3\2\2\2\u058a"+
		"\u058c\5\u0170\u00b9\2\u058b\u058d\5~@\2\u058c\u058b\3\2\2\2\u058d\u058e"+
		"\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0591\5\u016a\u00b6\2\u0591\u0593\3\2\2\2\u0592\u0570\3\2\2\2\u0592\u0582"+
		"\3\2\2\2\u0593{\3\2\2\2\u0594\u0595\7\62\2\2\u0595\u059b\5\u0096L\2\u0596"+
		"\u0597\5\u016c\u00b7\2\u0597\u0598\5\u0096L\2\u0598\u059a\3\2\2\2\u0599"+
		"\u0596\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2"+
		"\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a0\7\62\2\2\u059f"+
		"\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\7/"+
		"\2\2\u05a2\u05a3\5\u0098M\2\u05a3\u05a7\5\u016e\u00b8\2\u05a4\u05a6\5"+
		"^\60\2\u05a5\u05a4\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7"+
		"\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ab\5\u0170"+
		"\u00b9\2\u05ab\u05ac\5\u016a\u00b6\2\u05ac}\3\2\2\2\u05ad\u05b2\5\u0166"+
		"\u00b4\2\u05ae\u05af\5\u0166\u00b4\2\u05af\u05b0\5\u0126\u0094\2\u05b0"+
		"\u05b2\3\2\2\2\u05b1\u05ad\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b2\u05b3\3\2"+
		"\2\2\u05b3\u05b7\5\u016e\u00b8\2\u05b4\u05b6\5^\60\2\u05b5\u05b4\3\2\2"+
		"\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba"+
		"\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u05bb\5\u0170\u00b9\2\u05bb\177\3\2"+
		"\2\2\u05bc\u05bd\7^\2\2\u05bd\u05c1\5\u016e\u00b8\2\u05be\u05c0\5^\60"+
		"\2\u05bf\u05be\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2"+
		"\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5\5\u0170\u00b9"+
		"\2\u05c5\u0081\3\2\2\2\u05c6\u05c7\7\62\2\2\u05c7\u05c8\7\34\2\2\u05c8"+
		"\u05c9\5\u009cO\2\u05c9\u05ca\5\u016a\u00b6\2\u05ca\u0083\3\2\2\2\u05cb"+
		"\u05cc\5\u009cO\2\u05cc\u05d1\t\4\2\2\u05cd\u05ce\5\u0172\u00ba\2\u05ce"+
		"\u05cf\5\u009cO\2\u05cf\u05d0\5\u0174\u00bb\2\u05d0\u05d2\3\2\2\2\u05d1"+
		"\u05cd\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5\u009c"+
		"O\2\u05d4\u0085\3\2\2\2\u05d5\u05d6\5\u0166\u00b4\2\u05d6\u05d7\7\62\2"+
		"\2\u05d7\u05d8\5\u0126\u0094\2\u05d8\u05d9\5\u016a\u00b6\2\u05d9\u0087"+
		"\3\2\2\2\u05da\u05db\5\u0166\u00b4\2\u05db\u05dc\5\u0126\u0094\2\u05dc"+
		"\u05dd\5\u016a\u00b6\2\u05dd\u0089\3\2\2\2\u05de\u05e4\5\u0094K\2\u05df"+
		"\u05e0\5\u016c\u00b7\2\u05e0\u05e1\5\u0094K\2\u05e1\u05e3\3\2\2\2\u05e2"+
		"\u05df\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2"+
		"\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7\u05e8\7/\2\2\u05e8"+
		"\u05e9\5\u0098M\2\u05e9\u05ea\5\u016a\u00b6\2\u05ea\u008b\3\2\2\2\u05eb"+
		"\u05f1\5\u0096L\2\u05ec\u05ed\5\u016c\u00b7\2\u05ed\u05ee\5\u0096L\2\u05ee"+
		"\u05f0\3\2\2\2\u05ef\u05ec\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2"+
		"\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4"+
		"\u05f5\7/\2\2\u05f5\u05f6\5\u0098M\2\u05f6\u05f7\5\u016a\u00b6\2\u05f7"+
		"\u008d\3\2\2\2\u05f8\u05f9\5\u0098M\2\u05f9\u05fa\5\u015a\u00ae\2\u05fa"+
		"\u05fb\5\u0098M\2\u05fb\u05fc\5\u016a\u00b6\2\u05fc\u008f\3\2\2\2\u05fd"+
		"\u05fe\5\u009cO\2\u05fe\u05ff\5\u016a\u00b6\2\u05ff\u0091\3\2\2\2\u0600"+
		"\u0601\5\u00acW\2\u0601\u0602\5\u016a\u00b6\2\u0602\u0093\3\2\2\2\u0603"+
		"\u0604\5\u0166\u00b4\2\u0604\u0606\7\62\2\2\u0605\u0607\5\u0126\u0094"+
		"\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u060a"+
		"\7^\2\2\u0609\u0603\3\2\2\2\u0609\u0608\3\2\2\2\u060a\u0095\3\2\2\2\u060b"+
		"\u060d\5\u0166\u00b4\2\u060c\u060e\5\u0126\u0094\2\u060d\u060c\3\2\2\2"+
		"\u060d\u060e\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u0611\7^\2\2\u0610\u060b"+
		"\3\2\2\2\u0610\u060f\3\2\2\2\u0611\u0097\3\2\2\2\u0612\u0618\5\u009cO"+
		"\2\u0613\u0614\5\u016c\u00b7\2\u0614\u0615\5\u009cO\2\u0615\u0617\3\2"+
		"\2\2\u0616\u0613\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0618"+
		"\u0619\3\2\2\2\u0619\u0099\3\2\2\2\u061a\u0618\3\2\2\2\u061b\u061c\5\u0176"+
		"\u00bc\2\u061c\u061d\5\u0166\u00b4\2\u061d\u061e\5\u00e2r\2\u061e\u061f"+
		"\5\u0178\u00bd\2\u061f\u0628\3\2\2\2\u0620\u0628\5\u0166\u00b4\2\u0621"+
		"\u0628\7^\2\2\u0622\u0623\5\u0172\u00ba\2\u0623\u0624\5\u009cO\2\u0624"+
		"\u0625\5\u0174\u00bb\2\u0625\u0628\3\2\2\2\u0626\u0628\5\u0112\u008a\2"+
		"\u0627\u061b\3\2\2\2\u0627\u0620\3\2\2\2\u0627\u0621\3\2\2\2\u0627\u0622"+
		"\3\2\2\2\u0627\u0626\3\2\2\2\u0628\u009b\3\2\2\2\u0629\u062a\bO\1\2\u062a"+
		"\u063e\5\u00f6|\2\u062b\u063e\5\u009aN\2\u062c\u063e\5\u00ba^\2\u062d"+
		"\u063e\5\u00b4[\2\u062e\u063e\5\u00b0Y\2\u062f\u063e\5\u00ccg\2\u0630"+
		"\u063e\5\u00ceh\2\u0631\u063e\5\u00e4s\2\u0632\u063e\5\u00eex\2\u0633"+
		"\u063e\5\u00e8u\2\u0634\u063e\5\u00f0y\2\u0635\u063e\5\u00f4{\2\u0636"+
		"\u063e\5\u00f2z\2\u0637\u063e\5\u00fc\177\2\u0638\u063e\5\u0104\u0083"+
		"\2\u0639\u063e\5\u0108\u0085\2\u063a\u063e\5\u010a\u0086\2\u063b\u063e"+
		"\5\u010e\u0088\2\u063c\u063e\5\u00bc_\2\u063d\u0629\3\2\2\2\u063d\u062b"+
		"\3\2\2\2\u063d\u062c\3\2\2\2\u063d\u062d\3\2\2\2\u063d\u062e\3\2\2\2\u063d"+
		"\u062f\3\2\2\2\u063d\u0630\3\2\2\2\u063d\u0631\3\2\2\2\u063d\u0632\3\2"+
		"\2\2\u063d\u0633\3\2\2\2\u063d\u0634\3\2\2\2\u063d\u0635\3\2\2\2\u063d"+
		"\u0636\3\2\2\2\u063d\u0637\3\2\2\2\u063d\u0638\3\2\2\2\u063d\u0639\3\2"+
		"\2\2\u063d\u063a\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063c\3\2\2\2\u063e"+
		"\u0675\3\2\2\2\u063f\u0640\f\f\2\2\u0640\u0641\5\u00b6\\\2\u0641\u0642"+
		"\5\u009cO\r\u0642\u0674\3\2\2\2\u0643\u0644\f\13\2\2\u0644\u0645\5\u0160"+
		"\u00b1\2\u0645\u0646\5\u009cO\f\u0646\u0674\3\2\2\2\u0647\u0648\f\n\2"+
		"\2\u0648\u0649\5\u015e\u00b0\2\u0649\u064a\5\u009cO\13\u064a\u0674\3\2"+
		"\2\2\u064b\u064c\f\t\2\2\u064c\u064d\5\u015c\u00af\2\u064d\u064e\5\u009c"+
		"O\n\u064e\u0674\3\2\2\2\u064f\u0650\f\b\2\2\u0650\u0651\5\u0146\u00a4"+
		"\2\u0651\u0652\5\u009cO\t\u0652\u0674\3\2\2\2\u0653\u0654\f\5\2\2\u0654"+
		"\u0655\5\u0154\u00ab\2\u0655\u0656\5\u009cO\6\u0656\u0674\3\2\2\2\u0657"+
		"\u0658\f\4\2\2\u0658\u0659\5\u0156\u00ac\2\u0659\u065a\5\u009cO\5\u065a"+
		"\u0674\3\2\2\2\u065b\u065c\f\3\2\2\u065c\u065d\5\u0158\u00ad\2\u065d\u065e"+
		"\5\u009cO\4\u065e\u0674\3\2\2\2\u065f\u0660\f\25\2\2\u0660\u0674\7\62"+
		"\2\2\u0661\u0662\f\24\2\2\u0662\u0674\7\60\2\2\u0663\u0664\f\23\2\2\u0664"+
		"\u0674\5\u00be`\2\u0665\u0666\f\22\2\2\u0666\u0674\5\u00aeX\2\u0667\u0668"+
		"\f\20\2\2\u0668\u0674\5\u00b4[\2\u0669\u066a\f\17\2\2\u066a\u0674\5\u00b8"+
		"]\2\u066b\u066c\f\16\2\2\u066c\u0674\5\u00b2Z\2\u066d\u066e\f\r\2\2\u066e"+
		"\u0674\5\u009eP\2\u066f\u0670\f\7\2\2\u0670\u0674\5\u00c0a\2\u0671\u0672"+
		"\f\6\2\2\u0672\u0674\5\u00c2b\2\u0673\u063f\3\2\2\2\u0673\u0643\3\2\2"+
		"\2\u0673\u0647\3\2\2\2\u0673\u064b\3\2\2\2\u0673\u064f\3\2\2\2\u0673\u0653"+
		"\3\2\2\2\u0673\u0657\3\2\2\2\u0673\u065b\3\2\2\2\u0673\u065f\3\2\2\2\u0673"+
		"\u0661\3\2\2\2\u0673\u0663\3\2\2\2\u0673\u0665\3\2\2\2\u0673\u0667\3\2"+
		"\2\2\u0673\u0669\3\2\2\2\u0673\u066b\3\2\2\2\u0673\u066d\3\2\2\2\u0673"+
		"\u066f\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2"+
		"\2\2\u0675\u0676\3\2\2\2\u0676\u009d\3\2\2\2\u0677\u0675\3\2\2\2\u0678"+
		"\u067a\5\u0162\u00b2\2\u0679\u067b\7b\2\2\u067a\u0679\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u0682\3\2\2\2\u067c\u0683\5\u0166\u00b4\2\u067d\u067e\5"+
		"\u0176\u00bc\2\u067e\u067f\5\u0166\u00b4\2\u067f\u0680\5\u00e2r\2\u0680"+
		"\u0681\5\u0178\u00bd\2\u0681\u0683\3\2\2\2\u0682\u067c\3\2\2\2\u0682\u067d"+
		"\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0687\5\u00aeX\2\u0685\u0687\5\u00b8"+
		"]\2\u0686\u0684\3\2\2\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687"+
		"\u009f\3\2\2\2\u0688\u0692\5\u0172\u00ba\2\u0689\u068f\5\u009cO\2\u068a"+
		"\u068b\5\u016c\u00b7\2\u068b\u068c\5\u009cO\2\u068c\u068e\3\2\2\2\u068d"+
		"\u068a\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2"+
		"\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0689\3\2\2\2\u0692"+
		"\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\5\u0174\u00bb\2\u0695\u00a1"+
		"\3\2\2\2\u0696\u069c\5\u009cO\2\u0697\u0698\5\u016c\u00b7\2\u0698\u0699"+
		"\5\u009cO\2\u0699\u069b\3\2\2\2\u069a\u0697\3\2\2\2\u069b\u069e\3\2\2"+
		"\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u00a3\3\2\2\2\u069e\u069c"+
		"\3\2\2\2\u069f\u06a0\5\u00a6T\2\u06a0\u00a5\3\2\2\2\u06a1\u06a2\5\u00a8"+
		"U\2\u06a2\u00a7\3\2\2\2\u06a3\u06a6\5\u00aaV\2\u06a4\u06a6\5\u00acW\2"+
		"\u06a5\u06a3\3\2\2\2\u06a5\u06a4\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a9"+
		"\7b\2\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa"+
		"\u06a5\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2"+
		"\2\2\u06ad\u00a9\3\2\2\2\u06ae\u06b2\7>\2\2\u06af\u06b0\5\u0166\u00b4"+
		"\2\u06b0\u06b1\7\33\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06af\3\2\2\2\u06b2"+
		"\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b7\5\u0166\u00b4\2\u06b5\u06b8"+
		"\5\u00a0Q\2\u06b6\u06b8\5\u00e4s\2\u06b7\u06b5\3\2\2\2\u06b7\u06b6\3\2"+
		"\2\2\u06b7\u06b8\3\2\2\2\u06b8\u00ab\3\2\2\2\u06b9\u06bc\7>\2\2\u06ba"+
		"\u06bd\5\u0114\u008b\2\u06bb\u06bd\5\u011a\u008e\2\u06bc\u06ba\3\2\2\2"+
		"\u06bc\u06bb\3\2\2\2\u06bd\u00ad\3\2\2\2\u06be\u06c1\5\u00a0Q\2\u06bf"+
		"\u06c1\5\u00e4s\2\u06c0\u06be\3\2\2\2\u06c0\u06bf\3\2\2\2\u06c1\u00af"+
		"\3\2\2\2\u06c2\u06c3\7\35\2\2\u06c3\u06c4\5\u009cO\2\u06c4\u00b1\3\2\2"+
		"\2\u06c5\u06c8\7\35\2\2\u06c6\u06c9\5\u00a0Q\2\u06c7\u06c9\5\u00e4s\2"+
		"\u06c8\u06c6\3\2\2\2\u06c8\u06c7\3\2\2\2\u06c9\u00b3\3\2\2\2\u06ca\u06cb"+
		"\7\36\2\2\u06cb\u06cc\5\u009cO\2\u06cc\u00b5\3\2\2\2\u06cd\u06ce\7\36"+
		"\2\2\u06ce\u00b7\3\2\2\2\u06cf\u06d2\5\u0176\u00bc\2\u06d0\u06d3\5\u00d2"+
		"j\2\u06d1\u06d3\5\u009cO\2\u06d2\u06d0\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d5\5\u0178\u00bd\2\u06d5\u00b9\3\2\2\2\u06d6\u06d7"+
		"\5\u0126\u0094\2\u06d7\u06db\5\u016e\u00b8\2\u06d8\u06dc\5\u00c4c\2\u06d9"+
		"\u06dc\5\u00c8e\2\u06da\u06dc\5\u00caf\2\u06db\u06d8\3\2\2\2\u06db\u06d9"+
		"\3\2\2\2\u06db\u06da\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u06de\5\u0170\u00b9\2\u06de\u00bb\3\2\2\2\u06df\u06e0\5\u0126\u0094\2"+
		"\u06e0\u06e2\5\u0172\u00ba\2\u06e1\u06e3\7b\2\2\u06e2\u06e1\3\2\2\2\u06e2"+
		"\u06e3\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06e6\5\u00a2R\2\u06e5\u06e4"+
		"\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e9\7b\2\2\u06e8"+
		"\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\5\u0174"+
		"\u00bb\2\u06eb\u00bd\3\2\2\2\u06ec\u06ed\7\60\2\2\u06ed\u06ee\7\60\2\2"+
		"\u06ee\u06ef\5\u009cO\2\u06ef\u00bf\3\2\2\2\u06f0\u06f1\5\u0126\u0094"+
		"\2\u06f1\u06f2\7\62\2\2\u06f2\u00c1\3\2\2\2\u06f3\u06f4\5\u0126\u0094"+
		"\2\u06f4\u06f5\7\60\2\2\u06f5\u00c3\3\2\2\2\u06f6\u06f7\5\u00c6d\2\u06f7"+
		"\u06f8\5\u016a\u00b6\2\u06f8\u06fa\3\2\2\2\u06f9\u06f6\3\2\2\2\u06fa\u06fd"+
		"\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2\2\2\u06fd"+
		"\u06fb\3\2\2\2\u06fe\u06ff\5\u00c6d\2\u06ff\u00c5\3\2\2\2\u0700\u0701"+
		"\5\u00dco\2\u0701\u0702\7\37\2\2\u0702\u0703\5\u009cO\2\u0703\u00c7\3"+
		"\2\2\2\u0704\u0705\5\u009cO\2\u0705\u0706\5\u016a\u00b6\2\u0706\u0708"+
		"\3\2\2\2\u0707\u0704\3\2\2\2\u0708\u070b\3\2\2\2\u0709\u0707\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u0709\3\2\2\2\u070c\u070d\5\u009c"+
		"O\2\u070d\u00c9\3\2\2\2\u070e\u070f\5\u00d0i\2\u070f\u0710\5\u016a\u00b6"+
		"\2\u0710\u0712\3\2\2\2\u0711\u070e\3\2\2\2\u0712\u0715\3\2\2\2\u0713\u0711"+
		"\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0716\3\2\2\2\u0715\u0713\3\2\2\2\u0716"+
		"\u0717\5\u00d0i\2\u0717\u00cb\3\2\2\2\u0718\u071e\5\u016e\u00b8\2\u0719"+
		"\u071a\5\u009cO\2\u071a\u071b\5\u016a\u00b6\2\u071b\u071d\3\2\2\2\u071c"+
		"\u0719\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2"+
		"\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0722\5\u009cO\2\u0722"+
		"\u0723\5\u0170\u00b9\2\u0723\u00cd\3\2\2\2\u0724\u072a\5\u016e\u00b8\2"+
		"\u0725\u0726\5\u00d0i\2\u0726\u0727\5\u016a\u00b6\2\u0727\u0729\3\2\2"+
		"\2\u0728\u0725\3\2\2\2\u0729\u072c\3\2\2\2\u072a\u0728\3\2\2\2\u072a\u072b"+
		"\3\2\2\2\u072b\u072d\3\2\2\2\u072c\u072a\3\2\2\2\u072d\u072e\5\u00d0i"+
		"\2\u072e\u072f\5\u0170\u00b9\2\u072f\u00cf\3\2\2\2\u0730\u0731\5\u0176"+
		"\u00bc\2\u0731\u0732\5\u009cO\2\u0732\u0733\5\u0178\u00bd\2\u0733\u0734"+
		"\7\37\2\2\u0734\u0735\5\u009cO\2\u0735\u00d1\3\2\2\2\u0736\u073a\5\u00d6"+
		"l\2\u0737\u073a\5\u00d8m\2\u0738\u073a\5\u00d4k\2\u0739\u0736\3\2\2\2"+
		"\u0739\u0737\3\2\2\2\u0739\u0738\3\2\2\2\u073a\u00d3\3\2\2\2\u073b\u073c"+
		"\5\u009cO\2\u073c\u073d\t\4\2\2\u073d\u073e\5\u009cO\2\u073e\u00d5\3\2"+
		"\2\2\u073f\u0740\5\u009cO\2\u0740\u0741\t\4\2\2\u0741\u00d7\3\2\2\2\u0742"+
		"\u0743\t\4\2\2\u0743\u0744\5\u009cO\2\u0744\u00d9\3\2\2\2\u0745\u0746"+
		"\5\u0166\u00b4\2\u0746\u0748\5\u0162\u00b2\2\u0747\u0749\7b\2\2\u0748"+
		"\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074b\3\2\2\2\u074a\u0745\3\2"+
		"\2\2\u074b\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d"+
		"\u074f\3\2\2\2\u074e\u074c\3\2\2\2\u074f\u0750\5\u0166\u00b4\2\u0750\u00db"+
		"\3\2\2\2\u0751\u075a\5\u0166\u00b4\2\u0752\u0754\5\u0162\u00b2\2\u0753"+
		"\u0755\7b\2\2\u0754\u0753\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\3\2"+
		"\2\2\u0756\u0757\5\u0166\u00b4\2\u0757\u0759\3\2\2\2\u0758\u0752\3\2\2"+
		"\2\u0759\u075c\3\2\2\2\u075a\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u00dd"+
		"\3\2\2\2\u075c\u075a\3\2\2\2\u075d\u075f\5\u00e0q\2\u075e\u075d\3\2\2"+
		"\2\u075f\u0762\3\2\2\2\u0760\u075e\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u00df"+
		"\3\2\2\2\u0762\u0760\3\2\2\2\u0763\u076a\5\u0166\u00b4\2\u0764\u0765\5"+
		"\u0172\u00ba\2\u0765\u0766\5\u0166\u00b4\2\u0766\u0767\5\u0166\u00b4\2"+
		"\u0767\u0768\5\u0174\u00bb\2\u0768\u076a\3\2\2\2\u0769\u0763\3\2\2\2\u0769"+
		"\u0764\3\2\2\2\u076a\u00e1\3\2\2\2\u076b\u076d\5\u0126\u0094\2\u076c\u076b"+
		"\3\2\2\2\u076d\u0770\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f"+
		"\u00e3\3\2\2\2\u0770\u076e\3\2\2\2\u0771\u0773\5\u016e\u00b8\2\u0772\u0774"+
		"\5\u00e6t\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2"+
		"\2\u0775\u0779\t\2\2\2\u0776\u0778\7b\2\2\u0777\u0776\3\2\2\2\u0778\u077b"+
		"\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b"+
		"\u0779\3\2\2\2\u077c\u077d\5\u0098M\2\u077d\u077e\5\u0170\u00b9\2\u077e"+
		"\u0793\3\2\2\2\u077f\u0781\5\u016e\u00b8\2\u0780\u0782\5\u00e6t\2\u0781"+
		"\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0787\t\2"+
		"\2\2\u0784\u0786\7b\2\2\u0785\u0784\3\2\2\2\u0786\u0789\3\2\2\2\u0787"+
		"\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078d\3\2\2\2\u0789\u0787\3\2"+
		"\2\2\u078a\u078c\5^\60\2\u078b\u078a\3\2\2\2\u078c\u078f\3\2\2\2\u078d"+
		"\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0790\3\2\2\2\u078f\u078d\3\2"+
		"\2\2\u0790\u0791\5\u0170\u00b9\2\u0791\u0793\3\2\2\2\u0792\u0771\3\2\2"+
		"\2\u0792\u077f\3\2\2\2\u0793\u00e5\3\2\2\2\u0794\u079a\5\u0166\u00b4\2"+
		"\u0795\u0796\5\u016c\u00b7\2\u0796\u0797\5\u0166\u00b4\2\u0797\u0799\3"+
		"\2\2\2\u0798\u0795\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798\3\2\2\2\u079a"+
		"\u079b\3\2\2\2\u079b\u00e7\3\2\2\2\u079c\u079a\3\2\2\2\u079d\u079e\5\u00ea"+
		"v\2\u079e\u00e9\3\2\2\2\u079f\u07a5\5\u016e\u00b8\2\u07a0\u07a1\5\u00ec"+
		"w\2\u07a1\u07a2\5\u016a\u00b6\2\u07a2\u07a4\3\2\2\2\u07a3\u07a0\3\2\2"+
		"\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a8"+
		"\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u07a9\5\u00ecw\2\u07a9\u07aa\5\u0170"+
		"\u00b9\2\u07aa\u00eb\3\2\2\2\u07ab\u07ad\5\u00dco\2\u07ac\u07ae\7\62\2"+
		"\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0"+
		"\7/\2\2\u07b0\u07b1\5\u009cO\2\u07b1\u00ed\3\2\2\2\u07b2\u07b3\5\u0172"+
		"\u00ba\2\u07b3\u07b4\5X-\2\u07b4\u07b6\t\2\2\2\u07b5\u07b7\7\62\2\2\u07b6"+
		"\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07ba\7\61"+
		"\2\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07be\3\2\2\2\u07bb"+
		"\u07bd\7b\2\2\u07bc\u07bb\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1"+
		"\u07c2\5Z.\2\u07c2\u07c3\5\u0174\u00bb\2\u07c3\u07c7\5\u016e\u00b8\2\u07c4"+
		"\u07c6\5^\60\2\u07c5\u07c4\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3\2"+
		"\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca"+
		"\u07cb\5\u0170\u00b9\2\u07cb\u00ef\3\2\2\2\u07cc\u07cd\5\u015c\u00af\2"+
		"\u07cd\u07ce\5\u009cO\2\u07ce\u00f1\3\2\2\2\u07cf\u07d0\5\u0164\u00b3"+
		"\2\u07d0\u07d1\5\u009cO\2\u07d1\u00f3\3\2\2\2\u07d2\u07d3\5\u014c\u00a7"+
		"\2\u07d3\u07d4\5\u009cO\2\u07d4\u00f5\3\2\2\2\u07d5\u07d6\5\u00f8}\2\u07d6"+
		"\u07d8\7\33\2\2\u07d7\u07d9\7b\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2"+
		"\2\2\u07d9\u07dd\3\2\2\2\u07da\u07dc\5\u00fa~\2\u07db\u07da\3\2\2\2\u07dc"+
		"\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2"+
		"\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e2\5\u0166\u00b4\2\u07e1\u07e3\7b\2"+
		"\2\u07e2\u07e1\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5"+
		"\5\u009cO\2\u07e5\u00f7\3\2\2\2\u07e6\u07e7\7\61\2\2\u07e7\u07e9\5\u0166"+
		"\u00b4\2\u07e8\u07ea\7\62\2\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2"+
		"\u07ea\u07eb\3\2\2\2\u07eb\u07ec\7/\2\2\u07ec\u07ed\5\u009cO\2\u07ed\u00f9"+
		"\3\2\2\2\u07ee\u07f4\5\u00f8}\2\u07ef\u07f1\5\u0166\u00b4\2\u07f0\u07f2"+
		"\5\u009cO\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f4\3\2\2"+
		"\2\u07f3\u07ee\3\2\2\2\u07f3\u07ef\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7"+
		"\7\33\2\2\u07f6\u07f8\7b\2\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8"+
		"\u00fb\3\2\2\2\u07f9\u07fd\5\u0100\u0081\2\u07fa\u07fc\5\u0102\u0082\2"+
		"\u07fb\u07fa\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe"+
		"\3\2\2\2\u07fe\u0800\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800\u0801\5\u00fe\u0080"+
		"\2\u0801\u00fd\3\2\2\2\u0802\u0803\7^\2\2\u0803\u0807\5\u016e\u00b8\2"+
		"\u0804\u0806\5^\60\2\u0805\u0804\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805"+
		"\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080a\3\2\2\2\u0809\u0807\3\2\2\2\u080a"+
		"\u080b\5\u0098M\2\u080b\u080c\5\u0170\u00b9\2\u080c\u00ff\3\2\2\2\u080d"+
		"\u080e\7\60\2\2\u080e\u080f\7\33\2\2\u080f\u0810\5\u009cO\2\u0810\u0814"+
		"\5\u016e\u00b8\2\u0811\u0813\5^\60\2\u0812\u0811\3\2\2\2\u0813\u0816\3"+
		"\2\2\2\u0814\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816"+
		"\u0814\3\2\2\2\u0817\u0818\5\u0098M\2\u0818\u0819\5\u0170\u00b9\2\u0819"+
		"\u0101\3\2\2\2\u081a\u081b\5\u009cO\2\u081b\u081f\5\u016e\u00b8\2\u081c"+
		"\u081e\5^\60\2\u081d\u081c\3\2\2\2\u081e\u0821\3\2\2\2\u081f\u081d\3\2"+
		"\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2\2\2\u0821\u081f\3\2\2\2\u0822"+
		"\u0823\5\u0098M\2\u0823\u0824\5\u0170\u00b9\2\u0824\u0103\3\2\2\2\u0825"+
		"\u0826\7\60\2\2\u0826\u0827\5\u009cO\2\u0827\u0828\7/\2\2\u0828\u082a"+
		"\7\33\2\2\u0829\u082b\5\u0106\u0084\2\u082a\u0829\3\2\2\2\u082b\u082c"+
		"\3\2\2\2\u082c\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0105\3\2\2\2\u082e"+
		"\u0834\5d\63\2\u082f\u0830\5\u016c\u00b7\2\u0830\u0831\5d\63\2\u0831\u0833"+
		"\3\2\2\2\u0832\u082f\3\2\2\2\u0833\u0836\3\2\2\2\u0834\u0832\3\2\2\2\u0834"+
		"\u0835\3\2\2\2\u0835\u0837\3\2\2\2\u0836\u0834\3\2\2\2\u0837\u083b\5\u016e"+
		"\u00b8\2\u0838\u083a\5^\60\2\u0839\u0838\3\2\2\2\u083a\u083d\3\2\2\2\u083b"+
		"\u0839\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\3\2\2\2\u083d\u083b\3\2"+
		"\2\2\u083e\u083f\5\u0098M\2\u083f\u0840\5\u0170\u00b9\2\u0840\u0107\3"+
		"\2\2\2\u0841\u0842\7\61\2\2\u0842\u0844\5\u0166\u00b4\2\u0843\u0845\7"+
		"\62\2\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2\2\2\u0846"+
		"\u0847\7/\2\2\u0847\u0848\5\u0084C\2\u0848\u0849\7\33\2\2\u0849\u084d"+
		"\5\u016e\u00b8\2\u084a\u084c\5^\60\2\u084b\u084a\3\2\2\2\u084c\u084f\3"+
		"\2\2\2\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850\3\2\2\2\u084f"+
		"\u084d\3\2\2\2\u0850\u0851\5\u0098M\2\u0851\u0853\5\u0170\u00b9\2\u0852"+
		"\u0854\5\u010c\u0087\2\u0853\u0852\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0109"+
		"\3\2\2\2\u0855\u0859\7\61\2\2\u0856\u0857\5\u0166\u00b4\2\u0857\u0858"+
		"\7/\2\2\u0858\u085a\3\2\2\2\u0859\u0856\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u085b\3\2\2\2\u085b\u085d\5\u0166\u00b4\2\u085c\u085e\7\62\2\2\u085d"+
		"\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\7/"+
		"\2\2\u0860\u0861\5\u009cO\2\u0861\u0862\7\33\2\2\u0862\u0866\5\u016e\u00b8"+
		"\2\u0863\u0865\5^\60\2\u0864\u0863\3\2\2\2\u0865\u0868\3\2\2\2\u0866\u0864"+
		"\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0866\3\2\2\2\u0869"+
		"\u086a\5\u0098M\2\u086a\u086c\5\u0170\u00b9\2\u086b\u086d\5\u010c\u0087"+
		"\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u010b\3\2\2\2\u086e\u086f"+
		"\7^\2\2\u086f\u0873\5\u016e\u00b8\2\u0870\u0872\5^\60\2\u0871\u0870\3"+
		"\2\2\2\u0872\u0875\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0876\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u0877\5\u0098M\2\u0877\u0878"+
		"\5\u0170\u00b9\2\u0878\u010d\3\2\2\2\u0879\u087a\7\62\2\2\u087a\u087b"+
		"\7\33\2\2\u087b\u087f\5\u016e\u00b8\2\u087c\u087e\5^\60\2\u087d\u087c"+
		"\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880"+
		"\u0882\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0883\5\u0098M\2\u0883\u0887"+
		"\5\u0170\u00b9\2\u0884\u0886\5\u0110\u0089\2\u0885\u0884\3\2\2\2\u0886"+
		"\u0889\3\2\2\2\u0887\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2"+
		"\2\2\u0889\u0887\3\2\2\2\u088a\u088b\5\u0080A\2\u088b\u089d\3\2\2\2\u088c"+
		"\u088d\7\62\2\2\u088d\u088e\7\33\2\2\u088e\u0892\5\u016e\u00b8\2\u088f"+
		"\u0891\5^\60\2\u0890\u088f\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2"+
		"\2\2\u0892\u0893\3\2\2\2\u0893\u0895\3\2\2\2\u0894\u0892\3\2\2\2\u0895"+
		"\u0896\5\u0098M\2\u0896\u0898\5\u0170\u00b9\2\u0897\u0899\5\u0110\u0089"+
		"\2\u0898\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u0898\3\2\2\2\u089a\u089b"+
		"\3\2\2\2\u089b\u089d\3\2\2\2\u089c\u0879\3\2\2\2\u089c\u088c\3\2\2\2\u089d"+
		"\u010f\3\2\2\2\u089e\u08a3\5\u0166\u00b4\2\u089f\u08a0\5\u0166\u00b4\2"+
		"\u08a0\u08a1\5\u0126\u0094\2\u08a1\u08a3\3\2\2\2\u08a2\u089e\3\2\2\2\u08a2"+
		"\u089f\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a8\5\u016e\u00b8\2\u08a5\u08a7"+
		"\5^\60\2\u08a6\u08a5\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8"+
		"\u08a9\3\2\2\2\u08a9\u08ab\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u08ac\5\u0098"+
		"M\2\u08ac\u08ad\5\u0170\u00b9\2\u08ad\u0111\3\2\2\2\u08ae\u08b8\5\u0120"+
		"\u0091\2\u08af\u08b8\5\u0122\u0092\2\u08b0\u08b8\5\u011a\u008e\2\u08b1"+
		"\u08b8\5\u0114\u008b\2\u08b2\u08b8\7[\2\2\u08b3\u08b8\7Q\2\2\u08b4\u08b8"+
		"\7R\2\2\u08b5\u08b8\5\u0142\u00a2\2\u08b6\u08b8\7S\2\2\u08b7\u08ae\3\2"+
		"\2\2\u08b7\u08af\3\2\2\2\u08b7\u08b0\3\2\2\2\u08b7\u08b1\3\2\2\2\u08b7"+
		"\u08b2\3\2\2\2\u08b7\u08b3\3\2\2\2\u08b7\u08b4\3\2\2\2\u08b7\u08b5\3\2"+
		"\2\2\u08b7\u08b6\3\2\2\2\u08b8\u0113\3\2\2\2\u08b9\u08be\7Z\2\2\u08ba"+
		"\u08bd\5\u0116\u008c\2\u08bb\u08bd\5\u0118\u008d\2\u08bc\u08ba\3\2\2\2"+
		"\u08bc\u08bb\3\2\2\2\u08bd\u08c0\3\2\2\2\u08be\u08bc\3\2\2\2\u08be\u08bf"+
		"\3\2\2\2\u08bf\u08c1\3\2\2\2\u08c0\u08be\3\2\2\2\u08c1\u08c2\7d\2\2\u08c2"+
		"\u0115\3\2\2\2\u08c3\u08c4\7f\2\2\u08c4\u0117\3\2\2\2\u08c5\u08cb\7e\2"+
		"\2\u08c6\u08c7\5\u009cO\2\u08c7\u08c8\5\u016a\u00b6\2\u08c8\u08ca\3\2"+
		"\2\2\u08c9\u08c6\3\2\2\2\u08ca\u08cd\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08cb\3\2\2\2\u08ce\u08cf\5\u009c"+
		"O\2\u08cf\u08d0\7,\2\2\u08d0\u0119\3\2\2\2\u08d1\u08d7\7Y\2\2\u08d2\u08d6"+
		"\5\u011c\u008f\2\u08d3\u08d6\5\u011e\u0090\2\u08d4\u08d6\7h\2\2\u08d5"+
		"\u08d2\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5\u08d4\3\2\2\2\u08d6\u08d9\3\2"+
		"\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08da\3\2\2\2\u08d9"+
		"\u08d7\3\2\2\2\u08da\u08db\7g\2\2\u08db\u011b\3\2\2\2\u08dc\u08dd\7j\2"+
		"\2\u08dd\u011d\3\2\2\2\u08de\u08e2\7i\2\2\u08df\u08e1\7b\2\2\u08e0\u08df"+
		"\3\2\2\2\u08e1\u08e4\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3"+
		"\u08ea\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e5\u08e6\5\u009cO\2\u08e6\u08e7"+
		"\5\u016a\u00b6\2\u08e7\u08e9\3\2\2\2\u08e8\u08e5\3\2\2\2\u08e9\u08ec\3"+
		"\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ed\3\2\2\2\u08ec"+
		"\u08ea\3\2\2\2\u08ed\u08f1\5\u009cO\2\u08ee\u08f0\7b\2\2\u08ef\u08ee\3"+
		"\2\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2"+
		"\u08f4\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f4\u08f5\7,\2\2\u08f5\u011f\3\2"+
		"\2\2\u08f6\u08f7\7T\2\2\u08f7\u0121\3\2\2\2\u08f8\u08f9\t\5\2\2\u08f9"+
		"\u0123\3\2\2\2\u08fa\u0906\5\u013c\u009f\2\u08fb\u0906\5\u012a\u0096\2"+
		"\u08fc\u0906\5\u012c\u0097\2\u08fd\u0906\5\u012e\u0098\2\u08fe\u0906\5"+
		"\u0130\u0099\2\u08ff\u0906\5\u0132\u009a\2\u0900\u0906\5\u0134\u009b\2"+
		"\u0901\u0906\5\u0136\u009c\2\u0902\u0906\5\u0140\u00a1\2\u0903\u0906\5"+
		"\u0138\u009d\2\u0904\u0906\5\u013a\u009e\2\u0905\u08fa\3\2\2\2\u0905\u08fb"+
		"\3\2\2\2\u0905\u08fc\3\2\2\2\u0905\u08fd\3\2\2\2\u0905\u08fe\3\2\2\2\u0905"+
		"\u08ff\3\2\2\2\u0905\u0900\3\2\2\2\u0905\u0901\3\2\2\2\u0905\u0902\3\2"+
		"\2\2\u0905\u0903\3\2\2\2\u0905\u0904\3\2\2\2\u0906\u0125\3\2\2\2\u0907"+
		"\u090a\5\u0124\u0093\2\u0908\u090a\5\u0128\u0095\2\u0909\u0907\3\2\2\2"+
		"\u0909\u0908\3\2\2\2\u090a\u0127\3\2\2\2\u090b\u090c\7\60\2\2\u090c\u090d"+
		"\5\u0124\u0093\2\u090d\u0129\3\2\2\2\u090e\u090f\5\u0176\u00bc\2\u090f"+
		"\u0910\7\30\2\2\u0910\u0911\5\u0178\u00bd\2\u0911\u0912\5\u0126\u0094"+
		"\2\u0912\u012b\3\2\2\2\u0913\u0914\5\u0176\u00bc\2\u0914\u0915\5\u0178"+
		"\u00bd\2\u0915\u0916\5\u0126\u0094\2\u0916\u012d\3\2\2\2\u0917\u0918\5"+
		"\u0176\u00bc\2\u0918\u0919\5\u0126\u0094\2\u0919\u091a\5\u0178\u00bd\2"+
		"\u091a\u091b\7^\2\2\u091b\u012f\3\2\2\2\u091c\u091d\5\u0176\u00bc\2\u091d"+
		"\u091e\5\u0126\u0094\2\u091e\u091f\5\u0178\u00bd\2\u091f\u0920\5\u0126"+
		"\u0094\2\u0920\u0131\3\2\2\2\u0921\u0922\5\u0176\u00bc\2\u0922\u0923\7"+
		"\'\2\2\u0923\u0924\5\u0178\u00bd\2\u0924\u0925\5\u0126\u0094\2\u0925\u0133"+
		"\3\2\2\2\u0926\u0927\5\u0176\u00bc\2\u0927\u0928\7&\2\2\u0928\u0929\5"+
		"\u0178\u00bd\2\u0929\u092a\5\u0126\u0094\2\u092a\u0135\3\2\2\2\u092b\u092c"+
		"\5\u0176\u00bc\2\u092c\u092d\7\64\2\2\u092d\u092e\5\u0178\u00bd\2\u092e"+
		"\u092f\5\u0126\u0094\2\u092f\u0137\3\2\2\2\u0930\u0937\5\u00dan\2\u0931"+
		"\u0932\5\u0176\u00bc\2\u0932\u0933\5\u00dan\2\u0933\u0934\5\u00e2r\2\u0934"+
		"\u0935\5\u0178\u00bd\2\u0935\u0937\3\2\2\2\u0936\u0930\3\2\2\2\u0936\u0931"+
		"\3\2\2\2\u0937\u0139\3\2\2\2\u0938\u0939\5\u0172\u00ba\2\u0939\u093a\5"+
		"\u013e\u00a0\2\u093a\u093c\t\2\2\2\u093b\u093d\7\62\2\2\u093c\u093b\3"+
		"\2\2\2\u093c\u093d\3\2\2\2\u093d\u093f\3\2\2\2\u093e\u0940\7\61\2\2\u093f"+
		"\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0944\3\2\2\2\u0941\u0943\7b"+
		"\2\2\u0942\u0941\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942\3\2\2\2\u0944"+
		"\u0945\3\2\2\2\u0945\u0947\3\2\2\2\u0946\u0944\3\2\2\2\u0947\u0948\5\u013e"+
		"\u00a0\2\u0948\u0949\5\u0174\u00bb\2\u0949\u013b\3\2\2\2\u094a\u094b\7"+
		"O\2\2\u094b\u013d\3\2\2\2\u094c\u094e\5\u0126\u0094\2\u094d\u094c\3\2"+
		"\2\2\u094d\u094e\3\2\2\2\u094e\u0954\3\2\2\2\u094f\u0950\5\u016c\u00b7"+
		"\2\u0950\u0951\5\u0126\u0094\2\u0951\u0953\3\2\2\2\u0952\u094f\3\2\2\2"+
		"\u0953\u0956\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u013f"+
		"\3\2\2\2\u0956\u0954\3\2\2\2\u0957\u0968\7?\2\2\u0958\u0968\7@\2\2\u0959"+
		"\u0968\7A\2\2\u095a\u0968\7B\2\2\u095b\u0968\7C\2\2\u095c\u0968\7D\2\2"+
		"\u095d\u0968\7E\2\2\u095e\u0968\7F\2\2\u095f\u0968\7G\2\2\u0960\u0968"+
		"\7H\2\2\u0961\u0968\7I\2\2\u0962\u0968\7J\2\2\u0963\u0968\7K\2\2\u0964"+
		"\u0968\7L\2\2\u0965\u0968\7M\2\2\u0966\u0968\7N\2\2\u0967\u0957\3\2\2"+
		"\2\u0967\u0958\3\2\2\2\u0967\u0959\3\2\2\2\u0967\u095a\3\2\2\2\u0967\u095b"+
		"\3\2\2\2\u0967\u095c\3\2\2\2\u0967\u095d\3\2\2\2\u0967\u095e\3\2\2\2\u0967"+
		"\u095f\3\2\2\2\u0967\u0960\3\2\2\2\u0967\u0961\3\2\2\2\u0967\u0962\3\2"+
		"\2\2\u0967\u0963\3\2\2\2\u0967\u0964\3\2\2\2\u0967\u0965\3\2\2\2\u0967"+
		"\u0966\3\2\2\2\u0968\u0141\3\2\2\2\u0969\u096a\7P\2\2\u096a\u0143\3\2"+
		"\2\2\u096b\u096e\7Q\2\2\u096c\u096e\7R\2\2\u096d\u096b\3\2\2\2\u096d\u096c"+
		"\3\2\2\2\u096e\u0145\3\2\2\2\u096f\u0975\5\u0148\u00a5\2\u0970\u0975\5"+
		"\u014a\u00a6\2\u0971\u0975\5\u014e\u00a8\2\u0972\u0975\5\u0150\u00a9\2"+
		"\u0973\u0975\5\u0152\u00aa\2\u0974\u096f\3\2\2\2\u0974\u0970\3\2\2\2\u0974"+
		"\u0971\3\2\2\2\u0974\u0972\3\2\2\2\u0974\u0973\3\2\2\2\u0975\u0977\3\2"+
		"\2\2\u0976\u0978\7b\2\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978"+
		"\u0147\3\2\2\2\u0979\u097a\7\"\2\2\u097a\u0149\3\2\2\2\u097b\u097c\7#"+
		"\2\2\u097c\u014b\3\2\2\2\u097d\u097e\7%\2\2\u097e\u014d\3\2\2\2\u097f"+
		"\u0980\7$\2\2\u0980\u014f\3\2\2\2\u0981\u0982\7 \2\2\u0982\u0151\3\2\2"+
		"\2\u0983\u0984\7!\2\2\u0984\u0153\3\2\2\2\u0985\u0986\7\16\2\2\u0986\u0155"+
		"\3\2\2\2\u0987\u0989\t\6\2\2\u0988\u098a\7b\2\2\u0989\u0988\3\2\2\2\u0989"+
		"\u098a\3\2\2\2\u098a\u0157\3\2\2\2\u098b\u098d\t\7\2\2\u098c\u098e\7b"+
		"\2\2\u098d\u098c\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0159\3\2\2\2\u098f"+
		"\u0991\t\b\2\2\u0990\u0992\7b\2\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2"+
		"\2\2\u0992\u015b\3\2\2\2\u0993\u0995\t\t\2\2\u0994\u0996\7b\2\2\u0995"+
		"\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u015d\3\2\2\2\u0997\u0999\t\n"+
		"\2\2\u0998\u099a\7b\2\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u015f\3\2\2\2\u099b\u099d\7<\2\2\u099c\u099e\7b\2\2\u099d\u099c\3\2\2"+
		"\2\u099d\u099e\3\2\2\2\u099e\u0161\3\2\2\2\u099f\u09a1\7\25\2\2\u09a0"+
		"\u09a2\7b\2\2\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u0163\3\2"+
		"\2\2\u09a3\u09a4\7\64\2\2\u09a4\u0165\3\2\2\2\u09a5\u09a6\5\u0168\u00b5"+
		"\2\u09a6\u0167\3\2\2\2\u09a7\u09ab\t\13\2\2\u09a8\u09ab\5\u0140\u00a1"+
		"\2\u09a9\u09ab\5\u013c\u009f\2\u09aa\u09a7\3\2\2\2\u09aa\u09a8\3\2\2\2"+
		"\u09aa";
	private static final String _serializedATNSegment1 =
		"\u09a9\3\2\2\2\u09ab\u0169\3\2\2\2\u09ac\u09ad\t\f\2\2\u09ad\u016b\3\2"+
		"\2\2\u09ae\u09b2\7\30\2\2\u09af\u09b1\7b\2\2\u09b0\u09af\3\2\2\2\u09b1"+
		"\u09b4\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u016d\3\2"+
		"\2\2\u09b4\u09b2\3\2\2\2\u09b5\u09b9\7+\2\2\u09b6\u09b8\7b\2\2\u09b7\u09b6"+
		"\3\2\2\2\u09b8\u09bb\3\2\2\2\u09b9\u09b7\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba"+
		"\u016f\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bc\u09be\7b\2\2\u09bd\u09bc\3\2"+
		"\2\2\u09be\u09c1\3\2\2\2\u09bf\u09bd\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0"+
		"\u09c2\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c2\u09c3\7,\2\2\u09c3\u0171\3\2"+
		"\2\2\u09c4\u09c5\7)\2\2\u09c5\u0173\3\2\2\2\u09c6\u09c7\7*\2\2\u09c7\u0175"+
		"\3\2\2\2\u09c8\u09cc\7-\2\2\u09c9\u09cb\7b\2\2\u09ca\u09c9\3\2\2\2\u09cb"+
		"\u09ce\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u0177\3\2"+
		"\2\2\u09ce\u09cc\3\2\2\2\u09cf\u09d1\7b\2\2\u09d0\u09cf\3\2\2\2\u09d1"+
		"\u09d4\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d5\3\2"+
		"\2\2\u09d4\u09d2\3\2\2\2\u09d5\u09d6\7.\2\2\u09d6\u0179\3\2\2\2\u0125"+
		"\u017d\u0182\u0186\u018c\u0192\u01a4\u01ab\u01ad\u01b4\u01b8\u01bb\u01be"+
		"\u01c2\u01c8\u01d0\u01d6\u01df\u01e3\u01e9\u01f3\u01fc\u01ff\u0204\u020d"+
		"\u020f\u0214\u021c\u021e\u0223\u022b\u0232\u0235\u023a\u0243\u024a\u0252"+
		"\u0255\u025c\u0263\u0267\u0270\u0279\u027c\u0285\u0287\u028c\u0294\u0296"+
		"\u029b\u02a3\u02aa\u02ad\u02b2\u02bb\u02c3\u02c9\u02cb\u02d1\u02de\u02e3"+
		"\u02ea\u02f0\u02f2\u02f7\u02fb\u0301\u0307\u0310\u0312\u0317\u031f\u0321"+
		"\u0326\u032e\u0335\u0338\u033d\u0346\u0351\u0357\u036a\u0370\u0376\u037a"+
		"\u0380\u0384\u038d\u038f\u0394\u0398\u03a0\u03a2\u03a7\u03ab\u03b3\u03ba"+
		"\u03bd\u03c2\u03cb\u03d2\u03da\u03dd\u03e4\u03e8\u03ef\u03f3\u03fb\u03ff"+
		"\u0402\u0409\u040f\u0411\u0417\u041f\u0422\u0426\u042d\u042f\u0434\u043c"+
		"\u0442\u0445\u044a\u0457\u045e\u0461\u0466\u046f\u0477\u047d\u048b\u0492"+
		"\u0496\u049d\u04a1\u04a5\u04a8\u04ad\u04c6\u04ce\u04d8\u04df\u04e8\u04eb"+
		"\u04f1\u04fb\u0500\u0507\u0512\u051c\u0524\u052c\u0531\u053a\u053e\u0546"+
		"\u054b\u0555\u055a\u0563\u0575\u057c\u0587\u058e\u0592\u059b\u059f\u05a7"+
		"\u05b1\u05b7\u05c1\u05d1\u05e4\u05f1\u0606\u0609\u060d\u0610\u0618\u0627"+
		"\u063d\u0673\u0675\u067a\u0682\u0686\u068f\u0692\u069c\u06a5\u06a8\u06ac"+
		"\u06b2\u06b7\u06bc\u06c0\u06c8\u06d2\u06db\u06e2\u06e5\u06e8\u06fb\u0709"+
		"\u0713\u071e\u072a\u0739\u0748\u074c\u0754\u075a\u0760\u0769\u076e\u0773"+
		"\u0779\u0781\u0787\u078d\u0792\u079a\u07a5\u07ad\u07b6\u07b9\u07be\u07c7"+
		"\u07d8\u07dd\u07e2\u07e9\u07f1\u07f3\u07f7\u07fd\u0807\u0814\u081f\u082c"+
		"\u0834\u083b\u0844\u084d\u0853\u0859\u085d\u0866\u086c\u0873\u087f\u0887"+
		"\u0892\u089a\u089c\u08a2\u08a8\u08b7\u08bc\u08be\u08cb\u08d5\u08d7\u08e2"+
		"\u08ea\u08f1\u0905\u0909\u0936\u093c\u093f\u0944\u094d\u0954\u0967\u096d"+
		"\u0974\u0977\u0989\u098d\u0991\u0995\u0999\u099d\u09a1\u09aa\u09b2\u09b9"+
		"\u09bf\u09cc\u09d2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}