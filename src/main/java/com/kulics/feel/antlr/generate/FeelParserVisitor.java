// Generated from /Users/kulics/Documents/kulics-works/feel-kotlin/src/main/java/com/kulics/feel/antlr/FeelParser.g4 by ANTLR 4.8
package com.kulics.feel.antlr.generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FeelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FeelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FeelParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FeelParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FeelParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(FeelParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#namespaceSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceSupportStatement(FeelParser.NamespaceSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(FeelParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#importSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSubStatement(FeelParser.ImportSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStatement(FeelParser.TypeAliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeRedefineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRedefineStatement(FeelParser.TypeRedefineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeTagStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTagStatement(FeelParser.TypeTagStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#enumStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatement(FeelParser.EnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#enumSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSupportStatement(FeelParser.EnumSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#namespaceVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceVariableStatement(FeelParser.NamespaceVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#namespaceConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceConstantStatement(FeelParser.NamespaceConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#namespaceFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceFunctionStatement(FeelParser.NamespaceFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStatement(FeelParser.PackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStaticStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticStatement(FeelParser.PackageStaticStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStaticSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticSupportStatement(FeelParser.PackageStaticSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStaticVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticVariableStatement(FeelParser.PackageStaticVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStaticConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticConstantStatement(FeelParser.PackageStaticConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageStaticFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStaticFunctionStatement(FeelParser.PackageStaticFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageFieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageFieldStatement(FeelParser.PackageFieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageSupportStatement(FeelParser.PackageSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(FeelParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageNewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageNewStatement(FeelParser.PackageNewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageVariableStatement(FeelParser.PackageVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageConstantStatement(FeelParser.PackageConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageFunctionStatement(FeelParser.PackageFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageControlSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageControlSubStatement(FeelParser.PackageControlSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#packageEventStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageEventStatement(FeelParser.PackageEventStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#implementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementStatement(FeelParser.ImplementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#overrideVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideVariableStatement(FeelParser.OverrideVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#overrideConstantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideConstantStatement(FeelParser.OverrideConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#overrideFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideFunctionStatement(FeelParser.OverrideFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#protocolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolStatement(FeelParser.ProtocolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#protocolSubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolSubStatement(FeelParser.ProtocolSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#protocolSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolSupportStatement(FeelParser.ProtocolSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#protocolVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolVariableStatement(FeelParser.ProtocolVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#protocolFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolFunctionStatement(FeelParser.ProtocolFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(FeelParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FeelParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#returnAsyncStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAsyncStatement(FeelParser.ReturnAsyncStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#yieldReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldReturnStatement(FeelParser.YieldReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#yieldBreakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldBreakStatement(FeelParser.YieldBreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#parameterClauseIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClauseIn(FeelParser.ParameterClauseInContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#parameterClauseOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClauseOut(FeelParser.ParameterClauseOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FeelParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#functionSupportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSupportStatement(FeelParser.FunctionSupportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeCaseStatement(FeelParser.JudgeCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(FeelParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#caseExprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExprStatement(FeelParser.CaseExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeStatement(FeelParser.JudgeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeElseStatement(FeelParser.JudgeElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeIfStatement(FeelParser.JudgeIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeElseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeElseIfStatement(FeelParser.JudgeElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(FeelParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEachStatement(FeelParser.LoopEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCaseStatement(FeelParser.LoopCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElseStatement(FeelParser.LoopElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopJumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopJumpStatement(FeelParser.LoopJumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopContinueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopContinueStatement(FeelParser.LoopContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStatement(FeelParser.CheckStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#usingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingStatement(FeelParser.UsingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkErrorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckErrorStatement(FeelParser.CheckErrorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkFinallyStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckFinallyStatment(FeelParser.CheckFinallyStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkReportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckReportStatement(FeelParser.CheckReportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#iteratorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorStatement(FeelParser.IteratorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#variableDeclaredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaredStatement(FeelParser.VariableDeclaredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#constantDeclaredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaredStatement(FeelParser.ConstantDeclaredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#varStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStatement(FeelParser.VarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bindStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindStatement(FeelParser.BindStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(FeelParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(FeelParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationStatement(FeelParser.AnnotationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(FeelParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#constId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstId(FeelParser.ConstIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(FeelParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(FeelParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FeelParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(FeelParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(FeelParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FeelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotationSupport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationSupport(FeelParser.AnnotationSupportContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(FeelParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(FeelParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotationItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationItem(FeelParser.AnnotationItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#annotationString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationString(FeelParser.AnnotationStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(FeelParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callAsync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAsync(FeelParser.CallAsyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callAwait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAwait(FeelParser.CallAwaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallChannel(FeelParser.CallChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#transfer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransfer(FeelParser.TransferContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallElement(FeelParser.CallElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callPkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPkg(FeelParser.CallPkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#callNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallNew(FeelParser.CallNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#orElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrElse(FeelParser.OrElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(FeelParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCheck(FeelParser.TypeCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pkgAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAssign(FeelParser.PkgAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pkgAssignElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAssignElement(FeelParser.PkgAssignElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#listAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssign(FeelParser.ListAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#dictionaryAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryAssign(FeelParser.DictionaryAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FeelParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(FeelParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#dictionaryElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryElement(FeelParser.DictionaryElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(FeelParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#sliceFull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceFull(FeelParser.SliceFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#sliceStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceStart(FeelParser.SliceStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#sliceEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceEnd(FeelParser.SliceEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#nameSpaceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameSpaceItem(FeelParser.NameSpaceItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(FeelParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#templateDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDefine(FeelParser.TemplateDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#templateDefineItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDefineItem(FeelParser.TemplateDefineItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#templateCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCall(FeelParser.TemplateCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(FeelParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#lambdaIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIn(FeelParser.LambdaInContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pkgAnonymous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymous(FeelParser.PkgAnonymousContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pkgAnonymousAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymousAssign(FeelParser.PkgAnonymousAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pkgAnonymousAssignElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkgAnonymousAssignElement(FeelParser.PkgAnonymousAssignElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(FeelParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(FeelParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(FeelParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNotExpression(FeelParser.BitwiseNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#linq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinq(FeelParser.LinqContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#linqHeadItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinqHeadItem(FeelParser.LinqHeadItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#linqItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinqItem(FeelParser.LinqItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpression(FeelParser.JudgeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeExpressionElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionElseStatement(FeelParser.JudgeExpressionElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeExpressionIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionIfStatement(FeelParser.JudgeExpressionIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeExpressionElseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpressionElseIfStatement(FeelParser.JudgeExpressionElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#judgeCaseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeCaseExpression(FeelParser.JudgeCaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#caseExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpressionStatement(FeelParser.CaseExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExpression(FeelParser.LoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopEachExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEachExpression(FeelParser.LoopEachExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#loopElseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElseExpression(FeelParser.LoopElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckExpression(FeelParser.CheckExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#checkErrorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckErrorExpression(FeelParser.CheckErrorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(FeelParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(FeelParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(FeelParser.StringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#stringTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTemplate(FeelParser.StringTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#rawStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringExpr(FeelParser.RawStringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#rawStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringContent(FeelParser.RawStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#rawStringTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawStringTemplate(FeelParser.RawStringTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(FeelParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#integerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(FeelParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeNotNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotNull(FeelParser.TypeNotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(FeelParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeNullable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNullable(FeelParser.TypeNullableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(FeelParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(FeelParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSet(FeelParser.TypeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDictionary(FeelParser.TypeDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeStack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStack(FeelParser.TypeStackContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeQueue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQueue(FeelParser.TypeQueueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChannel(FeelParser.TypeChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typePackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePackage(FeelParser.TypePackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(FeelParser.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAny(FeelParser.TypeAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeFunctionParameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionParameterClause(FeelParser.TypeFunctionParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(FeelParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#nilExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilExpr(FeelParser.NilExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(FeelParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(FeelParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAnd(FeelParser.BitwiseAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOr(FeelParser.BitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNot(FeelParser.BitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXor(FeelParser.BitwiseXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseLeftShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseLeftShift(FeelParser.BitwiseLeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#bitwiseRightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseRightShift(FeelParser.BitwiseRightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#compareCombine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCombine(FeelParser.CompareCombineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(FeelParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(FeelParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FeelParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(FeelParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(FeelParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(FeelParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(FeelParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#wave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWave(FeelParser.WaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FeelParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#idItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdItem(FeelParser.IdItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(FeelParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore(FeelParser.MoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#left_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_brace(FeelParser.Left_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#right_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_brace(FeelParser.Right_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#left_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_paren(FeelParser.Left_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#right_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_paren(FeelParser.Right_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#left_brack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_brack(FeelParser.Left_brackContext ctx);
	/**
	 * Visit a parse tree produced by {@link FeelParser#right_brack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_brack(FeelParser.Right_brackContext ctx);
}