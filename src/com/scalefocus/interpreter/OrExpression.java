package com.scalefocus.interpreter;

/**
 * Class that evaluates OR expression.
 * It holds two {@link Expression}s and checks if one of them is present in a {@link String}.
 *
 * @author Mariyan Topalov
 */
public class OrExpression implements Expression {

    private Expression expr1;

    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * Checks if the context, given as parameter, contains either one of the expressions.
     *
     * @param context {@link String} - the context to be checked
     * @return {@link Boolean} - true if either the first or second expression is true
     */
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
