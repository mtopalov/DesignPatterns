package com.scalefocus.observer;

/**
 * Implements the method, defined in it's parent class - {@link Subscriber}.
 *
 * @author Mariyan Topalov
 */
public class NormalSubscriber extends Subscriber {


    public NormalSubscriber(Stream stream) {
        super(stream);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update() {
        System.out.println("Normal subscriber: Receiving the notification - " + super.stream.getState());
    }
}
