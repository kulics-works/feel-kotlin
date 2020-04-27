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
		Caret=58, Grave=59, TypeI8=60, TypeU8=61, TypeI16=62, TypeU16=63, TypeI32=64, 
		TypeU32=65, TypeI64=66, TypeU64=67, TypeF32=68, TypeF64=69, TypeChr=70, 
		TypeStr=71, TypeBool=72, TypeInt=73, TypeNum=74, TypeByte=75, TypeAny=76, 
		NilLiteral=77, TrueLiteral=78, FalseLiteral=79, UndefinedLiteral=80, FloatLiteral=81, 
		DecimalLiteral=82, BinaryLiteral=83, OctalLiteral=84, HexLiteral=85, Quote_Quote_Quote_Open=86, 
		Quote_Open=87, CharLiteral=88, IDPrivate=89, IDPublic=90, Discard=91, 
		Comment_Tag=92, Comment_Block=93, Comment_Line=94, New_Line=95, WS=96, 
		Quote_Close=97, String_Template_Open=98, TextLiteral=99, Quote_Quote_Quote_Close=100, 
		Raw_Quote=101, Raw_String_Template_Open=102, RawTextLiteral=103;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_exportStatement = 2, RULE_importStatement = 3, 
		RULE_namespaceSupportStatement = 4, RULE_typeAliasStatement = 5, RULE_typeRedefineStatement = 6, 
		RULE_typeTagStatement = 7, RULE_enumStatement = 8, RULE_enumSupportStatement = 9, 
		RULE_namespaceVariableStatement = 10, RULE_namespaceConstantStatement = 11, 
		RULE_namespaceFunctionStatement = 12, RULE_packageStatement = 13, RULE_packageStaticStatement = 14, 
		RULE_packageStaticSupportStatement = 15, RULE_packageStaticVariableStatement = 16, 
		RULE_packageStaticConstantStatement = 17, RULE_packageStaticFunctionStatement = 18, 
		RULE_packageFieldStatement = 19, RULE_packageSupportStatement = 20, RULE_includeStatement = 21, 
		RULE_packageNewStatement = 22, RULE_packageVariableStatement = 23, RULE_packageConstantStatement = 24, 
		RULE_packageFunctionStatement = 25, RULE_packageControlSubStatement = 26, 
		RULE_packageEventStatement = 27, RULE_implementStatement = 28, RULE_overrideVariableStatement = 29, 
		RULE_overrideConstantStatement = 30, RULE_overrideFunctionStatement = 31, 
		RULE_protocolStatement = 32, RULE_protocolSubStatement = 33, RULE_protocolSupportStatement = 34, 
		RULE_protocolVariableStatement = 35, RULE_protocolFunctionStatement = 36, 
		RULE_functionStatement = 37, RULE_returnStatement = 38, RULE_returnAsyncStatement = 39, 
		RULE_yieldReturnStatement = 40, RULE_yieldBreakStatement = 41, RULE_parameterClauseIn = 42, 
		RULE_parameterClauseOut = 43, RULE_parameter = 44, RULE_functionSupportStatement = 45, 
		RULE_judgeCaseStatement = 46, RULE_caseStatement = 47, RULE_caseExprStatement = 48, 
		RULE_judgeStatement = 49, RULE_judgeElseStatement = 50, RULE_judgeIfStatement = 51, 
		RULE_judgeElseIfStatement = 52, RULE_loopStatement = 53, RULE_loopEachStatement = 54, 
		RULE_loopCaseStatement = 55, RULE_loopElseStatement = 56, RULE_loopJumpStatement = 57, 
		RULE_loopContinueStatement = 58, RULE_checkStatement = 59, RULE_usingStatement = 60, 
		RULE_checkErrorStatement = 61, RULE_checkFinallyStatment = 62, RULE_checkReportStatement = 63, 
		RULE_iteratorStatement = 64, RULE_variableDeclaredStatement = 65, RULE_constantDeclaredStatement = 66, 
		RULE_varStatement = 67, RULE_bindStatement = 68, RULE_assignStatement = 69, 
		RULE_expressionStatement = 70, RULE_varId = 71, RULE_constId = 72, RULE_tupleExpression = 73, 
		RULE_primaryExpression = 74, RULE_expression = 75, RULE_callExpression = 76, 
		RULE_tuple = 77, RULE_expressionList = 78, RULE_annotationSupport = 79, 
		RULE_annotation = 80, RULE_annotationList = 81, RULE_annotationItem = 82, 
		RULE_callFunc = 83, RULE_callAsync = 84, RULE_callAwait = 85, RULE_callChannel = 86, 
		RULE_transfer = 87, RULE_callElement = 88, RULE_callPkg = 89, RULE_callNew = 90, 
		RULE_orElse = 91, RULE_typeConversion = 92, RULE_typeCheck = 93, RULE_pkgAssign = 94, 
		RULE_pkgAssignElement = 95, RULE_listAssign = 96, RULE_dictionaryAssign = 97, 
		RULE_list = 98, RULE_dictionary = 99, RULE_dictionaryElement = 100, RULE_slice = 101, 
		RULE_sliceFull = 102, RULE_sliceStart = 103, RULE_sliceEnd = 104, RULE_nameSpaceItem = 105, 
		RULE_name = 106, RULE_templateDefine = 107, RULE_templateDefineItem = 108, 
		RULE_templateCall = 109, RULE_lambda = 110, RULE_lambdaIn = 111, RULE_pkgAnonymous = 112, 
		RULE_pkgAnonymousAssign = 113, RULE_pkgAnonymousAssignElement = 114, RULE_functionExpression = 115, 
		RULE_plusMinus = 116, RULE_negate = 117, RULE_bitwiseNotExpression = 118, 
		RULE_linq = 119, RULE_linqHeadItem = 120, RULE_linqItem = 121, RULE_judgeExpression = 122, 
		RULE_judgeExpressionElseStatement = 123, RULE_judgeExpressionIfStatement = 124, 
		RULE_judgeExpressionElseIfStatement = 125, RULE_judgeCaseExpression = 126, 
		RULE_caseExpressionStatement = 127, RULE_loopExpression = 128, RULE_loopEachExpression = 129, 
		RULE_loopElseExpression = 130, RULE_checkExpression = 131, RULE_checkErrorExpression = 132, 
		RULE_dataStatement = 133, RULE_stringExpr = 134, RULE_stringContent = 135, 
		RULE_stringTemplate = 136, RULE_rawStringExpr = 137, RULE_rawStringContent = 138, 
		RULE_rawStringTemplate = 139, RULE_floatExpr = 140, RULE_integerExpr = 141, 
		RULE_typeNotNull = 142, RULE_typeType = 143, RULE_typeNullable = 144, 
		RULE_typeArray = 145, RULE_typeList = 146, RULE_typeSet = 147, RULE_typeDictionary = 148, 
		RULE_typeStack = 149, RULE_typeQueue = 150, RULE_typeChannel = 151, RULE_typePackage = 152, 
		RULE_typeFunction = 153, RULE_typeAny = 154, RULE_typeFunctionParameterClause = 155, 
		RULE_typeBasic = 156, RULE_nilExpr = 157, RULE_boolExpr = 158, RULE_bitwise = 159, 
		RULE_bitwiseAnd = 160, RULE_bitwiseOr = 161, RULE_bitwiseNot = 162, RULE_bitwiseXor = 163, 
		RULE_bitwiseLeftShift = 164, RULE_bitwiseRightShift = 165, RULE_compareCombine = 166, 
		RULE_compare = 167, RULE_logic = 168, RULE_assign = 169, RULE_add = 170, 
		RULE_mul = 171, RULE_pow = 172, RULE_call = 173, RULE_wave = 174, RULE_id = 175, 
		RULE_idItem = 176, RULE_end = 177, RULE_more = 178, RULE_left_brace = 179, 
		RULE_right_brace = 180, RULE_left_paren = 181, RULE_right_paren = 182, 
		RULE_left_brack = 183, RULE_right_brack = 184;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "exportStatement", "importStatement", "namespaceSupportStatement", 
			"typeAliasStatement", "typeRedefineStatement", "typeTagStatement", "enumStatement", 
			"enumSupportStatement", "namespaceVariableStatement", "namespaceConstantStatement", 
			"namespaceFunctionStatement", "packageStatement", "packageStaticStatement", 
			"packageStaticSupportStatement", "packageStaticVariableStatement", "packageStaticConstantStatement", 
			"packageStaticFunctionStatement", "packageFieldStatement", "packageSupportStatement", 
			"includeStatement", "packageNewStatement", "packageVariableStatement", 
			"packageConstantStatement", "packageFunctionStatement", "packageControlSubStatement", 
			"packageEventStatement", "implementStatement", "overrideVariableStatement", 
			"overrideConstantStatement", "overrideFunctionStatement", "protocolStatement", 
			"protocolSubStatement", "protocolSupportStatement", "protocolVariableStatement", 
			"protocolFunctionStatement", "functionStatement", "returnStatement", 
			"returnAsyncStatement", "yieldReturnStatement", "yieldBreakStatement", 
			"parameterClauseIn", "parameterClauseOut", "parameter", "functionSupportStatement", 
			"judgeCaseStatement", "caseStatement", "caseExprStatement", "judgeStatement", 
			"judgeElseStatement", "judgeIfStatement", "judgeElseIfStatement", "loopStatement", 
			"loopEachStatement", "loopCaseStatement", "loopElseStatement", "loopJumpStatement", 
			"loopContinueStatement", "checkStatement", "usingStatement", "checkErrorStatement", 
			"checkFinallyStatment", "checkReportStatement", "iteratorStatement", 
			"variableDeclaredStatement", "constantDeclaredStatement", "varStatement", 
			"bindStatement", "assignStatement", "expressionStatement", "varId", "constId", 
			"tupleExpression", "primaryExpression", "expression", "callExpression", 
			"tuple", "expressionList", "annotationSupport", "annotation", "annotationList", 
			"annotationItem", "callFunc", "callAsync", "callAwait", "callChannel", 
			"transfer", "callElement", "callPkg", "callNew", "orElse", "typeConversion", 
			"typeCheck", "pkgAssign", "pkgAssignElement", "listAssign", "dictionaryAssign", 
			"list", "dictionary", "dictionaryElement", "slice", "sliceFull", "sliceStart", 
			"sliceEnd", "nameSpaceItem", "name", "templateDefine", "templateDefineItem", 
			"templateCall", "lambda", "lambdaIn", "pkgAnonymous", "pkgAnonymousAssign", 
			"pkgAnonymousAssignElement", "functionExpression", "plusMinus", "negate", 
			"bitwiseNotExpression", "linq", "linqHeadItem", "linqItem", "judgeExpression", 
			"judgeExpressionElseStatement", "judgeExpressionIfStatement", "judgeExpressionElseIfStatement", 
			"judgeCaseExpression", "caseExpressionStatement", "loopExpression", "loopEachExpression", 
			"loopElseExpression", "checkExpression", "checkErrorExpression", "dataStatement", 
			"stringExpr", "stringContent", "stringTemplate", "rawStringExpr", "rawStringContent", 
			"rawStringTemplate", "floatExpr", "integerExpr", "typeNotNull", "typeType", 
			"typeNullable", "typeArray", "typeList", "typeSet", "typeDictionary", 
			"typeStack", "typeQueue", "typeChannel", "typePackage", "typeFunction", 
			"typeAny", "typeFunctionParameterClause", "typeBasic", "nilExpr", "boolExpr", 
			"bitwise", "bitwiseAnd", "bitwiseOr", "bitwiseNot", "bitwiseXor", "bitwiseLeftShift", 
			"bitwiseRightShift", "compareCombine", "compare", "logic", "assign", 
			"add", "mul", "pow", "call", "wave", "id", "idItem", "end", "more", "left_brace", 
			"right_brace", "left_paren", "right_paren", "left_brack", "right_brack"
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
			"'&'", "'|'", "'^'", "'`'", "'i8'", "'u8'", "'i16'", "'u16'", "'i32'", 
			"'u32'", "'i64'", "'u64'", "'f32'", "'f64'", "'chr'", "'str'", "'bool'", 
			"'int'", "'num'", "'byte'", "'any'", "'nil'", "'true'", "'false'", "'undef'", 
			null, null, null, null, null, null, null, null, null, null, "'_'"
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
			"Div", "Mod", "And", "Or", "Caret", "Grave", "TypeI8", "TypeU8", "TypeI16", 
			"TypeU16", "TypeI32", "TypeU32", "TypeI64", "TypeU64", "TypeF32", "TypeF64", 
			"TypeChr", "TypeStr", "TypeBool", "TypeInt", "TypeNum", "TypeByte", "TypeAny", 
			"NilLiteral", "TrueLiteral", "FalseLiteral", "UndefinedLiteral", "FloatLiteral", 
			"DecimalLiteral", "BinaryLiteral", "OctalLiteral", "HexLiteral", "Quote_Quote_Quote_Open", 
			"Quote_Open", "CharLiteral", "IDPrivate", "IDPublic", "Discard", "Comment_Tag", 
			"Comment_Block", "Comment_Line", "New_Line", "WS", "Quote_Close", "String_Template_Open", 
			"TextLiteral", "Quote_Quote_Quote_Close", "Raw_Quote", "Raw_String_Template_Open", 
			"RawTextLiteral"
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
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				statement();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Less - 36)) | (1L << (TypeI8 - 36)) | (1L << (TypeU8 - 36)) | (1L << (TypeI16 - 36)) | (1L << (TypeU16 - 36)) | (1L << (TypeI32 - 36)) | (1L << (TypeU32 - 36)) | (1L << (TypeI64 - 36)) | (1L << (TypeU64 - 36)) | (1L << (TypeF32 - 36)) | (1L << (TypeF64 - 36)) | (1L << (TypeChr - 36)) | (1L << (TypeStr - 36)) | (1L << (TypeBool - 36)) | (1L << (TypeInt - 36)) | (1L << (TypeNum - 36)) | (1L << (TypeByte - 36)) | (1L << (TypeAny - 36)) | (1L << (IDPrivate - 36)) | (1L << (IDPublic - 36)) | (1L << (New_Line - 36)))) != 0) );
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
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(375);
				match(New_Line);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(381);
				annotationSupport();
				}
			}

			setState(384);
			exportStatement();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(New_Line);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					namespaceSupportStatement();
					}
					} 
				}
				setState(396);
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
		public NameSpaceItemContext nameSpaceItem() {
			return getRuleContext(NameSpaceItemContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			nameSpaceItem();
			setState(398);
			call();
			setState(399);
			left_brace();
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(400);
						importStatement();
						}
						break;
					case 2:
						{
						setState(401);
						typeAliasStatement();
						}
						break;
					case 3:
						{
						setState(402);
						match(New_Line);
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(408);
			right_brace();
			setState(409);
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

	public static class ImportStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(411);
				annotationSupport();
				}
			}

			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(419);
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
					setState(414);
					id();
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Bang) {
						{
						setState(415);
						match(Bang);
						}
					}

					}
					break;
				case Discard:
					{
					setState(418);
					match(Discard);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421);
				match(Colon);
				}
				break;
			}
			setState(424);
			nameSpaceItem();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quote_Open) {
				{
				setState(425);
				stringExpr();
				}
			}

			setState(428);
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
		enterRule(_localctx, 8, RULE_namespaceSupportStatement);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				namespaceFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				namespaceVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				namespaceConstantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				packageStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				protocolStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				implementStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				enumStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				typeRedefineStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				typeTagStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
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
		enterRule(_localctx, 10, RULE_typeAliasStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			id();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(443);
				match(Bang);
				}
			}

			setState(446);
			match(Colon);
			setState(447);
			typeType();
			setState(448);
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
		enterRule(_localctx, 12, RULE_typeRedefineStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			id();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(451);
				match(Bang);
				}
			}

			setState(454);
			match(Colon);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(455);
				match(New_Line);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			typeType();
			setState(462);
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
		enterRule(_localctx, 14, RULE_typeTagStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		enterRule(_localctx, 16, RULE_enumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(466);
				annotationSupport();
				}
			}

			setState(469);
			id();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(470);
				match(Bang);
				}
			}

			setState(473);
			match(Colon);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(474);
				match(New_Line);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			left_brack();
			setState(481);
			match(Colon);
			setState(482);
			right_brack();
			setState(483);
			left_brace();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
				{
				{
				setState(484);
				enumSupportStatement();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			right_brace();
			setState(491);
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
		enterRule(_localctx, 18, RULE_enumSupportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			id();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(494);
				match(Colon);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Add || _la==Sub) {
					{
					setState(495);
					add();
					}
				}

				setState(498);
				integerExpr();
				}
			}

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
		enterRule(_localctx, 20, RULE_namespaceVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(503);
				annotationSupport();
				}
			}

			setState(506);
			id();
			setState(507);
			match(Bang);
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(508);
				match(Colon);
				setState(509);
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
				setState(510);
				typeType();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(511);
					match(Colon);
					setState(512);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(517);
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
		enterRule(_localctx, 22, RULE_namespaceConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(519);
				annotationSupport();
				}
			}

			setState(522);
			id();
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(523);
				match(Colon);
				setState(524);
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
				setState(525);
				typeType();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(526);
					match(Colon);
					setState(527);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532);
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
		enterRule(_localctx, 24, RULE_namespaceFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(534);
				annotationSupport();
				}
			}

			setState(543);
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
				setState(537);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(538);
				left_brack();
				setState(539);
				id();
				setState(540);
				templateDefine();
				setState(541);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(545);
			match(Colon);
			setState(546);
			left_paren();
			setState(547);
			parameterClauseIn();
			setState(548);
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
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(549);
				((NamespaceFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(552);
				((NamespaceFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(555);
				match(New_Line);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			parameterClauseOut();
			setState(562);
			right_paren();
			setState(563);
			left_brace();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					functionSupportStatement();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(570);
			right_brace();
			setState(571);
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
		enterRule(_localctx, 26, RULE_packageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(573);
				annotationSupport();
				}
			}

			setState(582);
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
				setState(576);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(577);
				left_brack();
				setState(578);
				id();
				setState(579);
				templateDefine();
				setState(580);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(584);
				match(Bang);
				}
			}

			setState(587);
			match(Colon);
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(588);
				packageNewStatement();
				}
				break;
			case 2:
				{
				setState(589);
				packageFieldStatement();
				}
				break;
			case 3:
				{
				setState(590);
				includeStatement();
				}
				break;
			case 4:
				{
				setState(591);
				packageStaticStatement();
				}
				break;
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Back_Forward_Slash) {
				{
				{
				setState(594);
				match(Back_Forward_Slash);
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(595);
					packageNewStatement();
					}
					break;
				case 2:
					{
					setState(596);
					packageFieldStatement();
					}
					break;
				case 3:
					{
					setState(597);
					includeStatement();
					}
					break;
				case 4:
					{
					setState(598);
					packageStaticStatement();
					}
					break;
				}
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
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
		enterRule(_localctx, 28, RULE_packageStaticStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			left_brace();
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(609);
					packageStaticSupportStatement();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(615);
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
		enterRule(_localctx, 30, RULE_packageStaticSupportStatement);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				packageStaticFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				packageStaticVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				packageStaticConstantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
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
		enterRule(_localctx, 32, RULE_packageStaticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(623);
				annotationSupport();
				}
			}

			setState(626);
			id();
			setState(627);
			match(Bang);
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(628);
				match(Colon);
				setState(629);
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
				setState(630);
				typeType();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(631);
					match(Colon);
					setState(632);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(637);
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
		enterRule(_localctx, 34, RULE_packageStaticConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(639);
				annotationSupport();
				}
			}

			setState(642);
			id();
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(643);
				match(Colon);
				setState(644);
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
				setState(645);
				typeType();
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(646);
					match(Colon);
					setState(647);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(652);
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
		enterRule(_localctx, 36, RULE_packageStaticFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(654);
				annotationSupport();
				}
			}

			setState(663);
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
				setState(657);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(658);
				left_brack();
				setState(659);
				id();
				setState(660);
				templateDefine();
				setState(661);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(665);
			match(Colon);
			setState(666);
			left_paren();
			setState(667);
			parameterClauseIn();
			setState(668);
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
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(669);
				((PackageStaticFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(672);
				((PackageStaticFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(675);
				match(New_Line);
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			parameterClauseOut();
			setState(682);
			right_paren();
			setState(683);
			left_brace();
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(684);
					functionSupportStatement();
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(690);
			right_brace();
			setState(691);
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
		enterRule(_localctx, 38, RULE_packageFieldStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(Coin);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (Question - 46)) | (1L << (TypeI8 - 46)) | (1L << (TypeU8 - 46)) | (1L << (TypeI16 - 46)) | (1L << (TypeU16 - 46)) | (1L << (TypeI32 - 46)) | (1L << (TypeU32 - 46)) | (1L << (TypeI64 - 46)) | (1L << (TypeU64 - 46)) | (1L << (TypeF32 - 46)) | (1L << (TypeF64 - 46)) | (1L << (TypeChr - 46)) | (1L << (TypeStr - 46)) | (1L << (TypeBool - 46)) | (1L << (TypeInt - 46)) | (1L << (TypeNum - 46)) | (1L << (TypeByte - 46)) | (1L << (TypeAny - 46)) | (1L << (IDPrivate - 46)) | (1L << (IDPublic - 46)))) != 0)) {
				{
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Question) {
					{
					setState(694);
					((PackageFieldStatementContext)_localctx).p = match(Question);
					}
				}

				setState(697);
				id();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(698);
					more();
					setState(699);
					id();
					}
				}

				}
			}

			setState(705);
			left_brace();
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(706);
					packageSupportStatement();
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(712);
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
		enterRule(_localctx, 40, RULE_packageSupportStatement);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				packageFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				packageVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				packageConstantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				packageEventStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				overrideFunctionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				overrideVariableStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				overrideConstantStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(721);
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
		enterRule(_localctx, 42, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
		enterRule(_localctx, 44, RULE_packageNewStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(726);
				annotationSupport();
				}
			}

			setState(729);
			left_paren();
			setState(730);
			parameterClauseIn();
			setState(731);
			match(Right_Arrow);
			setState(732);
			match(Coin);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(733);
				((PackageNewStatementContext)_localctx).p = match(Question);
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
				{
				setState(736);
				id();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(737);
					more();
					setState(738);
					id();
					}
				}

				}
			}

			setState(744);
			right_paren();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Paren) {
				{
				setState(745);
				left_paren();
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					setState(746);
					expressionList();
					}
				}

				setState(749);
				right_paren();
				}
			}

			setState(753);
			left_brace();
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754);
					functionSupportStatement();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(760);
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
		enterRule(_localctx, 46, RULE_packageVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(762);
				annotationSupport();
				}
			}

			setState(765);
			id();
			setState(766);
			match(Bang);
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(767);
				match(Colon);
				setState(768);
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
				setState(769);
				typeType();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(770);
					match(Colon);
					setState(771);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(776);
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
		enterRule(_localctx, 48, RULE_packageConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(778);
				annotationSupport();
				}
			}

			setState(781);
			id();
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(782);
				match(Colon);
				setState(783);
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
				setState(784);
				typeType();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(785);
					match(Colon);
					setState(786);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(791);
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
		enterRule(_localctx, 50, RULE_packageFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(793);
				annotationSupport();
				}
			}

			setState(802);
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
				setState(796);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(797);
				left_brack();
				setState(798);
				id();
				setState(799);
				templateDefine();
				setState(800);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(804);
			match(Colon);
			setState(805);
			left_paren();
			setState(806);
			parameterClauseIn();
			setState(807);
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
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(808);
				((PackageFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(811);
				((PackageFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(814);
				match(New_Line);
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			parameterClauseOut();
			setState(821);
			right_paren();
			setState(822);
			left_brace();
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(823);
					functionSupportStatement();
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(829);
			right_brace();
			setState(830);
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
		enterRule(_localctx, 52, RULE_packageControlSubStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			id();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Paren) {
				{
				setState(833);
				left_paren();
				setState(834);
				id();
				setState(835);
				right_paren();
				}
			}

			setState(839);
			left_brace();
			setState(841); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(840);
					functionSupportStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(843); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(845);
			right_brace();
			setState(846);
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
		enterRule(_localctx, 54, RULE_packageEventStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			id();
			setState(849);
			match(Bang);
			setState(850);
			left_brack();
			setState(851);
			match(Right_Arrow);
			setState(852);
			right_brack();
			setState(853);
			nameSpaceItem();
			setState(854);
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
		enterRule(_localctx, 56, RULE_implementStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
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
				setState(856);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(857);
				left_brack();
				setState(858);
				id();
				setState(859);
				templateDefine();
				setState(860);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(864);
			match(Colon_Equal);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(865);
				packageNewStatement();
				}
				break;
			case 2:
				{
				setState(866);
				packageFieldStatement();
				}
				break;
			case 3:
				{
				setState(867);
				includeStatement();
				}
				break;
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Back_Forward_Slash) {
				{
				{
				setState(870);
				match(Back_Forward_Slash);
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(871);
					packageNewStatement();
					}
					break;
				case 2:
					{
					setState(872);
					packageFieldStatement();
					}
					break;
				case 3:
					{
					setState(873);
					includeStatement();
					}
					break;
				}
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(881);
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
		enterRule(_localctx, 58, RULE_overrideVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(883);
				annotationSupport();
				}
			}

			setState(886);
			match(Dot);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(887);
				((OverrideVariableStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(890);
			id();
			setState(891);
			match(Bang);
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(892);
				match(Colon);
				setState(893);
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
				setState(894);
				typeType();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(895);
					match(Colon);
					setState(896);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(901);
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
		enterRule(_localctx, 60, RULE_overrideConstantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(903);
				annotationSupport();
				}
			}

			setState(906);
			match(Dot);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(907);
				((OverrideConstantStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(910);
			id();
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(911);
				match(Colon);
				setState(912);
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
				setState(913);
				typeType();
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(914);
					match(Colon);
					setState(915);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(920);
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
		enterRule(_localctx, 62, RULE_overrideFunctionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(922);
				annotationSupport();
				}
			}

			setState(925);
			match(Dot);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(926);
				((OverrideFunctionStatementContext)_localctx).n = match(Discard);
				}
			}

			setState(935);
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
				setState(929);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(930);
				left_brack();
				setState(931);
				id();
				setState(932);
				templateDefine();
				setState(933);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(937);
			match(Colon);
			setState(938);
			left_paren();
			setState(939);
			parameterClauseIn();
			setState(940);
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
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(941);
				((OverrideFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(944);
				((OverrideFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(947);
				match(New_Line);
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
			parameterClauseOut();
			setState(954);
			right_paren();
			setState(955);
			left_brace();
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					functionSupportStatement();
					}
					} 
				}
				setState(961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(962);
			right_brace();
			setState(963);
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
		enterRule(_localctx, 64, RULE_protocolStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(965);
				annotationSupport();
				}
			}

			setState(974);
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
				setState(968);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(969);
				left_brack();
				setState(970);
				id();
				setState(971);
				templateDefine();
				setState(972);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(976);
				match(Bang);
				}
			}

			setState(979);
			match(Colon);
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Coin:
				{
				setState(980);
				protocolSubStatement();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Back_Forward_Slash) {
					{
					{
					setState(981);
					match(Back_Forward_Slash);
					setState(984);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Coin:
						{
						setState(982);
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
						setState(983);
						includeStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(990);
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
				setState(991);
				includeStatement();
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(992);
						match(Back_Forward_Slash);
						setState(995);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Coin:
							{
							setState(993);
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
							setState(994);
							includeStatement();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1001);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(1002);
				match(Back_Forward_Slash);
				setState(1003);
				protocolSubStatement();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Back_Forward_Slash) {
					{
					{
					setState(1004);
					match(Back_Forward_Slash);
					setState(1007);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Coin:
						{
						setState(1005);
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
						setState(1006);
						includeStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1016);
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
		enterRule(_localctx, 66, RULE_protocolSubStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(Coin);
			setState(1019);
			match(Coin);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (Question - 46)) | (1L << (TypeI8 - 46)) | (1L << (TypeU8 - 46)) | (1L << (TypeI16 - 46)) | (1L << (TypeU16 - 46)) | (1L << (TypeI32 - 46)) | (1L << (TypeU32 - 46)) | (1L << (TypeI64 - 46)) | (1L << (TypeU64 - 46)) | (1L << (TypeF32 - 46)) | (1L << (TypeF64 - 46)) | (1L << (TypeChr - 46)) | (1L << (TypeStr - 46)) | (1L << (TypeBool - 46)) | (1L << (TypeInt - 46)) | (1L << (TypeNum - 46)) | (1L << (TypeByte - 46)) | (1L << (TypeAny - 46)) | (1L << (IDPrivate - 46)) | (1L << (IDPublic - 46)))) != 0)) {
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Question) {
					{
					setState(1020);
					((ProtocolSubStatementContext)_localctx).p = match(Question);
					}
				}

				setState(1023);
				id();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1024);
					more();
					setState(1025);
					id();
					}
				}

				}
			}

			setState(1031);
			left_brace();
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1032);
					protocolSupportStatement();
					}
					} 
				}
				setState(1037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1038);
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
		enterRule(_localctx, 68, RULE_protocolSupportStatement);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				protocolFunctionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				protocolVariableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1042);
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
		enterRule(_localctx, 70, RULE_protocolVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(1045);
				annotationSupport();
				}
			}

			setState(1048);
			id();
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1049);
				match(Bang);
				}
			}

			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				{
				setState(1052);
				match(Colon);
				setState(1053);
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
				setState(1054);
				typeType();
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1055);
					match(Colon);
					setState(1056);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1061);
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
		enterRule(_localctx, 72, RULE_protocolFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(1063);
				annotationSupport();
				}
			}

			setState(1072);
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
				setState(1066);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1067);
				left_brack();
				setState(1068);
				id();
				setState(1069);
				templateDefine();
				setState(1070);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1074);
			left_paren();
			setState(1075);
			parameterClauseIn();
			setState(1076);
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
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1077);
				((ProtocolFunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1080);
				((ProtocolFunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1083);
				match(New_Line);
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			parameterClauseOut();
			setState(1090);
			right_paren();
			setState(1091);
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
		enterRule(_localctx, 74, RULE_functionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
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
				setState(1093);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1094);
				left_brack();
				setState(1095);
				id();
				setState(1096);
				templateDefine();
				setState(1097);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1101);
			match(Colon);
			setState(1102);
			left_paren();
			setState(1103);
			parameterClauseIn();
			setState(1104);
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
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1105);
				((FunctionStatementContext)_localctx).b = match(Bang);
				}
			}

			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1108);
				((FunctionStatementContext)_localctx).y = match(At);
				}
			}

			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1111);
				match(New_Line);
				}
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1117);
			parameterClauseOut();
			setState(1118);
			right_paren();
			setState(1119);
			left_brace();
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					functionSupportStatement();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1126);
			right_brace();
			setState(1127);
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
		enterRule(_localctx, 76, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(Left_Arrow);
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1130);
				tupleExpression();
				}
			}

			setState(1133);
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
		enterRule(_localctx, 78, RULE_returnAsyncStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(Left_Flow);
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1136);
				tupleExpression();
				}
			}

			setState(1139);
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
		enterRule(_localctx, 80, RULE_yieldReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(At);
			setState(1142);
			match(Left_Arrow);
			setState(1143);
			tupleExpression();
			setState(1144);
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
		enterRule(_localctx, 82, RULE_yieldBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(At);
			setState(1147);
			match(Left_Arrow);
			setState(1148);
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
		enterRule(_localctx, 84, RULE_parameterClauseIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Less - 36)) | (1L << (TypeI8 - 36)) | (1L << (TypeU8 - 36)) | (1L << (TypeI16 - 36)) | (1L << (TypeU16 - 36)) | (1L << (TypeI32 - 36)) | (1L << (TypeU32 - 36)) | (1L << (TypeI64 - 36)) | (1L << (TypeU64 - 36)) | (1L << (TypeF32 - 36)) | (1L << (TypeF64 - 36)) | (1L << (TypeChr - 36)) | (1L << (TypeStr - 36)) | (1L << (TypeBool - 36)) | (1L << (TypeInt - 36)) | (1L << (TypeNum - 36)) | (1L << (TypeByte - 36)) | (1L << (TypeAny - 36)) | (1L << (IDPrivate - 36)) | (1L << (IDPublic - 36)))) != 0)) {
				{
				setState(1150);
				parameter();
				}
			}

			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1153);
				more();
				setState(1154);
				parameter();
				}
				}
				setState(1160);
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
		enterRule(_localctx, 86, RULE_parameterClauseOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Less - 36)) | (1L << (TypeI8 - 36)) | (1L << (TypeU8 - 36)) | (1L << (TypeI16 - 36)) | (1L << (TypeU16 - 36)) | (1L << (TypeI32 - 36)) | (1L << (TypeU32 - 36)) | (1L << (TypeI64 - 36)) | (1L << (TypeU64 - 36)) | (1L << (TypeF32 - 36)) | (1L << (TypeF64 - 36)) | (1L << (TypeChr - 36)) | (1L << (TypeStr - 36)) | (1L << (TypeBool - 36)) | (1L << (TypeInt - 36)) | (1L << (TypeNum - 36)) | (1L << (TypeByte - 36)) | (1L << (TypeAny - 36)) | (1L << (IDPrivate - 36)) | (1L << (IDPublic - 36)))) != 0)) {
				{
				setState(1161);
				parameter();
				}
			}

			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1164);
				more();
				setState(1165);
				parameter();
				}
				}
				setState(1171);
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
		enterRule(_localctx, 88, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(1172);
				annotationSupport();
				}
			}

			setState(1175);
			id();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1176);
				match(Bang);
				}
			}

			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma_Comma_Comma || _la==Comma_Comma) {
				{
				setState(1179);
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

			setState(1182);
			typeType();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1183);
				match(Colon);
				setState(1184);
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
		enterRule(_localctx, 90, RULE_functionSupportStatement);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				returnAsyncStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				yieldReturnStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1190);
				yieldBreakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1191);
				judgeCaseStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1192);
				judgeStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1193);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1194);
				loopEachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1195);
				loopCaseStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1196);
				loopJumpStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1197);
				loopContinueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1198);
				usingStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1199);
				checkStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1200);
				checkReportStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1201);
				functionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1202);
				variableDeclaredStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1203);
				constantDeclaredStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1204);
				varStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1205);
				bindStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1206);
				assignStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1207);
				expressionStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1208);
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
		enterRule(_localctx, 92, RULE_judgeCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(Question);
			setState(1212);
			expression(0);
			setState(1213);
			match(Colon);
			setState(1215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1214);
				caseStatement();
				}
				}
				setState(1217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0) );
			setState(1219);
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
		enterRule(_localctx, 94, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			caseExprStatement();
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1222);
				more();
				setState(1223);
				caseExprStatement();
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1230);
			left_brace();
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1231);
					functionSupportStatement();
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1237);
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
		enterRule(_localctx, 96, RULE_caseExprStatement);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				match(Discard);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243);
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
					setState(1241);
					id();
					}
					break;
				case Discard:
					{
					setState(1242);
					match(Discard);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1245);
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
		enterRule(_localctx, 98, RULE_judgeStatement);
		int _la;
		try {
			int _alt;
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				judgeIfStatement();
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1249);
						judgeElseIfStatement();
						}
						} 
					}
					setState(1254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1255);
				judgeElseStatement();
				setState(1256);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				judgeIfStatement();
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					{
					setState(1259);
					judgeElseIfStatement();
					}
					}
					setState(1264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1265);
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
		enterRule(_localctx, 100, RULE_judgeElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(Discard);
			setState(1270);
			left_brace();
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1271);
					functionSupportStatement();
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1277);
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
		enterRule(_localctx, 102, RULE_judgeIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(Question);
			setState(1280);
			expression(0);
			setState(1281);
			left_brace();
			setState(1285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		enterRule(_localctx, 104, RULE_judgeElseIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			expression(0);
			setState(1291);
			left_brace();
			setState(1295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1292);
					functionSupportStatement();
					}
					} 
				}
				setState(1297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1298);
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
		enterRule(_localctx, 106, RULE_loopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(At);
			setState(1301);
			id();
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1302);
				match(Bang);
				}
			}

			setState(1305);
			match(Colon);
			setState(1306);
			iteratorStatement();
			setState(1307);
			left_brace();
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1308);
					functionSupportStatement();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1314);
			right_brace();
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1315);
				loopElseStatement();
				}
			}

			setState(1318);
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
		enterRule(_localctx, 108, RULE_loopEachStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(At);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Left_Brack) {
				{
				setState(1321);
				left_brack();
				setState(1322);
				id();
				setState(1323);
				right_brack();
				}
			}

			setState(1327);
			id();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1328);
				match(Bang);
				}
			}

			setState(1331);
			match(Colon);
			setState(1332);
			expression(0);
			setState(1333);
			left_brace();
			setState(1337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1334);
					functionSupportStatement();
					}
					} 
				}
				setState(1339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1340);
			right_brace();
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1341);
				loopElseStatement();
				}
			}

			setState(1344);
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
		enterRule(_localctx, 110, RULE_loopCaseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(At);
			setState(1347);
			expression(0);
			setState(1348);
			left_brace();
			setState(1352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1349);
					functionSupportStatement();
					}
					} 
				}
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1355);
			right_brace();
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Discard) {
				{
				setState(1356);
				loopElseStatement();
				}
			}

			setState(1359);
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
		enterRule(_localctx, 112, RULE_loopElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(Discard);
			setState(1362);
			left_brace();
			setState(1366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1363);
					functionSupportStatement();
					}
					} 
				}
				setState(1368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1369);
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
		enterRule(_localctx, 114, RULE_loopJumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(Tilde);
			setState(1372);
			match(At);
			setState(1373);
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
		enterRule(_localctx, 116, RULE_loopContinueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(Right_Arrow);
			setState(1376);
			match(At);
			setState(1377);
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
		enterRule(_localctx, 118, RULE_checkStatement);
		int _la;
		try {
			int _alt;
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				match(Bang);
				setState(1380);
				left_brace();
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1381);
						functionSupportStatement();
						}
						} 
					}
					setState(1386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1387);
				right_brace();
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
					{
					{
					setState(1388);
					checkErrorStatement();
					}
					}
					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1394);
				checkFinallyStatment();
				setState(1395);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				match(Bang);
				setState(1398);
				left_brace();
				setState(1402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1399);
						functionSupportStatement();
						}
						} 
					}
					setState(1404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1405);
				right_brace();
				setState(1407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1406);
					checkErrorStatement();
					}
					}
					setState(1409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0) );
				setState(1411);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(KParser.Colon, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
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
		enterRule(_localctx, 120, RULE_usingStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(Bang);
			setState(1416);
			expression(0);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1417);
				match(Bang);
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				setState(1420);
				typeType();
				}
			}

			setState(1423);
			match(Colon);
			setState(1424);
			expression(0);
			setState(1425);
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
		enterRule(_localctx, 122, RULE_checkErrorStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1427);
				id();
				}
				break;
			case 2:
				{
				setState(1428);
				id();
				setState(1429);
				typeType();
				}
				break;
			}
			setState(1433);
			left_brace();
			setState(1437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1434);
					functionSupportStatement();
					}
					} 
				}
				setState(1439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1440);
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
		enterRule(_localctx, 124, RULE_checkFinallyStatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(Discard);
			setState(1443);
			left_brace();
			setState(1447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1444);
					functionSupportStatement();
					}
					} 
				}
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1450);
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
		enterRule(_localctx, 126, RULE_checkReportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(Bang);
			setState(1453);
			match(Left_Arrow);
			setState(1454);
			expression(0);
			setState(1455);
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
		enterRule(_localctx, 128, RULE_iteratorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			expression(0);
			setState(1458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1459);
				left_paren();
				setState(1460);
				expression(0);
				setState(1461);
				right_paren();
				}
				break;
			}
			setState(1465);
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
		enterRule(_localctx, 130, RULE_variableDeclaredStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			id();
			setState(1468);
			match(Bang);
			setState(1469);
			typeType();
			setState(1470);
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
		enterRule(_localctx, 132, RULE_constantDeclaredStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			id();
			setState(1473);
			typeType();
			setState(1474);
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
		enterRule(_localctx, 134, RULE_varStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			varId();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1477);
				more();
				setState(1478);
				varId();
				}
				}
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1485);
			match(Colon);
			setState(1486);
			tupleExpression();
			setState(1487);
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
		enterRule(_localctx, 136, RULE_bindStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			constId();
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1490);
				more();
				setState(1491);
				constId();
				}
				}
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1498);
			match(Colon);
			setState(1499);
			tupleExpression();
			setState(1500);
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
		enterRule(_localctx, 138, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			tupleExpression();
			setState(1503);
			assign();
			setState(1504);
			tupleExpression();
			setState(1505);
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
		enterRule(_localctx, 140, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			expression(0);
			setState(1508);
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
		enterRule(_localctx, 142, RULE_varId);
		int _la;
		try {
			setState(1516);
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
				setState(1510);
				id();
				setState(1511);
				match(Bang);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
					{
					setState(1512);
					typeType();
					}
				}

				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
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
		enterRule(_localctx, 144, RULE_constId);
		int _la;
		try {
			setState(1523);
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
				setState(1518);
				id();
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
					{
					setState(1519);
					typeType();
					}
				}

				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
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
		enterRule(_localctx, 146, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			expression(0);
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1526);
				more();
				setState(1527);
				expression(0);
				}
				}
				setState(1533);
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
		enterRule(_localctx, 148, RULE_primaryExpression);
		try {
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Brack:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534);
				left_brack();
				setState(1535);
				id();
				setState(1536);
				templateCall();
				setState(1537);
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
				setState(1539);
				id();
				}
				break;
			case Discard:
				enterOuterAlt(_localctx, 3);
				{
				setState(1540);
				((PrimaryExpressionContext)_localctx).t = match(Discard);
				}
				break;
			case Left_Paren:
				enterOuterAlt(_localctx, 4);
				{
				setState(1541);
				left_paren();
				setState(1542);
				expression(0);
				setState(1543);
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
				setState(1545);
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
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1549);
				linq();
				}
				break;
			case 2:
				{
				setState(1550);
				primaryExpression();
				}
				break;
			case 3:
				{
				setState(1551);
				callPkg();
				}
				break;
			case 4:
				{
				setState(1552);
				callChannel();
				}
				break;
			case 5:
				{
				setState(1553);
				callAsync();
				}
				break;
			case 6:
				{
				setState(1554);
				list();
				}
				break;
			case 7:
				{
				setState(1555);
				dictionary();
				}
				break;
			case 8:
				{
				setState(1556);
				lambda();
				}
				break;
			case 9:
				{
				setState(1557);
				functionExpression();
				}
				break;
			case 10:
				{
				setState(1558);
				pkgAnonymous();
				}
				break;
			case 11:
				{
				setState(1559);
				plusMinus();
				}
				break;
			case 12:
				{
				setState(1560);
				bitwiseNotExpression();
				}
				break;
			case 13:
				{
				setState(1561);
				negate();
				}
				break;
			case 14:
				{
				setState(1562);
				judgeExpression();
				}
				break;
			case 15:
				{
				setState(1563);
				judgeCaseExpression();
				}
				break;
			case 16:
				{
				setState(1564);
				loopExpression();
				}
				break;
			case 17:
				{
				setState(1565);
				loopEachExpression();
				}
				break;
			case 18:
				{
				setState(1566);
				checkExpression();
				}
				break;
			case 19:
				{
				setState(1567);
				callNew();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1622);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1570);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1571);
						transfer();
						setState(1572);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1574);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1575);
						pow();
						setState(1576);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1578);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1579);
						mul();
						setState(1580);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1582);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1583);
						add();
						setState(1584);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1586);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1587);
						bitwise();
						setState(1588);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1590);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1591);
						compareCombine();
						setState(1592);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1594);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1595);
						compare();
						setState(1596);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1598);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1599);
						logic();
						setState(1600);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1602);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1603);
						((ExpressionContext)_localctx).op = match(Bang);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1604);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1605);
						((ExpressionContext)_localctx).op = match(Question);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1606);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1607);
						orElse();
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1608);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1609);
						callFunc();
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1610);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1611);
						callChannel();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1612);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1613);
						callElement();
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1614);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1615);
						callAwait();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1616);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1617);
						callExpression();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1618);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1619);
						typeConversion();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1620);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1621);
						typeCheck();
						}
						break;
					}
					} 
				}
				setState(1626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 152, RULE_callExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			call();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1628);
				match(New_Line);
				}
			}

			setState(1637);
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
				setState(1631);
				id();
				}
				break;
			case Left_Brack:
				{
				setState(1632);
				left_brack();
				setState(1633);
				id();
				setState(1634);
				templateCall();
				setState(1635);
				right_brack();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1639);
				callFunc();
				}
				break;
			case 2:
				{
				setState(1640);
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
		enterRule(_localctx, 154, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			left_paren();
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1644);
				expression(0);
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1645);
					more();
					setState(1646);
					expression(0);
					}
					}
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1655);
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
		enterRule(_localctx, 156, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			expression(0);
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1658);
				more();
				setState(1659);
				expression(0);
				}
				}
				setState(1665);
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
		public TerminalNode New_Line() { return getToken(KParser.New_Line, 0); }
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
		enterRule(_localctx, 158, RULE_annotationSupport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			annotation();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1667);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(KParser.Less, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(KParser.Greater, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Right_Arrow() { return getToken(KParser.Right_Arrow, 0); }
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
		enterRule(_localctx, 160, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(Less);
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1671);
				id();
				setState(1672);
				match(Right_Arrow);
				}
				break;
			}
			setState(1676);
			annotationList();
			setState(1677);
			match(Greater);
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
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
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
		enterRule(_localctx, 162, RULE_annotationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1679);
					annotationItem();
					setState(1680);
					end();
					}
					} 
				}
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1687);
			annotationItem();
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 164, RULE_annotationItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			id();
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
				{
				setState(1690);
				tuple();
				}
				break;
			case Left_Brace:
				{
				setState(1691);
				lambda();
				}
				break;
			case Greater:
			case Semi:
			case New_Line:
				break;
			default:
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
		enterRule(_localctx, 166, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
				{
				setState(1694);
				tuple();
				}
				break;
			case Left_Brace:
				{
				setState(1695);
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
		enterRule(_localctx, 168, RULE_callAsync);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(Right_Wave);
			setState(1699);
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
		enterRule(_localctx, 170, RULE_callAwait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(Right_Wave);
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Left_Paren:
				{
				setState(1702);
				tuple();
				}
				break;
			case Left_Brace:
				{
				setState(1703);
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
		enterRule(_localctx, 172, RULE_callChannel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(Left_Wave);
			setState(1707);
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
		enterRule(_localctx, 174, RULE_transfer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
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
		enterRule(_localctx, 176, RULE_callElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			left_brack();
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1712);
				slice();
				}
				break;
			case 2:
				{
				setState(1713);
				expression(0);
				}
				break;
			}
			setState(1716);
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
		enterRule(_localctx, 178, RULE_callPkg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			typeType();
			setState(1719);
			left_brace();
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1720);
				pkgAssign();
				}
				break;
			case 2:
				{
				setState(1721);
				listAssign();
				}
				break;
			case 3:
				{
				setState(1722);
				dictionaryAssign();
				}
				break;
			}
			setState(1725);
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
		enterRule(_localctx, 180, RULE_callNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			typeType();
			setState(1728);
			left_paren();
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1729);
				match(New_Line);
				}
				break;
			}
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
				{
				setState(1732);
				expressionList();
				}
			}

			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1735);
				match(New_Line);
				}
			}

			setState(1738);
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
		enterRule(_localctx, 182, RULE_orElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(Question);
			setState(1741);
			match(Question);
			setState(1742);
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
		enterRule(_localctx, 184, RULE_typeConversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			typeType();
			setState(1745);
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
		enterRule(_localctx, 186, RULE_typeCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			typeType();
			setState(1748);
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
		enterRule(_localctx, 188, RULE_pkgAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1750);
					pkgAssignElement();
					setState(1751);
					end();
					}
					} 
				}
				setState(1757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			setState(1758);
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
		enterRule(_localctx, 190, RULE_pkgAssignElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			name();
			setState(1761);
			match(Equal);
			setState(1762);
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
		enterRule(_localctx, 192, RULE_listAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1764);
					expression(0);
					setState(1765);
					end();
					}
					} 
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
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
		enterRule(_localctx, 194, RULE_dictionaryAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1774);
					dictionaryElement();
					setState(1775);
					end();
					}
					} 
				}
				setState(1781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1782);
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
		enterRule(_localctx, 196, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			left_brace();
			setState(1790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1785);
					expression(0);
					setState(1786);
					end();
					}
					} 
				}
				setState(1792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			setState(1793);
			expression(0);
			setState(1794);
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
		enterRule(_localctx, 198, RULE_dictionary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			left_brace();
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1797);
					dictionaryElement();
					setState(1798);
					end();
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1805);
			dictionaryElement();
			setState(1806);
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
		enterRule(_localctx, 200, RULE_dictionaryElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			left_brack();
			setState(1809);
			expression(0);
			setState(1810);
			right_brack();
			setState(1811);
			match(Equal);
			setState(1812);
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
		enterRule(_localctx, 202, RULE_slice);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				sliceStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1815);
				sliceEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1816);
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
		enterRule(_localctx, 204, RULE_sliceFull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			expression(0);
			setState(1820);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1821);
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
		enterRule(_localctx, 206, RULE_sliceStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			expression(0);
			setState(1824);
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
		enterRule(_localctx, 208, RULE_sliceEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot_Dot_Dot) | (1L << Dot_Dot_Less) | (1L << Dot_Dot_Greater) | (1L << Dot_Dot))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1827);
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
		enterRule(_localctx, 210, RULE_nameSpaceItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					id();
					setState(1830);
					call();
					setState(1832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==New_Line) {
						{
						setState(1831);
						match(New_Line);
						}
					}

					}
					} 
				}
				setState(1838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			setState(1839);
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
		enterRule(_localctx, 212, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			id();
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(1842);
				call();
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New_Line) {
					{
					setState(1843);
					match(New_Line);
					}
				}

				setState(1846);
				id();
				}
				}
				setState(1852);
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
		enterRule(_localctx, 214, RULE_templateDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				{
				setState(1853);
				templateDefineItem();
				}
				}
				setState(1858);
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
		enterRule(_localctx, 216, RULE_templateDefineItem);
		try {
			setState(1865);
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
				setState(1859);
				id();
				}
				break;
			case Left_Paren:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				left_paren();
				setState(1861);
				id();
				setState(1862);
				id();
				setState(1863);
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
		enterRule(_localctx, 218, RULE_templateCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				{
				setState(1867);
				typeType();
				}
				}
				setState(1872);
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
		enterRule(_localctx, 220, RULE_lambda);
		int _la;
		try {
			int _alt;
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				left_brace();
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
					{
					setState(1874);
					lambdaIn();
					}
				}

				setState(1877);
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
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==New_Line) {
					{
					{
					setState(1878);
					match(New_Line);
					}
					}
					setState(1883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1884);
				tupleExpression();
				setState(1885);
				right_brace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				left_brace();
				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
					{
					setState(1888);
					lambdaIn();
					}
				}

				setState(1891);
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
				setState(1895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1892);
						match(New_Line);
						}
						} 
					}
					setState(1897);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				}
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1898);
						functionSupportStatement();
						}
						} 
					}
					setState(1903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				}
				setState(1904);
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
		enterRule(_localctx, 222, RULE_lambdaIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			id();
			setState(1914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1909);
				more();
				setState(1910);
				id();
				}
				}
				setState(1916);
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
		enterRule(_localctx, 224, RULE_pkgAnonymous);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
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
		enterRule(_localctx, 226, RULE_pkgAnonymousAssign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			left_brace();
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1920);
					pkgAnonymousAssignElement();
					setState(1921);
					end();
					}
					} 
				}
				setState(1927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			setState(1928);
			pkgAnonymousAssignElement();
			setState(1929);
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
		enterRule(_localctx, 228, RULE_pkgAnonymousAssignElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			name();
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1932);
				match(Bang);
				}
			}

			setState(1935);
			((PkgAnonymousAssignElementContext)_localctx).t = match(Colon);
			setState(1936);
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
		enterRule(_localctx, 230, RULE_functionExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			left_paren();
			setState(1939);
			parameterClauseIn();
			setState(1940);
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
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1941);
				((FunctionExpressionContext)_localctx).b = match(Bang);
				}
			}

			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1944);
				((FunctionExpressionContext)_localctx).y = match(At);
				}
			}

			setState(1950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(1947);
				match(New_Line);
				}
				}
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1953);
			parameterClauseOut();
			setState(1954);
			right_paren();
			setState(1955);
			left_brace();
			setState(1959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1956);
					functionSupportStatement();
					}
					} 
				}
				setState(1961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			setState(1962);
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
		enterRule(_localctx, 232, RULE_plusMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			add();
			setState(1965);
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
		enterRule(_localctx, 234, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			wave();
			setState(1968);
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
		enterRule(_localctx, 236, RULE_bitwiseNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			bitwiseNot();
			setState(1971);
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
		enterRule(_localctx, 238, RULE_linq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			linqHeadItem();
			setState(1974);
			match(Right_Arrow);
			setState(1976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1975);
				match(New_Line);
				}
			}

			setState(1981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1978);
					linqItem();
					}
					} 
				}
				setState(1983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1984);
			id();
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(1985);
				match(New_Line);
				}
			}

			setState(1988);
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
		enterRule(_localctx, 240, RULE_linqHeadItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(At);
			setState(1991);
			id();
			setState(1993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(1992);
				match(Bang);
				}
			}

			setState(1995);
			match(Colon);
			setState(1996);
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
		enterRule(_localctx, 242, RULE_linqItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case At:
				{
				setState(1998);
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
				setState(1999);
				id();
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Right_Wave) | (1L << Left_Wave) | (1L << Tilde_Tilde) | (1L << Left_Paren) | (1L << Left_Brace) | (1L << Left_Brack) | (1L << Question) | (1L << At) | (1L << Bang) | (1L << Tilde) | (1L << Add) | (1L << Sub) | (1L << TypeI8) | (1L << TypeU8) | (1L << TypeI16) | (1L << TypeU16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TypeI32 - 64)) | (1L << (TypeU32 - 64)) | (1L << (TypeI64 - 64)) | (1L << (TypeU64 - 64)) | (1L << (TypeF32 - 64)) | (1L << (TypeF64 - 64)) | (1L << (TypeChr - 64)) | (1L << (TypeStr - 64)) | (1L << (TypeBool - 64)) | (1L << (TypeInt - 64)) | (1L << (TypeNum - 64)) | (1L << (TypeByte - 64)) | (1L << (TypeAny - 64)) | (1L << (NilLiteral - 64)) | (1L << (TrueLiteral - 64)) | (1L << (FalseLiteral - 64)) | (1L << (UndefinedLiteral - 64)) | (1L << (FloatLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (HexLiteral - 64)) | (1L << (Quote_Quote_Quote_Open - 64)) | (1L << (Quote_Open - 64)) | (1L << (CharLiteral - 64)) | (1L << (IDPrivate - 64)) | (1L << (IDPublic - 64)) | (1L << (Discard - 64)))) != 0)) {
					{
					setState(2000);
					expression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2005);
			match(Right_Arrow);
			setState(2007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2006);
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
		enterRule(_localctx, 244, RULE_judgeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			judgeExpressionIfStatement();
			setState(2013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2010);
					judgeExpressionElseIfStatement();
					}
					} 
				}
				setState(2015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			setState(2016);
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
		enterRule(_localctx, 246, RULE_judgeExpressionElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(Discard);
			setState(2019);
			left_brace();
			setState(2023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2020);
					functionSupportStatement();
					}
					} 
				}
				setState(2025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(2026);
			tupleExpression();
			setState(2027);
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
		enterRule(_localctx, 248, RULE_judgeExpressionIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(Question);
			setState(2030);
			match(Right_Arrow);
			setState(2031);
			expression(0);
			setState(2032);
			left_brace();
			setState(2036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2033);
					functionSupportStatement();
					}
					} 
				}
				setState(2038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			setState(2039);
			tupleExpression();
			setState(2040);
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
		enterRule(_localctx, 250, RULE_judgeExpressionElseIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			expression(0);
			setState(2043);
			left_brace();
			setState(2047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2044);
					functionSupportStatement();
					}
					} 
				}
				setState(2049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(2050);
			tupleExpression();
			setState(2051);
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
		enterRule(_localctx, 252, RULE_judgeCaseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(Question);
			setState(2054);
			expression(0);
			setState(2055);
			match(Colon);
			setState(2056);
			match(Right_Arrow);
			setState(2058); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2057);
					caseExpressionStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2060); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		enterRule(_localctx, 254, RULE_caseExpressionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			caseExprStatement();
			setState(2068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2063);
				more();
				setState(2064);
				caseExprStatement();
				}
				}
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2071);
			left_brace();
			setState(2075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2072);
					functionSupportStatement();
					}
					} 
				}
				setState(2077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(2078);
			tupleExpression();
			setState(2079);
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
		enterRule(_localctx, 256, RULE_loopExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			match(At);
			setState(2082);
			id();
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2083);
				match(Bang);
				}
			}

			setState(2086);
			match(Colon);
			setState(2087);
			iteratorStatement();
			setState(2088);
			match(Right_Arrow);
			setState(2089);
			left_brace();
			setState(2093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2090);
					functionSupportStatement();
					}
					} 
				}
				setState(2095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			setState(2096);
			tupleExpression();
			setState(2097);
			right_brace();
			setState(2099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2098);
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
		enterRule(_localctx, 258, RULE_loopEachExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			match(At);
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2102);
				id();
				setState(2103);
				match(Colon);
				}
				break;
			}
			setState(2107);
			id();
			setState(2109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2108);
				match(Bang);
				}
			}

			setState(2111);
			match(Colon);
			setState(2112);
			expression(0);
			setState(2113);
			match(Right_Arrow);
			setState(2114);
			left_brace();
			setState(2118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2115);
					functionSupportStatement();
					}
					} 
				}
				setState(2120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			setState(2121);
			tupleExpression();
			setState(2122);
			right_brace();
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2123);
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
		enterRule(_localctx, 260, RULE_loopElseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(Discard);
			setState(2127);
			left_brace();
			setState(2131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2128);
					functionSupportStatement();
					}
					} 
				}
				setState(2133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			setState(2134);
			tupleExpression();
			setState(2135);
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
		enterRule(_localctx, 262, RULE_checkExpression);
		int _la;
		try {
			int _alt;
			setState(2172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				match(Bang);
				setState(2138);
				match(Right_Arrow);
				setState(2139);
				left_brace();
				setState(2143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2140);
						functionSupportStatement();
						}
						} 
					}
					setState(2145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
				}
				setState(2146);
				tupleExpression();
				setState(2147);
				right_brace();
				setState(2151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TypeI8 - 60)) | (1L << (TypeU8 - 60)) | (1L << (TypeI16 - 60)) | (1L << (TypeU16 - 60)) | (1L << (TypeI32 - 60)) | (1L << (TypeU32 - 60)) | (1L << (TypeI64 - 60)) | (1L << (TypeU64 - 60)) | (1L << (TypeF32 - 60)) | (1L << (TypeF64 - 60)) | (1L << (TypeChr - 60)) | (1L << (TypeStr - 60)) | (1L << (TypeBool - 60)) | (1L << (TypeInt - 60)) | (1L << (TypeNum - 60)) | (1L << (TypeByte - 60)) | (1L << (TypeAny - 60)) | (1L << (IDPrivate - 60)) | (1L << (IDPublic - 60)))) != 0)) {
					{
					{
					setState(2148);
					checkErrorExpression();
					}
					}
					setState(2153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2154);
				checkFinallyStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2156);
				match(Bang);
				setState(2157);
				match(Right_Arrow);
				setState(2158);
				left_brace();
				setState(2162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2159);
						functionSupportStatement();
						}
						} 
					}
					setState(2164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				}
				setState(2165);
				tupleExpression();
				setState(2166);
				right_brace();
				setState(2168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2167);
						checkErrorExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
		enterRule(_localctx, 264, RULE_checkErrorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2174);
				id();
				}
				break;
			case 2:
				{
				setState(2175);
				id();
				setState(2176);
				typeType();
				}
				break;
			}
			setState(2180);
			left_brace();
			setState(2184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2181);
					functionSupportStatement();
					}
					} 
				}
				setState(2186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			setState(2187);
			tupleExpression();
			setState(2188);
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
		enterRule(_localctx, 266, RULE_dataStatement);
		try {
			setState(2199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FloatLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2190);
				floatExpr();
				}
				break;
			case DecimalLiteral:
			case BinaryLiteral:
			case OctalLiteral:
			case HexLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2191);
				integerExpr();
				}
				break;
			case Quote_Quote_Quote_Open:
				enterOuterAlt(_localctx, 3);
				{
				setState(2192);
				rawStringExpr();
				}
				break;
			case Quote_Open:
				enterOuterAlt(_localctx, 4);
				{
				setState(2193);
				stringExpr();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2194);
				((DataStatementContext)_localctx).t = match(CharLiteral);
				}
				break;
			case TrueLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(2195);
				((DataStatementContext)_localctx).t = match(TrueLiteral);
				}
				break;
			case FalseLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2196);
				((DataStatementContext)_localctx).t = match(FalseLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(2197);
				nilExpr();
				}
				break;
			case UndefinedLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(2198);
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
		enterRule(_localctx, 268, RULE_stringExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(Quote_Open);
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String_Template_Open || _la==TextLiteral) {
				{
				setState(2204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TextLiteral:
					{
					setState(2202);
					stringContent();
					}
					break;
				case String_Template_Open:
					{
					setState(2203);
					stringTemplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2209);
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
		enterRule(_localctx, 270, RULE_stringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
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
		enterRule(_localctx, 272, RULE_stringTemplate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(String_Template_Open);
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2214);
					expression(0);
					setState(2215);
					end();
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			setState(2222);
			expression(0);
			setState(2223);
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
		enterRule(_localctx, 274, RULE_rawStringExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(Quote_Quote_Quote_Open);
			setState(2231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Raw_Quote - 101)) | (1L << (Raw_String_Template_Open - 101)) | (1L << (RawTextLiteral - 101)))) != 0)) {
				{
				setState(2229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RawTextLiteral:
					{
					setState(2226);
					rawStringContent();
					}
					break;
				case Raw_String_Template_Open:
					{
					setState(2227);
					rawStringTemplate();
					}
					break;
				case Raw_Quote:
					{
					setState(2228);
					match(Raw_Quote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2234);
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
		enterRule(_localctx, 276, RULE_rawStringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
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
		enterRule(_localctx, 278, RULE_rawStringTemplate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(Raw_String_Template_Open);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2239);
				match(New_Line);
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2245);
					expression(0);
					setState(2246);
					end();
					}
					} 
				}
				setState(2252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			setState(2253);
			expression(0);
			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2254);
				match(New_Line);
				}
				}
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2260);
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
		enterRule(_localctx, 280, RULE_floatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
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
		enterRule(_localctx, 282, RULE_integerExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (DecimalLiteral - 82)) | (1L << (BinaryLiteral - 82)) | (1L << (OctalLiteral - 82)) | (1L << (HexLiteral - 82)))) != 0)) ) {
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
		enterRule(_localctx, 284, RULE_typeNotNull);
		try {
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2266);
				typeAny();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2267);
				typeArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				typeList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2269);
				typeSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2270);
				typeDictionary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2271);
				typeStack();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2272);
				typeQueue();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2273);
				typeChannel();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2274);
				typeBasic();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2275);
				typePackage();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2276);
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
		enterRule(_localctx, 286, RULE_typeType);
		try {
			setState(2281);
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
				setState(2279);
				typeNotNull();
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
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
		enterRule(_localctx, 288, RULE_typeNullable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			match(Question);
			setState(2284);
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
		enterRule(_localctx, 290, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			left_brack();
			setState(2287);
			match(Comma);
			setState(2288);
			right_brack();
			setState(2289);
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
		enterRule(_localctx, 292, RULE_typeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			left_brack();
			setState(2292);
			right_brack();
			setState(2293);
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
		enterRule(_localctx, 294, RULE_typeSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			left_brack();
			setState(2296);
			typeType();
			setState(2297);
			right_brack();
			setState(2298);
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
		enterRule(_localctx, 296, RULE_typeDictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			left_brack();
			setState(2301);
			typeType();
			setState(2302);
			right_brack();
			setState(2303);
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
		enterRule(_localctx, 298, RULE_typeStack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			left_brack();
			setState(2306);
			match(Greater);
			setState(2307);
			right_brack();
			setState(2308);
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
		enterRule(_localctx, 300, RULE_typeQueue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			left_brack();
			setState(2311);
			match(Less);
			setState(2312);
			right_brack();
			setState(2313);
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
		enterRule(_localctx, 302, RULE_typeChannel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			left_brack();
			setState(2316);
			match(Tilde);
			setState(2317);
			right_brack();
			setState(2318);
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
		enterRule(_localctx, 304, RULE_typePackage);
		try {
			setState(2326);
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
				setState(2320);
				nameSpaceItem();
				}
				break;
			case Left_Brack:
				enterOuterAlt(_localctx, 2);
				{
				setState(2321);
				left_brack();
				setState(2322);
				nameSpaceItem();
				setState(2323);
				templateCall();
				setState(2324);
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
		enterRule(_localctx, 306, RULE_typeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			left_paren();
			setState(2329);
			typeFunctionParameterClause();
			setState(2330);
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
			setState(2332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang) {
				{
				setState(2331);
				((TypeFunctionContext)_localctx).b = match(Bang);
				}
			}

			setState(2335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(2334);
				((TypeFunctionContext)_localctx).y = match(At);
				}
			}

			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2337);
				match(New_Line);
				}
				}
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2343);
			typeFunctionParameterClause();
			setState(2344);
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
		enterRule(_localctx, 308, RULE_typeAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
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
		enterRule(_localctx, 310, RULE_typeFunctionParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Left_Paren - 39)) | (1L << (Left_Brack - 39)) | (1L << (Question - 39)) | (1L << (TypeI8 - 39)) | (1L << (TypeU8 - 39)) | (1L << (TypeI16 - 39)) | (1L << (TypeU16 - 39)) | (1L << (TypeI32 - 39)) | (1L << (TypeU32 - 39)) | (1L << (TypeI64 - 39)) | (1L << (TypeU64 - 39)) | (1L << (TypeF32 - 39)) | (1L << (TypeF64 - 39)) | (1L << (TypeChr - 39)) | (1L << (TypeStr - 39)) | (1L << (TypeBool - 39)) | (1L << (TypeInt - 39)) | (1L << (TypeNum - 39)) | (1L << (TypeByte - 39)) | (1L << (TypeAny - 39)) | (1L << (IDPrivate - 39)) | (1L << (IDPublic - 39)))) != 0)) {
				{
				setState(2348);
				typeType();
				}
			}

			setState(2356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2351);
				more();
				setState(2352);
				typeType();
				}
				}
				setState(2358);
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
		enterRule(_localctx, 312, RULE_typeBasic);
		try {
			setState(2375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeI8:
				enterOuterAlt(_localctx, 1);
				{
				setState(2359);
				((TypeBasicContext)_localctx).t = match(TypeI8);
				}
				break;
			case TypeU8:
				enterOuterAlt(_localctx, 2);
				{
				setState(2360);
				((TypeBasicContext)_localctx).t = match(TypeU8);
				}
				break;
			case TypeI16:
				enterOuterAlt(_localctx, 3);
				{
				setState(2361);
				((TypeBasicContext)_localctx).t = match(TypeI16);
				}
				break;
			case TypeU16:
				enterOuterAlt(_localctx, 4);
				{
				setState(2362);
				((TypeBasicContext)_localctx).t = match(TypeU16);
				}
				break;
			case TypeI32:
				enterOuterAlt(_localctx, 5);
				{
				setState(2363);
				((TypeBasicContext)_localctx).t = match(TypeI32);
				}
				break;
			case TypeU32:
				enterOuterAlt(_localctx, 6);
				{
				setState(2364);
				((TypeBasicContext)_localctx).t = match(TypeU32);
				}
				break;
			case TypeI64:
				enterOuterAlt(_localctx, 7);
				{
				setState(2365);
				((TypeBasicContext)_localctx).t = match(TypeI64);
				}
				break;
			case TypeU64:
				enterOuterAlt(_localctx, 8);
				{
				setState(2366);
				((TypeBasicContext)_localctx).t = match(TypeU64);
				}
				break;
			case TypeF32:
				enterOuterAlt(_localctx, 9);
				{
				setState(2367);
				((TypeBasicContext)_localctx).t = match(TypeF32);
				}
				break;
			case TypeF64:
				enterOuterAlt(_localctx, 10);
				{
				setState(2368);
				((TypeBasicContext)_localctx).t = match(TypeF64);
				}
				break;
			case TypeChr:
				enterOuterAlt(_localctx, 11);
				{
				setState(2369);
				((TypeBasicContext)_localctx).t = match(TypeChr);
				}
				break;
			case TypeStr:
				enterOuterAlt(_localctx, 12);
				{
				setState(2370);
				((TypeBasicContext)_localctx).t = match(TypeStr);
				}
				break;
			case TypeBool:
				enterOuterAlt(_localctx, 13);
				{
				setState(2371);
				((TypeBasicContext)_localctx).t = match(TypeBool);
				}
				break;
			case TypeInt:
				enterOuterAlt(_localctx, 14);
				{
				setState(2372);
				((TypeBasicContext)_localctx).t = match(TypeInt);
				}
				break;
			case TypeNum:
				enterOuterAlt(_localctx, 15);
				{
				setState(2373);
				((TypeBasicContext)_localctx).t = match(TypeNum);
				}
				break;
			case TypeByte:
				enterOuterAlt(_localctx, 16);
				{
				setState(2374);
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
		enterRule(_localctx, 314, RULE_nilExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
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
		enterRule(_localctx, 316, RULE_boolExpr);
		try {
			setState(2381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TrueLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379);
				((BoolExprContext)_localctx).t = match(TrueLiteral);
				}
				break;
			case FalseLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
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
		enterRule(_localctx, 318, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And_And:
				{
				setState(2383);
				bitwiseAnd();
				}
				break;
			case Or_Or:
				{
				setState(2384);
				bitwiseOr();
				}
				break;
			case Caret_Caret:
				{
				setState(2385);
				bitwiseXor();
				}
				break;
			case Less_Less:
				{
				setState(2386);
				bitwiseLeftShift();
				}
				break;
			case Greater_Greater:
				{
				setState(2387);
				bitwiseRightShift();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2390);
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
		enterRule(_localctx, 320, RULE_bitwiseAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
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
		enterRule(_localctx, 322, RULE_bitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
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
		enterRule(_localctx, 324, RULE_bitwiseNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
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
		enterRule(_localctx, 326, RULE_bitwiseXor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
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
		enterRule(_localctx, 328, RULE_bitwiseLeftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
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
		enterRule(_localctx, 330, RULE_bitwiseRightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
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
		enterRule(_localctx, 332, RULE_compareCombine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
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
		enterRule(_localctx, 334, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
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
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2408);
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
		enterRule(_localctx, 336, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
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
			setState(2413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2412);
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
		enterRule(_localctx, 338, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2415);
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
			setState(2417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2416);
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
		enterRule(_localctx, 340, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
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
		enterRule(_localctx, 342, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
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
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2424);
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
		enterRule(_localctx, 344, RULE_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(Caret);
			setState(2429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New_Line) {
				{
				setState(2428);
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
		enterRule(_localctx, 346, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			((CallContext)_localctx).op = match(Dot);
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2432);
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
		enterRule(_localctx, 348, RULE_wave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
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
		enterRule(_localctx, 350, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2437);
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
		enterRule(_localctx, 352, RULE_idItem);
		int _la;
		try {
			setState(2442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDPrivate:
			case IDPublic:
				enterOuterAlt(_localctx, 1);
				{
				setState(2439);
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
				setState(2440);
				typeBasic();
				}
				break;
			case TypeAny:
				enterOuterAlt(_localctx, 3);
				{
				setState(2441);
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
		enterRule(_localctx, 354, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
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
		enterRule(_localctx, 356, RULE_more);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			match(Comma);
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2447);
				match(New_Line);
				}
				}
				setState(2452);
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
		enterRule(_localctx, 358, RULE_left_brace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			match(Left_Brace);
			setState(2457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2454);
					match(New_Line);
					}
					} 
				}
				setState(2459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
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
		enterRule(_localctx, 360, RULE_right_brace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2460);
				match(New_Line);
				}
				}
				setState(2465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2466);
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
		enterRule(_localctx, 362, RULE_left_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
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
		enterRule(_localctx, 364, RULE_right_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
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
		enterRule(_localctx, 366, RULE_left_brack);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(Left_Brack);
			setState(2476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2473);
					match(New_Line);
					}
					} 
				}
				setState(2478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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
		enterRule(_localctx, 368, RULE_right_brack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==New_Line) {
				{
				{
				setState(2479);
				match(New_Line);
				}
				}
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2485);
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
		case 75:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\u09ba\4\2\t\2\4"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\3\2\6"+
		"\2\u0176\n\2\r\2\16\2\u0177\3\3\7\3\u017b\n\3\f\3\16\3\u017e\13\3\3\3"+
		"\5\3\u0181\n\3\3\3\3\3\7\3\u0185\n\3\f\3\16\3\u0188\13\3\3\3\7\3\u018b"+
		"\n\3\f\3\16\3\u018e\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0196\n\4\f\4\16"+
		"\4\u0199\13\4\3\4\3\4\3\4\3\5\5\5\u019f\n\5\3\5\3\5\5\5\u01a3\n\5\3\5"+
		"\5\5\u01a6\n\5\3\5\5\5\u01a9\n\5\3\5\3\5\5\5\u01ad\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01bb\n\6\3\7\3\7\5\7\u01bf\n\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\5\b\u01c7\n\b\3\b\3\b\7\b\u01cb\n\b\f\b\16\b\u01ce"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u01d6\n\n\3\n\3\n\5\n\u01da\n\n\3\n"+
		"\3\n\7\n\u01de\n\n\f\n\16\n\u01e1\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u01e8\n"+
		"\n\f\n\16\n\u01eb\13\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u01f3\n\13\3\13"+
		"\5\13\u01f6\n\13\3\13\3\13\3\f\5\f\u01fb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0204\n\f\5\f\u0206\n\f\3\f\3\f\3\r\5\r\u020b\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0213\n\r\5\r\u0215\n\r\3\r\3\r\3\16\5\16\u021a\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0222\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0229\n\16\3\16\5\16\u022c\n\16\3\16\7\16\u022f\n\16\f\16\16\16"+
		"\u0232\13\16\3\16\3\16\3\16\3\16\7\16\u0238\n\16\f\16\16\16\u023b\13\16"+
		"\3\16\3\16\3\16\3\17\5\17\u0241\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0249\n\17\3\17\5\17\u024c\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0253\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u025a\n\17\7\17\u025c\n\17\f\17\16\17"+
		"\u025f\13\17\3\17\3\17\3\20\3\20\7\20\u0265\n\20\f\20\16\20\u0268\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0270\n\21\3\22\5\22\u0273\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u027c\n\22\5\22\u027e\n\22\3\22"+
		"\3\22\3\23\5\23\u0283\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u028b\n"+
		"\23\5\23\u028d\n\23\3\23\3\23\3\24\5\24\u0292\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u029a\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u02a1\n\24\3"+
		"\24\5\24\u02a4\n\24\3\24\7\24\u02a7\n\24\f\24\16\24\u02aa\13\24\3\24\3"+
		"\24\3\24\3\24\7\24\u02b0\n\24\f\24\16\24\u02b3\13\24\3\24\3\24\3\24\3"+
		"\25\3\25\5\25\u02ba\n\25\3\25\3\25\3\25\3\25\5\25\u02c0\n\25\5\25\u02c2"+
		"\n\25\3\25\3\25\7\25\u02c6\n\25\f\25\16\25\u02c9\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02d5\n\26\3\27\3\27\3\30\5\30"+
		"\u02da\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u02e1\n\30\3\30\3\30\3\30\3"+
		"\30\5\30\u02e7\n\30\5\30\u02e9\n\30\3\30\3\30\3\30\5\30\u02ee\n\30\3\30"+
		"\3\30\5\30\u02f2\n\30\3\30\3\30\7\30\u02f6\n\30\f\30\16\30\u02f9\13\30"+
		"\3\30\3\30\3\31\5\31\u02fe\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0307\n\31\5\31\u0309\n\31\3\31\3\31\3\32\5\32\u030e\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0316\n\32\5\32\u0318\n\32\3\32\3\32\3\33\5\33"+
		"\u031d\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0325\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u032c\n\33\3\33\5\33\u032f\n\33\3\33\7\33\u0332\n\33"+
		"\f\33\16\33\u0335\13\33\3\33\3\33\3\33\3\33\7\33\u033b\n\33\f\33\16\33"+
		"\u033e\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0348\n\34\3"+
		"\34\3\34\6\34\u034c\n\34\r\34\16\34\u034d\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0361\n\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0367\n\36\3\36\3\36\3\36\3\36\5\36\u036d\n"+
		"\36\7\36\u036f\n\36\f\36\16\36\u0372\13\36\3\36\3\36\3\37\5\37\u0377\n"+
		"\37\3\37\3\37\5\37\u037b\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0384\n\37\5\37\u0386\n\37\3\37\3\37\3 \5 \u038b\n \3 \3 \5 \u038f\n"+
		" \3 \3 \3 \3 \3 \3 \5 \u0397\n \5 \u0399\n \3 \3 \3!\5!\u039e\n!\3!\3"+
		"!\5!\u03a2\n!\3!\3!\3!\3!\3!\3!\5!\u03aa\n!\3!\3!\3!\3!\3!\5!\u03b1\n"+
		"!\3!\5!\u03b4\n!\3!\7!\u03b7\n!\f!\16!\u03ba\13!\3!\3!\3!\3!\7!\u03c0"+
		"\n!\f!\16!\u03c3\13!\3!\3!\3!\3\"\5\"\u03c9\n\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u03d1\n\"\3\"\5\"\u03d4\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u03db\n\"\7"+
		"\"\u03dd\n\"\f\"\16\"\u03e0\13\"\3\"\3\"\3\"\3\"\5\"\u03e6\n\"\7\"\u03e8"+
		"\n\"\f\"\16\"\u03eb\13\"\3\"\3\"\3\"\3\"\3\"\5\"\u03f2\n\"\7\"\u03f4\n"+
		"\"\f\"\16\"\u03f7\13\"\5\"\u03f9\n\"\3\"\3\"\3#\3#\3#\5#\u0400\n#\3#\3"+
		"#\3#\3#\5#\u0406\n#\5#\u0408\n#\3#\3#\7#\u040c\n#\f#\16#\u040f\13#\3#"+
		"\3#\3$\3$\3$\5$\u0416\n$\3%\5%\u0419\n%\3%\3%\5%\u041d\n%\3%\3%\3%\3%"+
		"\3%\5%\u0424\n%\5%\u0426\n%\3%\3%\3&\5&\u042b\n&\3&\3&\3&\3&\3&\3&\5&"+
		"\u0433\n&\3&\3&\3&\3&\5&\u0439\n&\3&\5&\u043c\n&\3&\7&\u043f\n&\f&\16"+
		"&\u0442\13&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u044e\n\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u0455\n\'\3\'\5\'\u0458\n\'\3\'\7\'\u045b\n\'\f\'\16"+
		"\'\u045e\13\'\3\'\3\'\3\'\3\'\7\'\u0464\n\'\f\'\16\'\u0467\13\'\3\'\3"+
		"\'\3\'\3(\3(\5(\u046e\n(\3(\3(\3)\3)\5)\u0474\n)\3)\3)\3*\3*\3*\3*\3*"+
		"\3+\3+\3+\3+\3,\5,\u0482\n,\3,\3,\3,\7,\u0487\n,\f,\16,\u048a\13,\3-\5"+
		"-\u048d\n-\3-\3-\3-\7-\u0492\n-\f-\16-\u0495\13-\3.\5.\u0498\n.\3.\3."+
		"\5.\u049c\n.\3.\5.\u049f\n.\3.\3.\3.\5.\u04a4\n.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u04bc\n/\3\60\3\60\3"+
		"\60\3\60\6\60\u04c2\n\60\r\60\16\60\u04c3\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u04cc\n\61\f\61\16\61\u04cf\13\61\3\61\3\61\7\61\u04d3\n\61\f\61"+
		"\16\61\u04d6\13\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u04de\n\62\3\62"+
		"\5\62\u04e1\n\62\3\63\3\63\7\63\u04e5\n\63\f\63\16\63\u04e8\13\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u04ef\n\63\f\63\16\63\u04f2\13\63\3\63\3\63"+
		"\5\63\u04f6\n\63\3\64\3\64\3\64\7\64\u04fb\n\64\f\64\16\64\u04fe\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0506\n\65\f\65\16\65\u0509\13\65"+
		"\3\65\3\65\3\66\3\66\3\66\7\66\u0510\n\66\f\66\16\66\u0513\13\66\3\66"+
		"\3\66\3\67\3\67\3\67\5\67\u051a\n\67\3\67\3\67\3\67\3\67\7\67\u0520\n"+
		"\67\f\67\16\67\u0523\13\67\3\67\3\67\5\67\u0527\n\67\3\67\3\67\38\38\3"+
		"8\38\38\58\u0530\n8\38\38\58\u0534\n8\38\38\38\38\78\u053a\n8\f8\168\u053d"+
		"\138\38\38\58\u0541\n8\38\38\39\39\39\39\79\u0549\n9\f9\169\u054c\139"+
		"\39\39\59\u0550\n9\39\39\3:\3:\3:\7:\u0557\n:\f:\16:\u055a\13:\3:\3:\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\7=\u0569\n=\f=\16=\u056c\13=\3=\3=\7="+
		"\u0570\n=\f=\16=\u0573\13=\3=\3=\3=\3=\3=\3=\7=\u057b\n=\f=\16=\u057e"+
		"\13=\3=\3=\6=\u0582\n=\r=\16=\u0583\3=\3=\5=\u0588\n=\3>\3>\3>\5>\u058d"+
		"\n>\3>\5>\u0590\n>\3>\3>\3>\3>\3?\3?\3?\3?\5?\u059a\n?\3?\3?\7?\u059e"+
		"\n?\f?\16?\u05a1\13?\3?\3?\3@\3@\3@\7@\u05a8\n@\f@\16@\u05ab\13@\3@\3"+
		"@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\5B\u05ba\nB\3B\3B\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\3E\3E\3E\3E\7E\u05cb\nE\fE\16E\u05ce\13E\3E\3E\3E\3E\3F\3F"+
		"\3F\3F\7F\u05d8\nF\fF\16F\u05db\13F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3"+
		"H\3I\3I\3I\5I\u05ec\nI\3I\5I\u05ef\nI\3J\3J\5J\u05f3\nJ\3J\5J\u05f6\n"+
		"J\3K\3K\3K\3K\7K\u05fc\nK\fK\16K\u05ff\13K\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u060d\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u0623\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u0659\nM\fM\16M\u065c\13"+
		"M\3N\3N\5N\u0660\nN\3N\3N\3N\3N\3N\3N\5N\u0668\nN\3N\3N\5N\u066c\nN\3"+
		"O\3O\3O\3O\3O\7O\u0673\nO\fO\16O\u0676\13O\5O\u0678\nO\3O\3O\3P\3P\3P"+
		"\3P\7P\u0680\nP\fP\16P\u0683\13P\3Q\3Q\5Q\u0687\nQ\3R\3R\3R\3R\5R\u068d"+
		"\nR\3R\3R\3R\3S\3S\3S\7S\u0695\nS\fS\16S\u0698\13S\3S\3S\3T\3T\3T\5T\u069f"+
		"\nT\3U\3U\5U\u06a3\nU\3V\3V\3V\3W\3W\3W\5W\u06ab\nW\3X\3X\3X\3Y\3Y\3Z"+
		"\3Z\3Z\5Z\u06b5\nZ\3Z\3Z\3[\3[\3[\3[\3[\5[\u06be\n[\3[\3[\3\\\3\\\3\\"+
		"\5\\\u06c5\n\\\3\\\5\\\u06c8\n\\\3\\\5\\\u06cb\n\\\3\\\3\\\3]\3]\3]\3"+
		"]\3^\3^\3^\3_\3_\3_\3`\3`\3`\7`\u06dc\n`\f`\16`\u06df\13`\3`\3`\3a\3a"+
		"\3a\3a\3b\3b\3b\7b\u06ea\nb\fb\16b\u06ed\13b\3b\3b\3c\3c\3c\7c\u06f4\n"+
		"c\fc\16c\u06f7\13c\3c\3c\3d\3d\3d\3d\7d\u06ff\nd\fd\16d\u0702\13d\3d\3"+
		"d\3d\3e\3e\3e\3e\7e\u070b\ne\fe\16e\u070e\13e\3e\3e\3e\3f\3f\3f\3f\3f"+
		"\3f\3g\3g\3g\5g\u071c\ng\3h\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\5k\u072b"+
		"\nk\7k\u072d\nk\fk\16k\u0730\13k\3k\3k\3l\3l\3l\5l\u0737\nl\3l\3l\7l\u073b"+
		"\nl\fl\16l\u073e\13l\3m\7m\u0741\nm\fm\16m\u0744\13m\3n\3n\3n\3n\3n\3"+
		"n\5n\u074c\nn\3o\7o\u074f\no\fo\16o\u0752\13o\3p\3p\5p\u0756\np\3p\3p"+
		"\7p\u075a\np\fp\16p\u075d\13p\3p\3p\3p\3p\3p\5p\u0764\np\3p\3p\7p\u0768"+
		"\np\fp\16p\u076b\13p\3p\7p\u076e\np\fp\16p\u0771\13p\3p\3p\5p\u0775\n"+
		"p\3q\3q\3q\3q\7q\u077b\nq\fq\16q\u077e\13q\3r\3r\3s\3s\3s\3s\7s\u0786"+
		"\ns\fs\16s\u0789\13s\3s\3s\3s\3t\3t\5t\u0790\nt\3t\3t\3t\3u\3u\3u\3u\5"+
		"u\u0799\nu\3u\5u\u079c\nu\3u\7u\u079f\nu\fu\16u\u07a2\13u\3u\3u\3u\3u"+
		"\7u\u07a8\nu\fu\16u\u07ab\13u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3"+
		"y\5y\u07bb\ny\3y\7y\u07be\ny\fy\16y\u07c1\13y\3y\3y\5y\u07c5\ny\3y\3y"+
		"\3z\3z\3z\5z\u07cc\nz\3z\3z\3z\3{\3{\3{\5{\u07d4\n{\5{\u07d6\n{\3{\3{"+
		"\5{\u07da\n{\3|\3|\7|\u07de\n|\f|\16|\u07e1\13|\3|\3|\3}\3}\3}\7}\u07e8"+
		"\n}\f}\16}\u07eb\13}\3}\3}\3}\3~\3~\3~\3~\3~\7~\u07f5\n~\f~\16~\u07f8"+
		"\13~\3~\3~\3~\3\177\3\177\3\177\7\177\u0800\n\177\f\177\16\177\u0803\13"+
		"\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\6\u0080"+
		"\u080d\n\u0080\r\u0080\16\u0080\u080e\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0815\n\u0081\f\u0081\16\u0081\u0818\13\u0081\3\u0081\3\u0081"+
		"\7\u0081\u081c\n\u0081\f\u0081\16\u0081\u081f\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0827\n\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u082e\n\u0082\f\u0082\16\u0082\u0831"+
		"\13\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0836\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\5\u0083\u083c\n\u0083\3\u0083\3\u0083\5\u0083\u0840\n"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0847\n\u0083\f"+
		"\u0083\16\u0083\u084a\13\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u084f\n"+
		"\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0854\n\u0084\f\u0084\16\u0084"+
		"\u0857\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u0860\n\u0085\f\u0085\16\u0085\u0863\13\u0085\3\u0085\3\u0085"+
		"\3\u0085\7\u0085\u0868\n\u0085\f\u0085\16\u0085\u086b\13\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0873\n\u0085\f\u0085"+
		"\16\u0085\u0876\13\u0085\3\u0085\3\u0085\3\u0085\6\u0085\u087b\n\u0085"+
		"\r\u0085\16\u0085\u087c\5\u0085\u087f\n\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0885\n\u0086\3\u0086\3\u0086\7\u0086\u0889\n\u0086\f"+
		"\u0086\16\u0086\u088c\13\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u089a"+
		"\n\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u089f\n\u0088\f\u0088\16\u0088"+
		"\u08a2\13\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\7\u008a\u08ac\n\u008a\f\u008a\16\u008a\u08af\13\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u08b8\n\u008b"+
		"\f\u008b\16\u008b\u08bb\13\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\7\u008d\u08c3\n\u008d\f\u008d\16\u008d\u08c6\13\u008d\3\u008d"+
		"\3\u008d\3\u008d\7\u008d\u08cb\n\u008d\f\u008d\16\u008d\u08ce\13\u008d"+
		"\3\u008d\3\u008d\7\u008d\u08d2\n\u008d\f\u008d\16\u008d\u08d5\13\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u08e8\n\u0090\3\u0091\3\u0091\5\u0091\u08ec\n\u0091\3\u0092\3\u0092\3"+
		"\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0919\n\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\5\u009b\u091f\n\u009b\3\u009b\5\u009b\u0922\n"+
		"\u009b\3\u009b\7\u009b\u0925\n\u009b\f\u009b\16\u009b\u0928\13\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\5\u009d\u0930\n\u009d\3"+
		"\u009d\3\u009d\3\u009d\7\u009d\u0935\n\u009d\f\u009d\16\u009d\u0938\13"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u094a\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u0950\n\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0957\n\u00a1\3\u00a1\5"+
		"\u00a1\u095a\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\5\u00a9\u096c\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u0970\n\u00aa\3"+
		"\u00ab\3\u00ab\5\u00ab\u0974\n\u00ab\3\u00ac\3\u00ac\5\u00ac\u0978\n\u00ac"+
		"\3\u00ad\3\u00ad\5\u00ad\u097c\n\u00ad\3\u00ae\3\u00ae\5\u00ae\u0980\n"+
		"\u00ae\3\u00af\3\u00af\5\u00af\u0984\n\u00af\3\u00b0\3\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u098d\n\u00b2\3\u00b3\3\u00b3\3"+
		"\u00b4\3\u00b4\7\u00b4\u0993\n\u00b4\f\u00b4\16\u00b4\u0996\13\u00b4\3"+
		"\u00b5\3\u00b5\7\u00b5\u099a\n\u00b5\f\u00b5\16\u00b5\u099d\13\u00b5\3"+
		"\u00b6\7\u00b6\u09a0\n\u00b6\f\u00b6\16\u00b6\u09a3\13\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\7\u00b9\u09ad\n"+
		"\u00b9\f\u00b9\16\u00b9\u09b0\13\u00b9\3\u00ba\7\u00ba\u09b3\n\u00ba\f"+
		"\u00ba\16\u00ba\u09b6\13\u00ba\3\u00ba\3\u00ba\3\u00ba\2\3\u0098\u00bb"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\2\r\4\2\31\31\33\33\3\2\26"+
		"\27\3\2\21\24\3\2TW\4\2\n\r&\'\3\2:;\4\2\3\b\37\37\3\2\65\66\3\2\679\3"+
		"\2[\\\4\2((aa\2\u0a99\2\u0175\3\2\2\2\4\u017c\3\2\2\2\6\u018f\3\2\2\2"+
		"\b\u019e\3\2\2\2\n\u01ba\3\2\2\2\f\u01bc\3\2\2\2\16\u01c4\3\2\2\2\20\u01d2"+
		"\3\2\2\2\22\u01d5\3\2\2\2\24\u01ef\3\2\2\2\26\u01fa\3\2\2\2\30\u020a\3"+
		"\2\2\2\32\u0219\3\2\2\2\34\u0240\3\2\2\2\36\u0262\3\2\2\2 \u026f\3\2\2"+
		"\2\"\u0272\3\2\2\2$\u0282\3\2\2\2&\u0291\3\2\2\2(\u02b7\3\2\2\2*\u02d4"+
		"\3\2\2\2,\u02d6\3\2\2\2.\u02d9\3\2\2\2\60\u02fd\3\2\2\2\62\u030d\3\2\2"+
		"\2\64\u031c\3\2\2\2\66\u0342\3\2\2\28\u0352\3\2\2\2:\u0360\3\2\2\2<\u0376"+
		"\3\2\2\2>\u038a\3\2\2\2@\u039d\3\2\2\2B\u03c8\3\2\2\2D\u03fc\3\2\2\2F"+
		"\u0415\3\2\2\2H\u0418\3\2\2\2J\u042a\3\2\2\2L\u044d\3\2\2\2N\u046b\3\2"+
		"\2\2P\u0471\3\2\2\2R\u0477\3\2\2\2T\u047c\3\2\2\2V\u0481\3\2\2\2X\u048c"+
		"\3\2\2\2Z\u0497\3\2\2\2\\\u04bb\3\2\2\2^\u04bd\3\2\2\2`\u04c7\3\2\2\2"+
		"b\u04e0\3\2\2\2d\u04f5\3\2\2\2f\u04f7\3\2\2\2h\u0501\3\2\2\2j\u050c\3"+
		"\2\2\2l\u0516\3\2\2\2n\u052a\3\2\2\2p\u0544\3\2\2\2r\u0553\3\2\2\2t\u055d"+
		"\3\2\2\2v\u0561\3\2\2\2x\u0587\3\2\2\2z\u0589\3\2\2\2|\u0599\3\2\2\2~"+
		"\u05a4\3\2\2\2\u0080\u05ae\3\2\2\2\u0082\u05b3\3\2\2\2\u0084\u05bd\3\2"+
		"\2\2\u0086\u05c2\3\2\2\2\u0088\u05c6\3\2\2\2\u008a\u05d3\3\2\2\2\u008c"+
		"\u05e0\3\2\2\2\u008e\u05e5\3\2\2\2\u0090\u05ee\3\2\2\2\u0092\u05f5\3\2"+
		"\2\2\u0094\u05f7\3\2\2\2\u0096\u060c\3\2\2\2\u0098\u0622\3\2\2\2\u009a"+
		"\u065d\3\2\2\2\u009c\u066d\3\2\2\2\u009e\u067b\3\2\2\2\u00a0\u0684\3\2"+
		"\2\2\u00a2\u0688\3\2\2\2\u00a4\u0696\3\2\2\2\u00a6\u069b\3\2\2\2\u00a8"+
		"\u06a2\3\2\2\2\u00aa\u06a4\3\2\2\2\u00ac\u06a7\3\2\2\2\u00ae\u06ac\3\2"+
		"\2\2\u00b0\u06af\3\2\2\2\u00b2\u06b1\3\2\2\2\u00b4\u06b8\3\2\2\2\u00b6"+
		"\u06c1\3\2\2\2\u00b8\u06ce\3\2\2\2\u00ba\u06d2\3\2\2\2\u00bc\u06d5\3\2"+
		"\2\2\u00be\u06dd\3\2\2\2\u00c0\u06e2\3\2\2\2\u00c2\u06eb\3\2\2\2\u00c4"+
		"\u06f5\3\2\2\2\u00c6\u06fa\3\2\2\2\u00c8\u0706\3\2\2\2\u00ca\u0712\3\2"+
		"\2\2\u00cc\u071b\3\2\2\2\u00ce\u071d\3\2\2\2\u00d0\u0721\3\2\2\2\u00d2"+
		"\u0724\3\2\2\2\u00d4\u072e\3\2\2\2\u00d6\u0733\3\2\2\2\u00d8\u0742\3\2"+
		"\2\2\u00da\u074b\3\2\2\2\u00dc\u0750\3\2\2\2\u00de\u0774\3\2\2\2\u00e0"+
		"\u0776\3\2\2\2\u00e2\u077f\3\2\2\2\u00e4\u0781\3\2\2\2\u00e6\u078d\3\2"+
		"\2\2\u00e8\u0794\3\2\2\2\u00ea\u07ae\3\2\2\2\u00ec\u07b1\3\2\2\2\u00ee"+
		"\u07b4\3\2\2\2\u00f0\u07b7\3\2\2\2\u00f2\u07c8\3\2\2\2\u00f4\u07d5\3\2"+
		"\2\2\u00f6\u07db\3\2\2\2\u00f8\u07e4\3\2\2\2\u00fa\u07ef\3\2\2\2\u00fc"+
		"\u07fc\3\2\2\2\u00fe\u0807\3\2\2\2\u0100\u0810\3\2\2\2\u0102\u0823\3\2"+
		"\2\2\u0104\u0837\3\2\2\2\u0106\u0850\3\2\2\2\u0108\u087e\3\2\2\2\u010a"+
		"\u0884\3\2\2\2\u010c\u0899\3\2\2\2\u010e\u089b\3\2\2\2\u0110\u08a5\3\2"+
		"\2\2\u0112\u08a7\3\2\2\2\u0114\u08b3\3\2\2\2\u0116\u08be\3\2\2\2\u0118"+
		"\u08c0\3\2\2\2\u011a\u08d8\3\2\2\2\u011c\u08da\3\2\2\2\u011e\u08e7\3\2"+
		"\2\2\u0120\u08eb\3\2\2\2\u0122\u08ed\3\2\2\2\u0124\u08f0\3\2\2\2\u0126"+
		"\u08f5\3\2\2\2\u0128\u08f9\3\2\2\2\u012a\u08fe\3\2\2\2\u012c\u0903\3\2"+
		"\2\2\u012e\u0908\3\2\2\2\u0130\u090d\3\2\2\2\u0132\u0918\3\2\2\2\u0134"+
		"\u091a\3\2\2\2\u0136\u092c\3\2\2\2\u0138\u092f\3\2\2\2\u013a\u0949\3\2"+
		"\2\2\u013c\u094b\3\2\2\2\u013e\u094f\3\2\2\2\u0140\u0956\3\2\2\2\u0142"+
		"\u095b\3\2\2\2\u0144\u095d\3\2\2\2\u0146\u095f\3\2\2\2\u0148\u0961\3\2"+
		"\2\2\u014a\u0963\3\2\2\2\u014c\u0965\3\2\2\2\u014e\u0967\3\2\2\2\u0150"+
		"\u0969\3\2\2\2\u0152\u096d\3\2\2\2\u0154\u0971\3\2\2\2\u0156\u0975\3\2"+
		"\2\2\u0158\u0979\3\2\2\2\u015a\u097d\3\2\2\2\u015c\u0981\3\2\2\2\u015e"+
		"\u0985\3\2\2\2\u0160\u0987\3\2\2\2\u0162\u098c\3\2\2\2\u0164\u098e\3\2"+
		"\2\2\u0166\u0990\3\2\2\2\u0168\u0997\3\2\2\2\u016a\u09a1\3\2\2\2\u016c"+
		"\u09a6\3\2\2\2\u016e\u09a8\3\2\2\2\u0170\u09aa\3\2\2\2\u0172\u09b4\3\2"+
		"\2\2\u0174\u0176\5\4\3\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\3\3\2\2\2\u0179\u017b\7a\2\2"+
		"\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\5\u00a0Q"+
		"\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186"+
		"\5\6\4\2\u0183\u0185\7a\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018c\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u018b\5\n\6\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\5\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0190\5\u00d4k\2\u0190\u0191\5\u015c\u00af\2\u0191\u0197\5\u0168"+
		"\u00b5\2\u0192\u0196\5\b\5\2\u0193\u0196\5\f\7\2\u0194\u0196\7a\2\2\u0195"+
		"\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019b\5\u016a\u00b6\2\u019b\u019c\5\u0164\u00b3\2"+
		"\u019c\7\3\2\2\2\u019d\u019f\5\u00a0Q\2\u019e\u019d\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a8\3\2\2\2\u01a0\u01a2\5\u0160\u00b1\2\u01a1\u01a3\7"+
		"\62\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a6\7]\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\7/\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\5\u00d4k\2\u01ab\u01ad\5\u010e\u0088\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\u0164"+
		"\u00b3\2\u01af\t\3\2\2\2\u01b0\u01bb\5\32\16\2\u01b1\u01bb\5\26\f\2\u01b2"+
		"\u01bb\5\30\r\2\u01b3\u01bb\5\34\17\2\u01b4\u01bb\5B\"\2\u01b5\u01bb\5"+
		":\36\2\u01b6\u01bb\5\22\n\2\u01b7\u01bb\5\16\b\2\u01b8\u01bb\5\20\t\2"+
		"\u01b9\u01bb\7a\2\2\u01ba\u01b0\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b2"+
		"\3\2\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2"+
		"\2\2\u01bb\13\3\2\2\2\u01bc\u01be\5\u0160\u00b1\2\u01bd\u01bf\7\62\2\2"+
		"\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\7/\2\2\u01c1\u01c2\5\u0120\u0091\2\u01c2\u01c3\5\u0164\u00b3\2\u01c3"+
		"\r\3\2\2\2\u01c4\u01c6\5\u0160\u00b1\2\u01c5\u01c7\7\62\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cc\7/\2\2\u01c9"+
		"\u01cb\7a\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d0\5\u0120\u0091\2\u01d0\u01d1\5\u0164\u00b3\2\u01d1\17\3\2\2\2\u01d2"+
		"\u01d3\7^\2\2\u01d3\21\3\2\2\2\u01d4\u01d6\5\u00a0Q\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\5\u0160\u00b1"+
		"\2\u01d8\u01da\7\62\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01df\7/\2\2\u01dc\u01de\7a\2\2\u01dd\u01dc\3\2\2"+
		"\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5\u0170\u00b9\2\u01e3\u01e4\7"+
		"/\2\2\u01e4\u01e5\5\u0172\u00ba\2\u01e5\u01e9\5\u0168\u00b5\2\u01e6\u01e8"+
		"\5\24\13\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2"+
		"\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed"+
		"\5\u016a\u00b6\2\u01ed\u01ee\5\u0164\u00b3\2\u01ee\23\3\2\2\2\u01ef\u01f5"+
		"\5\u0160\u00b1\2\u01f0\u01f2\7/\2\2\u01f1\u01f3\5\u0156\u00ac\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\5\u011c"+
		"\u008f\2\u01f5\u01f0\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\5\u0164\u00b3\2\u01f8\25\3\2\2\2\u01f9\u01fb\5\u00a0Q\2\u01fa\u01f9"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5\u0160\u00b1"+
		"\2\u01fd\u0205\7\62\2\2\u01fe\u01ff\7/\2\2\u01ff\u0206\5\u0098M\2\u0200"+
		"\u0203\5\u0120\u0091\2\u0201\u0202\7/\2\2\u0202\u0204\5\u0098M\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01fe\3\2"+
		"\2\2\u0205\u0200\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5\u0164\u00b3"+
		"\2\u0208\27\3\2\2\2\u0209\u020b\5\u00a0Q\2\u020a\u0209\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0214\5\u0160\u00b1\2\u020d\u020e\7"+
		"/\2\2\u020e\u0215\5\u0098M\2\u020f\u0212\5\u0120\u0091\2\u0210\u0211\7"+
		"/\2\2\u0211\u0213\5\u0098M\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0215\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u020f\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0217\5\u0164\u00b3\2\u0217\31\3\2\2\2\u0218\u021a\5\u00a0"+
		"Q\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0221\3\2\2\2\u021b"+
		"\u0222\5\u0160\u00b1\2\u021c\u021d\5\u0170\u00b9\2\u021d\u021e\5\u0160"+
		"\u00b1\2\u021e\u021f\5\u00d8m\2\u021f\u0220\5\u0172\u00ba\2\u0220\u0222"+
		"\3\2\2\2\u0221\u021b\3\2\2\2\u0221\u021c\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\7/\2\2\u0224\u0225\5\u016c\u00b7\2\u0225\u0226\5V,\2\u0226\u0228"+
		"\t\2\2\2\u0227\u0229\7\62\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2"+
		"\u0229\u022b\3\2\2\2\u022a\u022c\7\61\2\2\u022b\u022a\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u0230\3\2\2\2\u022d\u022f\7a\2\2\u022e\u022d\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\5X-\2\u0234\u0235\5\u016e\u00b8\2"+
		"\u0235\u0239\5\u0168\u00b5\2\u0236\u0238\5\\/\2\u0237\u0236\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023d\5\u016a\u00b6\2\u023d\u023e\5\u0164"+
		"\u00b3\2\u023e\33\3\2\2\2\u023f\u0241\5\u00a0Q\2\u0240\u023f\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0248\3\2\2\2\u0242\u0249\5\u0160\u00b1\2\u0243\u0244"+
		"\5\u0170\u00b9\2\u0244\u0245\5\u0160\u00b1\2\u0245\u0246\5\u00d8m\2\u0246"+
		"\u0247\5\u0172\u00ba\2\u0247\u0249\3\2\2\2\u0248\u0242\3\2\2\2\u0248\u0243"+
		"\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u024c\7\62\2\2\u024b\u024a\3\2\2\2"+
		"\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0252\7/\2\2\u024e\u0253"+
		"\5.\30\2\u024f\u0253\5(\25\2\u0250\u0253\5,\27\2\u0251\u0253\5\36\20\2"+
		"\u0252\u024e\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0251"+
		"\3\2\2\2\u0253\u025d\3\2\2\2\u0254\u0259\7\20\2\2\u0255\u025a\5.\30\2"+
		"\u0256\u025a\5(\25\2\u0257\u025a\5,\27\2\u0258\u025a\5\36\20\2\u0259\u0255"+
		"\3\2\2\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0254\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0261\5\u0164\u00b3\2\u0261\35\3\2\2\2\u0262\u0266\5\u0168\u00b5\2\u0263"+
		"\u0265\5 \21\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026a\5\u016a\u00b6\2\u026a\37\3\2\2\2\u026b\u0270\5&\24\2\u026c\u0270"+
		"\5\"\22\2\u026d\u0270\5$\23\2\u026e\u0270\7a\2\2\u026f\u026b\3\2\2\2\u026f"+
		"\u026c\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270!\3\2\2\2"+
		"\u0271\u0273\5\u00a0Q\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\5\u0160\u00b1\2\u0275\u027d\7\62\2\2\u0276"+
		"\u0277\7/\2\2\u0277\u027e\5\u0098M\2\u0278\u027b\5\u0120\u0091\2\u0279"+
		"\u027a\7/\2\2\u027a\u027c\5\u0098M\2\u027b\u0279\3\2\2\2\u027b\u027c\3"+
		"\2\2\2\u027c\u027e\3\2\2\2\u027d\u0276\3\2\2\2\u027d\u0278\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0280\5\u0164\u00b3\2\u0280#\3\2\2\2\u0281\u0283"+
		"\5\u00a0Q\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2"+
		"\2\u0284\u028c\5\u0160\u00b1\2\u0285\u0286\7/\2\2\u0286\u028d\5\u0098"+
		"M\2\u0287\u028a\5\u0120\u0091\2\u0288\u0289\7/\2\2\u0289\u028b\5\u0098"+
		"M\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c"+
		"\u0285\3\2\2\2\u028c\u0287\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\5\u0164"+
		"\u00b3\2\u028f%\3\2\2\2\u0290\u0292\5\u00a0Q\2\u0291\u0290\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0299\3\2\2\2\u0293\u029a\5\u0160\u00b1\2\u0294\u0295"+
		"\5\u0170\u00b9\2\u0295\u0296\5\u0160\u00b1\2\u0296\u0297\5\u00d8m\2\u0297"+
		"\u0298\5\u0172\u00ba\2\u0298\u029a\3\2\2\2\u0299\u0293\3\2\2\2\u0299\u0294"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7/\2\2\u029c\u029d\5\u016c\u00b7"+
		"\2\u029d\u029e\5V,\2\u029e\u02a0\t\2\2\2\u029f\u02a1\7\62\2\2\u02a0\u029f"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a4\7\61\2\2"+
		"\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a8\3\2\2\2\u02a5\u02a7"+
		"\7a\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\5X"+
		"-\2\u02ac\u02ad\5\u016e\u00b8\2\u02ad\u02b1\5\u0168\u00b5\2\u02ae\u02b0"+
		"\5\\/\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\5\u016a"+
		"\u00b6\2\u02b5\u02b6\5\u0164\u00b3\2\u02b6\'\3\2\2\2\u02b7\u02c1\7\63"+
		"\2\2\u02b8\u02ba\7\60\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bf\5\u0160\u00b1\2\u02bc\u02bd\5\u0166\u00b4\2"+
		"\u02bd\u02be\5\u0160\u00b1\2\u02be\u02c0\3\2\2\2\u02bf\u02bc\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c7\5\u0168\u00b5\2\u02c4\u02c6\5*\26"+
		"\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\5\u016a\u00b6"+
		"\2\u02cb)\3\2\2\2\u02cc\u02d5\5\64\33\2\u02cd\u02d5\5\60\31\2\u02ce\u02d5"+
		"\5\62\32\2\u02cf\u02d5\58\35\2\u02d0\u02d5\5@!\2\u02d1\u02d5\5<\37\2\u02d2"+
		"\u02d5\5> \2\u02d3\u02d5\7a\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cd\3\2\2"+
		"\2\u02d4\u02ce\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1"+
		"\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5+\3\2\2\2\u02d6"+
		"\u02d7\5\u0120\u0091\2\u02d7-\3\2\2\2\u02d8\u02da\5\u00a0Q\2\u02d9\u02d8"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\5\u016c\u00b7"+
		"\2\u02dc\u02dd\5V,\2\u02dd\u02de\7\33\2\2\u02de\u02e0\7\63\2\2\u02df\u02e1"+
		"\7\60\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e8\3\2\2\2"+
		"\u02e2\u02e6\5\u0160\u00b1\2\u02e3\u02e4\5\u0166\u00b4\2\u02e4\u02e5\5"+
		"\u0160\u00b1\2\u02e5\u02e7\3\2\2\2\u02e6\u02e3\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e2\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02f1\5\u016e\u00b8\2\u02eb\u02ed\5\u016c\u00b7\2"+
		"\u02ec\u02ee\5\u009eP\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\5\u016e\u00b8\2\u02f0\u02f2\3\2\2\2\u02f1\u02eb"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f7\5\u0168\u00b5"+
		"\2\u02f4\u02f6\5\\/\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fb\5\u016a\u00b6\2\u02fb/\3\2\2\2\u02fc\u02fe\5\u00a0Q\2\u02fd\u02fc"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\5\u0160\u00b1"+
		"\2\u0300\u0308\7\62\2\2\u0301\u0302\7/\2\2\u0302\u0309\5\u0098M\2\u0303"+
		"\u0306\5\u0120\u0091\2\u0304\u0305\7/\2\2\u0305\u0307\5\u0098M\2\u0306"+
		"\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0301\3\2"+
		"\2\2\u0308\u0303\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\5\u0164\u00b3"+
		"\2\u030b\61\3\2\2\2\u030c\u030e\5\u00a0Q\2\u030d\u030c\3\2\2\2\u030d\u030e"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0317\5\u0160\u00b1\2\u0310\u0311\7"+
		"/\2\2\u0311\u0318\5\u0098M\2\u0312\u0315\5\u0120\u0091\2\u0313\u0314\7"+
		"/\2\2\u0314\u0316\5\u0098M\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0318\3\2\2\2\u0317\u0310\3\2\2\2\u0317\u0312\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319\u031a\5\u0164\u00b3\2\u031a\63\3\2\2\2\u031b\u031d\5\u00a0"+
		"Q\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0324\3\2\2\2\u031e"+
		"\u0325\5\u0160\u00b1\2\u031f\u0320\5\u0170\u00b9\2\u0320\u0321\5\u0160"+
		"\u00b1\2\u0321\u0322\5\u00d8m\2\u0322\u0323\5\u0172\u00ba\2\u0323\u0325"+
		"\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u031f\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\7/\2\2\u0327\u0328\5\u016c\u00b7\2\u0328\u0329\5V,\2\u0329\u032b"+
		"\t\2\2\2\u032a\u032c\7\62\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2"+
		"\u032c\u032e\3\2\2\2\u032d\u032f\7\61\2\2\u032e\u032d\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0333\3\2\2\2\u0330\u0332\7a\2\2\u0331\u0330\3\2\2\2\u0332"+
		"\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0336\u0337\5X-\2\u0337\u0338\5\u016e\u00b8\2"+
		"\u0338\u033c\5\u0168\u00b5\2\u0339\u033b\5\\/\2\u033a\u0339\3\2\2\2\u033b"+
		"\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2"+
		"\2\2\u033e\u033c\3\2\2\2\u033f\u0340\5\u016a\u00b6\2\u0340\u0341\5\u0164"+
		"\u00b3\2\u0341\65\3\2\2\2\u0342\u0347\5\u0160\u00b1\2\u0343\u0344\5\u016c"+
		"\u00b7\2\u0344\u0345\5\u0160\u00b1\2\u0345\u0346\5\u016e\u00b8\2\u0346"+
		"\u0348\3\2\2\2\u0347\u0343\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034b\5\u0168\u00b5\2\u034a\u034c\5\\/\2\u034b\u034a\3\2\2"+
		"\2\u034c\u034d\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u0350\5\u016a\u00b6\2\u0350\u0351\5\u0164\u00b3\2\u0351"+
		"\67\3\2\2\2\u0352\u0353\5\u0160\u00b1\2\u0353\u0354\7\62\2\2\u0354\u0355"+
		"\5\u0170\u00b9\2\u0355\u0356\7\33\2\2\u0356\u0357\5\u0172\u00ba\2\u0357"+
		"\u0358\5\u00d4k\2\u0358\u0359\5\u0164\u00b3\2\u03599\3\2\2\2\u035a\u0361"+
		"\5\u0160\u00b1\2\u035b\u035c\5\u0170\u00b9\2\u035c\u035d\5\u0160\u00b1"+
		"\2\u035d\u035e\5\u00d8m\2\u035e\u035f\5\u0172\u00ba\2\u035f\u0361\3\2"+
		"\2\2\u0360\u035a\3\2\2\2\u0360\u035b\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0366\7\t\2\2\u0363\u0367\5.\30\2\u0364\u0367\5(\25\2\u0365\u0367\5,"+
		"\27\2\u0366\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367"+
		"\u0370\3\2\2\2\u0368\u036c\7\20\2\2\u0369\u036d\5.\30\2\u036a\u036d\5"+
		"(\25\2\u036b\u036d\5,\27\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036c"+
		"\u036b\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0368\3\2\2\2\u036f\u0372\3\2"+
		"\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372"+
		"\u0370\3\2\2\2\u0373\u0374\5\u0164\u00b3\2\u0374;\3\2\2\2\u0375\u0377"+
		"\5\u00a0Q\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2"+
		"\2\u0378\u037a\7\25\2\2\u0379\u037b\7]\2\2\u037a\u0379\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\5\u0160\u00b1\2\u037d\u0385\7"+
		"\62\2\2\u037e\u037f\7/\2\2\u037f\u0386\5\u0098M\2\u0380\u0383\5\u0120"+
		"\u0091\2\u0381\u0382\7/\2\2\u0382\u0384\5\u0098M\2\u0383\u0381\3\2\2\2"+
		"\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u037e\3\2\2\2\u0385\u0380"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\5\u0164\u00b3\2\u0388=\3\2\2"+
		"\2\u0389\u038b\5\u00a0Q\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u038e\7\25\2\2\u038d\u038f\7]\2\2\u038e\u038d\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0398\5\u0160\u00b1"+
		"\2\u0391\u0392\7/\2\2\u0392\u0399\5\u0098M\2\u0393\u0396\5\u0120\u0091"+
		"\2\u0394\u0395\7/\2\2\u0395\u0397\5\u0098M\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u0391\3\2\2\2\u0398\u0393\3\2"+
		"\2\2\u0399\u039a\3\2\2\2\u039a\u039b\5\u0164\u00b3\2\u039b?\3\2\2\2\u039c"+
		"\u039e\5\u00a0Q\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a1\7\25\2\2\u03a0\u03a2\7]\2\2\u03a1\u03a0\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a9\3\2\2\2\u03a3\u03aa\5\u0160\u00b1\2\u03a4\u03a5"+
		"\5\u0170\u00b9\2\u03a5\u03a6\5\u0160\u00b1\2\u03a6\u03a7\5\u00d8m\2\u03a7"+
		"\u03a8\5\u0172\u00ba\2\u03a8\u03aa\3\2\2\2\u03a9\u03a3\3\2\2\2\u03a9\u03a4"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\7/\2\2\u03ac\u03ad\5\u016c\u00b7"+
		"\2\u03ad\u03ae\5V,\2\u03ae\u03b0\t\2\2\2\u03af\u03b1\7\62\2\2\u03b0\u03af"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b4\7\61\2\2"+
		"\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b8\3\2\2\2\u03b5\u03b7"+
		"\7a\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\5X"+
		"-\2\u03bc\u03bd\5\u016e\u00b8\2\u03bd\u03c1\5\u0168\u00b5\2\u03be\u03c0"+
		"\5\\/\2\u03bf\u03be\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c5\5\u016a"+
		"\u00b6\2\u03c5\u03c6\5\u0164\u00b3\2\u03c6A\3\2\2\2\u03c7\u03c9\5\u00a0"+
		"Q\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03d0\3\2\2\2\u03ca"+
		"\u03d1\5\u0160\u00b1\2\u03cb\u03cc\5\u0170\u00b9\2\u03cc\u03cd\5\u0160"+
		"\u00b1\2\u03cd\u03ce\5\u00d8m\2\u03ce\u03cf\5\u0172\u00ba\2\u03cf\u03d1"+
		"\3\2\2\2\u03d0\u03ca\3\2\2\2\u03d0\u03cb\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2"+
		"\u03d4\7\62\2\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3"+
		"\2\2\2\u03d5\u03f8\7/\2\2\u03d6\u03de\5D#\2\u03d7\u03da\7\20\2\2\u03d8"+
		"\u03db\5D#\2\u03d9\u03db\5,\27\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2"+
		"\2\u03db\u03dd\3\2\2\2\u03dc\u03d7\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03f9\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1"+
		"\u03e9\5,\27\2\u03e2\u03e5\7\20\2\2\u03e3\u03e6\5D#\2\u03e4\u03e6\5,\27"+
		"\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e2"+
		"\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ed\7\20\2\2\u03ed\u03f5\5"+
		"D#\2\u03ee\u03f1\7\20\2\2\u03ef\u03f2\5D#\2\u03f0\u03f2\5,\27\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03ee\3\2"+
		"\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03d6\3\2\2\2\u03f8\u03e1\3\2"+
		"\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\5\u0164\u00b3\2\u03fbC\3\2\2\2\u03fc"+
		"\u03fd\7\63\2\2\u03fd\u0407\7\63\2\2\u03fe\u0400\7\60\2\2\u03ff\u03fe"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0405\5\u0160\u00b1"+
		"\2\u0402\u0403\5\u0166\u00b4\2\u0403\u0404\5\u0160\u00b1\2\u0404\u0406"+
		"\3\2\2\2\u0405\u0402\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407"+
		"\u03ff\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040d\5\u0168"+
		"\u00b5\2\u040a\u040c\5F$\2\u040b\u040a\3\2\2\2\u040c\u040f\3\2\2\2\u040d"+
		"\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040d\3\2"+
		"\2\2\u0410\u0411\5\u016a\u00b6\2\u0411E\3\2\2\2\u0412\u0416\5J&\2\u0413"+
		"\u0416\5H%\2\u0414\u0416\7a\2\2\u0415\u0412\3\2\2\2\u0415\u0413\3\2\2"+
		"\2\u0415\u0414\3\2\2\2\u0416G\3\2\2\2\u0417\u0419\5\u00a0Q\2\u0418\u0417"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\5\u0160\u00b1"+
		"\2\u041b\u041d\7\62\2\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u0425\3\2\2\2\u041e\u041f\7/\2\2\u041f\u0426\5\u0098M\2\u0420\u0423\5"+
		"\u0120\u0091\2\u0421\u0422\7/\2\2\u0422\u0424\5\u0098M\2\u0423\u0421\3"+
		"\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u041e\3\2\2\2\u0425"+
		"\u0420\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\5\u0164\u00b3\2\u0428I"+
		"\3\2\2\2\u0429\u042b\5\u00a0Q\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2"+
		"\2\u042b\u0432\3\2\2\2\u042c\u0433\5\u0160\u00b1\2\u042d\u042e\5\u0170"+
		"\u00b9\2\u042e\u042f\5\u0160\u00b1\2\u042f\u0430\5\u00d8m\2\u0430\u0431"+
		"\5\u0172\u00ba\2\u0431\u0433\3\2\2\2\u0432\u042c\3\2\2\2\u0432\u042d\3"+
		"\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\5\u016c\u00b7\2\u0435\u0436\5V"+
		",\2\u0436\u0438\t\2\2\2\u0437\u0439\7\62\2\2\u0438\u0437\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u043c\7\61\2\2\u043b\u043a\3"+
		"\2\2\2\u043b\u043c\3\2\2\2\u043c\u0440\3\2\2\2\u043d\u043f\7a\2\2\u043e"+
		"\u043d\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441\u0443\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0444\5X-\2\u0444\u0445"+
		"\5\u016e\u00b8\2\u0445\u0446\5\u0164\u00b3\2\u0446K\3\2\2\2\u0447\u044e"+
		"\5\u0160\u00b1\2\u0448\u0449\5\u0170\u00b9\2\u0449\u044a\5\u0160\u00b1"+
		"\2\u044a\u044b\5\u00d8m\2\u044b\u044c\5\u0172\u00ba\2\u044c\u044e\3\2"+
		"\2\2\u044d\u0447\3\2\2\2\u044d\u0448\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0450\7/\2\2\u0450\u0451\5\u016c\u00b7\2\u0451\u0452\5V,\2\u0452\u0454"+
		"\t\2\2\2\u0453\u0455\7\62\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2"+
		"\u0455\u0457\3\2\2\2\u0456\u0458\7\61\2\2\u0457\u0456\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u045c\3\2\2\2\u0459\u045b\7a\2\2\u045a\u0459\3\2\2\2\u045b"+
		"\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2"+
		"\2\2\u045e\u045c\3\2\2\2\u045f\u0460\5X-\2\u0460\u0461\5\u016e\u00b8\2"+
		"\u0461\u0465\5\u0168\u00b5\2\u0462\u0464\5\\/\2\u0463\u0462\3\2\2\2\u0464"+
		"\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2"+
		"\2\2\u0467\u0465\3\2\2\2\u0468\u0469\5\u016a\u00b6\2\u0469\u046a\5\u0164"+
		"\u00b3\2\u046aM\3\2\2\2\u046b\u046d\7\34\2\2\u046c\u046e\5\u0094K\2\u046d"+
		"\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\5\u0164"+
		"\u00b3\2\u0470O\3\2\2\2\u0471\u0473\7\32\2\2\u0472\u0474\5\u0094K\2\u0473"+
		"\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\5\u0164"+
		"\u00b3\2\u0476Q\3\2\2\2\u0477\u0478\7\61\2\2\u0478\u0479\7\34\2\2\u0479"+
		"\u047a\5\u0094K\2\u047a\u047b\5\u0164\u00b3\2\u047bS\3\2\2\2\u047c\u047d"+
		"\7\61\2\2\u047d\u047e\7\34\2\2\u047e\u047f\5\u0164\u00b3\2\u047fU\3\2"+
		"\2\2\u0480\u0482\5Z.\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0488"+
		"\3\2\2\2\u0483\u0484\5\u0166\u00b4\2\u0484\u0485\5Z.\2\u0485\u0487\3\2"+
		"\2\2\u0486\u0483\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489W\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048d\5Z.\2\u048c"+
		"\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u0493\3\2\2\2\u048e\u048f\5\u0166"+
		"\u00b4\2\u048f\u0490\5Z.\2\u0490\u0492\3\2\2\2\u0491\u048e\3\2\2\2\u0492"+
		"\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494Y\3\2\2\2"+
		"\u0495\u0493\3\2\2\2\u0496\u0498\5\u00a0Q\2\u0497\u0496\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\5\u0160\u00b1\2\u049a\u049c"+
		"\7\62\2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2\2"+
		"\u049d\u049f\t\3\2\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0"+
		"\3\2\2\2\u04a0\u04a3\5\u0120\u0091\2\u04a1\u04a2\7/\2\2\u04a2\u04a4\5"+
		"\u0098M\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4[\3\2\2\2\u04a5"+
		"\u04bc\5N(\2\u04a6\u04bc\5P)\2\u04a7\u04bc\5R*\2\u04a8\u04bc\5T+\2\u04a9"+
		"\u04bc\5^\60\2\u04aa\u04bc\5d\63\2\u04ab\u04bc\5l\67\2\u04ac\u04bc\5n"+
		"8\2\u04ad\u04bc\5p9\2\u04ae\u04bc\5t;\2\u04af\u04bc\5v<\2\u04b0\u04bc"+
		"\5z>\2\u04b1\u04bc\5x=\2\u04b2\u04bc\5\u0080A\2\u04b3\u04bc\5L\'\2\u04b4"+
		"\u04bc\5\u0084C\2\u04b5\u04bc\5\u0086D\2\u04b6\u04bc\5\u0088E\2\u04b7"+
		"\u04bc\5\u008aF\2\u04b8\u04bc\5\u008cG\2\u04b9\u04bc\5\u008eH\2\u04ba"+
		"\u04bc\7a\2\2\u04bb\u04a5\3\2\2\2\u04bb\u04a6\3\2\2\2\u04bb\u04a7\3\2"+
		"\2\2\u04bb\u04a8\3\2\2\2\u04bb\u04a9\3\2\2\2\u04bb\u04aa\3\2\2\2\u04bb"+
		"\u04ab\3\2\2\2\u04bb\u04ac\3\2\2\2\u04bb\u04ad\3\2\2\2\u04bb\u04ae\3\2"+
		"\2\2\u04bb\u04af\3\2\2\2\u04bb\u04b0\3\2\2\2\u04bb\u04b1\3\2\2\2\u04bb"+
		"\u04b2\3\2\2\2\u04bb\u04b3\3\2\2\2\u04bb\u04b4\3\2\2\2\u04bb\u04b5\3\2"+
		"\2\2\u04bb\u04b6\3\2\2\2\u04bb\u04b7\3\2\2\2\u04bb\u04b8\3\2\2\2\u04bb"+
		"\u04b9\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc]\3\2\2\2\u04bd\u04be\7\60\2\2"+
		"\u04be\u04bf\5\u0098M\2\u04bf\u04c1\7/\2\2\u04c0\u04c2\5`\61\2\u04c1\u04c0"+
		"\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\3\2\2\2\u04c5\u04c6\5\u0164\u00b3\2\u04c6_\3\2\2\2\u04c7\u04cd"+
		"\5b\62\2\u04c8\u04c9\5\u0166\u00b4\2\u04c9\u04ca\5b\62\2\u04ca\u04cc\3"+
		"\2\2\2\u04cb\u04c8\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d4\5\u0168"+
		"\u00b5\2\u04d1\u04d3\5\\/\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4"+
		"\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d4\3\2"+
		"\2\2\u04d7\u04d8\5\u016a\u00b6\2\u04d8a\3\2\2\2\u04d9\u04e1\7]\2\2\u04da"+
		"\u04e1\5\u0098M\2\u04db\u04de\5\u0160\u00b1\2\u04dc\u04de\7]\2\2\u04dd"+
		"\u04db\3\2\2\2\u04dd\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\5\u0120"+
		"\u0091\2\u04e0\u04d9\3\2\2\2\u04e0\u04da\3\2\2\2\u04e0\u04dd\3\2\2\2\u04e1"+
		"c\3\2\2\2\u04e2\u04e6\5h\65\2\u04e3\u04e5\5j\66\2\u04e4\u04e3\3\2\2\2"+
		"\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9"+
		"\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\5f\64\2\u04ea\u04eb\5\u0164\u00b3"+
		"\2\u04eb\u04f6\3\2\2\2\u04ec\u04f0\5h\65\2\u04ed\u04ef\5j\66\2\u04ee\u04ed"+
		"\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f3\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f4\5\u0164\u00b3\2\u04f4\u04f6"+
		"\3\2\2\2\u04f5\u04e2\3\2\2\2\u04f5\u04ec\3\2\2\2\u04f6e\3\2\2\2\u04f7"+
		"\u04f8\7]\2\2\u04f8\u04fc\5\u0168\u00b5\2\u04f9\u04fb\5\\/\2\u04fa\u04f9"+
		"\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u04ff\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0500\5\u016a\u00b6\2\u0500g"+
		"\3\2\2\2\u0501\u0502\7\60\2\2\u0502\u0503\5\u0098M\2\u0503\u0507\5\u0168"+
		"\u00b5\2\u0504\u0506\5\\/\2\u0505\u0504\3\2\2\2\u0506\u0509\3\2\2\2\u0507"+
		"\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0507\3\2"+
		"\2\2\u050a\u050b\5\u016a\u00b6\2\u050bi\3\2\2\2\u050c\u050d\5\u0098M\2"+
		"\u050d\u0511\5\u0168\u00b5\2\u050e\u0510\5\\/\2\u050f\u050e\3\2\2\2\u0510"+
		"\u0513\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2"+
		"\2\2\u0513\u0511\3\2\2\2\u0514\u0515\5\u016a\u00b6\2\u0515k\3\2\2\2\u0516"+
		"\u0517\7\61\2\2\u0517\u0519\5\u0160\u00b1\2\u0518\u051a\7\62\2\2\u0519"+
		"\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\7/"+
		"\2\2\u051c\u051d\5\u0082B\2\u051d\u0521\5\u0168\u00b5\2\u051e\u0520\5"+
		"\\/\2\u051f\u051e\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u0526\5\u016a"+
		"\u00b6\2\u0525\u0527\5r:\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u0529\5\u0164\u00b3\2\u0529m\3\2\2\2\u052a\u052f"+
		"\7\61\2\2\u052b\u052c\5\u0170\u00b9\2\u052c\u052d\5\u0160\u00b1\2\u052d"+
		"\u052e\5\u0172\u00ba\2\u052e\u0530\3\2\2\2\u052f\u052b\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\5\u0160\u00b1\2\u0532\u0534\7"+
		"\62\2\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\7/\2\2\u0536\u0537\5\u0098M\2\u0537\u053b\5\u0168\u00b5\2\u0538"+
		"\u053a\5\\/\2\u0539\u0538\3\2\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u053b\3\2\2\2\u053e"+
		"\u0540\5\u016a\u00b6\2\u053f\u0541\5r:\2\u0540\u053f\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\5\u0164\u00b3\2\u0543o\3\2\2"+
		"\2\u0544\u0545\7\61\2\2\u0545\u0546\5\u0098M\2\u0546\u054a\5\u0168\u00b5"+
		"\2\u0547\u0549\5\\/\2\u0548\u0547\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548"+
		"\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u054a\3\2\2\2\u054d"+
		"\u054f\5\u016a\u00b6\2\u054e\u0550\5r:\2\u054f\u054e\3\2\2\2\u054f\u0550"+
		"\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\5\u0164\u00b3\2\u0552q\3\2\2"+
		"\2\u0553\u0554\7]\2\2\u0554\u0558\5\u0168\u00b5\2\u0555\u0557\5\\/\2\u0556"+
		"\u0555\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055b\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055c\5\u016a\u00b6"+
		"\2\u055cs\3\2\2\2\u055d\u055e\7\64\2\2\u055e\u055f\7\61\2\2\u055f\u0560"+
		"\5\u0164\u00b3\2\u0560u\3\2\2\2\u0561\u0562\7\33\2\2\u0562\u0563\7\61"+
		"\2\2\u0563\u0564\5\u0164\u00b3\2\u0564w\3\2\2\2\u0565\u0566\7\62\2\2\u0566"+
		"\u056a\5\u0168\u00b5\2\u0567\u0569\5\\/\2\u0568\u0567\3\2\2\2\u0569\u056c"+
		"\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c"+
		"\u056a\3\2\2\2\u056d\u0571\5\u016a\u00b6\2\u056e\u0570\5|?\2\u056f\u056e"+
		"\3\2\2\2\u0570\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572"+
		"\u0574\3\2\2\2\u0573\u0571\3\2\2\2\u0574\u0575\5~@\2\u0575\u0576\5\u0164"+
		"\u00b3\2\u0576\u0588\3\2\2\2\u0577\u0578\7\62\2\2\u0578\u057c\5\u0168"+
		"\u00b5\2\u0579\u057b\5\\/\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c"+
		"\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2"+
		"\2\2\u057f\u0581\5\u016a\u00b6\2\u0580\u0582\5|?\2\u0581\u0580\3\2\2\2"+
		"\u0582\u0583\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585"+
		"\3\2\2\2\u0585\u0586\5\u0164\u00b3\2\u0586\u0588\3\2\2\2\u0587\u0565\3"+
		"\2\2\2\u0587\u0577\3\2\2\2\u0588y\3\2\2\2\u0589\u058a\7\62\2\2\u058a\u058c"+
		"\5\u0098M\2\u058b\u058d\7\62\2\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2"+
		"\2\u058d\u058f\3\2\2\2\u058e\u0590\5\u0120\u0091\2\u058f\u058e\3\2\2\2"+
		"\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7/\2\2\u0592\u0593"+
		"\5\u0098M\2\u0593\u0594\5\u0164\u00b3\2\u0594{\3\2\2\2\u0595\u059a\5\u0160"+
		"\u00b1\2\u0596\u0597\5\u0160\u00b1\2\u0597\u0598\5\u0120\u0091\2\u0598"+
		"\u059a\3\2\2\2\u0599\u0595\3\2\2\2\u0599\u0596\3\2\2\2\u059a\u059b\3\2"+
		"\2\2\u059b\u059f\5\u0168\u00b5\2\u059c\u059e\5\\/\2\u059d\u059c\3\2\2"+
		"\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2"+
		"\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a3\5\u016a\u00b6\2\u05a3}\3\2\2"+
		"\2\u05a4\u05a5\7]\2\2\u05a5\u05a9\5\u0168\u00b5\2\u05a6\u05a8\5\\/\2\u05a7"+
		"\u05a6\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad\5\u016a\u00b6"+
		"\2\u05ad\177\3\2\2\2\u05ae\u05af\7\62\2\2\u05af\u05b0\7\34\2\2\u05b0\u05b1"+
		"\5\u0098M\2\u05b1\u05b2\5\u0164\u00b3\2\u05b2\u0081\3\2\2\2\u05b3\u05b4"+
		"\5\u0098M\2\u05b4\u05b9\t\4\2\2\u05b5\u05b6\5\u016c\u00b7\2\u05b6\u05b7"+
		"\5\u0098M\2\u05b7\u05b8\5\u016e\u00b8\2\u05b8\u05ba\3\2\2\2\u05b9\u05b5"+
		"\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\5\u0098M"+
		"\2\u05bc\u0083\3\2\2\2\u05bd\u05be\5\u0160\u00b1\2\u05be\u05bf\7\62\2"+
		"\2\u05bf\u05c0\5\u0120\u0091\2\u05c0\u05c1\5\u0164\u00b3\2\u05c1\u0085"+
		"\3\2\2\2\u05c2\u05c3\5\u0160\u00b1\2\u05c3\u05c4\5\u0120\u0091\2\u05c4"+
		"\u05c5\5\u0164\u00b3\2\u05c5\u0087\3\2\2\2\u05c6\u05cc\5\u0090I\2\u05c7"+
		"\u05c8\5\u0166\u00b4\2\u05c8\u05c9\5\u0090I\2\u05c9\u05cb\3\2\2\2\u05ca"+
		"\u05c7\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2"+
		"\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05d0\7/\2\2\u05d0"+
		"\u05d1\5\u0094K\2\u05d1\u05d2\5\u0164\u00b3\2\u05d2\u0089\3\2\2\2\u05d3"+
		"\u05d9\5\u0092J\2\u05d4\u05d5\5\u0166\u00b4\2\u05d5\u05d6\5\u0092J\2\u05d6"+
		"\u05d8\3\2\2\2\u05d7\u05d4\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2"+
		"\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc"+
		"\u05dd\7/\2\2\u05dd\u05de\5\u0094K\2\u05de\u05df\5\u0164\u00b3\2\u05df"+
		"\u008b\3\2\2\2\u05e0\u05e1\5\u0094K\2\u05e1\u05e2\5\u0154\u00ab\2\u05e2"+
		"\u05e3\5\u0094K\2\u05e3\u05e4\5\u0164\u00b3\2\u05e4\u008d\3\2\2\2\u05e5"+
		"\u05e6\5\u0098M\2\u05e6\u05e7\5\u0164\u00b3\2\u05e7\u008f\3\2\2\2\u05e8"+
		"\u05e9\5\u0160\u00b1\2\u05e9\u05eb\7\62\2\2\u05ea\u05ec\5\u0120\u0091"+
		"\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05ef"+
		"\7]\2\2\u05ee\u05e8\3\2\2\2\u05ee\u05ed\3\2\2\2\u05ef\u0091\3\2\2\2\u05f0"+
		"\u05f2\5\u0160\u00b1\2\u05f1\u05f3\5\u0120\u0091\2\u05f2\u05f1\3\2\2\2"+
		"\u05f2\u05f3\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f6\7]\2\2\u05f5\u05f0"+
		"\3\2\2\2\u05f5\u05f4\3\2\2\2\u05f6\u0093\3\2\2\2\u05f7\u05fd\5\u0098M"+
		"\2\u05f8\u05f9\5\u0166\u00b4\2\u05f9\u05fa\5\u0098M\2\u05fa\u05fc\3\2"+
		"\2\2\u05fb\u05f8\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u0095\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0601\5\u0170"+
		"\u00b9\2\u0601\u0602\5\u0160\u00b1\2\u0602\u0603\5\u00dco\2\u0603\u0604"+
		"\5\u0172\u00ba\2\u0604\u060d\3\2\2\2\u0605\u060d\5\u0160\u00b1\2\u0606"+
		"\u060d\7]\2\2\u0607\u0608\5\u016c\u00b7\2\u0608\u0609\5\u0098M\2\u0609"+
		"\u060a\5\u016e\u00b8\2\u060a\u060d\3\2\2\2\u060b\u060d\5\u010c\u0087\2"+
		"\u060c\u0600\3\2\2\2\u060c\u0605\3\2\2\2\u060c\u0606\3\2\2\2\u060c\u0607"+
		"\3\2\2\2\u060c\u060b\3\2\2\2\u060d\u0097\3\2\2\2\u060e\u060f\bM\1\2\u060f"+
		"\u0623\5\u00f0y\2\u0610\u0623\5\u0096L\2\u0611\u0623\5\u00b4[\2\u0612"+
		"\u0623\5\u00aeX\2\u0613\u0623\5\u00aaV\2\u0614\u0623\5\u00c6d\2\u0615"+
		"\u0623\5\u00c8e\2\u0616\u0623\5\u00dep\2\u0617\u0623\5\u00e8u\2\u0618"+
		"\u0623\5\u00e2r\2\u0619\u0623\5\u00eav\2\u061a\u0623\5\u00eex\2\u061b"+
		"\u0623\5\u00ecw\2\u061c\u0623\5\u00f6|\2\u061d\u0623\5\u00fe\u0080\2\u061e"+
		"\u0623\5\u0102\u0082\2\u061f\u0623\5\u0104\u0083\2\u0620\u0623\5\u0108"+
		"\u0085\2\u0621\u0623\5\u00b6\\\2\u0622\u060e\3\2\2\2\u0622\u0610\3\2\2"+
		"\2\u0622\u0611\3\2\2\2\u0622\u0612\3\2\2\2\u0622\u0613\3\2\2\2\u0622\u0614"+
		"\3\2\2\2\u0622\u0615\3\2\2\2\u0622\u0616\3\2\2\2\u0622\u0617\3\2\2\2\u0622"+
		"\u0618\3\2\2\2\u0622\u0619\3\2\2\2\u0622\u061a\3\2\2\2\u0622\u061b\3\2"+
		"\2\2\u0622\u061c\3\2\2\2\u0622\u061d\3\2\2\2\u0622\u061e\3\2\2\2\u0622"+
		"\u061f\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0621\3\2\2\2\u0623\u065a\3\2"+
		"\2\2\u0624\u0625\f\f\2\2\u0625\u0626\5\u00b0Y\2\u0626\u0627\5\u0098M\r"+
		"\u0627\u0659\3\2\2\2\u0628\u0629\f\13\2\2\u0629\u062a\5\u015a\u00ae\2"+
		"\u062a\u062b\5\u0098M\f\u062b\u0659\3\2\2\2\u062c\u062d\f\n\2\2\u062d"+
		"\u062e\5\u0158\u00ad\2\u062e\u062f\5\u0098M\13\u062f\u0659\3\2\2\2\u0630"+
		"\u0631\f\t\2\2\u0631\u0632\5\u0156\u00ac\2\u0632\u0633\5\u0098M\n\u0633"+
		"\u0659\3\2\2\2\u0634\u0635\f\b\2\2\u0635\u0636\5\u0140\u00a1\2\u0636\u0637"+
		"\5\u0098M\t\u0637\u0659\3\2\2\2\u0638\u0639\f\5\2\2\u0639\u063a\5\u014e"+
		"\u00a8\2\u063a\u063b\5\u0098M\6\u063b\u0659\3\2\2\2\u063c\u063d\f\4\2"+
		"\2\u063d\u063e\5\u0150\u00a9\2\u063e\u063f\5\u0098M\5\u063f\u0659\3\2"+
		"\2\2\u0640\u0641\f\3\2\2\u0641\u0642\5\u0152\u00aa\2\u0642\u0643\5\u0098"+
		"M\4\u0643\u0659\3\2\2\2\u0644\u0645\f\25\2\2\u0645\u0659\7\62\2\2\u0646"+
		"\u0647\f\24\2\2\u0647\u0659\7\60\2\2\u0648\u0649\f\23\2\2\u0649\u0659"+
		"\5\u00b8]\2\u064a\u064b\f\22\2\2\u064b\u0659\5\u00a8U\2\u064c\u064d\f"+
		"\20\2\2\u064d\u0659\5\u00aeX\2\u064e\u064f\f\17\2\2\u064f\u0659\5\u00b2"+
		"Z\2\u0650\u0651\f\16\2\2\u0651\u0659\5\u00acW\2\u0652\u0653\f\r\2\2\u0653"+
		"\u0659\5\u009aN\2\u0654\u0655\f\7\2\2\u0655\u0659\5\u00ba^\2\u0656\u0657"+
		"\f\6\2\2\u0657\u0659\5\u00bc_\2\u0658\u0624\3\2\2\2\u0658\u0628\3\2\2"+
		"\2\u0658\u062c\3\2\2\2\u0658\u0630\3\2\2\2\u0658\u0634\3\2\2\2\u0658\u0638"+
		"\3\2\2\2\u0658\u063c\3\2\2\2\u0658\u0640\3\2\2\2\u0658\u0644\3\2\2\2\u0658"+
		"\u0646\3\2\2\2\u0658\u0648\3\2\2\2\u0658\u064a\3\2\2\2\u0658\u064c\3\2"+
		"\2\2\u0658\u064e\3\2\2\2\u0658\u0650\3\2\2\2\u0658\u0652\3\2\2\2\u0658"+
		"\u0654\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2"+
		"\2\2\u065a\u065b\3\2\2\2\u065b\u0099\3\2\2\2\u065c\u065a\3\2\2\2\u065d"+
		"\u065f\5\u015c\u00af\2\u065e\u0660\7a\2\2\u065f\u065e\3\2\2\2\u065f\u0660"+
		"\3\2\2\2\u0660\u0667\3\2\2\2\u0661\u0668\5\u0160\u00b1\2\u0662\u0663\5"+
		"\u0170\u00b9\2\u0663\u0664\5\u0160\u00b1\2\u0664\u0665\5\u00dco\2\u0665"+
		"\u0666\5\u0172\u00ba\2\u0666\u0668\3\2\2\2\u0667\u0661\3\2\2\2\u0667\u0662"+
		"\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u066c\5\u00a8U\2\u066a\u066c\5\u00b2"+
		"Z\2\u066b\u0669\3\2\2\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u009b\3\2\2\2\u066d\u0677\5\u016c\u00b7\2\u066e\u0674\5\u0098M\2\u066f"+
		"\u0670\5\u0166\u00b4\2\u0670\u0671\5\u0098M\2\u0671\u0673\3\2\2\2\u0672"+
		"\u066f\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0677\u066e\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\5\u016e\u00b8\2\u067a\u009d"+
		"\3\2\2\2\u067b\u0681\5\u0098M\2\u067c\u067d\5\u0166\u00b4\2\u067d\u067e"+
		"\5\u0098M\2\u067e\u0680\3\2\2\2\u067f\u067c\3\2\2\2\u0680\u0683\3\2\2"+
		"\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u009f\3\2\2\2\u0683\u0681"+
		"\3\2\2\2\u0684\u0686\5\u00a2R\2\u0685\u0687\7a\2\2\u0686\u0685\3\2\2\2"+
		"\u0686\u0687\3\2\2\2\u0687\u00a1\3\2\2\2\u0688\u068c\7&\2\2\u0689\u068a"+
		"\5\u0160\u00b1\2\u068a\u068b\7\33\2\2\u068b\u068d\3\2\2\2\u068c\u0689"+
		"\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f\5\u00a4S"+
		"\2\u068f\u0690\7\'\2\2\u0690\u00a3\3\2\2\2\u0691\u0692\5\u00a6T\2\u0692"+
		"\u0693\5\u0164\u00b3\2\u0693\u0695\3\2\2\2\u0694\u0691\3\2\2\2\u0695\u0698"+
		"\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698"+
		"\u0696\3\2\2\2\u0699\u069a\5\u00a6T\2\u069a\u00a5\3\2\2\2\u069b\u069e"+
		"\5\u0160\u00b1\2\u069c\u069f\5\u009cO\2\u069d\u069f\5\u00dep\2\u069e\u069c"+
		"\3\2\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u00a7\3\2\2\2\u06a0"+
		"\u06a3\5\u009cO\2\u06a1\u06a3\5\u00dep\2\u06a2\u06a0\3\2\2\2\u06a2\u06a1"+
		"\3\2\2\2\u06a3\u00a9\3\2\2\2\u06a4\u06a5\7\35\2\2\u06a5\u06a6\5\u0098"+
		"M\2\u06a6\u00ab\3\2\2\2\u06a7\u06aa\7\35\2\2\u06a8\u06ab\5\u009cO\2\u06a9"+
		"\u06ab\5\u00dep\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2\2\2\u06ab\u00ad"+
		"\3\2\2\2\u06ac\u06ad\7\36\2\2\u06ad\u06ae\5\u0098M\2\u06ae\u00af\3\2\2"+
		"\2\u06af\u06b0\7\36\2\2\u06b0\u00b1\3\2\2\2\u06b1\u06b4\5\u0170\u00b9"+
		"\2\u06b2\u06b5\5\u00ccg\2\u06b3\u06b5\5\u0098M\2\u06b4\u06b2\3\2\2\2\u06b4"+
		"\u06b3\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\5\u0172\u00ba\2\u06b7\u00b3"+
		"\3\2\2\2\u06b8\u06b9\5\u0120\u0091\2\u06b9\u06bd\5\u0168\u00b5\2\u06ba"+
		"\u06be\5\u00be`\2\u06bb\u06be\5\u00c2b\2\u06bc\u06be\5\u00c4c\2\u06bd"+
		"\u06ba\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2"+
		"\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\5\u016a\u00b6\2\u06c0\u00b5\3\2\2"+
		"\2\u06c1\u06c2\5\u0120\u0091\2\u06c2\u06c4\5\u016c\u00b7\2\u06c3\u06c5"+
		"\7a\2\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6"+
		"\u06c8\5\u009eP\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca"+
		"\3\2\2\2\u06c9\u06cb\7a\2\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb"+
		"\u06cc\3\2\2\2\u06cc\u06cd\5\u016e\u00b8\2\u06cd\u00b7\3\2\2\2\u06ce\u06cf"+
		"\7\60\2\2\u06cf\u06d0\7\60\2\2\u06d0\u06d1\5\u0098M\2\u06d1\u00b9\3\2"+
		"\2\2\u06d2\u06d3\5\u0120\u0091\2\u06d3\u06d4\7\62\2\2\u06d4\u00bb\3\2"+
		"\2\2\u06d5\u06d6\5\u0120\u0091\2\u06d6\u06d7\7\60\2\2\u06d7\u00bd\3\2"+
		"\2\2\u06d8\u06d9\5\u00c0a\2\u06d9\u06da\5\u0164\u00b3\2\u06da\u06dc\3"+
		"\2\2\2\u06db\u06d8\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e1\5\u00c0"+
		"a\2\u06e1\u00bf\3\2\2\2\u06e2\u06e3\5\u00d6l\2\u06e3\u06e4\7\37\2\2\u06e4"+
		"\u06e5\5\u0098M\2\u06e5\u00c1\3\2\2\2\u06e6\u06e7\5\u0098M\2\u06e7\u06e8"+
		"\5\u0164\u00b3\2\u06e8\u06ea\3\2\2\2\u06e9\u06e6\3\2\2\2\u06ea\u06ed\3"+
		"\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed"+
		"\u06eb\3\2\2\2\u06ee\u06ef\5\u0098M\2\u06ef\u00c3\3\2\2\2\u06f0\u06f1"+
		"\5\u00caf\2\u06f1\u06f2\5\u0164\u00b3\2\u06f2\u06f4\3\2\2\2\u06f3\u06f0"+
		"\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6"+
		"\u06f8\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06f9\5\u00caf\2\u06f9\u00c5"+
		"\3\2\2\2\u06fa\u0700\5\u0168\u00b5\2\u06fb\u06fc\5\u0098M\2\u06fc\u06fd"+
		"\5\u0164\u00b3\2\u06fd\u06ff\3\2\2\2\u06fe\u06fb\3\2\2\2\u06ff\u0702\3"+
		"\2\2\2\u0700\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0703\3\2\2\2\u0702"+
		"\u0700\3\2\2\2\u0703\u0704\5\u0098M\2\u0704\u0705\5\u016a\u00b6\2\u0705"+
		"\u00c7\3\2\2\2\u0706\u070c\5\u0168\u00b5\2\u0707\u0708\5\u00caf\2\u0708"+
		"\u0709\5\u0164\u00b3\2\u0709\u070b\3\2\2\2\u070a\u0707\3\2\2\2\u070b\u070e"+
		"\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f\3\2\2\2\u070e"+
		"\u070c\3\2\2\2\u070f\u0710\5\u00caf\2\u0710\u0711\5\u016a\u00b6\2\u0711"+
		"\u00c9\3\2\2\2\u0712\u0713\5\u0170\u00b9\2\u0713\u0714\5\u0098M\2\u0714"+
		"\u0715\5\u0172\u00ba\2\u0715\u0716\7\37\2\2\u0716\u0717\5\u0098M\2\u0717"+
		"\u00cb\3\2\2\2\u0718\u071c\5\u00d0i\2\u0719\u071c\5\u00d2j\2\u071a\u071c"+
		"\5\u00ceh\2\u071b\u0718\3\2\2\2\u071b\u0719\3\2\2\2\u071b\u071a\3\2\2"+
		"\2\u071c\u00cd\3\2\2\2\u071d\u071e\5\u0098M\2\u071e\u071f\t\4\2\2\u071f"+
		"\u0720\5\u0098M\2\u0720\u00cf\3\2\2\2\u0721\u0722\5\u0098M\2\u0722\u0723"+
		"\t\4\2\2\u0723\u00d1\3\2\2\2\u0724\u0725\t\4\2\2\u0725\u0726\5\u0098M"+
		"\2\u0726\u00d3\3\2\2\2\u0727\u0728\5\u0160\u00b1\2\u0728\u072a\5\u015c"+
		"\u00af\2\u0729\u072b\7a\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u072d\3\2\2\2\u072c\u0727\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2"+
		"\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2\2\2\u0731"+
		"\u0732\5\u0160\u00b1\2\u0732\u00d5\3\2\2\2\u0733\u073c\5\u0160\u00b1\2"+
		"\u0734\u0736\5\u015c\u00af\2\u0735\u0737\7a\2\2\u0736\u0735\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\5\u0160\u00b1\2\u0739\u073b"+
		"\3\2\2\2\u073a\u0734\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073d\u00d7\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0741\5\u00da"+
		"n\2\u0740\u073f\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740\3\2\2\2\u0742"+
		"\u0743\3\2\2\2\u0743\u00d9\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u074c\5\u0160"+
		"\u00b1\2\u0746\u0747\5\u016c\u00b7\2\u0747\u0748\5\u0160\u00b1\2\u0748"+
		"\u0749\5\u0160\u00b1\2\u0749\u074a\5\u016e\u00b8\2\u074a\u074c\3\2\2\2"+
		"\u074b\u0745\3\2\2\2\u074b\u0746\3\2\2\2\u074c\u00db\3\2\2\2\u074d\u074f"+
		"\5\u0120\u0091\2\u074e\u074d\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3"+
		"\2\2\2\u0750\u0751\3\2\2\2\u0751\u00dd\3\2\2\2\u0752\u0750\3\2\2\2\u0753"+
		"\u0755\5\u0168\u00b5\2\u0754\u0756\5\u00e0q\2\u0755\u0754\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u075b\t\2\2\2\u0758\u075a\7a"+
		"\2\2\u0759\u0758\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075b"+
		"\u075c\3\2\2\2\u075c\u075e\3\2\2\2\u075d\u075b\3\2\2\2\u075e\u075f\5\u0094"+
		"K\2\u075f\u0760\5\u016a\u00b6\2\u0760\u0775\3\2\2\2\u0761\u0763\5\u0168"+
		"\u00b5\2\u0762\u0764\5\u00e0q\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2"+
		"\2\u0764\u0765\3\2\2\2\u0765\u0769\t\2\2\2\u0766\u0768\7a\2\2\u0767\u0766"+
		"\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u076f\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076e\5\\/\2\u076d\u076c\3\2"+
		"\2\2\u076e\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770"+
		"\u0772\3\2\2\2\u0771\u076f\3\2\2\2\u0772\u0773\5\u016a\u00b6\2\u0773\u0775"+
		"\3\2\2\2\u0774\u0753\3\2\2\2\u0774\u0761\3\2\2\2\u0775\u00df\3\2\2\2\u0776"+
		"\u077c\5\u0160\u00b1\2\u0777\u0778\5\u0166\u00b4\2\u0778\u0779\5\u0160"+
		"\u00b1\2\u0779\u077b\3\2\2\2\u077a\u0777\3\2\2\2\u077b\u077e\3\2\2\2\u077c"+
		"\u077a\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u00e1\3\2\2\2\u077e\u077c\3\2"+
		"\2\2\u077f\u0780\5\u00e4s\2\u0780\u00e3\3\2\2\2\u0781\u0787\5\u0168\u00b5"+
		"\2\u0782\u0783\5\u00e6t\2\u0783\u0784\5\u0164\u00b3\2\u0784\u0786\3\2"+
		"\2\2\u0785\u0782\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787"+
		"\u0788\3\2\2\2\u0788\u078a\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078b\5\u00e6"+
		"t\2\u078b\u078c\5\u016a\u00b6\2\u078c\u00e5\3\2\2\2\u078d\u078f\5\u00d6"+
		"l\2\u078e\u0790\7\62\2\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790"+
		"\u0791\3\2\2\2\u0791\u0792\7/\2\2\u0792\u0793\5\u0098M\2\u0793\u00e7\3"+
		"\2\2\2\u0794\u0795\5\u016c\u00b7\2\u0795\u0796\5V,\2\u0796\u0798\t\2\2"+
		"\2\u0797\u0799\7\62\2\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u079c\7\61\2\2\u079b\u079a\3\2\2\2\u079b\u079c\3"+
		"\2\2\2\u079c\u07a0\3\2\2\2\u079d\u079f\7a\2\2\u079e\u079d\3\2\2\2\u079f"+
		"\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a3\3\2"+
		"\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a4\5X-\2\u07a4\u07a5\5\u016e\u00b8\2"+
		"\u07a5\u07a9\5\u0168\u00b5\2\u07a6\u07a8\5\\/\2\u07a7\u07a6\3\2\2\2\u07a8"+
		"\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2"+
		"\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07ad\5\u016a\u00b6\2\u07ad\u00e9\3\2\2"+
		"\2\u07ae\u07af\5\u0156\u00ac\2\u07af\u07b0\5\u0098M\2\u07b0\u00eb\3\2"+
		"\2\2\u07b1\u07b2\5\u015e\u00b0\2\u07b2\u07b3\5\u0098M\2\u07b3\u00ed\3"+
		"\2\2\2\u07b4\u07b5\5\u0146\u00a4\2\u07b5\u07b6\5\u0098M\2\u07b6\u00ef"+
		"\3\2\2\2\u07b7\u07b8\5\u00f2z\2\u07b8\u07ba\7\33\2\2\u07b9\u07bb\7a\2"+
		"\2\u07ba\u07b9\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bf\3\2\2\2\u07bc\u07be"+
		"\5\u00f4{\2\u07bd\u07bc\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf\u07bd\3\2\2"+
		"\2\u07bf\u07c0\3\2\2\2\u07c0\u07c2\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2\u07c4"+
		"\5\u0160\u00b1\2\u07c3\u07c5\7a\2\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3"+
		"\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c7\5\u0098M\2\u07c7\u00f1\3\2\2\2"+
		"\u07c8\u07c9\7\61\2\2\u07c9\u07cb\5\u0160\u00b1\2\u07ca\u07cc\7\62\2\2"+
		"\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce"+
		"\7/\2\2\u07ce\u07cf\5\u0098M\2\u07cf\u00f3\3\2\2\2\u07d0\u07d6\5\u00f2"+
		"z\2\u07d1\u07d3\5\u0160\u00b1\2\u07d2\u07d4\5\u0098M\2\u07d3\u07d2\3\2"+
		"\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d6\3\2\2\2\u07d5\u07d0\3\2\2\2\u07d5"+
		"\u07d1\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\7\33\2\2\u07d8\u07da\7"+
		"a\2\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u00f5\3\2\2\2\u07db"+
		"\u07df\5\u00fa~\2\u07dc\u07de\5\u00fc\177\2\u07dd\u07dc\3\2\2\2\u07de"+
		"\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2"+
		"\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\5\u00f8}\2\u07e3\u00f7\3\2\2\2\u07e4"+
		"\u07e5\7]\2\2\u07e5\u07e9\5\u0168\u00b5\2\u07e6\u07e8\5\\/\2\u07e7\u07e6"+
		"\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u07ec\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u07ed\5\u0094K\2\u07ed\u07ee"+
		"\5\u016a\u00b6\2\u07ee\u00f9\3\2\2\2\u07ef\u07f0\7\60\2\2\u07f0\u07f1"+
		"\7\33\2\2\u07f1\u07f2\5\u0098M\2\u07f2\u07f6\5\u0168\u00b5\2\u07f3\u07f5"+
		"\5\\/\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6"+
		"\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fa\5\u0094"+
		"K\2\u07fa\u07fb\5\u016a\u00b6\2\u07fb\u00fb\3\2\2\2\u07fc\u07fd\5\u0098"+
		"M\2\u07fd\u0801\5\u0168\u00b5\2\u07fe\u0800\5\\/\2\u07ff\u07fe\3\2\2\2"+
		"\u0800\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0804"+
		"\3\2\2\2\u0803\u0801\3\2\2\2\u0804\u0805\5\u0094K\2\u0805\u0806\5\u016a"+
		"\u00b6\2\u0806\u00fd\3\2\2\2\u0807\u0808\7\60\2\2\u0808\u0809\5\u0098"+
		"M\2\u0809\u080a\7/\2\2\u080a\u080c\7\33\2\2\u080b\u080d\5\u0100\u0081"+
		"\2\u080c\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080c\3\2\2\2\u080e\u080f"+
		"\3\2\2\2\u080f\u00ff\3\2\2\2\u0810\u0816\5b\62\2\u0811\u0812\5\u0166\u00b4"+
		"\2\u0812\u0813\5b\62\2\u0813\u0815\3\2\2\2\u0814\u0811\3\2\2\2\u0815\u0818"+
		"\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818"+
		"\u0816\3\2\2\2\u0819\u081d\5\u0168\u00b5\2\u081a\u081c\5\\/\2\u081b\u081a"+
		"\3\2\2\2\u081c\u081f\3\2\2\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e"+
		"\u0820\3\2\2\2\u081f\u081d\3\2\2\2\u0820\u0821\5\u0094K\2\u0821\u0822"+
		"\5\u016a\u00b6\2\u0822\u0101\3\2\2\2\u0823\u0824\7\61\2\2\u0824\u0826"+
		"\5\u0160\u00b1\2\u0825\u0827\7\62\2\2\u0826\u0825\3\2\2\2\u0826\u0827"+
		"\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\7/\2\2\u0829\u082a\5\u0082B\2"+
		"\u082a\u082b\7\33\2\2\u082b\u082f\5\u0168\u00b5\2\u082c\u082e\5\\/\2\u082d"+
		"\u082c\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2"+
		"\2\2\u0830\u0832\3\2\2\2\u0831\u082f\3\2\2\2\u0832\u0833\5\u0094K\2\u0833"+
		"\u0835\5\u016a\u00b6\2\u0834\u0836\5\u0106\u0084\2\u0835\u0834\3\2\2\2"+
		"\u0835\u0836\3\2\2\2\u0836\u0103\3\2\2\2\u0837\u083b\7\61\2\2\u0838\u0839"+
		"\5\u0160\u00b1\2\u0839\u083a\7/\2\2\u083a\u083c\3\2\2\2\u083b\u0838\3"+
		"\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\5\u0160\u00b1"+
		"\2\u083e\u0840\7\62\2\2\u083f\u083e\3\2\2\2\u083f\u0840\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0842\7/\2\2\u0842\u0843\5\u0098M\2\u0843\u0844\7"+
		"\33\2\2\u0844\u0848\5\u0168\u00b5\2\u0845\u0847\5\\/\2\u0846\u0845\3\2"+
		"\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084b\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084c\5\u0094K\2\u084c\u084e"+
		"\5\u016a\u00b6\2\u084d\u084f\5\u0106\u0084\2\u084e\u084d\3\2\2\2\u084e"+
		"\u084f\3\2\2\2\u084f\u0105\3\2\2\2\u0850\u0851\7]\2\2\u0851\u0855\5\u0168"+
		"\u00b5\2\u0852\u0854\5\\/\2\u0853\u0852\3\2\2\2\u0854\u0857\3\2\2\2\u0855"+
		"\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0855\3\2"+
		"\2\2\u0858\u0859\5\u0094K\2\u0859\u085a\5\u016a\u00b6\2\u085a\u0107\3"+
		"\2\2\2\u085b\u085c\7\62\2\2\u085c\u085d\7\33\2\2\u085d\u0861\5\u0168\u00b5"+
		"\2\u085e\u0860\5\\/\2\u085f\u085e\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u085f"+
		"\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0864\3\2\2\2\u0863\u0861\3\2\2\2\u0864"+
		"\u0865\5\u0094K\2\u0865\u0869\5\u016a\u00b6\2\u0866\u0868\5\u010a\u0086"+
		"\2\u0867\u0866\3\2\2\2\u0868\u086b\3\2\2\2\u0869\u0867\3\2\2\2\u0869\u086a"+
		"\3\2\2\2\u086a\u086c\3\2\2\2\u086b\u0869\3\2\2\2\u086c\u086d\5~@\2\u086d"+
		"\u087f\3\2\2\2\u086e\u086f\7\62\2\2\u086f\u0870\7\33\2\2\u0870\u0874\5"+
		"\u0168\u00b5\2\u0871\u0873\5\\/\2\u0872\u0871\3\2\2\2\u0873\u0876\3\2"+
		"\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\3\2\2\2\u0876"+
		"\u0874\3\2\2\2\u0877\u0878\5\u0094K\2\u0878\u087a\5\u016a\u00b6\2\u0879"+
		"\u087b\5\u010a\u0086\2\u087a\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087a"+
		"\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087f\3\2\2\2\u087e\u085b\3\2\2\2\u087e"+
		"\u086e\3\2\2\2\u087f\u0109\3\2\2\2\u0880\u0885\5\u0160\u00b1\2\u0881\u0882"+
		"\5\u0160\u00b1\2\u0882\u0883\5\u0120\u0091\2\u0883\u0885\3\2\2\2\u0884"+
		"\u0880\3\2\2\2\u0884\u0881\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u088a\5\u0168"+
		"\u00b5\2\u0887\u0889\5\\/\2\u0888\u0887\3\2\2\2\u0889\u088c\3\2\2\2\u088a"+
		"\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088d\3\2\2\2\u088c\u088a\3\2"+
		"\2\2\u088d\u088e\5\u0094K\2\u088e\u088f\5\u016a\u00b6\2\u088f\u010b\3"+
		"\2\2\2\u0890\u089a\5\u011a\u008e\2\u0891\u089a\5\u011c\u008f\2\u0892\u089a"+
		"\5\u0114\u008b\2\u0893\u089a\5\u010e\u0088\2\u0894\u089a\7Z\2\2\u0895"+
		"\u089a\7P\2\2\u0896\u089a\7Q\2\2\u0897\u089a\5\u013c\u009f\2\u0898\u089a"+
		"\7R\2\2\u0899\u0890\3\2\2\2\u0899\u0891\3\2\2\2\u0899\u0892\3\2\2\2\u0899"+
		"\u0893\3\2\2\2\u0899\u0894\3\2\2\2\u0899\u0895\3\2\2\2\u0899\u0896\3\2"+
		"\2\2\u0899\u0897\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u010d\3\2\2\2\u089b"+
		"\u08a0\7Y\2\2\u089c\u089f\5\u0110\u0089\2\u089d\u089f\5\u0112\u008a\2"+
		"\u089e\u089c\3\2\2\2\u089e\u089d\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e"+
		"\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a3\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3"+
		"\u08a4\7c\2\2\u08a4\u010f\3\2\2\2\u08a5\u08a6\7e\2\2\u08a6\u0111\3\2\2"+
		"\2\u08a7\u08ad\7d\2\2\u08a8\u08a9\5\u0098M\2\u08a9\u08aa\5\u0164\u00b3"+
		"\2\u08aa\u08ac\3\2\2\2\u08ab\u08a8\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab"+
		"\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b0\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b1\5\u0098M\2\u08b1\u08b2\7,\2\2\u08b2\u0113\3\2\2\2\u08b3\u08b9\7"+
		"X\2\2\u08b4\u08b8\5\u0116\u008c\2\u08b5\u08b8\5\u0118\u008d\2\u08b6\u08b8"+
		"\7g\2\2\u08b7\u08b4\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b7\u08b6\3\2\2\2\u08b8"+
		"\u08bb\3\2\2\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bc\3\2"+
		"\2\2\u08bb\u08b9\3\2\2\2\u08bc\u08bd\7f\2\2\u08bd\u0115\3\2\2\2\u08be"+
		"\u08bf\7i\2\2\u08bf\u0117\3\2\2\2\u08c0\u08c4\7h\2\2\u08c1\u08c3\7a\2"+
		"\2\u08c2\u08c1\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5"+
		"\3\2\2\2\u08c5\u08cc\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08c8\5\u0098M"+
		"\2\u08c8\u08c9\5\u0164\u00b3\2\u08c9\u08cb\3\2\2\2\u08ca\u08c7\3\2\2\2"+
		"\u08cb\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08cf"+
		"\3\2\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d3\5\u0098M\2\u08d0\u08d2\7a\2\2"+
		"\u08d1\u08d0\3\2\2\2\u08d2\u08d5\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4"+
		"\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08d7\7,\2\2\u08d7"+
		"\u0119\3\2\2\2\u08d8\u08d9\7S\2\2\u08d9\u011b\3\2\2\2\u08da\u08db\t\5"+
		"\2\2\u08db\u011d\3\2\2\2\u08dc\u08e8\5\u0136\u009c\2\u08dd\u08e8\5\u0124"+
		"\u0093\2\u08de\u08e8\5\u0126\u0094\2\u08df\u08e8\5\u0128\u0095\2\u08e0"+
		"\u08e8\5\u012a\u0096\2\u08e1\u08e8\5\u012c\u0097\2\u08e2\u08e8\5\u012e"+
		"\u0098\2\u08e3\u08e8\5\u0130\u0099\2\u08e4\u08e8\5\u013a\u009e\2\u08e5"+
		"\u08e8\5\u0132\u009a\2\u08e6\u08e8\5\u0134\u009b\2\u08e7\u08dc\3\2\2\2"+
		"\u08e7\u08dd\3\2\2\2\u08e7\u08de\3\2\2\2\u08e7\u08df\3\2\2\2\u08e7\u08e0"+
		"\3\2\2\2\u08e7\u08e1\3\2\2\2\u08e7\u08e2\3\2\2\2\u08e7\u08e3\3\2\2\2\u08e7"+
		"\u08e4\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e6\3\2\2\2\u08e8\u011f\3\2"+
		"\2\2\u08e9\u08ec\5\u011e\u0090\2\u08ea\u08ec\5\u0122\u0092\2\u08eb\u08e9"+
		"\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec\u0121\3\2\2\2\u08ed\u08ee\7\60\2\2"+
		"\u08ee\u08ef\5\u011e\u0090\2\u08ef\u0123\3\2\2\2\u08f0\u08f1\5\u0170\u00b9"+
		"\2\u08f1\u08f2\7\30\2\2\u08f2\u08f3\5\u0172\u00ba\2\u08f3\u08f4\5\u0120"+
		"\u0091\2\u08f4\u0125\3\2\2\2\u08f5\u08f6\5\u0170\u00b9\2\u08f6\u08f7\5"+
		"\u0172\u00ba\2\u08f7\u08f8\5\u0120\u0091\2\u08f8\u0127\3\2\2\2\u08f9\u08fa"+
		"\5\u0170\u00b9\2\u08fa\u08fb\5\u0120\u0091\2\u08fb\u08fc\5\u0172\u00ba"+
		"\2\u08fc\u08fd\7]\2\2\u08fd\u0129\3\2\2\2\u08fe\u08ff\5\u0170\u00b9\2"+
		"\u08ff\u0900\5\u0120\u0091\2\u0900\u0901\5\u0172\u00ba\2\u0901\u0902\5"+
		"\u0120\u0091\2\u0902\u012b\3\2\2\2\u0903\u0904\5\u0170\u00b9\2\u0904\u0905"+
		"\7\'\2\2\u0905\u0906\5\u0172\u00ba\2\u0906\u0907\5\u0120\u0091\2\u0907"+
		"\u012d\3\2\2\2\u0908\u0909\5\u0170\u00b9\2\u0909\u090a\7&\2\2\u090a\u090b"+
		"\5\u0172\u00ba\2\u090b\u090c\5\u0120\u0091\2\u090c\u012f\3\2\2\2\u090d"+
		"\u090e\5\u0170\u00b9\2\u090e\u090f\7\64\2\2\u090f\u0910\5\u0172\u00ba"+
		"\2\u0910\u0911\5\u0120\u0091\2\u0911\u0131\3\2\2\2\u0912\u0919\5\u00d4"+
		"k\2\u0913\u0914\5\u0170\u00b9\2\u0914\u0915\5\u00d4k\2\u0915\u0916\5\u00dc"+
		"o\2\u0916\u0917\5\u0172\u00ba\2\u0917\u0919\3\2\2\2\u0918\u0912\3\2\2"+
		"\2\u0918\u0913\3\2\2\2\u0919\u0133\3\2\2\2\u091a\u091b\5\u016c\u00b7\2"+
		"\u091b\u091c\5\u0138\u009d\2\u091c\u091e\t\2\2\2\u091d\u091f\7\62\2\2"+
		"\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0921\3\2\2\2\u0920\u0922"+
		"\7\61\2\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0926\3\2\2\2"+
		"\u0923\u0925\7a\2\2\u0924\u0923\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0929\3\2\2\2\u0928\u0926\3\2\2\2\u0929"+
		"\u092a\5\u0138\u009d\2\u092a\u092b\5\u016e\u00b8\2\u092b\u0135\3\2\2\2"+
		"\u092c\u092d\7N\2\2\u092d\u0137\3\2\2\2\u092e\u0930\5\u0120\u0091\2\u092f"+
		"\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0936\3\2\2\2\u0931\u0932\5\u0166"+
		"\u00b4\2\u0932\u0933\5\u0120\u0091\2\u0933\u0935\3\2\2\2\u0934\u0931\3"+
		"\2\2\2\u0935\u0938\3\2\2\2\u0936\u0934\3\2\2\2\u0936\u0937\3\2\2\2\u0937"+
		"\u0139\3\2\2\2\u0938\u0936\3\2\2\2\u0939\u094a\7>\2\2\u093a\u094a\7?\2"+
		"\2\u093b\u094a\7@\2\2\u093c\u094a\7A\2\2\u093d\u094a\7B\2\2\u093e\u094a"+
		"\7C\2\2\u093f\u094a\7D\2\2\u0940\u094a\7E\2\2\u0941\u094a\7F\2\2\u0942"+
		"\u094a\7G\2\2\u0943\u094a\7H\2\2\u0944\u094a\7I\2\2\u0945\u094a\7J\2\2"+
		"\u0946\u094a\7K\2\2\u0947\u094a\7L\2\2\u0948\u094a\7M\2\2\u0949\u0939"+
		"\3\2\2\2\u0949\u093a\3\2\2\2\u0949\u093b\3\2\2\2\u0949\u093c\3\2\2\2\u0949"+
		"\u093d\3\2\2\2\u0949\u093e\3\2\2\2\u0949\u093f\3\2\2\2\u0949\u0940\3\2"+
		"\2\2\u0949\u0941\3\2\2\2\u0949\u0942\3\2\2\2\u0949\u0943\3\2\2\2\u0949"+
		"\u0944\3\2\2\2\u0949\u0945\3\2\2\2\u0949\u0946\3\2\2\2\u0949\u0947\3\2"+
		"\2\2\u0949\u0948\3\2\2\2\u094a\u013b\3\2\2\2\u094b\u094c\7O\2\2\u094c"+
		"\u013d\3\2\2\2\u094d\u0950\7P\2\2\u094e\u0950\7Q\2\2\u094f\u094d\3\2\2"+
		"\2\u094f\u094e\3\2\2\2\u0950\u013f\3\2\2\2\u0951\u0957\5\u0142\u00a2\2"+
		"\u0952\u0957\5\u0144\u00a3\2\u0953\u0957\5\u0148\u00a5\2\u0954\u0957\5"+
		"\u014a\u00a6\2\u0955\u0957\5\u014c\u00a7\2\u0956\u0951\3\2\2\2\u0956\u0952"+
		"\3\2\2\2\u0956\u0953\3\2\2\2\u0956\u0954\3\2\2\2\u0956\u0955\3\2\2\2\u0957"+
		"\u0959\3\2\2\2\u0958\u095a\7a\2\2\u0959\u0958\3\2\2\2\u0959\u095a\3\2"+
		"\2\2\u095a\u0141\3\2\2\2\u095b\u095c\7\"\2\2\u095c\u0143\3\2\2\2\u095d"+
		"\u095e\7#\2\2\u095e\u0145\3\2\2\2\u095f\u0960\7%\2\2\u0960\u0147\3\2\2"+
		"\2\u0961\u0962\7$\2\2\u0962\u0149\3\2\2\2\u0963\u0964\7 \2\2\u0964\u014b"+
		"\3\2\2\2\u0965\u0966\7!\2\2\u0966\u014d\3\2\2\2\u0967\u0968\7\16\2\2\u0968"+
		"\u014f\3\2\2\2\u0969\u096b\t\6\2\2\u096a\u096c\7a\2\2\u096b\u096a\3\2"+
		"\2\2\u096b\u096c\3\2\2\2\u096c\u0151\3\2\2\2\u096d\u096f\t\7\2\2\u096e"+
		"\u0970\7a\2\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0153\3\2"+
		"\2\2\u0971\u0973\t\b\2\2\u0972\u0974\7a\2\2\u0973\u0972\3\2\2\2\u0973"+
		"\u0974\3\2\2\2\u0974\u0155\3\2\2\2\u0975\u0977\t\t\2\2\u0976\u0978\7a"+
		"\2\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0157\3\2\2\2\u0979"+
		"\u097b\t\n\2\2\u097a\u097c\7a\2\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2"+
		"\2\2\u097c\u0159\3\2\2\2\u097d\u097f\7<\2\2\u097e\u0980\7a\2\2\u097f\u097e"+
		"\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u015b\3\2\2\2\u0981\u0983\7\25\2\2"+
		"\u0982\u0984\7a\2\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u015d"+
		"\3\2\2\2\u0985\u0986\7\64\2\2\u0986\u015f\3\2\2\2\u0987\u0988\5\u0162"+
		"\u00b2\2\u0988\u0161\3\2\2\2\u0989\u098d\t\13\2\2\u098a\u098d\5\u013a"+
		"\u009e\2\u098b\u098d\5\u0136\u009c\2\u098c\u0989\3\2\2\2\u098c\u098a\3"+
		"\2\2\2\u098c\u098b\3\2\2\2\u098d\u0163\3\2\2\2\u098e\u098f\t\f\2\2\u098f"+
		"\u0165\3\2\2\2\u0990\u0994\7\30\2\2\u0991\u0993\7a\2\2\u0992\u0991\3\2"+
		"\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0167\3\2\2\2\u0996\u0994\3\2\2\2\u0997\u099b\7+\2\2\u0998\u099a\7a\2"+
		"\2\u0999\u0998\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3\2\2\2\u099b\u099c"+
		"\3\2\2\2\u099c\u0169\3\2\2\2\u099d\u099b\3\2\2\2\u099e\u09a0\7a\2\2\u099f"+
		"\u099e\3\2\2\2\u09a0\u09a3\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2"+
		"\2\2\u09a2\u09a4\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09a5\7,\2\2\u09a5"+
		"\u016b\3\2\2\2\u09a6\u09a7\7)\2\2\u09a7\u016d\3\2\2\2\u09a8\u09a9\7*\2"+
		"\2\u09a9\u016f\3\2\2\2\u09aa\u09ae\7-\2\2\u09ab\u09ad\7a\2\2\u09ac\u09ab"+
		"\3\2\2\2\u09ad\u09b0\3\2\2\2\u09ae\u09ac\3\2\2\2\u09ae\u09af\3\2\2\2\u09af"+
		"\u0171\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b1\u09b3\7a\2\2\u09b2\u09b1\3\2"+
		"\2\2\u09b3\u09b6\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b7\3\2\2\2\u09b6"+
		"\u09b4\3\2\2\2\u09b7\u09b8\7.\2\2\u09b8\u0173\3\2\2\2\u0122\u0177\u017c"+
		"\u0180\u0186\u018c\u0195\u0197\u019e\u01a2\u01a5\u01a8\u01ac\u01ba\u01be"+
		"\u01c6\u01cc\u01d5\u01d9\u01df\u01e9\u01f2\u01f5\u01fa\u0203\u0205\u020a"+
		"\u0212\u0214\u0219\u0221\u0228\u022b\u0230\u0239\u0240\u0248\u024b\u0252"+
		"\u0259\u025d\u0266\u026f\u0272\u027b\u027d\u0282\u028a\u028c\u0291\u0299"+
		"\u02a0\u02a3\u02a8\u02b1\u02b9\u02bf\u02c1\u02c7\u02d4\u02d9\u02e0\u02e6"+
		"\u02e8\u02ed\u02f1\u02f7\u02fd\u0306\u0308\u030d\u0315\u0317\u031c\u0324"+
		"\u032b\u032e\u0333\u033c\u0347\u034d\u0360\u0366\u036c\u0370\u0376\u037a"+
		"\u0383\u0385\u038a\u038e\u0396\u0398\u039d\u03a1\u03a9\u03b0\u03b3\u03b8"+
		"\u03c1\u03c8\u03d0\u03d3\u03da\u03de\u03e5\u03e9\u03f1\u03f5\u03f8\u03ff"+
		"\u0405\u0407\u040d\u0415\u0418\u041c\u0423\u0425\u042a\u0432\u0438\u043b"+
		"\u0440\u044d\u0454\u0457\u045c\u0465\u046d\u0473\u0481\u0488\u048c\u0493"+
		"\u0497\u049b\u049e\u04a3\u04bb\u04c3\u04cd\u04d4\u04dd\u04e0\u04e6\u04f0"+
		"\u04f5\u04fc\u0507\u0511\u0519\u0521\u0526\u052f\u0533\u053b\u0540\u054a"+
		"\u054f\u0558\u056a\u0571\u057c\u0583\u0587\u058c\u058f\u0599\u059f\u05a9"+
		"\u05b9\u05cc\u05d9\u05eb\u05ee\u05f2\u05f5\u05fd\u060c\u0622\u0658\u065a"+
		"\u065f\u0667\u066b\u0674\u0677\u0681\u0686\u068c\u0696\u069e\u06a2\u06aa"+
		"\u06b4\u06bd\u06c4\u06c7\u06ca\u06dd\u06eb\u06f5\u0700\u070c\u071b\u072a"+
		"\u072e\u0736\u073c\u0742\u074b\u0750\u0755\u075b\u0763\u0769\u076f\u0774"+
		"\u077c\u0787\u078f\u0798\u079b\u07a0\u07a9\u07ba\u07bf\u07c4\u07cb\u07d3"+
		"\u07d5\u07d9\u07df\u07e9\u07f6\u0801\u080e\u0816\u081d\u0826\u082f\u0835"+
		"\u083b\u083f\u0848\u084e\u0855\u0861\u0869\u0874\u087c\u087e\u0884\u088a"+
		"\u0899\u089e\u08a0\u08ad\u08b7\u08b9\u08c4\u08cc\u08d3\u08e7\u08eb\u0918"+
		"\u091e\u0921\u0926\u092f\u0936\u0949\u094f\u0956\u0959\u096b\u096f\u0973"+
		"\u0977\u097b\u097f\u0983\u098c\u0994\u099b\u09a1\u09ae\u09b4";
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