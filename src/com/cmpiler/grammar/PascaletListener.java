// Generated from C:\Users\Miguel\Desktop\Pascalet\src\com\cmpiler\grammar\Pascalet.g4 by ANTLR 4.7.2
package com.cmpiler.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascaletParser}.
 */
public interface PascaletListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascaletParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascaletParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#builtInFuncStatement}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFuncStatement(PascaletParser.BuiltInFuncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#builtInFuncStatement}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFuncStatement(PascaletParser.BuiltInFuncStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#mathFuncStatement}.
	 * @param ctx the parse tree
	 */
	void enterMathFuncStatement(PascaletParser.MathFuncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#mathFuncStatement}.
	 * @param ctx the parse tree
	 */
	void exitMathFuncStatement(PascaletParser.MathFuncStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#ordFuncStatement}.
	 * @param ctx the parse tree
	 */
	void enterOrdFuncStatement(PascaletParser.OrdFuncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#ordFuncStatement}.
	 * @param ctx the parse tree
	 */
	void exitOrdFuncStatement(PascaletParser.OrdFuncStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascaletParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascaletParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascaletParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascaletParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascaletParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascaletParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascaletParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascaletParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#varDefBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarDefBlock(PascaletParser.VarDefBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#varDefBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarDefBlock(PascaletParser.VarDefBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(PascaletParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(PascaletParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascaletParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascaletParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constDefBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstDefBlock(PascaletParser.ConstDefBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constDefBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstDefBlock(PascaletParser.ConstDefBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(PascaletParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(PascaletParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procAndFuncDefBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcAndFuncDefBlock(PascaletParser.ProcAndFuncDefBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procAndFuncDefBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcAndFuncDefBlock(PascaletParser.ProcAndFuncDefBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procAndFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterProcAndFuncDef(PascaletParser.ProcAndFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procAndFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitProcAndFuncDef(PascaletParser.ProcAndFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascaletParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascaletParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascaletParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascaletParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascaletParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascaletParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascaletParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascaletParser.IdentifierContext ctx);
}