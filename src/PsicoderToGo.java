import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PsicoderToGo extends PsicoderBaseListener {
    HashMap<String, ArrayList<String>> translate_types = new HashMap<>();
    HashMap<String, String> variable_types = new HashMap<>();
    //TODO: CREAR HASHMAP CON ESTRUCTURAS
    public PsicoderToGo() {
        translate_types.put("entero", new ArrayList(Arrays.asList("int", "d", "0")));
        translate_types.put("real", new ArrayList(Arrays.asList("float64", "f", "0.0")));
        translate_types.put("caracter", new ArrayList(Arrays.asList("byte", "s", "\"\"")));
        translate_types.put("booleano", new ArrayList(Arrays.asList("bool", "b", "false")));
        translate_types.put("cadena", new ArrayList(Arrays.asList("string", "s", "\"\"")));
    }

    public String translate_expr(String expr) {
        String s = "";
        String[] cosas_comillas = expr.split("\"");
        for (int i = 0; i < cosas_comillas.length; ++i){
            //System.out.println("***************"+cosas_comillas[i]);
            if(i % 2 == 0){
                s += cosas_comillas[i].replace("falso", "false").replace("verdadero", "true");
            }
            else{
                s += "\"" + cosas_comillas[i] + "\"";
            }
        }
        return s;
    }

    int nested_level = 0;
    boolean inicio = false;

    public void printTabs() {
        for (int i = 0; i < nested_level; ++i) {
            System.out.print("\t");
        }
    }

    boolean pending_for = false;
    PsicoderParser.For_Context for_pendiente;
    PsicoderParser.FunctionContext funcion_pendiente;
    String name_estructura;

    @Override
    public void enterStart(PsicoderParser.StartContext ctx) {
        System.out.println("package main");
        System.out.println("import(\n" +
                "   \"fmt\"\n" +
                ")");
    }

    @Override
    public void enterMain(PsicoderParser.MainContext ctx) {
        System.out.println("func main() {\n");
        nested_level++;
    }

    @Override
    public void exitMain(PsicoderParser.MainContext ctx) {
        nested_level--;
        System.out.println("}");
    }

    @Override
    public void exitStart(PsicoderParser.StartContext ctx) {
        super.exitStart(ctx);
    }

    @Override
    public void enterIf_(PsicoderParser.If_Context ctx) {
        printTabs();
        System.out.println("if " + translate_expr(ctx.expr().getText()) + " {");
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
        name_estructura = ctx.ID().getText();
        nested_level++;
    }

    @Override
    public void exitEstructura(PsicoderParser.EstructuraContext ctx) {
        nested_level--;
        System.out.println("}");
    }

    @Override
    public void enterEstruct_body(PsicoderParser.Estruct_bodyContext ctx) {
        if (ctx.data_type() != null) {
            printTabs();
            String type;
            if(ctx.data_type().ID() == null){
                type = translate_types.get(ctx.data_type().getText()).get(0);
            }
            else{
                type = ctx.data_type().ID().getText();
            }
            for (int i = 0; i < ctx.ID().size(); i++) {
                if (i < ctx.ID().size() - 1) {
                    System.out.print(ctx.ID(i).getText() + ", ");
                } else {
                    System.out.print(ctx.ID(i).getText() + " ");
                }
            }
            System.out.println(" " + type);

        }
    }

    @Override
    public void exitEstruct_body(PsicoderParser.Estruct_bodyContext ctx) {
        super.exitEstruct_body(ctx);
    }

    @Override
    public void enterFunction(PsicoderParser.FunctionContext ctx) {
        System.out.print("func " + ctx.ID() + "(");
        funcion_pendiente = ctx;
        nested_level++;
    }

    @Override
    public void exitFunction(PsicoderParser.FunctionContext ctx) {
        nested_level--;
        System.out.println("}");
    }

    @Override
    public void enterParameters(PsicoderParser.ParametersContext ctx) {
        for (int i = 0; i < ctx.ID().size(); i++) {
            if (i < ctx.ID().size() - 1) {
                System.out.print(ctx.ID(i).getText() + " " + translate_types.get(ctx.data_type(i).getText()).get(0) + ", ");
            } else {
                System.out.print(ctx.ID(i).getText() + " " + translate_types.get(ctx.data_type(i).getText()).get(0));
            }
        }
    }

    @Override
    public void exitParameters(PsicoderParser.ParametersContext ctx) {
        System.out.println(") " + translate_types.get(funcion_pendiente.data_type().getText()).get(0) + "{");
        nested_level++;
    }

    @Override
    public void enterReturn_(PsicoderParser.Return_Context ctx) {
        printTabs();
        System.out.println("return " + translate_expr(ctx.expr().getText()));
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
        if(ctx.call_function() != null){
            printTabs();
            System.out.println(ctx.call_function().getText());
        }
    }

    @Override
    public void exitCommand(PsicoderParser.CommandContext ctx) {
        super.exitCommand(ctx);
    }

    @Override
    public void enterRead(PsicoderParser.ReadContext ctx) {
        printTabs();
        String name_variable = ctx.id_c().getText();
        try {
            System.out.println("fmt.Scanf(\"%" + translate_types.get(variable_types.get(name_variable)).get(1) + "\", &" + name_variable + ")");
        } catch (Exception e) {
            System.out.println("La variable " + name_variable + " No ha sido declarada");
        }

    }

    @Override
    public void exitRead(PsicoderParser.ReadContext ctx) {
        super.exitRead(ctx);
    }

    @Override
    public void enterPrint(PsicoderParser.PrintContext ctx) {
        printTabs();
        System.out.print("fmt.Println(");
        for (int i = 0; i < ctx.expr().size(); i++) {
            if (i < ctx.expr().size() - 1) {
                System.out.print(translate_expr(ctx.expr(i).getText()) + ", ");
            } else {
                System.out.println(translate_expr(ctx.expr(i).getText()) + ")");
            }
        }
    }

    @Override
    public void exitPrint(PsicoderParser.PrintContext ctx) {
        super.exitPrint(ctx);
    }

    @Override
    public void enterElse_(PsicoderParser.Else_Context ctx) {
        if (ctx.SI_NO() != null) {
            nested_level--;
            printTabs();
            System.out.println("} else {");
            nested_level++;
        }

    }

    @Override
    public void exitElse_(PsicoderParser.Else_Context ctx) {
        super.exitElse_(ctx);
    }

    @Override
    public void enterWhile_(PsicoderParser.While_Context ctx) {
        printTabs();
        System.out.println("for {");
        nested_level++;
        printTabs();
        System.out.println("if !(" + translate_expr(ctx.expr().getText()) + ") {");
        nested_level++;
        printTabs();
        System.out.println("break");
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void exitWhile_(PsicoderParser.While_Context ctx) {
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterDo_while_(PsicoderParser.Do_while_Context ctx) {
        printTabs();
        System.out.println("for {");
        nested_level++;
    }

    @Override
    public void exitDo_while_(PsicoderParser.Do_while_Context ctx) {
        printTabs();
        System.out.println("if !(" + translate_expr(ctx.expr().getText()) + ") {");
        nested_level++;
        printTabs();
        System.out.println("break");
        nested_level--;
        printTabs();
        System.out.println("}");
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterFor_(PsicoderParser.For_Context ctx) {
        printTabs();
        System.out.print("for ");
        pending_for = true;
        for_pendiente = ctx;
    }

    public void imprimir_for() {
        PsicoderParser.For_Context ctx = for_pendiente;
        String variable;
        if (ctx.assign() != null) {
            variable = ctx.assign().id_c().getText();
        } else {
            variable = ctx.declaration().ID(0).getText();
            System.out.print(variable + ":= " + translate_expr(ctx.declaration().expr(0).getText()));
        }
        System.out.println(" ; " + translate_expr(ctx.expr(0).getText()) + " ; " + variable + "+=" + translate_expr(ctx.expr(1).getText()) + " {");
        for_pendiente = null;
        pending_for = false;
        nested_level++;
    }

    @Override
    public void exitFor_(PsicoderParser.For_Context ctx) {
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterSwitch_(PsicoderParser.Switch_Context ctx) {
        printTabs();
        System.out.println("switch " + ctx.id_c().getText() + "{");
        nested_level++;
    }

    @Override
    public void exitSwitch_(PsicoderParser.Switch_Context ctx) {
        nested_level--;
        printTabs();
        System.out.println("}");
    }

    @Override
    public void enterCaso(PsicoderParser.CasoContext ctx) {
        printTabs();
        System.out.println("case "+ ctx.expr().getText() +" :");
        nested_level++;
    }

    @Override
    public void exitCaso(PsicoderParser.CasoContext ctx) {
        if(ctx.ROMPER() != null){
            System.out.println("break;");
        }
        nested_level--;
    }

    @Override
    public void enterDefect(PsicoderParser.DefectContext ctx) {
        printTabs();
        System.out.println("default :");
        nested_level++;
    }

    @Override
    public void exitDefect(PsicoderParser.DefectContext ctx) {
        if(ctx.ROMPER() != null){
            System.out.println("break;");
        }
        nested_level--;
    }

    @Override
    public void enterAssign(PsicoderParser.AssignContext ctx) {
        if (!pending_for) printTabs();
        System.out.print(ctx.id_c().getText() + " = " + translate_expr(ctx.expr().getText()));
        if (pending_for) imprimir_for();
        else {
            System.out.println();
        }
    }

    @Override
    public void exitAssign(PsicoderParser.AssignContext ctx) {
        super.exitAssign(ctx);
    }

    public void ingresar_variables(String variable, String tipo) {
        /*
        //TODO: ITERAR POR CADA ATRIBUTO DE ESTRUCTURA E INGRESARLO A VARIABLE_TYPES
        if(tipo == "entero" || tipo == "real" || tipo == "cadena" || tipo =="booleano" || tipo == "caracter") { // Si es primitivo lo ingresamos de una vez
            variable_types.put(variable, tipo);
        }
        else{ // Si no es primitivo iteramos por sus atributos y los ingresamos
            for(ArrayList<String> var : hash_estructs.get(tipo)){ //obtener cada uno de los atributos de la estructura tipo
                String nombre = var.get(0);
                String t = var.get(1);
                ingresar_variables(variable + "." + nombre, t);
            }
        }*/
    }

    @Override
    public void enterDeclaration(PsicoderParser.DeclarationContext ctx) {
        if (!pending_for) {
            printTabs();
            String exprs = "";
            System.out.print("var ");
            int id_count = 0;
            String tipo = ctx.data_type().getText();
            String tipo_trad;
            /*if(ctx.data_type().ID() == null){
                tipo = ctx.data_type().getText();
                tipo_trad = translate_types.get(ctx.data_type().getText());
            }
            else{
                tipo_trad = ctx.data_type().ID().getText();
            }*/

            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) == ctx.ID(id_count)) {

                    String variable = ctx.ID(id_count).getText();

                    ingresar_variables(variable, tipo);
                    System.out.print(variable);

                    if (id_count < ctx.ID().size() - 1) {
                        System.out.print(", ");
                    }
                    if (i < ctx.getChildCount() - 2 && ctx.ASIG().size() > 0 && ctx.getChild(i + 1).getText().equals("=") ) {
                        exprs += translate_expr(ctx.getChild(i + 2).getText());
                    } else {
                        exprs += (ctx.data_type().ID() == null ?  translate_types.get(tipo).get(2) : ctx.data_type().ID().getText());
                    }
                    if (id_count++ < ctx.ID().size() - 1) {
                        exprs += ", ";
                    }

                }
            }
            System.out.print(" " + (ctx.data_type().ID() == null ?  translate_types.get(tipo).get(0) : ctx.data_type().ID().getText()));
            System.out.println(" = " + exprs);
        } else {
            imprimir_for();
        }
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