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

        AbstractMobileDecorator mobileDecorator = new MobileDecorator(sony);

        sony.playMusic();
        mobileDecorator.makeFun();
    }
}
