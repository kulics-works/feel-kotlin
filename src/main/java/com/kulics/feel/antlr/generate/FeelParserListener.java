// Generated from /Users/kulics/Documents/kulics-works/feel-kotlin/src/main/java/com/kulics/feel/antlr/FeelParser.g4 by ANTLR 4.8
package com.kulics.feel.antlr.generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FeelParser}.
 */
public interface FeelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FeelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FeelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FeelParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FeelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FeelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(FeelParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(FeelParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceSupportStatement(FeelParser.NamespaceSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceSupportStatement(FeelParser.NamespaceSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(FeelParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(FeelParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#importSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportSubStatement(FeelParser.ImportSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#importSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportSubStatement(FeelParser.ImportSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasStatement(FeelParser.TypeAliasStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasStatement(FeelParser.TypeAliasStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeRedefineStatement(FeelParser.TypeRedefineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeRedefineStatement(FeelParser.TypeRedefineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeTagStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeTagStatement(FeelParser.TypeTagStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeTagStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeTagStatement(FeelParser.TypeTagStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatement(FeelParser.EnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatement(FeelParser.EnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumSupportStatement(FeelParser.EnumSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumSupportStatement(FeelParser.EnumSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceVariableStatement(FeelParser.NamespaceVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceVariableStatement(FeelParser.NamespaceVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceConstantStatement(FeelParser.NamespaceConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceConstantStatement(FeelParser.NamespaceConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceFunctionStatement(FeelParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceFunctionStatement(FeelParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStatement(FeelParser.PackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStatement(FeelParser.PackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticStatement(FeelParser.PackageStaticStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticStatement(FeelParser.PackageStaticStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticSupportStatement(FeelParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticSupportStatement(FeelParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticVariableStatement(FeelParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticVariableStatement(FeelParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticConstantStatement(FeelParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticConstantStatement(FeelParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticFunctionStatement(FeelParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticFunctionStatement(FeelParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageFieldStatement(FeelParser.PackageFieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageFieldStatement(FeelParser.PackageFieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageSupportStatement(FeelParser.PackageSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageSupportStatement(FeelParser.PackageSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(FeelParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(FeelParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageNewStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageNewStatement(FeelParser.PackageNewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageNewStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageNewStatement(FeelParser.PackageNewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageVariableStatement(FeelParser.PackageVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageVariableStatement(FeelParser.PackageVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageConstantStatement(FeelParser.PackageConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageConstantStatement(FeelParser.PackageConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageFunctionStatement(FeelParser.PackageFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageFunctionStatement(FeelParser.PackageFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageControlSubStatement(FeelParser.PackageControlSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageControlSubStatement(FeelParser.PackageControlSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#packageEventStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageEventStatement(FeelParser.PackageEventStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#packageEventStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageEventStatement(FeelParser.PackageEventStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#implementStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementStatement(FeelParser.ImplementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#implementStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementStatement(FeelParser.ImplementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideVariableStatement(FeelParser.OverrideVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideVariableStatement(FeelParser.OverrideVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideConstantStatement(FeelParser.OverrideConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideConstantStatement(FeelParser.OverrideConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideFunctionStatement(FeelParser.OverrideFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideFunctionStatement(FeelParser.OverrideFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#protocolStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolStatement(FeelParser.ProtocolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#protocolStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolStatement(FeelParser.ProtocolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSubStatement(FeelParser.ProtocolSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSubStatement(FeelParser.ProtocolSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSupportStatement(FeelParser.ProtocolSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSupportStatement(FeelParser.ProtocolSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolVariableStatement(FeelParser.ProtocolVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolVariableStatement(FeelParser.ProtocolVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolFunctionStatement(FeelParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolFunctionStatement(FeelParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(FeelParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(FeelParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FeelParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FeelParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#returnAsyncStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnAsyncStatement(FeelParser.ReturnAsyncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#returnAsyncStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnAsyncStatement(FeelParser.ReturnAsyncStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldReturnStatement(FeelParser.YieldReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldReturnStatement(FeelParser.YieldReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldBreakStatement(FeelParser.YieldBreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldBreakStatement(FeelParser.YieldBreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 */
	void enterParameterClauseIn(FeelParser.ParameterClauseInContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 */
	void exitParameterClauseIn(FeelParser.ParameterClauseInContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 */
	void enterParameterClauseOut(FeelParser.ParameterClauseOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 */
	void exitParameterClauseOut(FeelParser.ParameterClauseOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FeelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FeelParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSupportStatement(FeelParser.FunctionSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSupportStatement(FeelParser.FunctionSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeCaseStatement(FeelParser.JudgeCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeCaseStatement(FeelParser.JudgeCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(FeelParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(FeelParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#caseExprStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseExprStatement(FeelParser.CaseExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#caseExprStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseExprStatement(FeelParser.CaseExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeStatement(FeelParser.JudgeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeStatement(FeelParser.JudgeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeElseStatement(FeelParser.JudgeElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeElseStatement(FeelParser.JudgeElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeIfStatement(FeelParser.JudgeIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeIfStatement(FeelParser.JudgeIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeElseIfStatement(FeelParser.JudgeElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeElseIfStatement(FeelParser.JudgeElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(FeelParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(FeelParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopEachStatement(FeelParser.LoopEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopEachStatement(FeelParser.LoopEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopCaseStatement(FeelParser.LoopCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopCaseStatement(FeelParser.LoopCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopElseStatement(FeelParser.LoopElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopElseStatement(FeelParser.LoopElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopJumpStatement(FeelParser.LoopJumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopJumpStatement(FeelParser.LoopJumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopContinueStatement(FeelParser.LoopContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopContinueStatement(FeelParser.LoopContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckStatement(FeelParser.CheckStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckStatement(FeelParser.CheckStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(FeelParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(FeelParser.UsingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckErrorStatement(FeelParser.CheckErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckErrorStatement(FeelParser.CheckErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 */
	void enterCheckFinallyStatment(FeelParser.CheckFinallyStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 */
	void exitCheckFinallyStatment(FeelParser.CheckFinallyStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkReportStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckReportStatement(FeelParser.CheckReportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkReportStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckReportStatement(FeelParser.CheckReportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#iteratorStatement}.
	 * @param ctx the parse tree
	 */
	void enterIteratorStatement(FeelParser.IteratorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#iteratorStatement}.
	 * @param ctx the parse tree
	 */
	void exitIteratorStatement(FeelParser.IteratorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaredStatement(FeelParser.VariableDeclaredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaredStatement(FeelParser.VariableDeclaredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaredStatement(FeelParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaredStatement(FeelParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarStatement(FeelParser.VarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarStatement(FeelParser.VarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bindStatement}.
	 * @param ctx the parse tree
	 */
	void enterBindStatement(FeelParser.BindStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bindStatement}.
	 * @param ctx the parse tree
	 */
	void exitBindStatement(FeelParser.BindStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(FeelParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(FeelParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(FeelParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(FeelParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationStatement(FeelParser.AnnotationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationStatement(FeelParser.AnnotationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(FeelParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(FeelParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#constId}.
	 * @param ctx the parse tree
	 */
	void enterConstId(FeelParser.ConstIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#constId}.
	 * @param ctx the parse tree
	 */
	void exitConstId(FeelParser.ConstIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(FeelParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(FeelParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(FeelParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(FeelParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FeelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FeelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(FeelParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(FeelParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(FeelParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(FeelParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FeelParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FeelParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotationSupport}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationSupport(FeelParser.AnnotationSupportContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotationSupport}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationSupport(FeelParser.AnnotationSupportContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(FeelParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(FeelParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(FeelParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(FeelParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotationItem}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationItem(FeelParser.AnnotationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotationItem}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationItem(FeelParser.AnnotationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#annotationString}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationString(FeelParser.AnnotationStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#annotationString}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationString(FeelParser.AnnotationStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(FeelParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(FeelParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callAsync}.
	 * @param ctx the parse tree
	 */
	void enterCallAsync(FeelParser.CallAsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callAsync}.
	 * @param ctx the parse tree
	 */
	void exitCallAsync(FeelParser.CallAsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callAwait}.
	 * @param ctx the parse tree
	 */
	void enterCallAwait(FeelParser.CallAwaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callAwait}.
	 * @param ctx the parse tree
	 */
	void exitCallAwait(FeelParser.CallAwaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callChannel}.
	 * @param ctx the parse tree
	 */
	void enterCallChannel(FeelParser.CallChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callChannel}.
	 * @param ctx the parse tree
	 */
	void exitCallChannel(FeelParser.CallChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#transfer}.
	 * @param ctx the parse tree
	 */
	void enterTransfer(FeelParser.TransferContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#transfer}.
	 * @param ctx the parse tree
	 */
	void exitTransfer(FeelParser.TransferContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callElement}.
	 * @param ctx the parse tree
	 */
	void enterCallElement(FeelParser.CallElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callElement}.
	 * @param ctx the parse tree
	 */
	void exitCallElement(FeelParser.CallElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callPkg}.
	 * @param ctx the parse tree
	 */
	void enterCallPkg(FeelParser.CallPkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callPkg}.
	 * @param ctx the parse tree
	 */
	void exitCallPkg(FeelParser.CallPkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#callNew}.
	 * @param ctx the parse tree
	 */
	void enterCallNew(FeelParser.CallNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#callNew}.
	 * @param ctx the parse tree
	 */
	void exitCallNew(FeelParser.CallNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#orElse}.
	 * @param ctx the parse tree
	 */
	void enterOrElse(FeelParser.OrElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#orElse}.
	 * @param ctx the parse tree
	 */
	void exitOrElse(FeelParser.OrElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(FeelParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(FeelParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeCheck}.
	 * @param ctx the parse tree
	 */
	void enterTypeCheck(FeelParser.TypeCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeCheck}.
	 * @param ctx the parse tree
	 */
	void exitTypeCheck(FeelParser.TypeCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pkgAssign}.
	 * @param ctx the parse tree
	 */
	void enterPkgAssign(FeelParser.PkgAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pkgAssign}.
	 * @param ctx the parse tree
	 */
	void exitPkgAssign(FeelParser.PkgAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 */
	void enterPkgAssignElement(FeelParser.PkgAssignElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 */
	void exitPkgAssignElement(FeelParser.PkgAssignElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#listAssign}.
	 * @param ctx the parse tree
	 */
	void enterListAssign(FeelParser.ListAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#listAssign}.
	 * @param ctx the parse tree
	 */
	void exitListAssign(FeelParser.ListAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAssign(FeelParser.DictionaryAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAssign(FeelParser.DictionaryAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FeelParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FeelParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(FeelParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(FeelParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryElement(FeelParser.DictionaryElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryElement(FeelParser.DictionaryElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(FeelParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(FeelParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#sliceFull}.
	 * @param ctx the parse tree
	 */
	void enterSliceFull(FeelParser.SliceFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#sliceFull}.
	 * @param ctx the parse tree
	 */
	void exitSliceFull(FeelParser.SliceFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#sliceStart}.
	 * @param ctx the parse tree
	 */
	void enterSliceStart(FeelParser.SliceStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#sliceStart}.
	 * @param ctx the parse tree
	 */
	void exitSliceStart(FeelParser.SliceStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void enterSliceEnd(FeelParser.SliceEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void exitSliceEnd(FeelParser.SliceEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceItem(FeelParser.NameSpaceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceItem(FeelParser.NameSpaceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FeelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FeelParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#templateDefine}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDefine(FeelParser.TemplateDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#templateDefine}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDefine(FeelParser.TemplateDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#templateDefineItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDefineItem(FeelParser.TemplateDefineItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#templateDefineItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDefineItem(FeelParser.TemplateDefineItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#templateCall}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCall(FeelParser.TemplateCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#templateCall}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCall(FeelParser.TemplateCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(FeelParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(FeelParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#lambdaIn}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIn(FeelParser.LambdaInContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#lambdaIn}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIn(FeelParser.LambdaInContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymous(FeelParser.PkgAnonymousContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymous(FeelParser.PkgAnonymousContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymousAssign(FeelParser.PkgAnonymousAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymousAssign(FeelParser.PkgAnonymousAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymousAssignElement(FeelParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymousAssignElement(FeelParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(FeelParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(FeelParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(FeelParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(FeelParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(FeelParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(FeelParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNotExpression(FeelParser.BitwiseNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNotExpression(FeelParser.BitwiseNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#linq}.
	 * @param ctx the parse tree
	 */
	void enterLinq(FeelParser.LinqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#linq}.
	 * @param ctx the parse tree
	 */
	void exitLinq(FeelParser.LinqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#linqHeadItem}.
	 * @param ctx the parse tree
	 */
	void enterLinqHeadItem(FeelParser.LinqHeadItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#linqHeadItem}.
	 * @param ctx the parse tree
	 */
	void exitLinqHeadItem(FeelParser.LinqHeadItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#linqItem}.
	 * @param ctx the parse tree
	 */
	void enterLinqItem(FeelParser.LinqItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#linqItem}.
	 * @param ctx the parse tree
	 */
	void exitLinqItem(FeelParser.LinqItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpression(FeelParser.JudgeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpression(FeelParser.JudgeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionElseStatement(FeelParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionElseStatement(FeelParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionIfStatement(FeelParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionIfStatement(FeelParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionElseIfStatement(FeelParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionElseIfStatement(FeelParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterJudgeCaseExpression(FeelParser.JudgeCaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitJudgeCaseExpression(FeelParser.JudgeCaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionStatement(FeelParser.CaseExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionStatement(FeelParser.CaseExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(FeelParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(FeelParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopEachExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopEachExpression(FeelParser.LoopEachExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopEachExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopEachExpression(FeelParser.LoopEachExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#loopElseExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopElseExpression(FeelParser.LoopElseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#loopElseExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopElseExpression(FeelParser.LoopElseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkExpression}.
	 * @param ctx the parse tree
	 */
	void enterCheckExpression(FeelParser.CheckExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkExpression}.
	 * @param ctx the parse tree
	 */
	void exitCheckExpression(FeelParser.CheckExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 */
	void enterCheckErrorExpression(FeelParser.CheckErrorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 */
	void exitCheckErrorExpression(FeelParser.CheckErrorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(FeelParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(FeelParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(FeelParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(FeelParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(FeelParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(FeelParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#stringTemplate}.
	 * @param ctx the parse tree
	 */
	void enterStringTemplate(FeelParser.StringTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#stringTemplate}.
	 * @param ctx the parse tree
	 */
	void exitStringTemplate(FeelParser.StringTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#rawStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterRawStringExpr(FeelParser.RawStringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#rawStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitRawStringExpr(FeelParser.RawStringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#rawStringContent}.
	 * @param ctx the parse tree
	 */
	void enterRawStringContent(FeelParser.RawStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#rawStringContent}.
	 * @param ctx the parse tree
	 */
	void exitRawStringContent(FeelParser.RawStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 */
	void enterRawStringTemplate(FeelParser.RawStringTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 */
	void exitRawStringTemplate(FeelParser.RawStringTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(FeelParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(FeelParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(FeelParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(FeelParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeNotNull}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotNull(FeelParser.TypeNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeNotNull}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotNull(FeelParser.TypeNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(FeelParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(FeelParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeNullable}.
	 * @param ctx the parse tree
	 */
	void enterTypeNullable(FeelParser.TypeNullableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeNullable}.
	 * @param ctx the parse tree
	 */
	void exitTypeNullable(FeelParser.TypeNullableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(FeelParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(FeelParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FeelParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FeelParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeSet}.
	 * @param ctx the parse tree
	 */
	void enterTypeSet(FeelParser.TypeSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeSet}.
	 * @param ctx the parse tree
	 */
	void exitTypeSet(FeelParser.TypeSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeDictionary}.
	 * @param ctx the parse tree
	 */
	void enterTypeDictionary(FeelParser.TypeDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeDictionary}.
	 * @param ctx the parse tree
	 */
	void exitTypeDictionary(FeelParser.TypeDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeStack}.
	 * @param ctx the parse tree
	 */
	void enterTypeStack(FeelParser.TypeStackContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeStack}.
	 * @param ctx the parse tree
	 */
	void exitTypeStack(FeelParser.TypeStackContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeQueue}.
	 * @param ctx the parse tree
	 */
	void enterTypeQueue(FeelParser.TypeQueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeQueue}.
	 * @param ctx the parse tree
	 */
	void exitTypeQueue(FeelParser.TypeQueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeChannel}.
	 * @param ctx the parse tree
	 */
	void enterTypeChannel(FeelParser.TypeChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeChannel}.
	 * @param ctx the parse tree
	 */
	void exitTypeChannel(FeelParser.TypeChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typePackage}.
	 * @param ctx the parse tree
	 */
	void enterTypePackage(FeelParser.TypePackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typePackage}.
	 * @param ctx the parse tree
	 */
	void exitTypePackage(FeelParser.TypePackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(FeelParser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(FeelParser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeAny}.
	 * @param ctx the parse tree
	 */
	void enterTypeAny(FeelParser.TypeAnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeAny}.
	 * @param ctx the parse tree
	 */
	void exitTypeAny(FeelParser.TypeAnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionParameterClause(FeelParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionParameterClause(FeelParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(FeelParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(FeelParser.TypeBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#nilExpr}.
	 * @param ctx the parse tree
	 */
	void enterNilExpr(FeelParser.NilExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#nilExpr}.
	 * @param ctx the parse tree
	 */
	void exitNilExpr(FeelParser.NilExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(FeelParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(FeelParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(FeelParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(FeelParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAnd(FeelParser.BitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAnd(FeelParser.BitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(FeelParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(FeelParser.BitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseNot}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNot(FeelParser.BitwiseNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseNot}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNot(FeelParser.BitwiseNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXor(FeelParser.BitwiseXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXor(FeelParser.BitwiseXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseLeftShift(FeelParser.BitwiseLeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseLeftShift(FeelParser.BitwiseLeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseRightShift(FeelParser.BitwiseRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseRightShift(FeelParser.BitwiseRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#compareCombine}.
	 * @param ctx the parse tree
	 */
	void enterCompareCombine(FeelParser.CompareCombineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#compareCombine}.
	 * @param ctx the parse tree
	 */
	void exitCompareCombine(FeelParser.CompareCombineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(FeelParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(FeelParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(FeelParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(FeelParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FeelParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FeelParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(FeelParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(FeelParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(FeelParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(FeelParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(FeelParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(FeelParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(FeelParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(FeelParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#wave}.
	 * @param ctx the parse tree
	 */
	void enterWave(FeelParser.WaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#wave}.
	 * @param ctx the parse tree
	 */
	void exitWave(FeelParser.WaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(FeelParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(FeelParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#idItem}.
	 * @param ctx the parse tree
	 */
	void enterIdItem(FeelParser.IdItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#idItem}.
	 * @param ctx the parse tree
	 */
	void exitIdItem(FeelParser.IdItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(FeelParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(FeelParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(FeelParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(FeelParser.MoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void enterLeft_brace(FeelParser.Left_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void exitLeft_brace(FeelParser.Left_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void enterRight_brace(FeelParser.Right_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void exitRight_brace(FeelParser.Right_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#left_paren}.
	 * @param ctx the parse tree
	 */
	void enterLeft_paren(FeelParser.Left_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#left_paren}.
	 * @param ctx the parse tree
	 */
	void exitLeft_paren(FeelParser.Left_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#right_paren}.
	 * @param ctx the parse tree
	 */
	void enterRight_paren(FeelParser.Right_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#right_paren}.
	 * @param ctx the parse tree
	 */
	void exitRight_paren(FeelParser.Right_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#left_brack}.
	 * @param ctx the parse tree
	 */
	void enterLeft_brack(FeelParser.Left_brackContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#left_brack}.
	 * @param ctx the parse tree
	 */
	void exitLeft_brack(FeelParser.Left_brackContext ctx);
	/**
	 * Enter a parse tree produced by {@link FeelParser#right_brack}.
	 * @param ctx the parse tree
	 */
	void enterRight_brack(FeelParser.Right_brackContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeelParser#right_brack}.
	 * @param ctx the parse tree
	 */
	void exitRight_brack(FeelParser.Right_brackContext ctx);
}