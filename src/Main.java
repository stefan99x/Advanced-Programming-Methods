import Controller.Controller;
import Model.ADTS.*;
import Model.Expressions.ValueExp;
import Model.Program.PrgState;
import Model.Statements.CompStmt;
import Model.Statements.*;
import Model.Types.*;
import Model.Values.*;
import Model.Values.Value;
import Repository.*;
import Model.Expressions.*;
import View.Commands.*;
import View.TextMenu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static IRepository repo = new LogRepository("o.out");

    static Controller contrl = new Controller(repo);

    public static void main(String[] args) throws Exception {
        /*PrintWriter logFile= new PrintWriter(new BufferedWriter(new FileWriter("o.out")));
        logFile.close();
        IStmt ex1 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(2))), new PrintStmt(new
                        VarExpr("v"))));
        IStmt ex2 = new CompStmt( new VarDeclStmt("a",new IntType()),
                new CompStmt(new VarDeclStmt("b",new IntType()),
                        new CompStmt(new AssignStmt("a", new ArithExp('+',new ValueExp(new IntValue(2)),new
                                ArithExp('*',new ValueExp(new IntValue(3)), new ValueExp(new IntValue(5))))),
                                new CompStmt(new AssignStmt("b",new ArithExp('+',new VarExpr("a"), new
                                        ValueExp(new IntValue(1)))), new PrintStmt(new VarExpr("b"))))));
        IStmt ex3 = new CompStmt(new VarDeclStmt("a", new BoolType()),
                new CompStmt(new VarDeclStmt("v", new IntType()),
                        new CompStmt(new AssignStmt("a", new ValueExp(new BoolValue(true))),
                                new CompStmt(new IfStmt(new VarExpr("a"), new AssignStmt("v", new ValueExp(new
                                        IntValue(2))), new AssignStmt("v", new ValueExp(new IntValue(3)))), new PrintStmt(new
                                        VarExpr("v"))))));
        MyIStack<IStmt> stk = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out = new MyList<Value>();
        PrgState myPrg = null;
        System.out.print("Which program do you want to run:");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();

        if(choice==1){myPrg = new PrgState(stk, symTbl, out, ex1,fT);}
        if(choice==2){myPrg = new PrgState(stk, symTbl, out, ex2,fT);}
        if(choice==3){myPrg = new PrgState(stk, symTbl, out, ex3,fT);}

        try {
            contrl.addProgram(myPrg);
            contrl.allStep();
        }
        catch (Exception e){
            System.out.println(e);
        }*/

        PrintWriter logFile = new PrintWriter(new BufferedWriter(new FileWriter("log1.txt")));
        logFile.close();
        PrintWriter logFile2 = new PrintWriter(new BufferedWriter(new FileWriter("log2.txt")));
        logFile2.close();
        PrintWriter logFile3 = new PrintWriter(new BufferedWriter(new FileWriter("log3.txt")));
        logFile3.close();
        PrintWriter logFile4 = new PrintWriter(new BufferedWriter(new FileWriter("log4.txt")));
        logFile4.close();
        PrintWriter logFile5 = new PrintWriter(new BufferedWriter(new FileWriter("log5.txt")));
        logFile5.close();
        PrintWriter logFile6 = new PrintWriter(new BufferedWriter(new FileWriter("log6.txt")));
        logFile6.close();
        PrintWriter logFile7 = new PrintWriter(new BufferedWriter(new FileWriter("log7.txt")));
        logFile7.close();
        PrintWriter logFile8 = new PrintWriter(new BufferedWriter(new FileWriter("log8.txt")));
        logFile8.close();
        PrintWriter logFile9 = new PrintWriter(new BufferedWriter(new FileWriter("log9.txt")));
        logFile9.close();
        PrintWriter logFile10 = new PrintWriter(new BufferedWriter(new FileWriter("log10.txt")));
        logFile10.close();
        PrintWriter logFile11 = new PrintWriter(new BufferedWriter(new FileWriter("log11.txt")));
        logFile11.close();



        IStmt ex1 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(2))), new PrintStmt(new
                        VarExpr("v"))));
        MyIStack<IStmt> stk1 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl1 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT1 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out1 = new MyList<Value>();
        MyIHeap<Integer, Value> heap1 = new MyHeap();
        PrgState prg1 = new PrgState(stk1, symTbl1, out1, fT1, heap1, ex1);
        IRepository repo1 = new LogRepository("log1.txt");
        Controller ctr1 = new Controller(repo1);
        ctr1.addProgram(prg1);

        IStmt ex2 = new CompStmt(new VarDeclStmt("a", new IntType()),
                new CompStmt(new VarDeclStmt("b", new IntType()),
                        new CompStmt(new AssignStmt("a", new ArithExp('+', new ValueExp(new IntValue(2)), new
                                ArithExp('*', new ValueExp(new IntValue(3)), new ValueExp(new IntValue(5))))),
                                new CompStmt(new AssignStmt("b", new ArithExp('+', new VarExpr("a"), new
                                        ValueExp(new IntValue(1)))), new PrintStmt(new VarExpr("b"))))));
        MyIStack<IStmt> stk2 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl2 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT2 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out2 = new MyList<Value>();
        MyIHeap<Integer, Value> heap2 = new MyHeap();
        PrgState prg2 = new PrgState(stk2, symTbl2, out2, fT2, heap2, ex2);
        IRepository repo2 = new LogRepository("log2.txt");
        Controller ctr2 = new Controller(repo2);
        ctr2.addProgram(prg2);


        IStmt ex3 = new CompStmt(new VarDeclStmt("a", new BoolType()),
                new CompStmt(new VarDeclStmt("v", new IntType()),
                        new CompStmt(new AssignStmt("a", new ValueExp(new BoolValue(true))),
                                new CompStmt(new IfStmt(new VarExpr("a"), new AssignStmt("v", new ValueExp(new
                                        IntValue(2))), new AssignStmt("v", new ValueExp(new IntValue(3)))), new PrintStmt(new
                                        VarExpr("v"))))));
        MyIStack<IStmt> stk3 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl3 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT3 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out3 = new MyList<Value>();
        MyIHeap<Integer, Value> heap3 = new MyHeap();
        PrgState prg3 = new PrgState(stk3, symTbl3, out3, fT3, heap3, ex3);
        IRepository repo3 = new LogRepository("log3.txt");
        Controller ctr3 = new Controller(repo3);
        ctr3.addProgram(prg3);

        IStmt ex4 = new CompStmt(new VarDeclStmt("varf", new StringType()),
                new CompStmt(new AssignStmt("varf", new ValueExp(new StringValue("test.in"))),
                        new CompStmt(new OpenRFileStmt(new VarExpr("varf")),
                                new CompStmt(new VarDeclStmt("varc", new IntType()),
                                        new CompStmt(new ReadFileStmt(new VarExpr("varf"), "varc"),
                                                new CompStmt(new PrintStmt(new VarExpr("varc")),
                                                        new CompStmt(new ReadFileStmt(new VarExpr("varf"), "varc"),
                                                                new CompStmt(new PrintStmt(new VarExpr("varc")), new CloseRFileStmt(new VarExpr("varf"))))))))));
        MyIStack<IStmt> stk4 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl4 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT4 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out4 = new MyList<Value>();
        MyIHeap<Integer, Value> heap4 = new MyHeap();
        PrgState prg4 = new PrgState(stk4, symTbl4, out4, fT4, heap4, ex4);
        IRepository repo4 = new LogRepository("log4.txt");
        Controller ctr4 = new Controller(repo4);
        ctr4.addProgram(prg4);


        IStmt ex5 = new CompStmt(new VarDeclStmt("v", new RefType(new IntType())),
                new CompStmt(new NewStmt("v", new ValueExp(new IntValue(20))),
                        new CompStmt(new VarDeclStmt("a", new RefType(new RefType(new IntType()))),
                                new CompStmt(new NewStmt("a", new VarExpr("v")),
                                        new CompStmt(new PrintStmt(new VarExpr("v")), new PrintStmt(new VarExpr("a")))))));

        MyIStack<IStmt> stk5 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl5 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT5 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out5 = new MyList<Value>();
        MyIHeap<Integer, Value> heap5 = new MyHeap();
        PrgState prg5 = new PrgState(stk5, symTbl5, out5, fT5, heap5, ex5);
        IRepository repo5 = new LogRepository("log5.txt");
        Controller ctr5 = new Controller(repo5);
        ctr5.addProgram(prg5);


        IStmt ex6 = new CompStmt(new VarDeclStmt("v", new RefType(new IntType())),
                new CompStmt(new NewStmt("v", new ValueExp(new IntValue(20))),
                        new CompStmt(new VarDeclStmt("a", new RefType(new RefType(new IntType()))),
                                new CompStmt(new NewStmt("a", new VarExpr("v")),
                                        new CompStmt(new PrintStmt(new ReadH(new VarExpr("v"))),
                                                new PrintStmt(new ArithExp('+', new ReadH(new ReadH(new VarExpr("a"))), new ValueExp(new IntValue(5)))))))));

        MyIStack<IStmt> stk6 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl6 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT6 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out6 = new MyList<Value>();
        MyIHeap<Integer, Value> heap6 = new MyHeap();
        PrgState prg6 = new PrgState(stk6, symTbl6, out6, fT6, heap6, ex6);
        IRepository repo6 = new LogRepository("log6.txt");
        Controller ctr6 = new Controller(repo6);
        ctr6.addProgram(prg6);


        IStmt ex7 = new CompStmt(new VarDeclStmt("v", new RefType(new IntType())),
                new CompStmt(new NewStmt("v", new ValueExp(new IntValue(20))),
                        new CompStmt(new PrintStmt(new ReadH(new VarExpr("v"))),
                                new CompStmt(new WriteHStmt("v", new ValueExp(new IntValue(30))),
                                        new PrintStmt(new ArithExp('+', new ReadH(new VarExpr("v")), new ValueExp(new IntValue(5))))))));
        ;

        MyIStack<IStmt> stk7 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl7 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT7 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out7 = new MyList<Value>();
        MyIHeap<Integer, Value> heap7 = new MyHeap();
        PrgState prg7 = new PrgState(stk7, symTbl7, out7, fT7, heap7, ex7);
        IRepository repo7 = new LogRepository("log7.txt");
        Controller ctr7 = new Controller(repo7);
        ctr7.addProgram(prg7);


        IStmt ex8 = new CompStmt(new VarDeclStmt("v", new RefType(new IntType())),
                new CompStmt(new NewStmt("v", new ValueExp(new IntValue(20))),
                        new CompStmt(new VarDeclStmt("a", new RefType(new RefType(new IntType()))),
                                new CompStmt(new NewStmt("a", new VarExpr("v")),
                                        new CompStmt(new NewStmt("v", new ValueExp(new IntValue(30))),
                                                new PrintStmt(new ReadH(new ReadH(new VarExpr("a")))))))));


        MyIStack<IStmt> stk8 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl8 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT8 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out8 = new MyList<Value>();
        MyIHeap<Integer, Value> heap8 = new MyHeap();
        PrgState prg8 = new PrgState(stk8, symTbl8, out8, fT8, heap8, ex8);
        IRepository repo8 = new LogRepository("log8.txt");
        Controller ctr8 = new Controller(repo8);
        ctr8.addProgram(prg8);


        IStmt ex9 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(4))),
                        new CompStmt(new WhileStmt(new RelationalExp(">", new VarExpr("v"), new ValueExp(new IntValue(0))),
                                new CompStmt(new PrintStmt(new VarExpr("v")), new AssignStmt("v", new ArithExp('-', new VarExpr("v"), new ValueExp(new IntValue(1)))))),
                                new PrintStmt(new VarExpr("v"))
                        )));
        ;

        MyIStack<IStmt> stk9 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl9 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT9 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out9 = new MyList<Value>();
        MyIHeap<Integer, Value> heap9 = new MyHeap();
        PrgState prg9 = new PrgState(stk9, symTbl9, out9, fT9, heap9, ex9);
        IRepository repo9 = new LogRepository("log9.txt");
        Controller ctr9 = new Controller(repo9);
        ctr9.addProgram(prg9);


        IStmt ex10 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new VarDeclStmt("a", new RefType(new IntType())),
                        new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(10))),
                                new CompStmt(new NewStmt("a", new ValueExp(new IntValue(22))),
                                        new CompStmt(new Fork(new CompStmt(new WriteHStmt("a", new ValueExp(new IntValue(30))), new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(32))), new CompStmt(new PrintStmt(new VarExpr("v")), new PrintStmt(new ReadH(new VarExpr("a"))))))),
                                                new CompStmt(new PrintStmt(new VarExpr("v")), new PrintStmt(new ReadH(new VarExpr("a")))))))));

        MyIStack<IStmt> stk10 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl10 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT10 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out10 = new MyList<Value>();
        MyIHeap<Integer, Value> heap10 = new MyHeap();
        PrgState prg10 = new PrgState(stk10, symTbl10, out10, fT10, heap10, ex10);
        IRepository repo10 = new LogRepository("log10.txt");
        Controller ctr10 = new Controller(repo10);
        ctr10.addProgram(prg10);


        IStmt ex11 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new VarDeclStmt("a", new RefType(new IntType())),
                        new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(10))),
                                new CompStmt(new NewStmt("a", new ValueExp(new IntValue(22))),
                                        new CompStmt(new Fork(new CompStmt(new WriteHStmt("a", new ValueExp(new IntValue(30))), new CompStmt(new AssignStmt("v", new ValueExp(new IntValue(32))), new CompStmt(new PrintStmt(new VarExpr("v")), new PrintStmt(new ReadH(new VarExpr("a"))))))),
                                                new CompStmt(new PrintStmt(new VarExpr("v")), new PrintStmt(new ReadH(new VarExpr("a")))))))));

        MyIStack<IStmt> stk11 = new MyStack<IStmt>();
        MyIDictionary<String, Value> symTbl11 = new MyDictionary<String, Value>();
        MyIDictionary<StringValue, BufferedReader> fT11 = new MyDictionary<StringValue, BufferedReader>();
        MyIList<Value> out11 = new MyList<Value>();
        MyIHeap<Integer, Value> heap11 = new MyHeap();
        PrgState prg11 = new PrgState(stk11, symTbl11, out11, fT11, heap11, ex11);
        IRepository repo11 = new LogRepository("log11.txt");
        Controller ctr11 = new Controller(repo11);
        ctr10.addProgram(prg11);

        IStmt ex12=new CompStmt(new VarDeclStmt("a",new IntType()),new AssignStmt("a",new ValueExp(new IntValue(20))));
        ex12.typecheck(new MyDictionary<String,IType>());


        TextMenu menu = new TextMenu();
        menu.addCommand(new ExitCommand("0", "exit"));
        menu.addCommand(new RunExample("1", ex1.toString(), ctr1));
        menu.addCommand(new RunExample("2", ex2.toString(), ctr2));
        menu.addCommand(new RunExample("3", ex3.toString(), ctr3));
        menu.addCommand(new RunExample("4", ex4.toString(), ctr4));
        menu.addCommand(new RunExample("5", ex5.toString(), ctr5));
        menu.addCommand(new RunExample("6", ex6.toString(), ctr6));
        menu.addCommand(new RunExample("7", ex7.toString(), ctr7));
        menu.addCommand(new RunExample("8", ex8.toString(), ctr8));
        menu.addCommand(new RunExample("9", ex9.toString(), ctr9));
        menu.addCommand(new RunExample("10", ex10.toString(), ctr10));
        menu.addCommand(new RunExample("11", ex11.toString(), ctr11));
        menu.show();

    }
}
