// Generated from /Users/kulics/Documents/kulics-works/k-kotlin/src/main/kotlin/com/kulics/k/antlr/KParser.g4 by ANTLR 4.8
package com.kulics.k.antlr.generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KParser}.
 */
public interface KParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(KParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(KParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(KParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(KParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceSupportStatement(KParser.NamespaceSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceSupportStatement(KParser.NamespaceSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasStatement(KParser.TypeAliasStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasStatement(KParser.TypeAliasStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeRedefineStatement(KParser.TypeRedefineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeRedefineStatement(KParser.TypeRedefineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeTagStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeTagStatement(KParser.TypeTagStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeTagStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeTagStatement(KParser.TypeTagStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatement(KParser.EnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatement(KParser.EnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumSupportStatement(KParser.EnumSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumSupportStatement(KParser.EnumSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceVariableStatement(KParser.NamespaceVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceVariableStatement(KParser.NamespaceVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceConstantStatement(KParser.NamespaceConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceConstantStatement(KParser.NamespaceConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceFunctionStatement(KParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceFunctionStatement(KParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStatement(KParser.PackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStatement(KParser.PackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticStatement(KParser.PackageStaticStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticStatement(KParser.PackageStaticStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticSupportStatement(KParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticSupportStatement(KParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticVariableStatement(KParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticVariableStatement(KParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticConstantStatement(KParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticConstantStatement(KParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStaticFunctionStatement(KParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStaticFunctionStatement(KParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageFieldStatement(KParser.PackageFieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageFieldStatement(KParser.PackageFieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageSupportStatement(KParser.PackageSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageSupportStatement(KParser.PackageSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(KParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(KParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageNewStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageNewStatement(KParser.PackageNewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageNewStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageNewStatement(KParser.PackageNewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageVariableStatement(KParser.PackageVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageVariableStatement(KParser.PackageVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageConstantStatement(KParser.PackageConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageConstantStatement(KParser.PackageConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageFunctionStatement(KParser.PackageFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageFunctionStatement(KParser.PackageFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageControlSubStatement(KParser.PackageControlSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageControlSubStatement(KParser.PackageControlSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#packageEventStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageEventStatement(KParser.PackageEventStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#packageEventStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageEventStatement(KParser.PackageEventStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#implementStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementStatement(KParser.ImplementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#implementStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementStatement(KParser.ImplementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideVariableStatement(KParser.OverrideVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideVariableStatement(KParser.OverrideVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideConstantStatement(KParser.OverrideConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideConstantStatement(KParser.OverrideConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOverrideFunctionStatement(KParser.OverrideFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOverrideFunctionStatement(KParser.OverrideFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#protocolStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolStatement(KParser.ProtocolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#protocolStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolStatement(KParser.ProtocolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSubStatement(KParser.ProtocolSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSubStatement(KParser.ProtocolSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSupportStatement(KParser.ProtocolSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSupportStatement(KParser.ProtocolSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolVariableStatement(KParser.ProtocolVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolVariableStatement(KParser.ProtocolVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterProtocolFunctionStatement(KParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitProtocolFunctionStatement(KParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(KParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(KParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#returnAwaitStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnAwaitStatement(KParser.ReturnAwaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#returnAwaitStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnAwaitStatement(KParser.ReturnAwaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldReturnStatement(KParser.YieldReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldReturnStatement(KParser.YieldReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldBreakStatement(KParser.YieldBreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldBreakStatement(KParser.YieldBreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 */
	void enterParameterClauseIn(KParser.ParameterClauseInContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 */
	void exitParameterClauseIn(KParser.ParameterClauseInContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 */
	void enterParameterClauseOut(KParser.ParameterClauseOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 */
	void exitParameterClauseOut(KParser.ParameterClauseOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSupportStatement(KParser.FunctionSupportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSupportStatement(KParser.FunctionSupportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeCaseStatement(KParser.JudgeCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeCaseStatement(KParser.JudgeCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(KParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(KParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#caseExprStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseExprStatement(KParser.CaseExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#caseExprStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseExprStatement(KParser.CaseExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeStatement(KParser.JudgeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeStatement(KParser.JudgeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeElseStatement(KParser.JudgeElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeElseStatement(KParser.JudgeElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeIfStatement(KParser.JudgeIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeIfStatement(KParser.JudgeIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeElseIfStatement(KParser.JudgeElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeElseIfStatement(KParser.JudgeElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(KParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(KParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopEachStatement(KParser.LoopEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopEachStatement(KParser.LoopEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopCaseStatement(KParser.LoopCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopCaseStatement(KParser.LoopCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopElseStatement(KParser.LoopElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopElseStatement(KParser.LoopElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopJumpStatement(KParser.LoopJumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopJumpStatement(KParser.LoopJumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopContinueStatement(KParser.LoopContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopContinueStatement(KParser.LoopContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckStatement(KParser.CheckStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckStatement(KParser.CheckStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(KParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(KParser.UsingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckErrorStatement(KParser.CheckErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckErrorStatement(KParser.CheckErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 */
	void enterCheckFinallyStatment(KParser.CheckFinallyStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 */
	void exitCheckFinallyStatment(KParser.CheckFinallyStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkReportStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckReportStatement(KParser.CheckReportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkReportStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckReportStatement(KParser.CheckReportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#iteratorStatement}.
	 * @param ctx the parse tree
	 */
	void enterIteratorStatement(KParser.IteratorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#iteratorStatement}.
	 * @param ctx the parse tree
	 */
	void exitIteratorStatement(KParser.IteratorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaredStatement(KParser.VariableDeclaredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaredStatement(KParser.VariableDeclaredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaredStatement(KParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaredStatement(KParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#channelAssignStatement}.
	 * @param ctx the parse tree
	 */
	void enterChannelAssignStatement(KParser.ChannelAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#channelAssignStatement}.
	 * @param ctx the parse tree
	 */
	void exitChannelAssignStatement(KParser.ChannelAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarStatement(KParser.VarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#varStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarStatement(KParser.VarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bindStatement}.
	 * @param ctx the parse tree
	 */
	void enterBindStatement(KParser.BindStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bindStatement}.
	 * @param ctx the parse tree
	 */
	void exitBindStatement(KParser.BindStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(KParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(KParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(KParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(KParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(KParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(KParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#constId}.
	 * @param ctx the parse tree
	 */
	void enterConstId(KParser.ConstIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#constId}.
	 * @param ctx the parse tree
	 */
	void exitConstId(KParser.ConstIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(KParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(KParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(KParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(KParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(KParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(KParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(KParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(KParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(KParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(KParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#annotationSupport}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationSupport(KParser.AnnotationSupportContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#annotationSupport}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationSupport(KParser.AnnotationSupportContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(KParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(KParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(KParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(KParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#annotationItem}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationItem(KParser.AnnotationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#annotationItem}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationItem(KParser.AnnotationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(KParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(KParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callChannel}.
	 * @param ctx the parse tree
	 */
	void enterCallChannel(KParser.CallChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callChannel}.
	 * @param ctx the parse tree
	 */
	void exitCallChannel(KParser.CallChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callElement}.
	 * @param ctx the parse tree
	 */
	void enterCallElement(KParser.CallElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callElement}.
	 * @param ctx the parse tree
	 */
	void exitCallElement(KParser.CallElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callPkg}.
	 * @param ctx the parse tree
	 */
	void enterCallPkg(KParser.CallPkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callPkg}.
	 * @param ctx the parse tree
	 */
	void exitCallPkg(KParser.CallPkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callNew}.
	 * @param ctx the parse tree
	 */
	void enterCallNew(KParser.CallNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callNew}.
	 * @param ctx the parse tree
	 */
	void exitCallNew(KParser.CallNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#orElse}.
	 * @param ctx the parse tree
	 */
	void enterOrElse(KParser.OrElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#orElse}.
	 * @param ctx the parse tree
	 */
	void exitOrElse(KParser.OrElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(KParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(KParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeCheck}.
	 * @param ctx the parse tree
	 */
	void enterTypeCheck(KParser.TypeCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeCheck}.
	 * @param ctx the parse tree
	 */
	void exitTypeCheck(KParser.TypeCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pkgAssign}.
	 * @param ctx the parse tree
	 */
	void enterPkgAssign(KParser.PkgAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pkgAssign}.
	 * @param ctx the parse tree
	 */
	void exitPkgAssign(KParser.PkgAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 */
	void enterPkgAssignElement(KParser.PkgAssignElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 */
	void exitPkgAssignElement(KParser.PkgAssignElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#listAssign}.
	 * @param ctx the parse tree
	 */
	void enterListAssign(KParser.ListAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#listAssign}.
	 * @param ctx the parse tree
	 */
	void exitListAssign(KParser.ListAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAssign(KParser.DictionaryAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAssign(KParser.DictionaryAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callAwait}.
	 * @param ctx the parse tree
	 */
	void enterCallAwait(KParser.CallAwaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callAwait}.
	 * @param ctx the parse tree
	 */
	void exitCallAwait(KParser.CallAwaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#callAsync}.
	 * @param ctx the parse tree
	 */
	void enterCallAsync(KParser.CallAsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#callAsync}.
	 * @param ctx the parse tree
	 */
	void exitCallAsync(KParser.CallAsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(KParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(KParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(KParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(KParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryElement(KParser.DictionaryElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryElement(KParser.DictionaryElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(KParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(KParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#sliceFull}.
	 * @param ctx the parse tree
	 */
	void enterSliceFull(KParser.SliceFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#sliceFull}.
	 * @param ctx the parse tree
	 */
	void exitSliceFull(KParser.SliceFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#sliceStart}.
	 * @param ctx the parse tree
	 */
	void enterSliceStart(KParser.SliceStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#sliceStart}.
	 * @param ctx the parse tree
	 */
	void exitSliceStart(KParser.SliceStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void enterSliceEnd(KParser.SliceEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void exitSliceEnd(KParser.SliceEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceItem(KParser.NameSpaceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceItem(KParser.NameSpaceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(KParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(KParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#templateDefine}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDefine(KParser.TemplateDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#templateDefine}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDefine(KParser.TemplateDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#templateDefineItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDefineItem(KParser.TemplateDefineItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#templateDefineItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDefineItem(KParser.TemplateDefineItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#templateCall}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCall(KParser.TemplateCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#templateCall}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCall(KParser.TemplateCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(KParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(KParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#lambdaIn}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIn(KParser.LambdaInContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#lambdaIn}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIn(KParser.LambdaInContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymous(KParser.PkgAnonymousContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymous(KParser.PkgAnonymousContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymousAssign(KParser.PkgAnonymousAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymousAssign(KParser.PkgAnonymousAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 */
	void enterPkgAnonymousAssignElement(KParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 */
	void exitPkgAnonymousAssignElement(KParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(KParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(KParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(KParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(KParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(KParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(KParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNotExpression(KParser.BitwiseNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNotExpression(KParser.BitwiseNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#linq}.
	 * @param ctx the parse tree
	 */
	void enterLinq(KParser.LinqContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#linq}.
	 * @param ctx the parse tree
	 */
	void exitLinq(KParser.LinqContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#linqHeadItem}.
	 * @param ctx the parse tree
	 */
	void enterLinqHeadItem(KParser.LinqHeadItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#linqHeadItem}.
	 * @param ctx the parse tree
	 */
	void exitLinqHeadItem(KParser.LinqHeadItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#linqItem}.
	 * @param ctx the parse tree
	 */
	void enterLinqItem(KParser.LinqItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#linqItem}.
	 * @param ctx the parse tree
	 */
	void exitLinqItem(KParser.LinqItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpression(KParser.JudgeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeExpression}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpression(KParser.JudgeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionElseStatement(KParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionElseStatement(KParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionIfStatement(KParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionIfStatement(KParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJudgeExpressionElseIfStatement(KParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJudgeExpressionElseIfStatement(KParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterJudgeCaseExpression(KParser.JudgeCaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitJudgeCaseExpression(KParser.JudgeCaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionStatement(KParser.CaseExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionStatement(KParser.CaseExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(KParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(KParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopEachExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopEachExpression(KParser.LoopEachExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopEachExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopEachExpression(KParser.LoopEachExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#loopElseExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopElseExpression(KParser.LoopElseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#loopElseExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopElseExpression(KParser.LoopElseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkExpression}.
	 * @param ctx the parse tree
	 */
	void enterCheckExpression(KParser.CheckExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkExpression}.
	 * @param ctx the parse tree
	 */
	void exitCheckExpression(KParser.CheckExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 */
	void enterCheckErrorExpression(KParser.CheckErrorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 */
	void exitCheckErrorExpression(KParser.CheckErrorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(KParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(KParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(KParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(KParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(KParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(KParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#stringTemplate}.
	 * @param ctx the parse tree
	 */
	void enterStringTemplate(KParser.StringTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#stringTemplate}.
	 * @param ctx the parse tree
	 */
	void exitStringTemplate(KParser.StringTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#rawStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterRawStringExpr(KParser.RawStringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#rawStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitRawStringExpr(KParser.RawStringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#rawStringContent}.
	 * @param ctx the parse tree
	 */
	void enterRawStringContent(KParser.RawStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#rawStringContent}.
	 * @param ctx the parse tree
	 */
	void exitRawStringContent(KParser.RawStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 */
	void enterRawStringTemplate(KParser.RawStringTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 */
	void exitRawStringTemplate(KParser.RawStringTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(KParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(KParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(KParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(KParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeNotNull}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotNull(KParser.TypeNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeNotNull}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotNull(KParser.TypeNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(KParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(KParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeNullable}.
	 * @param ctx the parse tree
	 */
	void enterTypeNullable(KParser.TypeNullableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeNullable}.
	 * @param ctx the parse tree
	 */
	void exitTypeNullable(KParser.TypeNullableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(KParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(KParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(KParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(KParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeSet}.
	 * @param ctx the parse tree
	 */
	void enterTypeSet(KParser.TypeSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeSet}.
	 * @param ctx the parse tree
	 */
	void exitTypeSet(KParser.TypeSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeDictionary}.
	 * @param ctx the parse tree
	 */
	void enterTypeDictionary(KParser.TypeDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeDictionary}.
	 * @param ctx the parse tree
	 */
	void exitTypeDictionary(KParser.TypeDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeStack}.
	 * @param ctx the parse tree
	 */
	void enterTypeStack(KParser.TypeStackContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeStack}.
	 * @param ctx the parse tree
	 */
	void exitTypeStack(KParser.TypeStackContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeQueue}.
	 * @param ctx the parse tree
	 */
	void enterTypeQueue(KParser.TypeQueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeQueue}.
	 * @param ctx the parse tree
	 */
	void exitTypeQueue(KParser.TypeQueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeChannel}.
	 * @param ctx the parse tree
	 */
	void enterTypeChannel(KParser.TypeChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeChannel}.
	 * @param ctx the parse tree
	 */
	void exitTypeChannel(KParser.TypeChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typePackage}.
	 * @param ctx the parse tree
	 */
	void enterTypePackage(KParser.TypePackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typePackage}.
	 * @param ctx the parse tree
	 */
	void exitTypePackage(KParser.TypePackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(KParser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(KParser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeAny}.
	 * @param ctx the parse tree
	 */
	void enterTypeAny(KParser.TypeAnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeAny}.
	 * @param ctx the parse tree
	 */
	void exitTypeAny(KParser.TypeAnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionParameterClause(KParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionParameterClause(KParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(KParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(KParser.TypeBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#nilExpr}.
	 * @param ctx the parse tree
	 */
	void enterNilExpr(KParser.NilExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#nilExpr}.
	 * @param ctx the parse tree
	 */
	void exitNilExpr(KParser.NilExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(KParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(KParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(KParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(KParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAnd(KParser.BitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAnd(KParser.BitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(KParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(KParser.BitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseNot}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNot(KParser.BitwiseNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseNot}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNot(KParser.BitwiseNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXor(KParser.BitwiseXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXor(KParser.BitwiseXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseLeftShift(KParser.BitwiseLeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseLeftShift(KParser.BitwiseLeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseRightShift(KParser.BitwiseRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseRightShift(KParser.BitwiseRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#compareCombine}.
	 * @param ctx the parse tree
	 */
	void enterCompareCombine(KParser.CompareCombineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#compareCombine}.
	 * @param ctx the parse tree
	 */
	void exitCompareCombine(KParser.CompareCombineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(KParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(KParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(KParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(KParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(KParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(KParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(KParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(KParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(KParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(KParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(KParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(KParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(KParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(KParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#wave}.
	 * @param ctx the parse tree
	 */
	void enterWave(KParser.WaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#wave}.
	 * @param ctx the parse tree
	 */
	void exitWave(KParser.WaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(KParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(KParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#idItem}.
	 * @param ctx the parse tree
	 */
	void enterIdItem(KParser.IdItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#idItem}.
	 * @param ctx the parse tree
	 */
	void exitIdItem(KParser.IdItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(KParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(KParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(KParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(KParser.MoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void enterLeft_brace(KParser.Left_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void exitLeft_brace(KParser.Left_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void enterRight_brace(KParser.Right_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void exitRight_brace(KParser.Right_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#left_paren}.
	 * @param ctx the parse tree
	 */
	void enterLeft_paren(KParser.Left_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#left_paren}.
	 * @param ctx the parse tree
	 */
	void exitLeft_paren(KParser.Left_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#right_paren}.
	 * @param ctx the parse tree
	 */
	void enterRight_paren(KParser.Right_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#right_paren}.
	 * @param ctx the parse tree
	 */
	void exitRight_paren(KParser.Right_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#left_brack}.
	 * @param ctx the parse tree
	 */
	void enterLeft_brack(KParser.Left_brackContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#left_brack}.
	 * @param ctx the parse tree
	 */
	void exitLeft_brack(KParser.Left_brackContext ctx);
	/**
	 * Enter a parse tree produced by {@link KParser#right_brack}.
	 * @param ctx the parse tree
	 */
	void enterRight_brack(KParser.Right_brackContext ctx);
	/**
	 * Exit a parse tree produced by {@link KParser#right_brack}.
	 * @param ctx the parse tree
	 */
	void exitRight_brack(KParser.Right_brackContext ctx);
}