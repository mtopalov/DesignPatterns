package com.scalefocus.decorator;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Mobile sony = new Sony();
        Mobile samsung = new Samsung();

        MobileDecorator mobileDecorator = new MobileDecorator(sony);
        MobileDecorator mobileDecorator1 = new MobileDecorator(samsung);

        mobileDecorator1.playMusic();
        mobileDecorator.playGameAndMusic();
    }
}
