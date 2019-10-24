package com.scalefocus.interpreter;

/**
 * Class that evaluates AND expression.
 * It holds two {@link Expression}s and checks if both of them are present in a {@link String}.
 *
 * @author Mariyan Topalov
 */
public class AndExpression implements Expression {

    private Expression expr1;

    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * Checks if the context, given as parameter, contains both first and second expression.
     *
     * @param context {@link String} - the context to be checked.
     * @return {@link Boolean} - true if the context contains both the expressions, otherwise false.
     */
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
