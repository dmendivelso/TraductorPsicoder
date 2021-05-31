// Generated from R:/Documentos/Unal/7mo Semestre/Lng/ANTLR/ProyectoPsicoder/grammar\Psicoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsicoderParser}.
 */
public interface PsicoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PsicoderParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PsicoderParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PsicoderParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PsicoderParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#estruct_body}.
	 * @param ctx the parse tree
	 */
	void enterEstruct_body(PsicoderParser.Estruct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#estruct_body}.
	 * @param ctx the parse tree
	 */
	void exitEstruct_body(PsicoderParser.Estruct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PsicoderParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PsicoderParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PsicoderParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PsicoderParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(PsicoderParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(PsicoderParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(PsicoderParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(PsicoderParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PsicoderParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PsicoderParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PsicoderParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PsicoderParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PsicoderParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PsicoderParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(PsicoderParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(PsicoderParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(PsicoderParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(PsicoderParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(PsicoderParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(PsicoderParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#do_while_}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_(PsicoderParser.Do_while_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#do_while_}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_(PsicoderParser.Do_while_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(PsicoderParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(PsicoderParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#switch_}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_(PsicoderParser.Switch_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#switch_}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_(PsicoderParser.Switch_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#defect}.
	 * @param ctx the parse tree
	 */
	void enterDefect(PsicoderParser.DefectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#defect}.
	 * @param ctx the parse tree
	 */
	void exitDefect(PsicoderParser.DefectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PsicoderParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PsicoderParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PsicoderParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PsicoderParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(PsicoderParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(PsicoderParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(PsicoderParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(PsicoderParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PsicoderParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PsicoderParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(PsicoderParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(PsicoderParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#id_c}.
	 * @param ctx the parse tree
	 */
	void enterId_c(PsicoderParser.Id_cContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#id_c}.
	 * @param ctx the parse tree
	 */
	void exitId_c(PsicoderParser.Id_cContext ctx);
}