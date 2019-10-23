package com.scalefocus.proxy;

/**
 * Declares methods a Server has
 *
 * @author Mariyan Topalov
 */
public interface Server {

    /**
     * Checks if an {@link Employee} has access to the server.
     *
     * @param employee {@link Employee} to be checked
     */
    boolean checkServerAccess(Employee employee);
}
