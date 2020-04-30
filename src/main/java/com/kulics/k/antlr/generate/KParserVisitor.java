// Generated from /Users/kulics/Documents/kulics-works/k-kotlin/src/main/java/com/kulics/k/antlr/KParser.g4 by ANTLR 4.8
package com.kulics.k.antlr.generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(KParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceSupportStatement(KParser.NamespaceSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(KParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#importSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSubStatement(KParser.ImportSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStatement(KParser.TypeAliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRedefineStatement(KParser.TypeRedefineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeTagStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTagStatement(KParser.TypeTagStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#enumStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatement(KParser.EnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSupportStatement(KParser.EnumSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceVariableStatement(KParser.NamespaceVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceConstantStatement(KParser.NamespaceConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceFunctionStatement(KParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStatement(KParser.PackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticStatement(KParser.PackageStaticStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticSupportStatement(KParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticVariableStatement(KParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticConstantStatement(KParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticFunctionStatement(KParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageFieldStatement(KParser.PackageFieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageSupportStatement(KParser.PackageSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(KParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageNewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageNewStatement(KParser.PackageNewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageVariableStatement(KParser.PackageVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageConstantStatement(KParser.PackageConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageFunctionStatement(KParser.PackageFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageControlSubStatement(KParser.PackageControlSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#packageEventStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageEventStatement(KParser.PackageEventStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#implementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementStatement(KParser.ImplementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideVariableStatement(KParser.OverrideVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideConstantStatement(KParser.OverrideConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideFunctionStatement(KParser.OverrideFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#protocolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolStatement(KParser.ProtocolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolSubStatement(KParser.ProtocolSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolSupportStatement(KParser.ProtocolSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolVariableStatement(KParser.ProtocolVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolFunctionStatement(KParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(KParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(KParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#returnAsyncStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAsyncStatement(KParser.ReturnAsyncStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldReturnStatement(KParser.YieldReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldBreakStatement(KParser.YieldBreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClauseIn(KParser.ParameterClauseInContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClauseOut(KParser.ParameterClauseOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSupportStatement(KParser.FunctionSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeCaseStatement(KParser.JudgeCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(KParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#caseExprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExprStatement(KParser.CaseExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeStatement(KParser.JudgeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeElseStatement(KParser.JudgeElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeIfStatement(KParser.JudgeIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeElseIfStatement(KParser.JudgeElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(KParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEachStatement(KParser.LoopEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCaseStatement(KParser.LoopCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElseStatement(KParser.LoopElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopJumpStatement(KParser.LoopJumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopContinueStatement(KParser.LoopContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStatement(KParser.CheckStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#usingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingStatement(KParser.UsingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckErrorStatement(KParser.CheckErrorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFinallyStatment(KParser.CheckFinallyStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkReportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckReportStatement(KParser.CheckReportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#iteratorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorStatement(KParser.IteratorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaredStatement(KParser.VariableDeclaredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaredStatement(KParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#varStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStatement(KParser.VarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bindStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindStatement(KParser.BindStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(KParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(KParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationStatement(KParser.AnnotationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(KParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#constId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstId(KParser.ConstIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(KParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(KParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(KParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(KParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(KParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotationSupport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationSupport(KParser.AnnotationSupportContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(KParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(KParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationItem(KParser.AnnotationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#annotationString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationString(KParser.AnnotationStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(KParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callAsync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAsync(KParser.CallAsyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callAwait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAwait(KParser.CallAwaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallChannel(KParser.CallChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#transfer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransfer(KParser.TransferContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallElement(KParser.CallElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callPkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPkg(KParser.CallPkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#callNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallNew(KParser.CallNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#orElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrElse(KParser.OrElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(KParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCheck(KParser.TypeCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pkgAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAssign(KParser.PkgAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAssignElement(KParser.PkgAssignElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#listAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssign(KParser.ListAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryAssign(KParser.DictionaryAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(KParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(KParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#dictionaryElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryElement(KParser.DictionaryElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(KParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#sliceFull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceFull(KParser.SliceFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#sliceStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceStart(KParser.SliceStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#sliceEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceEnd(KParser.SliceEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameSpaceItem(KParser.NameSpaceItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(KParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#templateDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDefine(KParser.TemplateDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#templateDefineItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDefineItem(KParser.TemplateDefineItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#templateCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCall(KParser.TemplateCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(KParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#lambdaIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIn(KParser.LambdaInContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymous(KParser.PkgAnonymousContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymousAssign(KParser.PkgAnonymousAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymousAssignElement(KParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(KParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(KParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(KParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNotExpression(KParser.BitwiseNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#linq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinq(KParser.LinqContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#linqHeadItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinqHeadItem(KParser.LinqHeadItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#linqItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinqItem(KParser.LinqItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpression(KParser.JudgeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionElseStatement(KParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionIfStatement(KParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionElseIfStatement(KParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeCaseExpression(KParser.JudgeCaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionStatement(KParser.CaseExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExpression(KParser.LoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopEachExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEachExpression(KParser.LoopEachExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#loopElseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElseExpression(KParser.LoopElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckExpression(KParser.CheckExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckErrorExpression(KParser.CheckErrorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(KParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(KParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(KParser.StringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#stringTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTemplate(KParser.StringTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#rawStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringExpr(KParser.RawStringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#rawStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringContent(KParser.RawStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringTemplate(KParser.RawStringTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(KParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#integerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(KParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeNotNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotNull(KParser.TypeNotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(KParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeNullable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNullable(KParser.TypeNullableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(KParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(KParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSet(KParser.TypeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDictionary(KParser.TypeDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeStack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStack(KParser.TypeStackContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeQueue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQueue(KParser.TypeQueueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChannel(KParser.TypeChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typePackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePackage(KParser.TypePackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(KParser.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAny(KParser.TypeAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionParameterClause(KParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(KParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#nilExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilExpr(KParser.NilExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(KParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(KParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAnd(KParser.BitwiseAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOr(KParser.BitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNot(KParser.BitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXor(KParser.BitwiseXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseLeftShift(KParser.BitwiseLeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseRightShift(KParser.BitwiseRightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#compareCombine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCombine(KParser.CompareCombineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(KParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(KParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(KParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(KParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(KParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(KParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(KParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#wave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWave(KParser.WaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(KParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#idItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdItem(KParser.IdItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(KParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore(KParser.MoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#left_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_brace(KParser.Left_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#right_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_brace(KParser.Right_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#left_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_paren(KParser.Left_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#right_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_paren(KParser.Right_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#left_brack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_brack(KParser.Left_brackContext ctx);
	/**
	 * Visit a parse tree produced by {@link KParser#right_brack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_brack(KParser.Right_brackContext ctx);
}