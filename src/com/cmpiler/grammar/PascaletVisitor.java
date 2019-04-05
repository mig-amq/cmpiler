// Generated from C:\Users\Miguel\Desktop\Pascalet\src\com\cmpiler\grammar\Pascalet.g4 by ANTLR 4.7.2
package com.cmpiler.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascaletParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascaletVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascaletParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#builtInFuncStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFuncStatement(PascaletParser.BuiltInFuncStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(PascaletParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascaletParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#varDefBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefBlock(PascaletParser.VarDefBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(PascaletParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascaletParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constDefBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDefBlock(PascaletParser.ConstDefBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(PascaletParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procAndFuncDefBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcAndFuncDefBlock(PascaletParser.ProcAndFuncDefBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procAndFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcAndFuncDef(PascaletParser.ProcAndFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascaletParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascaletParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascaletParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PascaletParser.IdentifierContext ctx);
}