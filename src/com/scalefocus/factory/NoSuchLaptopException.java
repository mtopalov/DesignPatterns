package com.scalefocus.factory;

/**
 * Custom exception.
 * Thrown when we try to create an instance of type {@link Laptop} with reference to {@link Laptop}'s child which does not exist.
 *
 * @author Mariyan Topalov
 */
public class NoSuchLaptopException extends Throwable {

    public NoSuchLaptopException(String ex) {
        super(ex);
    }
}
