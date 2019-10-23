package com.scalefocus.interpreter;

/**
 * @author Mariyan Topalov
 */
public class TestClass {

    public static Expression getMaleExpression(){
        Expression expr1 = new TerminalExpression("Ivan");
        Expression expr2 = new TerminalExpression("Joro");
        return new OrExpression(expr1, expr2);
    }

    public static Expression getMarriedWomanExpression(){
        Expression expr1 = new TerminalExpression("Mariya");
        Expression expr2 = new TerminalExpression("Married");
        return new AndExpression(expr1, expr2);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("Ivan"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Mariya"));
    }
}
