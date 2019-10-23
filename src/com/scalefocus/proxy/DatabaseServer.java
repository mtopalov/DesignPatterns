package com.scalefocus.proxy;

/**
 * Class that implements {@link Server}.
 *
 * @author Mariyan Topalov
 */
public class DatabaseServer implements Server {

    /**
     * {@inheritDoc}
     *
     * @param employee {@link Employee} to be checked
     */
    @Override
    public boolean checkServerAccess(Employee employee) {
        System.out.println("Access granted!\n" + employee.getName() + " is inside database server.");
        return true;
    }
}
