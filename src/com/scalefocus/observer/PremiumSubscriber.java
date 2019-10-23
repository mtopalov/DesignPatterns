package com.scalefocus.observer;

/**
 * Implements the method, defined in it's parent class - {@link Subscriber}.
 *
 * @author Mariyan Topalov
 */
public class PremiumSubscriber extends Subscriber {


    public PremiumSubscriber(Stream stream) {
        super(stream);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update() {
        System.out.println("Premium subscriber: First to receive the notification - " + super.stream.getState());
    }
}
