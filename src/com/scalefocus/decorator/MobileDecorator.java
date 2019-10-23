package com.scalefocus.decorator;

/**
 * Class that implements the new functionality of the {@link Mobile}s.
 *
 * @author Mariyan Topalov
 */
public class MobileDecorator extends AbstractMobileDecorator {

    public MobileDecorator(Mobile mobile) {
        super(mobile);
    }

    /**
     * Calls the old and the new functionality of the {@link Mobile}.
     */
    public void makeFun(){
        playMusic();
        playGame();
    }

    /**
     * Adds new functionality to the {@link Mobile}.
     */
    void playGame(){
        System.out.println("I can also run video games!");
    }
}
