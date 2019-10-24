package com.scalefocus.interpreter;

/**
 * Validate if a context contains an expression.
 *
 * @author Mariyan Topalov
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    /**
     * Checks if parameter contains {@link TerminalExpression#data}.
     *
     * @param context {@link String} - text to be checked
     * @return {@link Boolean} - true if the parameter contains the data.
     */
    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
