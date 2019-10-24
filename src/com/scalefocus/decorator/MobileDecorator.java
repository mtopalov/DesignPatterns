package com.scalefocus.decorator;

/**
 * Class that defines new logic that will be added to the {@link Mobile}, without
 *
 * @author Mariyan Topalov
 */
public class MobileDecorator implements Mobile {

    protected Mobile mobile;

    public MobileDecorator(Mobile mobile) {
        this.mobile = mobile;
    }

    /**
     * Invokes {@link Mobile}'s playMusic method.
     */
    @Override
    public void playMusic() {
        mobile.playMusic();
    }

    /**
     * Plays game on the {@link Mobile}.
     */
    void playGame() {
        System.out.println("I can also play games.");
    }

    /**
     * Plays game while playing music.
     */
    void playGameAndMusic() {
        playMusic();
        playGame();
    }
}
