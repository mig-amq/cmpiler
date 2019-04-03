package com.cmpiler;

import com.cmpiler.grammar.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream inputStream = args.length > 0 ? new FileInputStream(args[0]) : new FileInputStream("test.pas");

            PascaletLexer lexer = new PascaletLexer(CharStreams.fromStream(inputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PascaletParser parser = new PascaletParser(tokens);
            /*parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            parser.addErrorListener(new CustomErrorListener());
            parser.setErrorHandler(new CustomErrorStrategy());*/

            PascaletParser.ProgramContext tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new PascaletBaseListener(), tree);

            Scope scope = new Scope();
            HashMap<String, Function> functions = new HashMap<>();
            FunctionVisitor functionVisitor = new FunctionVisitor(functions);
            functionVisitor.visit(tree);

            for(Map.Entry<String, Function> f : functions.entrySet()) {
                System.out.println(f.getKey() + " params: ");
                for (Map.Entry<String, Value.GenericType> p : f.getValue().getParameters().entrySet())
                    System.out.println("    " + p.getKey() + " -> " + p.getValue().toString());
            }

            Visitor visitor = new Visitor(scope, functions);
            visitor.visitProgram(tree);

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.open();
        } catch (IOException e) {
            System.out.println("Error: Cannot find input file...");
            e.printStackTrace();
        }
    }
}
