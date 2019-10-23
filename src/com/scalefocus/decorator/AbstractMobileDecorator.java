package com.scalefocus.decorator;

/**
 * Implements the {@link Mobile} interface.
 * Declares new functionality for a {@link Mobile}.
 *
 * @author Mariyan Topalov
 */
public abstract class AbstractMobileDecorator implements Mobile {

    protected Mobile mobile;

    public AbstractMobileDecorator(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void playMusic() {
        mobile.playMusic();
    }

    abstract void playGame();

    abstract void makeFun();
}
