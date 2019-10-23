package com.scalefocus.interpreter;

/**
 * @author Mariyan Topalov
 */
public interface Expression {

    boolean interpret(String context);
}
