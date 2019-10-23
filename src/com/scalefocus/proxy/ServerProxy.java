package com.scalefocus.proxy;

/**
 * Class that serves as Proxy between the {@link Employee} and the {@link Server}.
 * Prevents the access if the employee is not an engineer.
 *
 * @author Mariyan Topalov
 */
public class ServerProxy implements Server {

    private static final String ENGINEER = "engineer";

    private DatabaseServer server;

    public ServerProxy(DatabaseServer server) {
        this.server = server;
    }

    /**
     * Checks if the employee is an engineer.
     * Grants access to the {@link Server} if the employee is an engineer.
     *
     * @param employee {@link Employee} to be checked
     */
    @Override
    public boolean checkServerAccess(Employee employee) {
        if (ENGINEER.equalsIgnoreCase(employee.getPosition())) {
            return server.checkServerAccess(employee);
        } else {
            System.out.println(employee.getName() + " does not have access!");
            return false;
        }
    }
}
