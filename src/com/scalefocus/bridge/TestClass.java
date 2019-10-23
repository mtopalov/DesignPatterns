package com.scalefocus.bridge;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        RemoteControl oldTvRemote = new OldTVRemote(new TVDevice());
        RemoteControl smartTvRemote = new SmartTVRemote(new TVDevice());

        oldTvRemote.upButton();
        oldTvRemote.upButton();
        oldTvRemote.upButton();
        oldTvRemote.upButton();
        oldTvRemote.upButton();
        oldTvRemote.rightButton();
        oldTvRemote.rightButton();
        oldTvRemote.rightButton();
        oldTvRemote.rightButton();
        oldTvRemote.rightButton();
        oldTvRemote.rightButton();
        oldTvRemote.showInfo();
        oldTvRemote.centerButton();
        oldTvRemote.showInfo();

        smartTvRemote.showInfo();
        smartTvRemote.centerButton();

    }

}
