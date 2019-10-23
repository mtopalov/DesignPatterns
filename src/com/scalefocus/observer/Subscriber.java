package com.scalefocus.observer;

/**
 * Instances of this type will be attached to the {@link Stream}, passed in the constructor.
 * Whenever the {@link Stream} changes it's state, the attached Subscribers will be notified.
 *
 * @author Mariyan Topalov
 */
public abstract class Subscriber {

    protected Stream stream;

    /**
     * Creates a Subscriber and attaches it to the {@link Stream}, given as parameter.
     *
     * @param stream {@link Stream} - the current object will be attached to this Stream
     */
    public Subscriber(Stream stream) {
        this.stream = stream;
        this.stream.attach(this);
    }

    /**
     * Notifies current subscriber if the state of it's {@link Stream} changes.
     */
    public abstract void update();

}
