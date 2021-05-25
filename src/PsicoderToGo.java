import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class PsicoderToGo extends PsicoderBaseListener{
    HashMap<String, String> translate_types = new HashMap<>();

    public PsicoderToGo() {
        translate_types.put("entero", "int");
        translate_types.put("real", "float64");
        translate_types.put("caracter", "byte");
        translate_types.put("booleano", "bool");
        translate_types.put("cadena", "string");

    }

    int nested_level = 0;
    boolean inicio = false;
    public void printTabs(){
        for(int i = 0; i < nested_level; ++i){
            System.out.print("\t");
        }
    }

    @Override
    public void enterStart(PsicoderParser.StartContext ctx) {
        System.out.println("package main");
        System.out.println("import(\n" +
                "   fmt\n" +
                ")");
    }

    @Override
    public void enterMain(PsicoderParser.MainContext ctx) {
        System.out.println("func main() {\n");
        nested_level++;
    }

    @Override
    public void exitMain(PsicoderParser.MainContext ctx) {
        System.out.println("}");
    }

    @Override
    public void exitStart(PsicoderParser.StartContext ctx) {
        super.exitStart(ctx);
    }

    @Override
    public void enterIf_(PsicoderParser.If_Context ctx) {
        printTabs();
        System.out.println("if(" + ctx.expr().getText() + "){");
        nested_level++;
    }

    @Override
    public void exitIf_(PsicoderParser.If_Context ctx) {
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterEstructura(PsicoderParser.EstructuraContext ctx) {
        System.out.println("type " + ctx.ID().getText() + " struct {");
        nested_level++;
    }

    @Override
    public void exitEstructura(PsicoderParser.EstructuraContext ctx) {
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterEstruct_body(PsicoderParser.Estruct_bodyContext ctx) {
        printTabs();
        if(ctx.data_type() != null){
            for(int i = 0; i < ctx.ID().size(); i++){
                if ( i < ctx.ID().size() - 1){
                    System.out.print(ctx.ID(i).getText() + ", ");
                }else{
                    System.out.print(ctx.ID(i).getText() +  " ");
                }
            }
            System.out.println(" "+ translate_types.get(ctx.data_type().getText()));
        }
    }

    @Override
    public void exitEstruct_body(PsicoderParser.Estruct_bodyContext ctx) {
        super.exitEstruct_body(ctx);
    }

    @Override
    public void enterFunction(PsicoderParser.FunctionContext ctx) {
        super.enterFunction(ctx);
    }

    @Override
    public void exitFunction(PsicoderParser.FunctionContext ctx) {
        super.exitFunction(ctx);
    }

    @Override
    public void enterParameters(PsicoderParser.ParametersContext ctx) {
        super.enterParameters(ctx);
    }

    @Override
    public void exitParameters(PsicoderParser.ParametersContext ctx) {
        super.exitParameters(ctx);
    }

    @Override
    public void enterReturn_(PsicoderParser.Return_Context ctx) {
        super.enterReturn_(ctx);
    }

    @Override
    public void exitReturn_(PsicoderParser.Return_Context ctx) {
        super.exitReturn_(ctx);
    }

    @Override
    public void enterCommands(PsicoderParser.CommandsContext ctx) {
        super.enterCommands(ctx);
    }

    @Override
    public void exitCommands(PsicoderParser.CommandsContext ctx) {
        super.exitCommands(ctx);
    }

    @Override
    public void enterCommand(PsicoderParser.CommandContext ctx) {
        super.enterCommand(ctx);
    }

    @Override
    public void exitCommand(PsicoderParser.CommandContext ctx) {
        super.exitCommand(ctx);
    }

    @Override
    public void enterRead(PsicoderParser.ReadContext ctx) {
        super.enterRead(ctx);
    }

    @Override
    public void exitRead(PsicoderParser.ReadContext ctx) {
        super.exitRead(ctx);
    }

    @Override
    public void enterPrint(PsicoderParser.PrintContext ctx) {
        super.enterPrint(ctx);
    }

    @Override
    public void exitPrint(PsicoderParser.PrintContext ctx) {
        super.exitPrint(ctx);
    }

    @Override
    public void enterElse_(PsicoderParser.Else_Context ctx) {
        super.enterElse_(ctx);
    }

    @Override
    public void exitElse_(PsicoderParser.Else_Context ctx) {
        super.exitElse_(ctx);
    }

    @Override
    public void enterWhile_(PsicoderParser.While_Context ctx) {
        super.enterWhile_(ctx);
    }

    @Override
    public void exitWhile_(PsicoderParser.While_Context ctx) {
        super.exitWhile_(ctx);
    }

    @Override
    public void enterDo_while_(PsicoderParser.Do_while_Context ctx) {
        super.enterDo_while_(ctx);
    }

    @Override
    public void exitDo_while_(PsicoderParser.Do_while_Context ctx) {
        super.exitDo_while_(ctx);
    }

    @Override
    public void enterFor_(PsicoderParser.For_Context ctx) {
        super.enterFor_(ctx);
    }

    @Override
    public void exitFor_(PsicoderParser.For_Context ctx) {
        super.exitFor_(ctx);
    }

    @Override
    public void enterSwitch_(PsicoderParser.Switch_Context ctx) {
        super.enterSwitch_(ctx);
    }

    @Override
    public void exitSwitch_(PsicoderParser.Switch_Context ctx) {
        super.exitSwitch_(ctx);
    }

    @Override
    public void enterCaso(PsicoderParser.CasoContext ctx) {
        super.enterCaso(ctx);
    }

    @Override
    public void exitCaso(PsicoderParser.CasoContext ctx) {
        super.exitCaso(ctx);
    }

    @Override
    public void enterDefect(PsicoderParser.DefectContext ctx) {
        super.enterDefect(ctx);
    }

    @Override
    public void exitDefect(PsicoderParser.DefectContext ctx) {
        super.exitDefect(ctx);
    }

    @Override
    public void enterAssign(PsicoderParser.AssignContext ctx) {
        super.enterAssign(ctx);
    }

    @Override
    public void exitAssign(PsicoderParser.AssignContext ctx) {
        super.exitAssign(ctx);
    }

    @Override
    public void enterDeclaration(PsicoderParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(PsicoderParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterCall_function(PsicoderParser.Call_functionContext ctx) {
        super.enterCall_function(ctx);
    }

    @Override
    public void exitCall_function(PsicoderParser.Call_functionContext ctx) {
        super.exitCall_function(ctx);
    }

    @Override
    public void enterSend_parameters(PsicoderParser.Send_parametersContext ctx) {
        super.enterSend_parameters(ctx);
    }

    @Override
    public void exitSend_parameters(PsicoderParser.Send_parametersContext ctx) {
        super.exitSend_parameters(ctx);
    }

    @Override
    public void enterExpr(PsicoderParser.ExprContext ctx) {
        super.enterExpr(ctx);
    }

    @Override
    public void exitExpr(PsicoderParser.ExprContext ctx) {
        super.exitExpr(ctx);
    }

    @Override
    public void enterData(PsicoderParser.DataContext ctx) {
        super.enterData(ctx);
    }

    @Override
    public void exitData(PsicoderParser.DataContext ctx) {
        super.exitData(ctx);
    }

    @Override
    public void enterOperator(PsicoderParser.OperatorContext ctx) {
        super.enterOperator(ctx);
    }

    @Override
    public void exitOperator(PsicoderParser.OperatorContext ctx) {
        super.exitOperator(ctx);
    }

    @Override
    public void enterData_type(PsicoderParser.Data_typeContext ctx) {
        super.enterData_type(ctx);
    }

    @Override
    public void exitData_type(PsicoderParser.Data_typeContext ctx) {
        super.exitData_type(ctx);
    }

    @Override
    public void enterId_c(PsicoderParser.Id_cContext ctx) {
        super.enterId_c(ctx);
    }

    @Override
    public void exitId_c(PsicoderParser.Id_cContext ctx) {
        super.exitId_c(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}