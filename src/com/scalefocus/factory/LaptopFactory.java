package com.scalefocus.factory;

/**
 * Class based on the Factory design pattern.
 * It has only one role - to return a new Object of type {@link Laptop},
 * based on the given parameter.
 *
 * @author Mariyan Topalov
 */
public class LaptopFactory {

    /**
     * Returns a new instance of Laptop, based on the String, given as parameter.
     *
     * @param laptopType {@link String} - Type of the Laptop.
     * @return {@link Laptop} - new instance of Laptop, based on the String, given as parameter.
     *
     * @throws NoSuchLaptopException - this exception is thrown when try to get a {@link Laptop} which does not exist.
     */
    public Laptop getLaptop(String laptopType) throws NoSuchLaptopException {
        switch (laptopType.toLowerCase()) {
            case "lenovo": {
                return new Lenovo();
            }
            case "dell": {
                return new Dell();
            }
            case "razer": {
                return new Razer();
            }
            default:
                throw new NoSuchLaptopException("No such laptop.");
        }
    }
}
